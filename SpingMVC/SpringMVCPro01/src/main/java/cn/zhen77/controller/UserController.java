package cn.zhen77.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.io.IOException;

/**
 * @author : zhen77
 * @date: 2021/2/1 - 02 - 01 - 21:29
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */

@Controller

/*@RequestMapping("user")*/
public class UserController {
    @RequestMapping("reg.do")
    public ModelAndView reg(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        String username = request.getParameter("username");
        request.setAttribute("username",username);
        System.out.println("进入reg处理器中..");
        mv.setViewName("/success.jsp");
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
    // @RequestMapping("/log.do")//如果不写类@requestMapping(user) 方法需要在/前加入user
    /**
    @RequestMapping(value={"log.do","log1.do","log2.do"},method = {RequestMethod.POST})
    public ModelAndView log(String username,String pwd) {
        ModelAndView mv = new ModelAndView();

        System.out.println("进入log处理器");
        if ("admin".equals(username) && "161600".equals(pwd)) {
            mv.addObject("username", username);
            mv.addObject("pwd", pwd);
            mv.setViewName("/success.jsp");
        } else {
            mv.addObject("info", "登录失败");
            mv.setViewName("login.jsp");
        }
        return mv;

    }*/
    /*@RequestMapping("log.do")
    public String log(String username,String pwd ,HttpServletRequest request){
        if ("admin".equals(username) && "161600".equals(pwd)) {
            request.setAttribute("name",username);
            request.setAttribute("pwd",pwd);
            return "redirect:success.jsp;";
        }else{
            request.setAttribute("info","登录失败");
            return "redirect:login.jsp";

        }
    }*/
    /*@RequestMapping("log.do")
    public void log(String username, String pwd , HttpServletRequest request, HttpServletResponse response) throws IOException {
        if ("admin".equals(username) && "161600".equals(pwd)) {
            request.setAttribute("name",username);
            request.setAttribute("pwd",pwd);
            response.sendRedirect("success.jsp");//重定向
        }else{
            request.setAttribute("info","登录失败");
            response.sendRedirect("login.jsp");
        }
    }*/
   /* @RequestMapping("log.do")
    public void log(String username, String pwd , HttpServletRequest request, HttpServletResponse response, Model model) throws IOException, ServletException {
        if ("admin".equals(username) && "161600".equals(pwd)) {
            model.addAttribute("name",username);
            request.getRequestDispatcher("success.jsp").forward(request,response);
        }else{
            request.setAttribute("info","登录失败");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }*/
    @RequestMapping("log.do")
    public String log(String username, String pwd , HttpServletRequest request, HttpServletResponse response, Model model) throws IOException, ServletException {
        if ("admin".equals(username) && "161600".equals(pwd)) {
            model.addAttribute("name",username);
            return "success.jsp";
        }else{
            request.setAttribute("info","登录失败");
            return "login.jsp";
        }
    }
}
