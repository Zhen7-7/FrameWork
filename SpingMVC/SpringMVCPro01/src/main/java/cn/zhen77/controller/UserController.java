package cn.zhen77.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : zhen77
 * @date: 2021/2/1 - 02 - 01 - 21:29
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */

@Controller
public class UserController {
    @RequestMapping("reg.do")
    public ModelAndView reg(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        String username = request.getParameter("username");
        request.setAttribute("username",username);
        System.out.println("进入reg处理器中..");
        mv.setViewName("success.jsp");
        return mv;
    }


    /**
     * 第一种优化
     * @RequestMapping("log.do")
    public ModelAndView log(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        System.out.println("进入log处理器");
        if("admin".equals(username) && "161600".equals(pwd)){
            request.setAttribute("username",username);
            request.setAttribute("pwd",pwd);
            mv.setViewName("success.jsp");
        }else{
            request.setAttribute("info","登录失败");
            mv.setViewName("login.jsp");
        }

        return mv;
    }*/

    /** 第二种优化
    @RequestMapping("log.do")
    public ModelAndView log(String username,String pwd,HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();

        System.out.println("进入log处理器");
        if ("admin".equals(username) && "161600".equals(pwd)) {
            request.setAttribute("username", username);
            request.setAttribute("pwd", pwd);
            mv.setViewName("success.jsp");
        } else {
            request.setAttribute("info", "登录失败");
            mv.setViewName("login.jsp");
        }
        return mv;
    }*/
    @RequestMapping("log.do")
    public ModelAndView log(String username,String pwd) {
        ModelAndView mv = new ModelAndView();

        System.out.println("进入log处理器");
        if ("admin".equals(username) && "161600".equals(pwd)) {
            mv.addObject("username", username);
            mv.addObject("pwd", pwd);
            mv.setViewName("success.jsp");
        } else {
            mv.addObject("info", "登录失败");
            mv.setViewName("login.jsp");
        }
        return mv;
    }

}
