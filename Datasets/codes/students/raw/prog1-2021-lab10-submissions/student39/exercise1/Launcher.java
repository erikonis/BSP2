package lu.uni.programming1.lab10.exercise1;

import java.util.*;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = -1;
        String role = " ";
        String name = " ";
        Party[] partyArr = {new Party(),new Party()};

        do {
                System.out.println( "Commands:" + 
                                    "\n0 - Exit" +
                                    "\n1 - Create new character" +
                                    "\n2 - Show party");
                System.out.print("\nCommand: ");

                try {
                    input = sc.nextInt();
                    if(input != 0 && input != 1 && input != 2){
                        throw new IllegalArgumentException();
                    }
                } catch(IllegalArgumentException e) {
                    System.err.println("Wrong value type for this field.");
                } catch(InputMismatchException e) {
                    System.err.println("Wrong value type for this field.");
                    sc.nextLine();
                }

            if(input == 0) {
                System.out.println("Exiting!");
            }
            try {
                if(input == 1) {

                    name = " ";
                    role = " ";
                    int parInput;
                    System.out.println("Creating a new character...");
                    System.out.print("Enter name: ");
                    name = sc.next();
                    System.out.print("Enter role (DAMAGE, TANK, HEALER): ");
                    role = sc.next();
                    Character character = new Character(name, CharacterRole.valueOf(role));
                    System.out.print("Add to party (0 or 1): ");
                    parInput = sc.nextInt();

                    if(parInput == 1) {
                        partyArr[0].add(character);
                    }
                    else {
                        partyArr[1].add(character);
                    }
                    input = -1;
                }
            } catch (InvalidRoleException e) {
                System.err.println("Unknown character role.");
            } catch (InputMismatchException e) {
                System.err.println("Wrong value type for this field.");
            } catch (IllegalArgumentException e) {
                System.err.println("Invalid character name " + e.getMessage());
            } catch (PartyFullException e) {
                System.err.println("The party is full: no other characters can be added to it.");
            } catch (AlreadyInPartyException e) {
                System.err.println(e.getMessage());
            }

            if(input == 2) {
                int show = -1;
                System.out.print("\nShow party (0 or 1): ");
                try {
                    show = sc.nextInt();
                    partyArr[show].toString();
                } catch (InputMismatchException e) {
                    System.err.println("Wrong value type for this field.");
                } catch (IndexOutOfBoundsException e) {
                    System.err.println("Unexpected index: Index " + show + " out of bounds for length " + partyArr.length );
                }
            }
        }
        while(input!=0);
        sc.close();
    }
}
