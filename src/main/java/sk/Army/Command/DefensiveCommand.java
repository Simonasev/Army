package sk.Army.Command;

import sk.Army.CategoryOfSoldier.Category;
import sk.Army.CategoryOfSoldier.Soldier;

public class DefensiveCommand implements Command {
    @Override
    public void execute(Soldier soldier) {
        if (soldier.getCategory() == Category.DEFENSIVE || soldier.getCategory() == Category.ADAPTABLE) {
            System.out.println(soldier.getName() + " ( " + soldier.getCategory() + " ) is defending!");
            soldier.specialAbility();
        }

    }
}