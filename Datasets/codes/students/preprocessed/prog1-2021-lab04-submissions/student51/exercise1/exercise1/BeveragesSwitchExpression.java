import java.util.Scanner;

public class BeveragesSwitchExpression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        String drink = switch (menu){
            case 1, 2 -> adult ? "Red wine" : "Coca";
            case 3 -> adult ? "White wine" : "Lemonade";
            case 4 -> adult ? "Port wine" : "Still water";
            case 5 -> "Sparkling water";
            default -> "The restaurant does not have such a menu!";
        };

        if(menu>0 && menu<6){
            System.out.println("The restaurant suggests: "+drink);
        }else{
            System.out.println(drink);
        }

        scanner.close();
    }
}
