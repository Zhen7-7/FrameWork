package cn.zhen77.controller;

import cn.zhen77.service.DeptService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author : zhen77
 * @date: 2021/3/15 - 03 - 15 - 16:21
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/dept")
    public String showDept(Model model){
        model.addAttribute("list",deptService.findAll());
        return "dept";
    }
}
