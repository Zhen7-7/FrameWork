package cn.zhen77.controller;

import cn.zhen77.pojo.Student;
import cn.zhen77.pojo.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : zhen77
 * @date: 2021/2/3 - 02 - 03 - 14:34
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class TeacherController {
  /*  @RequestMapping("teashow.do")
    public ModelAndView show(){
        ModelAndView mv = new ModelAndView();
        List<Teacher> list = new ArrayList<>();
        list.add(new Teacher(1,"末末"));
        list.add(new Teacher(2,"未未"));
        list.add(new Teacher(3,"木木"));
        mv.addObject("list" ,list);
        mv.setViewName("teashow.jsp");
        return mv;
    }*/
    @RequestMapping("teashow.do")
    public ModelAndView show(){
        ModelAndView mv = new ModelAndView();
        Map<Integer, Teacher> map = new HashMap<>();
        Teacher tea1=new Teacher(234,"zhangsan");
        Teacher tea2=new Teacher(345,"lisi");
        Teacher tea3=new Teacher(456,"wagnwu");
        map.put(tea1.getTeaId(),tea1);
        map.put(tea2.getTeaId(),tea2);
        map.put(tea3.getTeaId(),tea3);
        mv.addObject("map",map);
        mv.setViewName("teashowmap.jsp");
        return mv;
    }

    @RequestMapping("teaupd.do")
    public String upd(Student stu){
        System.out.println(stu);
        return "teashow.jsp";
    }
}
