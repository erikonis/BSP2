import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lu.uni.programming1.lab10.exercise1.exceptions.EmptyNameException;
import lu.uni.programming1.lab10.exercise1.exceptions.NameTooLongException;
import lu.uni.programming1.lab10.exercise1.exceptions.PartyCompleteException;
import lu.uni.programming1.lab10.exercise1.exceptions.RoleCompleteException;
import lu.uni.programming1.lab10.exercise1.exceptions.RoleException;

public class Launcher {

    private static List<Party> parties = new ArrayList<>(2);
    private static Scanner scanInput = new Scanner(System.in);

    public static void main(String[] args) {
        // Implement the main program here, i.e. this is where you will read the various
        // inputs from the user.
        // Remember: your program should run forever, i.e. constantly expect input from
        // the user, until they explicitly enter '0' to exit the program.

        // Character sarah = new Character("Sarah", CharacterRole.DAMAGE);
        // Character iolanda = new Character("Iolanda", CharacterRole.HEALER);
        Party party0 = new Party();
        Party party1 = new Party();
        parties.add(party0);
        parties.add(party1);
        // party0.add(sarah);
        // party1.add(iolanda);

        printMainMenu();
        scanInput.close();

    }

    private static void showParty() {
        try {
            System.out.println("Show party (0 or 1):");
            int partychoose = Integer.parseInt(scanInput.nextLine());

            if (partychoose == 0) {
                System.out.println(parties.get(0).toString());

            } else if (partychoose == 1) {
                System.out.println(parties.get(1).toString());
            } else {
                System.out.println("Unexpected index: Index " + partychoose + " out of bounds for length 2");
            }

        } catch (Exception e) {
            if (e instanceof IndexOutOfBoundsException) {
                System.out.println("This index is not valid");
            }
            printMainMenu();
        }

    }

    private static void createNewCharacter() throws NameTooLongException, EmptyNameException, RoleException,
            PartyCompleteException, RoleCompleteException {

        System.out.println("Enter name:");
        String name = scanInput.nextLine();

        System.out.println("Enter role (DAMAGE, TANK, HEALER):");
        String role = scanInput.nextLine();

        System.out.println("Add to party (0 or 1)");
        int party = Integer.parseInt(scanInput.nextLine());
        CharacterRole characterRole;
        try {
            characterRole = CharacterRole.valueOf(role);
        } catch (Exception e) {
            throw new RoleException();
        }

        Character character = new Character(name, characterRole);
        parties.get(party).add(character);

        printMainMenu();

    }

    private static void printMainMenu() {
        try {
            System.out.println("Commands: \n0 - Exit the program \n1 - Create new character \n2 - Show party");
            System.out.println("Enter a Command");
            int command = Integer.parseInt(scanInput.nextLine()); // Read user input
            System.out.println("You have choose the command: " + command); // Output user input
            if (command == 1) {
                createNewCharacter();
            } else if (command == 2) {
                showParty();
            } else if (command == 0) {
                // Don't do nothing
                System.out.println("Exiting!!!");
            } else {
                System.out.println("This is not a command id. Wrong value type for this field");
            }
        } catch (Exception e) {
            if (e instanceof EmptyNameException) {
                System.out.println("Invalid character name (name can't be empty)");
            } else if (e instanceof NameTooLongException) {
                System.out.println("Invalid character name (name is too long - max 20 characters)");
            } else if (e instanceof NumberFormatException) {
                System.out.println("This command is not valid");
            } else if (e instanceof RoleException) {
                System.out.println("This role is not valid (DAMAGE, TANK, HEALER)");
            } else if (e instanceof RoleCompleteException) {
                System.out.println("The party is complete for this role");
            } else if (e instanceof PartyCompleteException) {
                System.out.println("This party is complete");
            } else {
                System.out.println(e);
            }
            printMainMenu();
        }

    }
}
