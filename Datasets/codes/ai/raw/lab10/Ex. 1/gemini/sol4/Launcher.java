import java.util.InputMismatchException;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Party[] parties = new Party[2];
        parties[0] = new Party();
        parties[1] = new Party();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Final Fantasy Party Manager (State-Based) ---");
            System.out.println("0 - Exit");
            System.out.println("1 - Create a new character");
            System.out.println("2 - View a Party");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 0:
                        System.out.println("Exiting program.");
                        scanner.close();
                        return;
                    case 1:
                        createCharacterAndAddToParty(scanner, parties);
                        break;
                    case 2:
                        viewParty(scanner, parties);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input type. Please enter an integer.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
    }

    private static void createCharacterAndAddToParty(Scanner scanner, Party[] parties) {
        System.out.print("Enter character name: ");
        String characterName = scanner.nextLine();

        System.out.print("Enter character role (DAMAGE, TANK, HEALER): ");
        String roleString = scanner.nextLine();

        System.out.print("Enter the Party to add the character to (0 or 1): ");
        int partyIndex = scanner.nextInt();
        scanner.nextLine();

        try {
            CharacterRole role = CharacterRole.fromString(roleString);
            Character character = new Character(characterName, role);
            parties[partyIndex].addCharacter(character);
            System.out.println("Character added to Party " + partyIndex + " successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid party index. Please enter 0 or 1.");
        } catch (PartyFullException | InvalidPartyCompositionException | CharacterAlreadyInPartyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void viewParty(Scanner scanner, Party[] parties) {
        System.out.print("Enter the Party to view (0 or 1): ");
        int partyIndex = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        try {
            System.out.println(parties[partyIndex]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid party index. Please enter 0 or 1.");
        }
    }
}