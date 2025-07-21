package sk.Army.CategoryOfSoldier;

import sk.Army.Soldier;

public class DefensiveSoldier extends Soldier {
    public DefensiveSoldier(String name) {
        super(name, Category.DEFENSIVE);
    }

    @Override
    public String specialAbility() {
        System.out.println(getName() + " is using a shield.");
    return "";}
}
