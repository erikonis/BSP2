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
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
                continue;
            }

            if (choice == 0) {
                break;
            } else if (choice == 1) {
                scanner.nextLine(); // Consume newline

                System.out.println("Enter character name:");
                String name = scanner.nextLine();
                try {
                    if (name.isEmpty() || name.length() > 20) {
                        throw new InvalidCharacterNameException("Invalid character name.");
                    }
                } catch (InvalidCharacterNameException e) {
                    System.out.println(e.getMessage());
                    continue;
                }

                System.out.println("Enter character role (DAMAGE, TANK, HEALER):");
                String roleInput = scanner.nextLine();
                CharacterRole role;
                try {
                    role = CharacterRole.valueOf(roleInput.toUpperCase());
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid role name.");
                    continue;
                }

                Character character = new Character(name, role);

                System.out.println("Enter party index (0 or 1):");
                int partyIndex;
                try {
                    partyIndex = scanner.nextInt();
                    if (partyIndex != 0 && partyIndex != 1) {
                        throw new IndexOutOfBoundsException("Invalid party index.");
                    }
                } catch (InputMismatchException | IndexOutOfBoundsException e) {
                    System.out.println(e.getMessage());
                    scanner.next(); // Clear the invalid input
                    continue;
                }

                try {
                    if (partyIndex == 0) {
                        party0.add(character);
                    } else {
                        party1.add(character);
                    }
                } catch (PartyFullException | RoleAlreadyExistsException | CharacterAlreadyInPartyException e) {
                    System.out.println(e.getMessage());
                }
            } else if (choice == 2) {
                System.out.println("Enter party index to view (0 or 1):");
                int partyIndex;
                try {
                    partyIndex = scanner.nextInt();
                    if (partyIndex != 0 && partyIndex != 1) {
                        throw new IndexOutOfBoundsException("Invalid party index.");
                    }
                } catch (InputMismatchException | IndexOutOfBoundsException e) {
                    System.out.println(e.getMessage());
                    scanner.next(); // Clear the invalid input
                    continue;
                }

                if (partyIndex == 0) {
                    System.out.println(party0);
                } else {
                    System.out.println(party1);
                }
            } else {
                System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
