package lu.uni.programming1.lab10.exercise1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) throws Exception {
        // Implement the main program here, i.e. this is where you will read the various
        // inputs from the user.
        // Remember: your program should run forever, i.e. constantly expect input from
        // the user, until they explicitly enter '0' to exit the program.
        Scanner scanner = new Scanner(System.in);
        String input;
        int num;
        Party party0 = new Party();
        Party party1 = new Party();

        while(true){
            System.out.println("Commands:\n0 - Exit\n1 - Create new character\n2 - Show party\n");

            System.out.print("Command: ");
            
            try {
                num = scanner.nextInt();
                check012(num);
            } 
            catch (Exception012 e) {
                scanner.close();
                throw e;
            }
            catch (InputMismatchException e) {
                scanner.close();
                throw new InputMismatchException("Wrong value type for this field.");
            }

            if(num == 0){
                scanner.close();
                break;
            }
            if(num == 1){
                System.out.print("Enter name: ");
                input = scanner.nextLine();
                input = scanner.nextLine();
                String name = input;

                System.out.print("Enter role (DAMAGE, TANK, HEALER): ");
                input = scanner.nextLine();
                
                Character character = new Character(name, convertStrRole(input));

                System.out.print("Add to party (0 or 1): ");
                
                try {
                    num = scanner.nextInt();
                    checkParty(num);
                } catch (PartyException e) {
                    scanner.close();
                    throw e;
                } catch (InputMismatchException e) {
                    scanner.close();
                    throw new InputMismatchException("Wrong value type for this field.");
                }

                if(num == 0){
                    if(party0.add(character))
                    System.out.println("Added "+character.toString()+" to party 0.\n");
                }
                    
                else{
                    if(party1.add(character))
                    System.out.println("Added "+character.toString()+" to party 1.\n");
                }
                    
                
            }
            if(num == 2){

                try {
                    num = scanner.nextInt();
                    checkParty(num);
                } catch (PartyException e) {
                    scanner.close();
                    throw e;
                } catch (InputMismatchException e) {
                    scanner.close();
                    throw new InputMismatchException("Wrong value type for this field.");
                }

                if(num == 0)
                    System.out.println(party0.toString());  
                else
                    System.out.println(party1.toString());
                
            }
        }
    }
    public static void check012 (int num) throws Exception012 {
        if(num == 0)
            System.out.println("Exiting!");
        else if(num == 1)
            System.out.println("Creating new character...");
        else if(num == 2)
            System.out.print("Show party (0 or 1): ");
        else
            throw new Exception012("Unexpected index: Index "+num+" out of bounds for length 2");
    }

    public static CharacterRole convertStrRole(String role) {
        if(role.equalsIgnoreCase("Tank"))
            return CharacterRole.TANK;
        if(role.equalsIgnoreCase("Healer"))
            return CharacterRole.HEALER;
        if(role.equalsIgnoreCase("Damage"))
            return CharacterRole.DAMAGE;
        return null;
    }

    public static void checkParty (int num) throws PartyException {
        if(num == 0 || num == 1)
            ;
        else
            throw new PartyException("Unexpected index: Index "+num+" out of bounds for length 1");
    }
}
