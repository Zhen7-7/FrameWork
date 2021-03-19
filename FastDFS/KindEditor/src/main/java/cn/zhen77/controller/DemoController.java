package cn.zhen77.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : zhen77
 * @date: 2021/3/19 - 03 - 19 - 18:26
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class DemoController {
    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }
}
