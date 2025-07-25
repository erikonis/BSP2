import java.util.InputMismatchException;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Party[] parties = {new Party(), new Party()};

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("0 - Exit");
            System.out.println("1 - Create a new character and add to party");
            System.out.println("2 - View a party");
            System.out.print("Choose an option: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 0:
                        System.out.println("Exiting program...");
                        return;
                    case 1:
                        createCharacterAndAddToParty(scanner, parties);
                        break;
                    case 2:
                        viewParty(scanner, parties);
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // clear the invalid input
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void createCharacterAndAddToParty(Scanner scanner, Party[] parties) {
        try {
            // Get character name
            System.out.print("Enter character name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                throw new IllegalArgumentException("Character name cannot be empty");
            }
            if (name.length() > 20) {
                throw new IllegalArgumentException("Character name cannot exceed 20 characters");
            }

            // Get character role
            System.out.print("Enter character role (DAMAGE, TANK, HEALER): ");
            String roleStr = scanner.nextLine().toUpperCase();
            CharacterRole role;

            try {
                role = CharacterRole.valueOf(roleStr);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid role. Must be DAMAGE, TANK, or HEALER");
            }

            // Get party to add to
            System.out.print("Select party to add to (0 or 1): ");
            int partyIndex = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (partyIndex < 0 || partyIndex > 1) {
                throw new IllegalArgumentException("Invalid party index. Must be 0 or 1");
            }

            // Create character and add to party
            Character character = new Character(name, role);
            parties[partyIndex].add(character);
            System.out.println("Character " + name + " added to party " + partyIndex);

        } catch (Exception e) {
            System.out.println("Error creating character: " + e.getMessage());
        }
    }

    private static void viewParty(Scanner scanner, Party[] parties) {
        try {
            System.out.print("Select party to view (0 or 1): ");
            int partyIndex = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (partyIndex < 0 || partyIndex > 1) {
                throw new IllegalArgumentException("Invalid party index. Must be 0 or 1");
            }

            System.out.println(parties[partyIndex]);
        } catch (Exception e) {
            System.out.println("Error viewing party: " + e.getMessage());
        }
    }
}