/**
 * Created by houyefeng on 2015/7/15.
 */
package com.shuidi.dal.entity;

import java.io.Serializable;

public class Product implements Serializable{
    private static final long serialVersionUID = -8153750508729722729L;
    private int id;
    private String name;
    private int amount = 1;
    private float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
