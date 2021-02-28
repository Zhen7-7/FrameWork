package cn.zhen77.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/2/7 - 02 - 07 - 21:51
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class MyController {


    @RequestMapping("/show")
    public String show(Model model){
        List<String> list = new ArrayList<String>();
        list.add("上海");
        list.add("北京");
        list.add("黑龙江");
        list.add("长春");
        list.add("济南");
        list.add("深圳");
        list.add("广州");

        model.addAttribute("list",list);
        return "show";
    }
}
