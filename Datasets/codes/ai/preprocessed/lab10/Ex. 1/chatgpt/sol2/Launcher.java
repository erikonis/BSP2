import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Party[] parties = {new Party(), new Party()};

        while (true) {
            try {
                System.out.println("Menu:
0 - Exit
1 - Add Character
2 - View Party");
                int choice = Integer.parseInt(scanner.nextLine());

                if (choice == 0) break;
                if (choice == 1) {
                    System.out.print("Enter character name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter role (DAMAGE, TANK, HEALER): ");
                    String roleStr = scanner.nextLine().toUpperCase();
                    CharacterRole role = CharacterRole.valueOf(roleStr);

                    System.out.print("Add to party (0 or 1): ");
                    int partyIndex = Integer.parseInt(scanner.nextLine());
                    if (partyIndex < 0 || partyIndex >= parties.length)
                        throw new IndexOutOfBoundsException("Invalid party index.");

                    Character character = new Character(name, role);
                    parties[partyIndex].add(character);
                    System.out.println("Character added successfully!");

                } else if (choice == 2) {
                    System.out.print("View which party (0 or 1): ");
                    int partyIndex = Integer.parseInt(scanner.nextLine());
                    parties[partyIndex].printParty();
                } else {
                    System.out.println("Unknown option.");
                }
            } catch (InvalidCharacterException | IllegalArgumentException |
                     IndexOutOfBoundsException | PartyFullException |
                     InvalidRoleException | DuplicateCharacterException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
    }
}