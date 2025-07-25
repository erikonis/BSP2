import java.util.InputMismatchException;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Party party0 = new Party();
        Party party1 = new Party();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter '0' to exit, '1' to create a new character, '2' to view a party:");
            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume invalid input
                continue;
            }

            if (choice == 0) {
                break;
            } else if (choice == 1) {
                try {
                    System.out.println("Enter character name:");
                    String name = scanner.nextLine();
                    if (name.isEmpty() || name.length() > 20) {
                        throw new Exception("Invalid character name.");
                    }

                    System.out.println("Enter character role (DAMAGE, TANK, HEALER):");
                    String roleInput = scanner.nextLine().toUpperCase();
                    CharacterRole role;
                    try {
                        role = CharacterRole.valueOf(roleInput);
                    } catch (IllegalArgumentException e) {
                        throw new Exception("Invalid role name.");
                    }

                    System.out.println("Enter party number (0 or 1):");
                    int partyNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    Character character = new Character(name, role);
                    if (partyNumber == 0) {
                        party0.add(character);
                    } else if (partyNumber == 1) {
                        party1.add(character);
                    } else {
                        throw new Exception("Invalid party number.");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else if (choice == 2) {
                try {
                    System.out.println("Enter party number to view (0 or 1):");
                    int partyNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (partyNumber == 0) {
                        System.out.println(party0);
                    } else if (partyNumber == 1) {
                        System.out.println(party1);
                    } else {
                        throw new Exception("Invalid party number.");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Invalid choice. Please enter '0', '1', or '2'.");
            }
        }

        scanner.close();
    }
}
