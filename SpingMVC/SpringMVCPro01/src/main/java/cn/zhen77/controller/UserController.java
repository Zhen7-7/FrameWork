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

}
