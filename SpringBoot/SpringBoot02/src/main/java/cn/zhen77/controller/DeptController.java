package cn.zhen77.controller;

import cn.zhen77.mapper.DeptMapper;
import cn.zhen77.pojo.Dept;
import cn.zhen77.service.DeptService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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



    @RequestMapping("/showpage")
    public ModelAndView showpage(Integer pageindex){
        ModelAndView mv = new ModelAndView();
        //开启分页:这个工具是通过拦截sql语句 动态的往sql语句中添加关键字limit 来实现分页的
        //所以一定要在sql语句执行功能之前开启分页

        if(pageindex==null){
            PageHelper.startPage(1,2);
        }else{
            PageHelper.startPage(pageindex,2);
        }
        //添加deptService对象的查询语句
        List<Dept> list=deptService.selectAll();
        //我们在分页的时候需要拿到很多很多的分页信息:比如当前页是否为首页?是否为尾页?有无上一页下一页?一共多少条数据
        //以前我们的做法是去手动编写一个分页工具类;现在都准备好了
        PageInfo<Dept> pageinfo=new PageInfo<Dept>(list);//这是一个构造方法
        //之后将pageinfo添加到ModelAndView对象中去,到达前台页面只需要对pageinfo进行取值就可以了
        mv.addObject("pageinfo",pageinfo);
        return mv;
    }




}
