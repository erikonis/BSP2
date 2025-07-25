import java.util.Scanner;

public class BeveragesSwitchExpression {
    
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
        
    System.out.println("Please enter the selected menu id:");
    int menu = scanner.nextInt();

    System.out.println("Please enter whether the client is an adult: (true/false)");
    boolean adult = scanner.nextBoolean();

    String suggestion = switch (menu){
        case 1,2 -> adult ? "Red wine":"Cola";
        case 3 -> adult ? "White wine":"Lemonade";  
        case 4 -> adult ? "Port wine":"Still water";
        case 5 -> "The restaurant suggests : sparkling water";
        default -> "The restaurant does not have such a menu!";
     };
    System.out.println("We suggest " + suggestion);
    scanner.close();
    }
}
