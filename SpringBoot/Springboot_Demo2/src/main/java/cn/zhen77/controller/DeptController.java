package cn.zhen77.controller;

import cn.zhen77.pojo.Dept;
import cn.zhen77.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/3/16 - 03 - 16 - 10:33
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class DeptController {
    @Autowired
    private DeptService deptService;
    @RequestMapping("/add")
    @ResponseBody
    public String add(){
        Dept dept = new Dept(40,"pkp");
        int result = deptService.insert(dept);
        if(result==1){
            return "seccus";
        }else return "false";
    }

    @RequestMapping("/demo")
    @ResponseBody
    public String demo (){
        return deptService.find().toString();
    }
}
