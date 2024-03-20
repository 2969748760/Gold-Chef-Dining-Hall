package com.blxz.mapper;

import com.blxz.pojo.Food;

import java.util.List;


public interface FoodMapper {
    //全查
    List<Food> selectAll();

    //添加
    int addFood(Food food);

    //修改
    //查询一个用作回显
    Food selectById(int id);

    //修改选择的食物
    int updateFood(Food food);

    //逻辑删除
    int deleteFoodTmp(int id);

    //物理删除
    int deleteFoodCom(int id);

    List<Food> selectAllDeleted();

    Food selectDeleteById(int id);

    int restoreFood(Food food);

    List<Food> FuzzyQueryByDishes(String dishes);
}
