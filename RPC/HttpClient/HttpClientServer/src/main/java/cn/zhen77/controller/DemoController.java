package cn.zhen77.controller;

import cn.zhen77.bean.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping("/demo2")
    @ResponseBody
    public User demo2(User user){
        return user;
    }

    @RequestMapping("/demo3")
    @ResponseBody
    public List<User> demo3() {
        List<User> list = new ArrayList();
        list.add(new User(10,"sun"));
        list.add(new User(20,"zhen"));
        return list;

    }
    @RequestMapping("/demo4")
    @ResponseBody//响应对象转换为流类型
    public String demo4(@RequestBody List<User> list){
        System.out.println(list);
        return list.toString();

    }
    @RequestMapping("/demo05")
    @ResponseBody
    public List<User> demo5(@RequestBody List<User> list){
        System.out.println(list);
        return list;
    }
}
