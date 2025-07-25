import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Party party0 = new Party();
        Party party1 = new Party();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command (0: Exit, 1: Create character, 2: View party): ");
            int command = getIntInput(scanner);

            if (command == 0) {
                break;
            } else if (command == 1) {
                createCharacter(scanner, party0, party1);
            } else if (command == 2) {
                viewParty(scanner, party0, party1);
            } else {
                System.out.println("Invalid command");
            }
        }

        scanner.close();
    }

    private static void createCharacter(Scanner scanner, Party party0, Party party1) {
        try {
            System.out.println("Enter character name: ");
            String name = scanner.nextLine();

            System.out.println("Enter character role (DAMAGE, TANK, HEALER): ");
            String roleInput = scanner.nextLine();
            CharacterRole role = CharacterRole.valueOf(roleInput.toUpperCase());

            System.out.println("Enter party number (0 or 1): ");
            int partyNumber = getIntInput(scanner);

            Character character = new Character(name, role);
            if (partyNumber == 0) {
                party0.add(character);
            } else if (partyNumber == 1) {
                party1.add(character);
            } else {
                throw new IllegalArgumentException("Invalid party number");
            }

            System.out.println("Character added successfully");
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void viewParty(Scanner scanner, Party party0, Party party1) {
        try {
            System.out.println("Enter party number to view (0 or 1): ");
            int partyNumber = getIntInput(scanner);

            if (partyNumber == 0) {
                party0.printParty();
            } else if (partyNumber == 1) {
                party1.printParty();
            } else {
                throw new IllegalArgumentException("Invalid party number");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static int getIntInput(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}
