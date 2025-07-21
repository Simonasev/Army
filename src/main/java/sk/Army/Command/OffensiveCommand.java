package sk.Army.Command;

import sk.Army.CategoryOfSoldier.Category;
import sk.Army.CategoryOfSoldier.Soldier;

public class OffensiveCommand implements Command{
    @Override
    public void execute(Soldier soldier) {
        if (soldier.getCategory() == Category.OFFENSIVE || soldier.getCategory() == Category.ADAPTABLE) {
            System.out.println(soldier.getReport() + " is attacking !!! ");
            soldier.specialAbility();
        }

    }
}