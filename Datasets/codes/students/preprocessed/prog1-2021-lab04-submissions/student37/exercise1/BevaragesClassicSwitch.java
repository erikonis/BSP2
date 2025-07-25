import java.util.Scanner;

public class BevaragesClassicSwitch {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id: ");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false) ");
        boolean adult = scanner.nextBoolean();

        scanner.close();
    
                
        switch (menu) {
        case 1:
            String drink;
            drink = (adult == true) ? "Red wine" : "Cola";
            System.out.println("The restaurant suggests: " + drink);
            break; 
        case 2:
            drink = (adult == true) ? "Red wine" : "Cola";
            System.out.println("The restaurant suggests: " + drink);
            break; 
        case 3:
            drink = (adult == true) ? "White wine" : "Lemonade";
            System.out.println("The restaurant suggests: " + drink);
            break; 
        case 4:
            drink = (adult == true) ? "Port wine" : "Still Water";
            System.out.println("The restaurant suggests: " + drink);
            break;
        case 5:
            System.out.println("The restaurant suggests: Sparkling Water") ;
            break;

        default:
            System.out.println("The restaurant does not have such a menu!");
            break; 
        }

    }
    
}
