package sk.Army;

abstract class Soldier {
    private String name;
    private Category category;

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

    @Override
    public String toString() {
        return name +  " (" + category + ")";
    }

}