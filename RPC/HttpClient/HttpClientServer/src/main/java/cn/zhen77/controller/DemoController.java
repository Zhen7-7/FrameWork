package cn.zhen77.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : zhen77
 * @date: 2021/2/16 - 02 - 16 - 17:46
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class DemoController {

    @RequestMapping("/demo")
    @ResponseBody
    public String demo(String param){
        return param+"abc";
    }
}
