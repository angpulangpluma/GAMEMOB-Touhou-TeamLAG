package com.gamez.teamlag.onlinestore;

/**
 * Created by YING LOPEZ on 3/9/2016.
 */
public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public Item(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
