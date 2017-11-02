package com.jimg.strategy.game;

import com.jimg.strategy.game.weapon.impl.BowAndArrowBehavior;

public class Troll extends Character {
    public Troll() {
        weaponBehavior = new BowAndArrowBehavior();
    }
    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
