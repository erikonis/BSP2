import java.util.InputMismatchException;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Party[] parties = { new Party(), new Party() };

        while (true) {
            System.out.println("Choose an option:\n0 - Exit\n1 - Create character\n2 - View party");
            try {
                int option = Integer.parseInt(scanner.nextLine().trim());

                if (option == 0) break;

                switch (option) {
                    case 1 -> createCharacter(scanner, parties);
                    case 2 -> viewParty(scanner, parties);
                    default -> System.out.println("Invalid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        scanner.close();
        System.out.println("Program terminated.");
    }

    private static void createCharacter(Scanner scanner, Party[] parties) {
        try {
            System.out.print("Enter character name: ");
            String name = scanner.nextLine().trim();

            System.out.print("Enter role (DAMAGE, TANK, HEALER): ");
            String roleInput = scanner.nextLine().trim().toUpperCase();
            CharacterRole role = CharacterRole.valueOf(roleInput);

            System.out.print("Add to which party? (0 or 1): ");
            int partyIndex = Integer.parseInt(scanner.nextLine().trim());
            if (partyIndex < 0 || partyIndex > 1) throw new IndexOutOfBoundsException("Invalid party index.");

            Character character = new Character(name, role);
            parties[partyIndex].add(character);
            System.out.println("Character added!");

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid party index.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void viewParty(Scanner scanner, Party[] parties) {
        try {
            System.out.print("Which party to view? (0 or 1): ");
            int index = Integer.parseInt(scanner.nextLine().trim());
            if (index < 0 || index > 1) throw new IndexOutOfBoundsException("Invalid party index.");

            System.out.println(parties[index]);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
