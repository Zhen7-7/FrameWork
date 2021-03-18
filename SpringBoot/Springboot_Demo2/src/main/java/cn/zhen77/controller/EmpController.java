package cn.zhen77.controller;

import cn.zhen77.pojo.Emp;
import cn.zhen77.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : zhen77
 * @date: 2021/3/18 - 03 - 18 - 15:30
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/emp")
    @ResponseBody
    public String demo() {
        return empService.selectAllEmp().toString();
    }
    @RequestMapping("/empadd")
    @ResponseBody
    public String demo1() {
        Emp emp = new Emp(6, "新人1", 1);
        int result = empService.insertEmp(emp);
        if(result==1){
            return "seccus";
        }else return "false";
    }
    @RequestMapping("/empone")
    @ResponseBody
    public String demo2() {
        return empService.selectByOneemp(2).toString();
    }
}
