package com.blxz.controller;

import com.blxz.pojo.User;
import com.blxz.service.UserServiceInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceInf userservice;
    //登录
    @RequestMapping("/loginCheck")
    public ModelAndView loginCheck(User user,HttpSession session){
        ModelAndView mv=new ModelAndView();
        User u=userservice.loginCheck(user);
        if(u!=null){
            session.setAttribute("user",u);
            mv.setViewName("redirect:../showmenu/foodList");
        }else{
            mv.setViewName("login");
        }
        return mv;
    }

    @RequestMapping("/signup")
    public String register(User user){
        return userservice.register(user)>0?"login":"error";
    }

    @RequestMapping("/logout")
    public ModelAndView logout(HttpSession session){
        ModelAndView mv=new ModelAndView();
        session.removeAttribute("user");
        mv.setViewName("login");
        return mv;
    }

    @RequestMapping("/reSetPassword")
    public String reSetPassword(String username,String password,String phonenumber){
        System.out.println(userservice.reSetPassword(username,password,phonenumber));
        return userservice.reSetPassword(username,password,phonenumber)>0?"login":"error";
    }

    @RequestMapping("{page}")
    public String toPage(@PathVariable() String page){
        return page;
    }
}
