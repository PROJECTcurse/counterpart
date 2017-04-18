package com.counterpart.game.items;

/**
 * Created by augustuswadlington on 4/10/17.
 */

public class Consumable implements Item {
    private int durability = 1;

    public Consumable() {

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
