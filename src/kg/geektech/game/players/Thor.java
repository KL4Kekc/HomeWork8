package kg.geektech.game.players;

import java.util.Random;

public class Thor extends Hero {

    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.SHOCK);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random ra = new Random();
        int random1 = ra.nextInt(3);
        if (random1 == 1) {
            System.out.println("Thor use Mjolnir!!!");
            boss.setDamage(boss.getDamage() - 80);

        } else {
            boss.setDamage(80);
        }
    }
}