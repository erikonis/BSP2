import java.util.Scanner;

public class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();
        String drink = "The restaurant suggests: ";

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        drink = switch (menu) {
        case 1, 2 -> drink += adult ? "Red wine" : "Cola";
        case 3 -> drink += adult ? "White wine" : "Lemonade";
        case 4 -> drink += adult ? "Port wine" : "Still water";
        case 5 -> drink += "Sparkling water";
        default -> "The restaurant does not have such a menu!";
        };
        System.out.println(drink);
    }
}
