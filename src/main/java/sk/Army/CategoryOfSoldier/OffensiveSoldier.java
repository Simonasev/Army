package sk.Army.CategoryOfSoldier;

public class OffensiveSoldier extends Soldier {
    public OffensiveSoldier(String name) {
        super(name, Category.OFFENSIVE);
    }

    @Override
    public String specialAbility() {
        System.out.println(getName() + " is throwing grenades.");
        return "";
    }
}
