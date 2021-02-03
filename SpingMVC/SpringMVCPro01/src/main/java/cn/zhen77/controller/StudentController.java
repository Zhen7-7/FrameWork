package cn.zhen77.controller;

import cn.zhen77.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : zhen77
 * @date: 2021/2/3 - 02 - 03 - 11:52
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class StudentController  {
    @RequestMapping("add.do")
    public ModelAndView addStu(Student stu){
        ModelAndView mv = new ModelAndView();
        mv.addObject("stu",stu);
        mv.setViewName("teashow.do");


        return mv;
    }
 }
