package cn.zhen77.controller;

import cn.zhen77.pojo.Student;
import cn.zhen77.pojo.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/2/3 - 02 - 03 - 14:34
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class TeacherController {
    @RequestMapping("teashow.do")
    public ModelAndView show(){
        ModelAndView mv = new ModelAndView();
        List<Teacher> list = new ArrayList<>();
        list.add(new Teacher(1,"末末"));
        list.add(new Teacher(2,"未未"));
        list.add(new Teacher(3,"木木"));
        mv.addObject("list" ,list);
        mv.setViewName("teashow.jsp");
        return mv;
    }

    @RequestMapping("teaupd.do")
    public String upd(Student stu){
        System.out.println(stu);
        return "teashow.jsp";
    }
}
