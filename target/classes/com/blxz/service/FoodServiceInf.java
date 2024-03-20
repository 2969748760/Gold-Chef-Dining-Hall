package com.blxz.service;

import com.blxz.pojo.Food;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface FoodServiceInf {
    List<Food> selectAll();

    int addFood(Food food);

    Food selectById(int id);

    int updateFood(Food food);

    int deleteFoodTmp(int id);

    int deleteFoodCom(int id);

    //从pageNum开始每次查询pageSize个
    PageInfo<Food> selectAll(Integer pageNum,Integer pageSize);

    //分页查询回收站种的内容
    PageInfo<Food> selectAllDeleted(Integer pageNum,Integer pageSize);

    Food selectDeleteById(int id);

    int restoreFood(Food food);

    PageInfo<Food> FuzzyQueryByDishes(String dishes,Integer pageNum,Integer pageSize);
}
