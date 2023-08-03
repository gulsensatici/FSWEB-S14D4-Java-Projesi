package com.workintech.abstraction.rpg;

public class Werewolf extends Monster{
    public Werewolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage() + bleed() + poison();
    }

    @Override
    public double attack() {
        return getDamage()*0.25;
    }

    @Override
    public double poison() {
        return 0;
    }
}
