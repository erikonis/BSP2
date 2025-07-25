import java.util.InputMismatchException;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        // Implement the main program here, i.e. this is where you will read the various
        // inputs from the user.
        // Remember: your program should run forever, i.e. constantly expect input from
        // the user, until they explicitly enter '0' to exit the program.
        Scanner scanner = new Scanner(System.in);
        int options;
        String name = "";
        String role = "";
        CharacterRole cr = null;
        Character ch = new Character(name, cr);
        Party p1 = new Party();
        Party p2 = new Party();
        int partyChoice;
        int num;
        
        do{
            System.out.println("Select option: (0) for stopping program, (1) for adding a character, (2) for displaying a party.");
            options = scanner.nextInt(); 
            scanner.nextLine();

            //Option 1: Adding Character
            if (options == 1){
                //Name
                System.out.println("Name: ");
                name = scanner.nextLine();
                int nameLength = name.length();
                try {
                    while (nameLength > 12 || name == null){
                        throw new StringTooLongExeption();
                    }
                }
                catch (StringTooLongExeption ex){
                    System.out.println("Input invalid, please try again: ");
                    name = scanner.nextLine();
                    nameLength = name.length();
                }
                catch (InputMismatchException tmm){
                    System.out.println("Input invalid, please try again: ");
                    name = scanner.nextLine();
                    nameLength = name.length();
                }

                //Role
                System.out.println("Role: ");
                role = scanner.nextLine();
                try {
                    cr = CharacterRole.valueOf(role.toUpperCase());
                }
                catch(IllegalArgumentException ill){
                    System.out.println("Input for role invalid. Please try again: ");
                    role = scanner.nextLine();
                    cr = CharacterRole.valueOf(role.toUpperCase());
                }
                
                ch = new Character(name, cr);
                
                //Party
                System.out.println("Choose party to add to: (0) or (1).");
                partyChoice = scanner.nextInt();
                scanner.nextLine();
                try{
                    while (partyChoice > 1){
                        throw new IndexOutOfBoundsException();
                    }
                }
                catch(IndexOutOfBoundsException index){
                    System.out.println("Value out of bounds. Please input new value: ");
                    partyChoice = scanner.nextInt();
                }

                if (partyChoice == 0){
                    num = p1.getNum();
                    if (num < 4){
                        p1.adding(ch);
                    }
                    else{
                        System.out.println("Party is full.");
                    }
                }

                if (partyChoice == 1){
                    num = p2.getNum();
                    if (num < 4){
                        p2.adding(ch);
                    }
                    else{
                        System.out.println("Party is full.");
                    }
                }
            }

            //Option 2: Display Party
            if (options == 2){
                System.out.println("Choose party to display: (0) or (1).");
                partyChoice = scanner.nextInt();
                scanner.nextLine();
                try{
                    while (partyChoice > 1){
                        throw new IndexOutOfBoundsException();
                    }
                }
                catch(IndexOutOfBoundsException index){
                    System.out.println("Value out of bounds. Please input new value: ");
                    partyChoice = scanner.nextInt();
                }

                if (partyChoice == 0){
                    System.out.println(p1.toString());
                }
                if (partyChoice == 1){
                    System.out.println(p2.toString());
                }
            } 

        }while (options != 0);
        scanner.close();
    }  
}
