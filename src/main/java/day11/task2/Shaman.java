package day11.task2;

public class Shaman extends Hero implements Healer {
    int magicAttack = 10;

    public Shaman() {
        physAttack = 10;
        physDef = 0.2;
        magicDef = 0.2;

    }

    @Override
    public void healHimself() {
        if (health + 50 > 100) {
            health = 100;
        } else {
            health += 50;
        }

    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 30 > 100) {
            hero.health = 100;
        } else {
            hero.health += 30;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
