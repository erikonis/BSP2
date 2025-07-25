import java.util.InputMismatchException;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        // Implement the main program here, i.e. this is where you will read the various
        // inputs from the user.
        // Remember: your program should run forever, i.e. constantly expect input from
        // the user, until they explicitly enter '0' to exit the program.
        Scanner playerEntry = new Scanner(System.in);

        int choice;
        String heroname = "";
        String role = "";

        CharacterRole playerRole = null;
        Character createCharacter = new Character(heroname, playerRole);

        Party party1 = new Party();
        Party party2 = new Party();

        int partyChoice;
        int amount;

        do{

            System.out.print("Select option:\n0 - Exit \n1 - Create new character \n2 - Show party \nCommand: ");
 
            choice = playerEntry.nextInt(); 
            playerEntry.nextLine();

            if (choice == 1){

                System.out.print("Creating new character...\nEnter name: ");

                heroname = playerEntry.nextLine();
                int nameLength = heroname.length();

                try {
                    while (nameLength > 12 || heroname == null){
                        throw new StringTooLongExeption();
                    }
                }

                catch (StringTooLongExeption ex){
                    System.out.println("Invalid character name (name is too long - max 20 characters): " + heroname);
                    heroname = playerEntry.nextLine();
                    nameLength = heroname.length();
                }

                catch (InputMismatchException tmm){
                    System.out.println("Wrong value type for this field.");
                    heroname = playerEntry.nextLine();
                    nameLength = heroname.length();
                }

                System.out.print("Enter role (DAMAGE, TANK, HEALER): ");
                role = playerEntry.nextLine();

                try {
                    playerRole = CharacterRole.valueOf(role.toUpperCase());
                }

                catch(IllegalArgumentException ill){
                    System.out.println("Unknown character role.");
                    role = playerEntry.nextLine();
                    playerRole = CharacterRole.valueOf(role.toUpperCase());
                }
                
                createCharacter = new Character(heroname, playerRole);

                System.out.print("Add to party (0 or 1): ");

                partyChoice = playerEntry.nextInt();
                playerEntry.nextLine();

                try{

                    while (partyChoice > 1){
                        throw new IndexOutOfBoundsException();
                    }

                }
                catch(IndexOutOfBoundsException index){

                    System.out.println("Unexpected index: Index " + choice + " out of bounds for length 2");
                    partyChoice = playerEntry.nextInt();

                }

                if (partyChoice == 0){
                    amount = party1.getNum();

                    if (amount < 4){
                        party1.add(createCharacter);
                    }
                    else{
                        System.out.println("Party is full.");
                    }

                }

                if (partyChoice == 1){
                    amount = party2.getNum();

                    if (amount < 4){
                        party2.add(createCharacter);
                    }
                    else{
                        System.out.println("The party is full: no other characters can be added to it.");
                    }

                }
            }

            if (choice == 2){

                System.out.println("Choose party to display: (0) or (1).");

                partyChoice = playerEntry.nextInt();
                playerEntry.nextLine();

                try{

                    while (partyChoice > 1){
                        throw new IndexOutOfBoundsException();
                    }

                }
                catch(IndexOutOfBoundsException index){
                    System.out.println("Unexpected index: Index " + choice + " out of bounds for length 2");
                    partyChoice = playerEntry.nextInt();
                }

                if (partyChoice == 0){

                    System.out.println(party1.toString());

                }

                if (partyChoice == 1){

                    System.out.println(party2.toString());

                }

            } 

        }while (choice != 0);

        playerEntry.close();
    }

}
