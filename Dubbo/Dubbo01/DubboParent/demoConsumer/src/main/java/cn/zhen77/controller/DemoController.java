package cn.zhen77.controller;

import cn.zhen77.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : zhen77
 * @date: 2021/3/15 - 03 - 15 - 9:26
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class DemoController {
    @Autowired
    private DemoService demoService;
    @RequestMapping("/demo")
    @ResponseBody
    public String demo(){
        String result = demoService.consumerDemo();
        return  result;
    }
}
