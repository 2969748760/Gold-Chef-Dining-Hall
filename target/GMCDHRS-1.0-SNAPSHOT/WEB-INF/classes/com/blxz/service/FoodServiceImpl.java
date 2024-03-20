package com.blxz.service;

import com.blxz.mapper.FoodMapper;
import com.blxz.pojo.Food;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodServiceInf {
    @Autowired
    private FoodMapper foodmapper;
    @Override
    public List<Food> selectAll() {
        List<Food> list=foodmapper.selectAll();
        return list;
    }

    @Override
    public int addFood(Food food) {
        return foodmapper.addFood(food);
    }

    @Override
    public Food selectById(int id) {
        return foodmapper.selectById(id);
    }

    @Override
    public int updateFood(Food food) {
        return foodmapper.updateFood(food);
    }

    @Override
    public int deleteFoodTmp(int id) {
        return foodmapper.deleteFoodTmp(id);
    }

    @Override
    public int deleteFoodCom(int id) {
        return foodmapper.deleteFoodCom(id);
    }

    @Override
    public PageInfo<Food> selectAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Food> list=foodmapper.selectAll();
        return new PageInfo<>(list);
    }

    @Override
    public PageInfo<Food> selectAllDeleted(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Food> list=foodmapper.selectAllDeleted();
        return new PageInfo<>(list);
    }

    @Override
    public Food selectDeleteById(int id) {
        return foodmapper.selectDeleteById(id);
    }

    @Override
    public int restoreFood(Food food) {
        return foodmapper.restoreFood(food);
    }

    @Override
    public PageInfo<Food> FuzzyQueryByDishes(String dishes, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Food> list=foodmapper.FuzzyQueryByDishes(dishes);
        return new PageInfo<>(list);
    }
}
