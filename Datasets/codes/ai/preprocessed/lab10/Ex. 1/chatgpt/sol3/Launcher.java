import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Party[] parties = {new Party(), new Party()};

        while (true) {
            try {
                System.out.println("\nChoose an action:");
                System.out.println("0 - Exit");
                System.out.println("1 - Create new character");
                System.out.println("2 - View party");

                int option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 0:
                        System.out.println("Exiting...");
                        return;

                    case 1:
                        System.out.print("Enter character name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter character role (DAMAGE, TANK, HEALER): ");
                        String roleInput = scanner.nextLine().toUpperCase();

                        CharacterRole role;
                        try {
                            role = CharacterRole.valueOf(roleInput);
                        } catch (IllegalArgumentException e) {
                            throw new InvalidRoleException("Invalid role: " + roleInput);
                        }

                        Character character = new Character(name, role);

                        System.out.print("Choose a party (0 or 1): ");
                        int index = Integer.parseInt(scanner.nextLine());

                        if (index < 0 || index > 1) {
                            throw new InvalidPartyIndexException("Party index must be 0 or 1.");
                        }

                        parties[index].add(character);
                        System.out.println("Character added to party!");

                        break;

                    case 2:
                        System.out.print("Choose a party to view (0 or 1): ");
                        int viewIndex = Integer.parseInt(scanner.nextLine());

                        if (viewIndex < 0 || viewIndex > 1) {
                            throw new InvalidPartyIndexException("Party index must be 0 or 1.");
                        }

                        System.out.println(parties[viewIndex]);
                        break;

                    default:
                        System.out.println("Invalid option.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            } catch (InvalidCharacterNameException |
                     InvalidRoleException |
                     InvalidPartyIndexException |
                     DuplicateCharacterException |
                     PartyFullException |
                     RoleLimitExceededException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}