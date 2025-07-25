package lu.uni.programming1.lab10.exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

import lu.uni.programming1.lab10.exercise1.Exceptions.InvalidPArtyComposition;
import lu.uni.programming1.lab10.exercise1.Exceptions.PartyOverload;
import lu.uni.programming1.lab10.exercise1.Exceptions.WrongNumberYouIdiot;
import lu.uni.programming1.lab10.exercise1.Exceptions.nameTooLongException;

public class Launcher {
    private static final String[] baseProp = {"Create new Character", "Show party"};
    private static final String[] roleProp  = {"Damage", "Tank", "Healer"};
    private static final String[] partyProp = {"Party 1", "Party 2"};



    private static String displayPropositions(String[] actions, boolean quitOption) {

        String msg = "Commands  :";

        msg += quitOption ? "\n0 - Quit" : "";
        int offset = quitOption ? 1 : 0;

        for(int i = (0); i<actions.length; ++i) {
            msg += "\n" + (i+offset) + " - " + actions[i];
        }

        return msg;
    }

    private static void checkBounds(int min, int max, int n) throws WrongNumberYouIdiot{
        if (!(((n >= min) && (n <= max)))) {throw new WrongNumberYouIdiot();}
    }

    private static int ask(int min, int max, Scanner scan) {

        boolean asking = true;
        int choice = 0;

        while (asking) {
            try {
                System.out.println("->");
            

                choice = scan.nextInt();
                checkBounds(min, max, choice);
                
                asking = false;

            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number !!!!!!!!! (mismatch)");
                asking = true;
                choice = 0;


            } catch (WrongNumberYouIdiot e) {
                System.out.println("Pleaser enter a valid number !!!!!!!!! (outofbounds)");
                asking = true;
                choice = 0;

            } finally {
                scan.nextLine();
            }
        
        }

        return choice;
    }

    private static Character CreateNew(Scanner scan) {
        System.out.println("Creating...");

        String name = "";
        CharacterRole role;
        int partyId;
        
        //Custom asking for the name
        boolean asking = true;

        System.out.println("Input a name for your new Character (names must be shorter than 20 charaters");

        while (asking) {
            try {
                System.out.println("->");
                name = scan.next();
                if (name.length() > 20) {throw new nameTooLongException();}
                asking = false;
                
            } catch (nameTooLongException e) {
                System.out.println("The name must not exceed 20 characters");

                asking = true;
            } finally {
                scan.nextLine();
            }
        }
        //----//
        //Role
        System.out.println("Chose a role :");
        System.out.println(displayPropositions(roleProp, false));
        switch (ask(0, 2, scan)) {
            case 0 : {role = CharacterRole.DAMAGE; break;}
            case 1 : {role = CharacterRole.TANK; break;}
            case 2 : {role = CharacterRole.HEALER; break;}

            default : {role = CharacterRole.DAMAGE; break;}
        }

        //Which party
        System.out.println("Choose a party too add your character");
        System.out.println(displayPropositions(partyProp, false));
        partyId = ask(0, 1, scan);
        
        System.out.println("Created new character !");
        return new Character(name, role, partyId);
    }

    private static void addToParty(Character newChar, Party[] partyList) {
        Party toAdd = partyList[newChar.getPartyId()];

        try {
            toAdd.add(newChar);

        } catch (PartyOverload e) {
            System.out.println("The party is full !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        } catch (InvalidPArtyComposition e) {
            System.out.println("The party composition is not good");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    

    public static void main(String[] args) {
        // Implement the main program here, i.e. this is where you will read the various
        // inputs from the user.
        // Remember: your program should run forever, i.e. constantly expect input from
        // the user, until they explicitly enter '0' to exit the program.

        boolean doingStuff = true;

        Party p1 = new Party();
        Party p2 = new Party();

        Party[] partyList = {p1, p2};

        Scanner scan = new Scanner(System.in);

        Character newChar; 
        

        while (doingStuff) {

            System.out.println(displayPropositions(baseProp, true));

            switch (ask(0,2, scan)) {
                case 1 : {
                    System.out.println("Character creator assistant tool 2021");
                    newChar = CreateNew(scan);

                    addToParty(newChar, partyList);

                    break;
                }
                
                case 0 : {doingStuff = false; break;}

                case 2 : {
                    System.out.println("Party List");
                    System.out.println(p1.toString());
                    System.out.println(p2.toString());
                }
            }
        }

        scan.close();
    }

    
}
