package cn.zhen77.controller;

import cn.zhen77.pojo.Dept;
import cn.zhen77.service.DeptServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/3/16 - 03 - 16 - 9:31
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class DeptController {

    @Autowired
    private  DeptServcie deptServcie;
    @RequestMapping("/dept")
    @ResponseBody
    public String show(){
        Dept dept = new Dept();
//        dept.setId(1);
        dept.setName("开发部");
        List<Dept> list = deptServcie.selectBycon(dept);
        return list.toString();
    }

}
