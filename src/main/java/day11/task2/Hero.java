package day11.task2;

public abstract class Hero implements PhysAttack {
    int health;
    int physAttack;
    double physDef;
    double magicDef;

    final int MIN = 0;

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attack = physAttack * (1 - hero.physDef);
        if (hero.health - attack < MIN) {
            hero.health = 0;
        } else {
            hero.health -= attack;
        }
    }
}
