package cn.zhen77.controller;

import org.springframework.web.servlet.ModelAndView;

import javax.naming.ldap.Control;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : zhen77
 * @date: 2021/2/2 - 02 - 02 - 13:50
 * @Description: cn.zhen77.controller
 * @version: 1.0
 */
public class UserController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView();

        mv.setViewName("success.jsp");
        return mv;
    }
}
