package com.counterpart.game;

/**
 * Created by CUONG on 4/15/2017.
 */

import java.util.*;

public class Player {
    private String name;
    private ArrayList<String> inventory;
    private int health;
    private int locX;
    private int locY;
    private int level;

    public Player(String name, ArrayList<String> inventory, int health, int locX, int locY) //default constructor
    {
        this.name = name;
        this.inventory = inventory;
        this.health = health;
        this.locX = locX;
        this.locY = locY;
    }

    public void setLocation(int locX, int locY) // sets location of player
    {
        this.locX = locX;
        this.locY = locY;
    }

    public int getX() //get the X-coordinate
    {
        return locX;
    }

    public int getY() //get the Y-coordinate
    {
        return locY;
    }

    public void addItem(String in) {
        inventory.add(in);
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

}


