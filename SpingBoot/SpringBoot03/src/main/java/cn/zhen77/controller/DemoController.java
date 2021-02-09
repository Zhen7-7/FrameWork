package cn.zhen77.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : zhen77
 * @date: 2021/2/9 - 02 - 09 - 16:14
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class DemoController {
    @RequestMapping("/demo")
    @ResponseBody
    public String demo(){
        return "Demo";

    }
    @RequestMapping("/login")
    @ResponseBody
    public String login(){
        return "login";
    }
}
