import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Party party0 = new Party();
        Party party1 = new Party();
        int choice;

        do {
            System.out.println("\n--- Final Fantasy Party Manager ---");
            System.out.println("0 - Exit the program");
            System.out.println("1 - Create a new character");
            System.out.println("2 - Choose a Party to view");
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 0:
                        System.out.println("Exiting program.");
                        break;
                    case 1:
                        createCharacter(scanner, party0, party1);
                        break;
                    case 2:
                        viewParty(scanner, party0, party1);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input type. Please enter an integer.");
                scanner.nextLine(); // Consume the invalid input
                choice = -1; // Continue the loop
            }
        } while (choice != 0);

        scanner.close();
    }

    // Method to create a character
    private static void createCharacter(Scanner scanner, Party party0, Party party1) {
        System.out.print("Enter character name: ");
        String characterName = scanner.nextLine();

        System.out.print("Enter character role (DAMAGE, TANK, HEALER): ");
        String roleString = scanner.nextLine();
        CharacterRole role = null;

        try {
            role = CharacterRole.valueOf(roleString.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Invalid role name. Please enter DAMAGE, TANK, or HEALER.");
            return; // Return to the main menu
        }

        System.out.print("Enter the Party to which the Character should be added (0 or 1): ");
        int partyChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        Character character = null;
        try {
             character = new Character(characterName, role);
        } catch (InvalidCharacterNameException e){
            System.out.println("Error: " + e.getMessage());
            return;
        }


        try {
            if (partyChoice == 0) {
                party0.add(character);
            } else if (partyChoice == 1) {
                party1.add(character);
            } else {
                System.out.println("Error: Invalid party choice. Please enter 0 or 1.");
            }
        } catch (Party.PartyFullException | Party.InvalidRoleException | Party.CharacterAlreadyInPartyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to view a party
    private static void viewParty(Scanner scanner, Party party0, Party party1) {
        System.out.print("Enter the Party to show (0 or 1): ");
        int partyChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        if (partyChoice == 0) {
            System.out.println(party0);
        } else if (partyChoice == 1) {
            System.out.println(party1);
        } else {
            System.out.println("Error: Invalid party choice. Please enter 0 or 1.");
        }
    }
}