package sk.Army;

import sk.Army.CategoryOfSoldier.Category;

public abstract class Soldier {
    private final String name;
    private final Category category;

    public Soldier(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public abstract String specialAbility ();

    public String getReport() {
        return getName()  + " ( " + category + " ) ";
    }

}