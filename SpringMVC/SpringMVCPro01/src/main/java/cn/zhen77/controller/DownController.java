package cn.zhen77.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/2/4 - 02 - 04 - 18:55
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class DownController {
    @RequestMapping("getDownList.do")
    public String getDownList(HttpServletRequest request){
        String url = request.getSession().getServletContext().getRealPath("/imgs");

        File file = new File(url);
        File[] files = file.listFiles();
        List<String> list = new ArrayList<>();
        for(File f :files){
            list.add(f.getName());
        }
        request.setAttribute("list",list);
        return "downlist.jsp";
    }

    @RequestMapping("down.do")
    public void down(String fname, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("进入下载处理器");
        String downurl=request.getSession().getServletContext().getRealPath("/imgs");
        File file = new File(downurl, fname);

        //设置信息相应类型:
        response.setContentType("application/x-msdownload");

        //设置下载时文件的显示类型(既文件名+后缀)  ex:txt为文本类型
        response.setHeader("Context-Disposition","attachment;filename="+fname);

        //执行下载功能
        System.out.println(file.toPath());
        Files.copy(file.toPath(),response.getOutputStream());
    }

}
