package cn.zhen77.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : zhen77
 * @date: 2021/2/6 - 02 - 06 - 19:30
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class MyController {
    @RequestMapping("/show")
    @ResponseBody
    public String show(){
        return "hello";
    }
}
