package com.counterpart.game.items;

/**
 * Created by kenthall on 4/10/17.
 */

public class Weapon implements Item {
    private double durability;

    public Weapon(double durability) {
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
