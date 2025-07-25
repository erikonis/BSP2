package lu.uni.programming1.lab10.exercise1;

import java.util.Scanner;

import lu.uni.programming1.lab10.exercise1.exceptions.EmptyNameException;
import lu.uni.programming1.lab10.exercise1.exceptions.ExistingCharacterException;
import lu.uni.programming1.lab10.exercise1.exceptions.FullPartyException;
import lu.uni.programming1.lab10.exercise1.exceptions.PartyRoleLimitException;
import lu.uni.programming1.lab10.exercise1.exceptions.TooLongNameException;
import lu.uni.programming1.lab10.exercise1.exceptions.UnkownCharacterRoleException;
import lu.uni.programming1.lab10.exercise1.exceptions.UnkownCommandException;

public class Launcher {
    public static void main(String[] args) throws TooLongNameException, EmptyNameException,
            UnkownCharacterRoleException, PartyRoleLimitException, FullPartyException, ExistingCharacterException {
        // Implement the main program here, i.e. this is where you will read the various
        // inputs from the user.
        // Remember: your program should run forever, i.e. constantly expect input from
        // the user, until they explicitly enter '0' to exit the program.

        Party party0 = new Party();
        Party party1 = new Party();

        System.out.print("Commands:\n0 - Exit\n1 - Create new character\n2 - Show party\n\nCommand: ");

        try (Scanner sc = new Scanner(System.in)) {
            int initialCommandInt = sc.nextInt();
            while (initialCommandInt != 0) {
                if (initialCommandInt == 1) {
                    System.out.print("Creating new character...\nEnter name: ");
                    String name = sc.next();
                    System.out.print("Enter role (DAMAGE, TANK, HEALER): ");
                    String cRole = sc.next();
                    //CharacterRole characterRole = CharacterRole.valueOf(cRole);
                    System.out.print("Add to party (0 or 1): ");
                    int partyNr = sc.nextInt();
                    Character c = new Character(name, cRole);
                    if (partyNr == 0) {
                        party0.add(c, partyNr);
                    }
                    if (partyNr == 1) {
                        party1.add(c, partyNr);
                    }
                } else if (initialCommandInt == 2) {
                    System.out.print("Show party (0 or 1): ");
                    int partyNr = sc.nextInt();
                    if (partyNr == 0) {
                        System.out.println(party0.toString());
                    } else if (partyNr == 1) {
                        System.out.println(party1.toString());
                    } else {
                        System.out.println(new UnkownCommandException(partyNr).getMessage());
                    }
                } else {
                    System.out.println(new UnkownCommandException(initialCommandInt).getMessage());
                }

                System.out.print("Commands:\n0 - Exit\n1 - Create new character\n2 - Show party\n\nCommand: ");
                initialCommandInt = sc.nextInt();

            }

            if(initialCommandInt == 0){
                System.out.println("Exiting");
            }

            sc.close();
        }

    }
}
