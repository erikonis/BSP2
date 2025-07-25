import java.util.*;

public class BeveragesSwitchExpreesion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();
        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        String expression = switch(menu){
            case 1 -> adult? "Red wine" : "Cola";
            
            case 2 -> adult? "Red wine" : "Cola";
        
            case 3 -> adult? " White wine" : "Cola";
            
            case 4 -> adult? "Still water" : "Port wine";

            case 5 -> "The restaurant suggests: Sparkling Water";
            
            default -> "The restaurant does not have such a menu!";

        };
        System.out.println("The restaurant suggests: "+expression);
}
}