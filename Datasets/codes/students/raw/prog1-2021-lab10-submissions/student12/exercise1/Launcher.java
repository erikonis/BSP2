package lu.uni.programming1.lab10.exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("all")

public class Launcher {
    public static void main(String[] args) {
        // Implement the main program here, i.e. this is where you will read the various
        // inputs from the user.
        // Remember: your program should run forever, i.e. constantly expect input from
        // the user, until they explicitly enter '0' to exit the program.

        Party party1 = new Party();
        Party party2 = new Party();
        Party[] partyArray = new Party[2];
        partyArray[0] = party1;
        partyArray[1] = party2;
        
        Scanner scanner = new Scanner(System.in);
        int userCommand=-1;
        while(userCommand!=0){
            System.out.println("Commands:\n0 - Exit\n1 - Create new character\n2 - Show party\n\n");
            System.out.print("Command:");
            try {
                userCommand = scanner.nextInt();
                if(userCommand!=0 && userCommand!=1 && userCommand!=2){
                    throw new InputMismatchException("");
                }
            }catch(InputMismatchException e){
                System.out.println("this is not a command id\nWrong value type for this field.");
                userCommand =-1;
            }finally{
                scanner.nextLine();
            }
            if(userCommand==1){//Create and add a new character
                System.out.println("Please enter the character name: ");
                String name = scanner.next();
                int exceptionCount=0;
                if(name==""){
                    try {
                        throw new NameException("Invalid character name (name can't be empty): "+name);
                    } catch (NameException e) {
                        System.out.println(e.getMessage());
                        exceptionCount++; 
                    }
                }else if(name.length()>20){
                    try {
                        throw new NameException("Invalid character name (name is too long - max 20 characters): "+name);
                    } catch (NameException e) {
                        System.out.println(e.getMessage());
                        exceptionCount++;
                    }
                }
                
                if(exceptionCount==0){
                    System.out.println("Please enter the character role: ");
                CharacterRole role=null;
                Character character = null;
                try {
                    role = CharacterRole.getCharacterRoleFromString(scanner.next());
                } catch (RoleException e1) {
                    System.out.println(e1.getMessage());
                }
    
                if(role!=null){
                    if((!role.equals(CharacterRole.HEALER) && !role.equals(CharacterRole.TANK) && !role.equals(CharacterRole.DAMAGE))|| role==null){
                        try {
                            throw new RoleException("Unknown character role!");
                        } catch (RoleException e) {
                            System.out.println(e.getMessage());
                        }
                    }else{
                        character = new Character(name, role);
                    }
                }else{
                    try {
                        throw new RoleException("Unknown character role!");
                    } catch (RoleException e) {
                        System.out.println(e.getMessage());
                    }
                }
                if(character!=null){
                    System.out.print("Add to party (0 or 1):");
                    int index = scanner.nextInt();
                    int exceptionCount1=0;
                    if(index==0 || index==1){
                        try {
                            partyArray[index].add(character);
                        }catch (InvalidRoleForTheGivenPartyException e) {
                            System.out.println(e.getMessage());
                            exceptionCount1++;
                        } catch (CharacterAlreadyInThePartyException e) {
                            System.out.println(e.getMessage());
                            exceptionCount1++;
                        }catch(FullPartyException e){
                            System.out.println(e.getMessage());
                            exceptionCount1++;
                        }
                        if(exceptionCount1==0){
                            System.out.println("Added "+character.toString()+" to party "+index+".");
                        }
                    }else{
                        try {
                            throw new InvalidIndexException("Unexpected index: Index "+index+" out of bounds for length 2");
                        }catch (InvalidIndexException e){
                            System.out.println(e.getMessage());
                        } 
                    }
                    scanner.nextLine();
                }
                }
                


            }else if(userCommand==2){//Display party
                System.out.println("Please choose party to view (0 or 1): ");
                int partyNumber = scanner.nextInt();
                if(partyNumber!=0 && partyNumber!=1){
                    try {
                        throw new InvalidIndexException("Unexpected index: Index "+partyNumber+" out of bounds for length 2");
                    } catch (InvalidIndexException e) {
                        System.out.println(e.getMessage());
                    }
                }else{
                    System.out.println(partyArray[partyNumber]);
                }
                scanner.nextLine();
            }
        }
        if(userCommand==0){
            System.out.println("Exiting!");
        }
        
    }
}
