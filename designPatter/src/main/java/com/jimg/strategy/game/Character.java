package com.jimg.strategy.game;

import com.jimg.strategy.game.weapon.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weaponBehavior;

    public Character() {

    }

    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
