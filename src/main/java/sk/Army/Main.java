package sk.Army;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Soldier> soldiers = List.of(
                new AdaptableSoldier("Anna", Category.ADAPTABLE),
                new AdaptableSoldier("Miro", Category.ADAPTABLE),
                new AdaptableSoldier("Rasto", Category.ADAPTABLE),
                new DefensiveSoldier("Peter", Category.DEFENSIVE),
                new DefensiveSoldier("Michal", Category.DEFENSIVE),
                new DefensiveSoldier("Vlado", Category.DEFENSIVE),
                new OffensiveSoldier("Naty", Category.OFFENSIVE),
                new OffensiveSoldier("Matteo", Category.OFFENSIVE),
                new OffensiveSoldier("Kika", Category.OFFENSIVE)
        );

        System.out.println("====== ARMY IS READY ======");
        soldiers.forEach(s -> System.out.println(s + " is here."));
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Write command offensive, defensive or quit: ");
            String command = scanner.nextLine().trim().toLowerCase();

            if (command.equals("quit")) {
                System.out.println("Exiting program...");
                break;
            }

            switch (command) {
                case "offensive":
                    System.out.println("Executing OFFENSIVE strategy...");
                    soldiers.stream().filter(s ->
                                    s.getCategory() == Category.OFFENSIVE ||
                                            s.getCategory() == Category.ADAPTABLE)
                            .forEach(s -> {
                                System.out.println(s.getName() + " takes defensive position!");
                                s.specialAbility();
                            });
                case "defensive":
                    System.out.println("Executing DEFENSIVE strategy...");
                    soldiers.stream()
                            .filter(s -> s.getCategory() == Category.DEFENSIVE ||
                                    s.getCategory() == Category.ADAPTABLE)
                            .forEach(s -> {
                                System.out.println(s.getName() + " takes defensive position!");
                                s.specialAbility();
                            });
                    break;
                default:
                    System.out.println("Unknown command.... ");

            }
        }
    }
}
