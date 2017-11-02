package com.jimg.strategy.game;

import com.jimg.strategy.game.weapon.impl.AxeBehavior;

public class Knight extends Character {
    public Knight() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
