package com.counterpart.game.items;

/**
 * Created by augustuswadlington on 4/10/17.
 */

public class Armor implements Item {

    private double durability;

    public Armor(double durability) {
        this.durability = durability;
    }

    @Override
    public void use() {

    }

    @Override
    public double getDurability() {

        return durability;
    }
}
