import java.util.Scanner;

public class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        String beverage;

        beverage = switch (menu) {

            case 1 -> beverage = adult == true? "The restaurant suggests: Red Wine":"The restaurant suggests: Cola";
            case 2 -> beverage = adult == true? "The restaurant suggests: Red Wine":"The restaurant suggests: Cola";
            case 3 -> beverage = adult == true? "The restaurant suggests: White Wine":"The restaurant suggests: Lemonade";
            case 4 -> beverage = adult == true? "The restaurant suggests: Port Wine":"The restaurant suggests: Still Water";
            case 5 -> beverage = "The restaurant suggests: Sparkling Water";
            default -> {yield "The restaurant does not have such a menu!";}
        };

        System.out.println(beverage);
        
    } 

}