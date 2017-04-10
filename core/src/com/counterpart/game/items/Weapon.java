package com.counterpart.game.items;

/**
 * Created by kenthall on 4/10/17.
 */

public class Weapon implements Item {
    private int durability;

    public Weapon(int durability) {
        this.durability = durability;
    }

    @Override
    public void use() {
        durability--;
    }

    @Override
    public int getDurability() {
        return durability;
    }

}
