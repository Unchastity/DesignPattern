package com.jimg.strategy.game;

import com.jimg.strategy.game.weapon.impl.KnifeBehavior;
import com.jimg.strategy.game.weapon.impl.SwordBehavior;

public class Queen extends Character{

    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }
    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
