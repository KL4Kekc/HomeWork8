package kg.geektech.game.players;

public class Tank extends Hero {

    private int returnAttack;

    public Tank(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
        this.returnAttack = returnAttack;
    }

    public int getReturnAttack() {
        return returnAttack;
    }

    public void setReturnAttack(int returnAttack) {
        this.returnAttack = returnAttack;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int health = boss.getHealth() - boss.getDamage();
        boss.setHealth(health);
        System.out.println("Tank return the attack!!!");
    }


}
