package kg.geektech.game.players;

public class Magic extends Hero {
    private int boost;

    public Magic(int health, int damage, int boost) {
        super(health, damage, SuperAbility.BOOST);
        this.boost = boost;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
                heroes[i].setDamage(heroes[i].getDamage() + boost);
                break;

        }
    }
}