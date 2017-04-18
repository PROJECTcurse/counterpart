package com.counterpart.game.items;

/**
 * Created by augustuswadlington on 4/10/17.
 */

public class Armor implements Item {

    private int durability;

    public Armor(int durability) {
        this.durability = durability;
    }

    @Override
    public void use() {

    }

    @Override
    public int getDurability() {

        return durability;
    }
}
