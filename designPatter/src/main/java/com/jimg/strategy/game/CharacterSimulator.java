package com.jimg.strategy.game;

import com.jimg.strategy.game.weapon.impl.KnifeBehavior;

public class CharacterSimulator {
    public static void main(String[] args) {

        Character king = new King();
        king.fight();
        king.setWeaponBehavior(new KnifeBehavior());
        king.fight();
    }
}
