package com.blxz.pojo;

import java.util.Date;

public class Food {
    private Integer id;
    private String dishes;
    private double price;
    private int inventory;
    private double discount;
    private Date madetime;
    private int shelflife;
    private String summary;
    private String orderway;
    private int status;

    public Food() {
    }

    public Food(Integer id, String dishes, double price, int inventory, double discount, Date madetime, int shelflife, String summary, String orderway, int status) {
        this.id = id;
        this.dishes = dishes;
        this.price = price;
        this.inventory = inventory;
        this.discount = discount;
        this.madetime = madetime;
        this.shelflife = shelflife;
        this.summary = summary;
        this.orderway = orderway;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDishes() {
        return dishes;
    }

    public void setDishes(String dishes) {
        this.dishes = dishes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Date getMadetime() {
        return madetime;
    }

    public void setMadetime(Date madetime) {
        this.madetime = madetime;
    }

    public int getShelflife() {
        return shelflife;
    }

    public void setShelflife(int shelflife) {
        this.shelflife = shelflife;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getOrderway() {
        return orderway;
    }

    public void setOrderway(String orderway) {
        this.orderway = orderway;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", dishes='" + dishes + '\'' +
                ", price=" + price +
                ", inventory=" + inventory +
                ", discount=" + discount +
                ", madetime=" + madetime +
                ", shelflife=" + shelflife +
                ", summary='" + summary + '\'' +
                ", orderway='" + orderway + '\'' +
                '}';
    }
}
