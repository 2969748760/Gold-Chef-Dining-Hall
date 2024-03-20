package com.blxz.controller;

import com.blxz.pojo.Food;
import com.blxz.service.FoodServiceInf;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

import java.util.List;

@Controller
@RequestMapping("/showmenu")
public class FoodController {
    @Autowired
    private FoodServiceInf foodservice;

    //普通全查
    /*@RequestMapping("/foodList")
    public ModelAndView selectAll(){
        ModelAndView mv=new ModelAndView();
        List<Food> foodList =foodservice.selectAll();
        mv.addObject("foodlist", foodList);
        mv.setViewName("query");
        return mv;
    }*/

    //分页全查
    @RequestMapping("/foodList")
    public ModelAndView selectAll(@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "5") Integer pageSize){
        ModelAndView mv=new ModelAndView();
        PageInfo<Food> pi=foodservice.selectAll(pageNum,pageSize);
        mv.addObject("pi",pi);
        mv.setViewName("query");
        return mv;
    }

    /*@RequestMapping("/addFood")
    public ModelAndView addFood(Food food){
        ModelAndView mv=new ModelAndView();
        int flag= foodservice.addFood(food);
        if(flag>0){
            mv.setViewName("redirect:foodList");
        }else{
            mv.setViewName("add");
        }
        return mv;
    }*/

    @RequestMapping("/addFood")
    public String addFood(Food food){
        return foodservice.addFood(food)>0?"redirect:foodList":"add";
    }

    @RequestMapping("/showFood")
    public ModelAndView showFood(int id) {
        ModelAndView mv=new ModelAndView();
        Food food=foodservice.selectById(id);
        mv.addObject("selectedfood",food);
        mv.setViewName("update");
        return mv;
    }

    @RequestMapping("/updateFood")
    public String updateFood(Food food){
        return foodservice.updateFood(food)>0?"redirect:foodList":"error";
    }

    @RequestMapping("/deleteFoodTmp")
    public String deleteFoodTmp(int id){
        return foodservice.deleteFoodTmp(id)>0?"redirect:foodList":"error";
    }

    @RequestMapping("/deleteFoodCom")
    public String deleteFoodCom(int id){
        return foodservice.deleteFoodCom(id)>0?"redirect:deletedList":"error";
    }

    @RequestMapping("/deletedList")
    public ModelAndView selectAllDeleted(@RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "5") Integer pageSize){
        ModelAndView mv=new ModelAndView();
        PageInfo<Food> pid=foodservice.selectAllDeleted(pageNum,pageSize);
        mv.addObject("pid",pid);
        mv.setViewName("querydeleted");
        return mv;
    }

    @RequestMapping("/restore")
    public ModelAndView restore(int id){
        ModelAndView mv=new ModelAndView();
        Food defood=foodservice.selectDeleteById(id);
        mv.addObject("deletedfood",defood);
        mv.setViewName("restore");
        return mv;
    }

    @RequestMapping("/restoreFood")
    public String restoreFood(Food food){
        return foodservice.restoreFood(food)>0?"redirect:deletedList":"error";
    }

    @RequestMapping("/fuzzyQuery")
    public ModelAndView fuzzyQuery(String dishes,@RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "5") Integer pageSize){
        ModelAndView mv=new ModelAndView();
        PageInfo<Food> pif=foodservice.FuzzyQueryByDishes(dishes,pageNum,pageSize);
        mv.addObject("querylist",pif);
        mv.setViewName("fuzzyquery");
        return mv;
    }

    @RequestMapping("{page}")
    public String toPage(@PathVariable() String page){
        return page;
    }
}
