package sk.Army.Command;

import sk.Army.CategoryOfSoldier.Soldier;

public interface Command {
    void execute (Soldier soldier);
}
