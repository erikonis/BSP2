package lu.uni.programming1.lab10.exercise1;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Party party1 = new Party();
        Party party2 = new Party();

        int loop = 3;

        while (loop > 0) {
            loop = 3;
            int length;

            System.out.println(
                    "Commands: \n \"0\" - Exit the program \n \"1\" - Create a new character \n \"2\" - Choose a party to view");
            loop = scanner.nextInt();

            switch (loop) {
                case 0:
                    System.out.println("Command: 0 \n Exiting!");
                    break;
                case 1:

                    System.out.println("Command: 1 \n Creating new character... \n Enter name:");
                    String name = scanner.next();
                    length = name.length();
                    if (length > 20) {
                        System.out.println("Invalid character name (name is too long - max 20 characters):" + name);
                        break;
                    }
                    if (length == 0) {
                        System.out.println("Invalid character name (name can't be empty): " + name);
                        break;
                    }
                    System.out.println("Enter role (DAMAGE, TANK, HEALER):");
                    CharacterRole role = CharacterRole.valueOf(scanner.next());

                    if (role.equals(CharacterRole.DAMAGE) || role.equals(CharacterRole.TANK)
                            || role.equals(CharacterRole.HEALER)) {
                        Character character = new Character(name, role);
                        System.out.println("Add to party (0 or 1):");
                        int partyNumber = scanner.nextInt();
                        if (partyNumber == 0) {
                            party1.add(character);
                            System.out.println("Added " + character.toString() + " to party " + partyNumber + ".");
                        }
                        if (partyNumber == 1) {
                            party2.add(character);
                            System.out.println("Added " + character.toString() + " to party " + partyNumber + ".");
                        }
                        break;
                    } else {
                        System.out.println("Unknown character role.");
                        break;
                    }

                case 2:
                    System.out.println("Command: 2 \n Show party (0 or 1):");
                    int partyNumber2 = scanner.nextInt();
                    if (partyNumber2 == 0) {
                        party1.toString();
                    }
                    if (partyNumber2 == 1) {
                        party2.toString();
                    }
                    if (partyNumber2 > 2 || partyNumber2 < 0) {
                        System.out.println(
                                "Command: 2 \n Unexpected index: Index" + partyNumber2 + "out of bounds for length 2");
                    }
                    break;
            }

        }

        scanner.close();
    }
}
