package lu.uni.programming1.lab4.exercise1;
import java.util.Scanner;

public class BeveragesSwitchExpression {
    public static void main(String[] args) {
        String MenuPrint ;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu ID: ");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult (true/false): ");
        boolean adult = scanner.nextBoolean();

        scanner.close();
       

        if ((menu < 1) || (menu > 5)) {
            System.out.println("The restaurant does not have such a menu!");
        } 
        
	if (adult) {
        MenuPrint = switch(menu){
        case 1,2 ->  "Red wine"; 
	    case 3 ->  "White wine";
	    case 4 ->   "Port wine";
        case 5 ->  "Sparkling Water"; 
        default -> "default";	};
        }
        
    else {
	MenuPrint = switch(menu){
            case 1,2 -> "Cola";
            case 3 ->   "Lemonade";
            case 4 ->  "Still Water";
            case 5 ->  "Sparkling Water";
    default -> "UNKNOWN";	
    };


    } 
    System.out.println("The restaurant suggests: "+ MenuPrint);
 } 
   
}
    
