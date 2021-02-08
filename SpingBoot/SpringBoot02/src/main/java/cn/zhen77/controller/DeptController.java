package cn.zhen77.controller;

import cn.zhen77.mapper.DeptMapper;
import cn.zhen77.pojo.Dept;
import cn.zhen77.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/2/6 - 02 - 06 - 22:58
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
@Controller
public class DeptController {
    @Autowired
    private DeptService deptService;

    public DeptService getDeptService() {
        return deptService;
    }

    public void setDeptService(DeptService deptService) {
        this.deptService = deptService;
    }

    /*@RequestMapping("/getall")
    @ResponseBody
    public List<Dept> getall(){
        return  deptService.selectAll();
    }*/
    @RequestMapping("/getall")
    public ModelAndView getall(HttpSession session){
        ModelAndView mv = new ModelAndView();

        mv.addObject("list",deptService.selectAll());
        mv.addObject("str","张三");
        mv.setViewName("show");
        session.setAttribute("dept","运维组");
        return mv;
    }
    @RequestMapping("/show")
    public void show(int id,String name){
        System.out.println(id+"**********"+name);
    }
}
