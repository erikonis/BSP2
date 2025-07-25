import java.util.ArrayList;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        // Implement the main program here, i.e. this is where you will read the various
        // inputs from the user.
        // Remember: your program should run forever, i.e. constantly expect input from
        // the user, until they explicitly enter '0' to exit the program.
        Scanner scanner = new Scanner(System.in);
        Party party0 = new Party();
        Party party1 = new Party();
        ArrayList<Party> parties = new ArrayList<>();
        int choice = -1;

        parties.add(party0);
        parties.add(party1);
        
        while (choice != 0) {
            try {
                System.out.print("Commands:\n0 - Exit\n1 - Create new character\n2 - Show party\n\nCommand: ");
                choice = Integer.parseInt(scanner.nextLine());

                if (choice == 0) {
                    System.out.println("Exiting!");
                }

                //create new character
                if (choice == 1) {
                    System.out.print("Creating new character...\nEnter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter role (DAMAGE, TANK, HEALER): ");
                    String role = scanner.nextLine();

                    Character character = new Character(name, role);

                    System.out.print("Add to party (0 or 1): ");
                    int partyIndex = Integer.parseInt(scanner.nextLine());
                    
                    parties.get(partyIndex).add(character);
                    System.out.println("Added " + name + " (" + role + ") to party " + partyIndex + ".");
                }
                
                if (choice == 2) {
                    System.out.print("Show party (0 or 1): ");
                    int partyIndex = Integer.parseInt(scanner.nextLine());
                    Party party = parties.get(partyIndex);

                    System.out.println("\nParty ( " + party.getCharacters().size() + " members):");
                    for (Character character : party.getCharacters()) {
                        System.out.println("- " + character);
                    }
                    System.out.print("\n");
                }

            } catch (IllegalArgumentException illegalArgumentException) {
                System.err.println("Wrong value type for this field.");
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                System.err.println("Unexpected index: " + indexOutOfBoundsException.getMessage());
            } catch (NameTooLongException nameTooLongException) {
                System.err.println("Invalid character name (name is too long - max 20 characters): " + nameTooLongException.getName());
            } catch (NameTooShortException nameTooShortException) {
                System.err.println("Invalid character name (name can't be empty): " + nameTooShortException.getName());
            } catch (FullRoleException fullRoleException) {
                System.err.println("Can't add " + fullRoleException.getCharacter() + " to party: the party has reached the limit for the role " + fullRoleException.getCharacter().getRole());
            } catch (UnknownCharacterRoleException unknownCharacterRoleException) {
                System.err.println("Unknown character role.");
            } catch (AlreadyInException alreadyInException) {
                System.err.println("Can't add " + alreadyInException.getCharacter() + " to party, they're already in it.");
            } catch (FullPartyException fullPartyException) {
                System.err.println("The party is full: no other characters can be add to it.");
            }
        }
        scanner.close();
    }
}
