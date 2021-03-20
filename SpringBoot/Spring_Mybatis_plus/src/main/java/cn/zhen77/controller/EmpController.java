package cn.zhen77.controller;

import cn.zhen77.mapper.EmpMapper;
import cn.zhen77.pojo.Emp;
import cn.zhen77.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.Request;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/3/20 - 03 - 20 - 17:41
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class EmpController {
    @Autowired
    private EmpService empService;
    @RequestMapping("/demo")
    @ResponseBody
    public String demo(){
        List<Emp> list = empService.selectAll();
        System.out.println(list.toString());
        return list.toString();

    }

}
