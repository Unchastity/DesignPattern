package com.jimg.strategy.game;

import com.jimg.strategy.game.weapon.impl.SwordBehavior;

public class King extends Character {

    public King() {
        weaponBehavior = new SwordBehavior();
    }
    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
