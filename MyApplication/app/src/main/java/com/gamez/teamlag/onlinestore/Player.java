package com.gamez.teamlag.onlinestore;

import java.util.ArrayList;

/**
 * Created by YING LOPEZ on 3/9/2016.
 */
public class Player {
    private String name;
    private ArrayList<Item> bag;
    private int money;

    public Player(String name, int money){
        this.name = name;
        this.money = money;
    }

    public Player(String name, ArrayList<Item> bag, int money){
        this.name = name;
        this.bag = bag;
        this.money = money;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Item> getBagofItems(){
        return this.bag;
    }

    public int getMoney(){
        return this.money;
    }

    public Item getItem(int i){
        return this.bag.get(i);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMoney(int money){
        this.money = money;
    }

    public void setIteminBag(Item item){
        this.bag.add(item);
    }

    public void removeIteminBag(int i){
        this.bag.remove(i);
    }
}
