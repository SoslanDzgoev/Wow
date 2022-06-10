package day11.task2;

public class Magician extends Hero implements MagicAttack{
        int magicAttack = 20;

    public Magician() {
        physAttack = 5;
        physDef = 0;
        magicDef = 0.8;


    }

    @Override
    public void magicalAttack(Hero hero) {
        double magAttack = magicAttack * (1 - hero.magicDef);
        if (hero.health - magicAttack < MIN){
            hero.health = 0;
        }else {
            hero.health -= magAttack;
        }
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
