package kg.geektech.game.players;

import java.util.Random;

public class Warrior extends Hero {
    private int criticalDamage;

    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
        this.criticalDamage = criticalDamage;
    }

    public int getCriticalDamage() {
        return criticalDamage;
    }

    public void setCriticalDamage(int criticalDamage) {
        this.criticalDamage = criticalDamage;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int random1 = random.nextInt(4) + 1;
        int bossHealth = boss.getHealth() - (heroes[0].getDamage() * random1);
        boss.setHealth(bossHealth);
        System.out.println("Warrior make critical hit!!! " + (heroes[0].getDamage() * random1));
    }
}
