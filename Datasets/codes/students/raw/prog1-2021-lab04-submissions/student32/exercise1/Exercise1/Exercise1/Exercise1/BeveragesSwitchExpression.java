package lu.uni.programming1.lab4.exercise1.Exercise1.Exercise1.Exercise1;
import java.util.Scanner;
public class BeveragesSwitchExpression {

    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int n = scanner.nextInt();
        
        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();
        scanner.close();
        
        String type = switch (n) {
            case 1, 2 -> adult ? "The restaurant suggest: " + "Red wine" : "The restaurant suggest: " + "cola";
            case 3 -> adult ? "The restaurant suggest: " + "White wine" : "The restaurant suggest: "  + "Lemonade";
            case 4 -> adult ? "The restaurant suggest: " 
            + "Port wine" : "The restaurant suggest: "+ "Still water";
            case 5 -> "The restaurant suggest: " + "Sparkling water";
            default -> "The restaurant does not have such a menu!";
        };
        System.out.println(type);
    }
}   
