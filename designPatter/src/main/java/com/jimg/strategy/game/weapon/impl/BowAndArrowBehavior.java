package com.jimg.strategy.game.weapon.impl;

import com.jimg.strategy.game.weapon.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("use bow and arrow");
    }
}
