package com.counterpart.game.items;

/**
 * Created by augustuswadlington on 4/10/17.
 */

public class Consumable implements Item {
    private double durability;

    public Consumable(double durability){
        this.durability = durability;
    }

    @Override
    public void use() {

    }

    @Override
    public double getDurability() {
        return 0;
    }

}
