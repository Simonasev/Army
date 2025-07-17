package sk.Army;

public class DefensiveSoldier extends Soldier {
    public DefensiveSoldier(String name, Category category) {
        super(name, Category.DEFENSIVE);
    }

    @Override
    public void specialAbility() {
        System.out.println(getName() + " is using a shield.");
    }
}
