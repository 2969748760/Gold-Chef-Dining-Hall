package com.blxz.util;

import com.blxz.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri=request.getRequestURI();
        StringBuffer url=request.getRequestURL();
        System.out.println(uri);
        if(uri.contains("login")||uri.contains("signup")||uri.contains("register")||uri.contains("resetpwd")||uri.contains("error")||uri.contains("reSetPassword")){
            return true;
        }
        User user=(User)request.getSession().getAttribute("user");
        if (user!=null){
            return true;
        }else{
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
