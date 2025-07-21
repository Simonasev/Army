package sk.Army;

import sk.Army.CategoryOfSoldier.*;
import sk.Army.Command.Command;
import sk.Army.Command.DefensiveCommand;
import sk.Army.Command.OffensiveCommand;

import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        List<Soldier> soldiers = List.of(
                new AdaptableSoldier("Anna"),
                new AdaptableSoldier("Miro"),
                new AdaptableSoldier("Rasto"),
                new DefensiveSoldier("Peter"),
                new DefensiveSoldier("Michal"),
                new DefensiveSoldier("Vlado"),
                new OffensiveSoldier("Naty"),
                new OffensiveSoldier("Matteo"),
                new OffensiveSoldier("Kika")
        );

        System.out.println("====== ARMY IS READY ======");
        soldiers.forEach(s -> System.out.println(s.getReport() + " is here."));
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Write command offensive, defensive or quit: ");
            String command = scanner.nextLine().trim().toLowerCase();

            if (command.equals("quit")) {
                System.out.println("Exiting program...");
                break;
            }

            Command cmd = null;

                switch (command) {
                    case "offensive":
                        cmd = new OffensiveCommand();
                        break;
                    case "defensive":
                        cmd = new DefensiveCommand();
                        break;
                    default:
                        System.out.println("Unknown command!");
                        continue;
                }

                for (Soldier s : soldiers) {
                    cmd.execute(s);
                }
            }
        }
    }
