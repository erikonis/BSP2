import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        // user's options
        System.out.println("************************");
        System.out.println("Commands options:");
        System.out.println("0-Exit");
        System.out.println("1-Create new character");
        System.out.println("2-Show party");
        System.out.println("************************");
        // define some parties
        Party party1 = new Party();
        Party party2 = new Party();
        // define scanner
        Scanner scanner = new Scanner(System.in);
        // define variable for the scanner's value
        int input = scanner.nextInt();
        // we need a while loop here, as long as input's value is not 0
        // ouput option
        while (input != 0) {
            // try...
            try {
                // invalid input
                if (input < 0 && input < 2) {
                    throw new IndexOutOfBoundsException("Invalid input");
                }
                // when the input 1 is
                if (input == 1) {

                    // define two String varibales
                    String characterName;
                    String characterRole;
                    CharacterRole Role;
                    // ask for a name
                    System.out.println("enter a name for your character:");
                    characterName = scanner.next();
                    // ask for a character
                    System.out.println("enter a role for your character:");
                    characterRole = scanner.next();
                    // check the roles
                    if (characterRole.equals("HEALER")) {
                        Role = CharacterRole.HEALER;
                    } else if (characterRole.equals("TANK")) {
                        Role = CharacterRole.TANK;
                    } else if (characterRole.equals("DAMAGE")) {
                        Role = CharacterRole.DAMAGE;
                    } else {
                        throw new EnumConstantNotPresentException(CharacterRole.class, characterRole);
                    }
                    // define character with his name and his role
                    Character character1 = new Character(characterName, Role);
                    System.out.println("To which party do you want, 0 or 1");
                    int location = scanner.nextInt();
                    // check in which party the character should be added
                    // party 0
                    if (location == 0) {
                        // add to the party
                        party1.add(character1);
                    }
                    // party 1
                    else if (location == 1) {
                        // add to the party
                        party2.add(character1);
                    }

                }
                // when the input 2 is
                // show the party
                else if (input == 2) {
                    // ask
                    System.out.println("show party 0 or 1");
                    int party = scanner.nextInt();
                    // check if the party is neither 0 or 1
                    if (party == 0 || party == 1) {
                        // then the party is 0
                        if (party == 0) {
                            // we use the .toString method from the party to show to show who all is in the
                            // party
                            System.out.println(party1.toString());
                        }
                        // the party is 1
                        else if (party == 1) {
                            // we use the .toString method from the party to show to show who all is in the
                            // party
                            System.out.println(party2.toString());
                        }
                    }
                    // entered something else (not the expected index 0,1,2)
                    else {
                        throw new IndexOutOfBoundsException("Unexpected index!!");
                    }
                }
            }
            // the character role is unknown, does not exist
            catch (EnumConstantNotPresentException ex) {
                System.err.println("Unknown character role");
            } catch (Exception s) {
                System.err.println(s.getMessage());
            }
            // the exit
            finally {
                System.out.println("Exit");
                input = scanner.nextInt();
            }
        }
        // close the scanner
        scanner.close();
    }
}
