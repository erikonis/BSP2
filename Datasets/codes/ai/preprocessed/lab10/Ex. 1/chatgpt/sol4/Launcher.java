import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Party[] parties = {new Party(), new Party()};
        boolean running = true;

        while (running) {
            try {
                System.out.println("\n0: Exit | 1: Create Character | 2: View Party");
                int choice = Integer.parseInt(scanner.nextLine().trim());

                switch (choice) {
                    case 0:
                        running = false;
                        break;
                    case 1:
                        createCharacter(scanner, parties);
                        break;
                    case 2:
                        viewParty(scanner, parties);
                        break;
                    default:
                        System.out.println("Invalid menu option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input type. Please enter a number.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Goodbye!");
    }

    private static void createCharacter(Scanner scanner, Party[] parties) throws Exception {
        System.out.print("Enter character name: ");
        String name = scanner.nextLine();

        System.out.print("Enter character role (DAMAGE / TANK / HEALER): ");
        String roleInput = scanner.nextLine().trim().toUpperCase();

        CharacterRole role;
        try {
            role = CharacterRole.valueOf(roleInput);
        } catch (IllegalArgumentException e) {
            throw new InvalidCharacterException("Invalid role name.");
        }

        Character character = new Character(name, role);

        System.out.print("Choose party (0 or 1): ");
        int partyIndex = Integer.parseInt(scanner.nextLine().trim());
        if (partyIndex != 0 && partyIndex != 1) {
            throw new IndexOutOfBoundsException("Invalid party index.");
        }

        parties[partyIndex].addCharacter(character);
        System.out.println("Character added to Party " + partyIndex + "!");
    }

    private static void viewParty(Scanner scanner, Party[] parties) {
        System.out.print("Which party to view? (0 or 1): ");
        try {
            int index = Integer.parseInt(scanner.nextLine().trim());
            parties[index].showParty();
        } catch (Exception e) {
            System.out.println("Invalid party index.");
        }
    }
}