package cn.zhen77.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/2/7 - 02 - 07 - 23:01
 * @Description: cn.zhen77.contoller
 * @version: 1.0
 */
@org.springframework.stereotype.Controller
public class MyController {
    @RequestMapping("/show")
    public String show(Model model){
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        model.addAttribute("list",list);
        return "show.jsp";
     }
}
