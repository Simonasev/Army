package sk.Army;

public class OffensiveSoldier extends Soldier {
    public OffensiveSoldier(String name, Category category) {
        super(name, Category.OFFENSIVE);
    }

    @Override
    public String specialAbility() {
        System.out.println(getName() + " is throwing grenades.");
        return "";
    }
}
