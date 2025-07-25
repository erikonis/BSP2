import java.util.InputMismatchException;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Party[] parties = {new Party(), new Party()};

        while (true) {
            printMainMenu();
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 0:
                        System.out.println("Exiting program...");
                        return;
                    case 1:
                        handleCharacterCreation(scanner, parties);
                        break;
                    case 2:
                        handleViewParty(scanner, parties);
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear invalid input
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void printMainMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("0 - Exit");
        System.out.println("1 - Create a new character and add to party");
        System.out.println("2 - View a party");
        System.out.print("Choose an option: ");
    }

    private static void handleCharacterCreation(Scanner scanner, Party[] parties) {
        try {
            String name = promptForName(scanner);
            CharacterRole role = promptForRole(scanner);
            int partyIndex = promptForPartyIndex(scanner);
            
            Character character = new Character(name, role);
            parties[partyIndex].add(character);
            System.out.println("Character added successfully to party " + partyIndex);
        } catch (IllegalArgumentException | PartyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static String promptForName(Scanner scanner) {
        System.out.print("Enter character name: ");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (name.length() > 20) {
            throw new IllegalArgumentException("Name cannot exceed 20 characters");
        }
        return name;
    }

    private static CharacterRole promptForRole(Scanner scanner) {
        System.out.print("Enter character role (DAMAGE, TANK, HEALER): ");
        String roleInput = scanner.nextLine().toUpperCase();
        try {
            return CharacterRole.valueOf(roleInput);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid role. Must be DAMAGE, TANK, or HEALER");
        }
    }

    private static int promptForPartyIndex(Scanner scanner) {
        System.out.print("Select party (0 or 1): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (index < 0 || index > 1) {
            throw new IllegalArgumentException("Invalid party selection");
        }
        return index;
    }

    private static void handleViewParty(Scanner scanner, Party[] parties) {
        try {
            int partyIndex = promptForPartyIndex(scanner);
            System.out.println(parties[partyIndex]);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}