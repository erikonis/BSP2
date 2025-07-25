package lu.uni.programming1.lab10.exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.naming.InvalidNameException;

public class Launcher {

    public void perfRoleException() throws RoleException{}
    public static void main(String[] args) throws InvalidNameException, InputMismatchException, RoleException, IndexOutOfBoundsException, FullPartyException, PartyCompException, DuplicateCharException{
        // Implement the main program here, i.e. this is where you will read the various
        // inputs from the user.
        // Remember: your program should run forever, i.e. constantly expect input from
        // the user, until they explicitly enter '0' to exit the program.

        
        Party[] party = new Party[2];
        party[0] = new Party(0);
        party[1] = new Party(1);
        boolean toDo = true;

        System.out.println("Welcome to the Party Composition System!");
        Scanner sc = new Scanner(System.in);


        while (toDo){
            System.out.println();
            System.out.println("0 - Exit the program\n" + "1 - Create a new Character\n" + "2 - Choose a party to view.");
            System.out.println();
            try {int n = sc.nextInt();
                switch(n){
                    case 0:
                    System.out.println("Finished."); toDo = false; break;
    
                    case 1: 
                    Character character;
                    System.out.println("Please enter a name for your character: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    
                    System.out.println("\nPlease choose a role for your character by typing the corresponding name in the console: \n" + "DAMAGE = dd\n" + "TANK = tank\n" + "HEALER = healer");
                   try {
                    String role = sc.nextLine();
                    System.out.println();
                    switch(role){
                        case "dd" :
                            try {
                                character = new Character(name, CharacterRole.DAMAGE);
                                System.out.println("Which party should your character be added to?");
                                int b = sc.nextInt();
                                party[b].add(character);
                                break;
                            }
                            catch (InvalidNameException | IndexOutOfBoundsException ex){
                                System.err.println(ex);
                                break;
                            } 
                        
                        case "tank" :
                        try {
                        character = new Character(name, CharacterRole.TANK);
                        System.out.println("Which party should your character be added to?");
                        
                        int b = sc.nextInt();
                        party[b].add(character);
                        break; 
                        }

                        catch (InvalidNameException | IndexOutOfBoundsException ex){
                        System.err.println(ex);
                        break;
                        } 
                    
                        case "healer" :
                        try {
                        character = new Character(name, CharacterRole.HEALER);
                        System.out.println("Which party should your character be added to?");
                        int b = sc.nextInt();
                        party[b].add(character);
                        break;  
                    
                        }
                        catch (InvalidNameException | IndexOutOfBoundsException ex){
                        System.err.println(ex);
                        break;
                        } 
    
                        default: throw new RoleException("role doesn't exist");
                       
                    }
                break;
                   }

                   catch (RoleException exc){
                    System.err.println(exc);
                        break;
                   } 
    
                     case 2:
                     System.out.println("Which party should be shown? Enter 0 or 1");
                     int k = sc.nextInt();
                     System.out.println(party[k].toString());
                     break;

                    default: System.out.println("Error");
    
                }
            }
            catch (InputMismatchException iex){
                System.err.println(iex + " Wrong value type for this field");
                sc.next();
            }

            
            
            
        }
    }
}
