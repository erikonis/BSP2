import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Party party0 = new Party();
        Party party1 = new Party();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command (0: Exit, 1: Create character, 2: View party):");
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input type. Please enter a number.");
                continue;
            }

            if (command == 0) {
                break;
            } else if (command == 1) {
                try {
                    System.out.println("Enter character name:");
                    String name = scanner.nextLine();
                    if (name.isEmpty() || name.length() > 20) {
                        throw new InvalidCharacterNameException("Invalid character name.");
                    }

                    System.out.println("Enter character role (DAMAGE, TANK, HEALER):");
                    String roleInput = scanner.nextLine();
                    CharacterRole role;
                    try {
                        role = CharacterRole.valueOf(roleInput.toUpperCase());
                    } catch (IllegalArgumentException e) {
                        throw new InvalidRoleException("Invalid role name.");
                    }

                    System.out.println("Enter party index (0 or 1):");
                    int partyIndex = Integer.parseInt(scanner.nextLine());
                    if (partyIndex != 0 && partyIndex != 1) {
                        throw new Exception("Invalid party index.");
                    }

                    Character character = new Character(name, role);
                    if (partyIndex == 0) {
                        party0.add(character);
                    } else {
                        party1.add(character);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else if (command == 2) {
                try {
                    System.out.println("Enter party index to view (0 or 1):");
                    int partyIndex = Integer.parseInt(scanner.nextLine());
                    if (partyIndex != 0 && partyIndex != 1) {
                        throw new Exception("Invalid party index.");
                    }

                    if (partyIndex == 0) {
                        party0.printParty();
                    } else {
                        party1.printParty();
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Invalid command.");
            }
        }

        scanner.close();
    }
}
