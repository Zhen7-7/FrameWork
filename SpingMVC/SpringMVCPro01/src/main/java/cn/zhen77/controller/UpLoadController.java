package cn.zhen77.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * @author : zhen77
 * @date: 2021/2/4 - 02 - 04 - 17:54
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class UpLoadController {
    @RequestMapping("upload.do")
    public ModelAndView upload(String uploadName , HttpServletRequest request, MultipartFile upfile)throws Exception{
        ModelAndView mv = new ModelAndView();
        //1.获取文件名字:
        String fileName = upfile.getOriginalFilename();
        //2.获取上传路径:
        String url = request.getSession().getServletContext().getRealPath("/imgs/");
        File file = new File(url + fileName);
        System.out.println(url+fileName);
        upfile.transferTo(file);

        mv.addObject("url","imgs/"+ fileName );
        mv.setViewName("fileupload.jsp");

        return mv;
    }
}
