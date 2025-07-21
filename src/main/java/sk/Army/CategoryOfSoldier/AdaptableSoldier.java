package sk.Army.CategoryOfSoldier;

import sk.Army.Soldier;

public class AdaptableSoldier extends Soldier {
    public AdaptableSoldier(String name) {
        super(name, Category.ADAPTABLE);
    }

    @Override
    public String specialAbility() {
        System.out.println(getName() + " is adaptable in every situation and uses a flamethrower.");
    return "";
    }
}
