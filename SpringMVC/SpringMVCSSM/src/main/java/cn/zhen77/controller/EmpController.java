package cn.zhen77.controller;

import cn.zhen77.pojo.Emp;
import cn.zhen77.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/2/5 - 02 - 05 - 19:59
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class EmpController {
    @Autowired
    private EmpService empService;

    public EmpService getEmpService() {
        return empService;
    }
    public void setEmpService(EmpService empService) {
        this.empService = empService;
    }


    @RequestMapping("show.do")
    public ModelAndView show(){
        System.out.println("进入show.do里");
        ModelAndView mv=new ModelAndView();
        List<Emp> list=empService.findAll();
        mv.addObject("list", list);
        mv.setViewName("/jsp/show.jsp");
        return mv;
    }
}
