import java.util.Scanner;

public class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Choose a menu (1-5): ");
        int chosenMenu = reader.nextInt();

        System.out.print("Is the client an adult (true/false): ");
        boolean isAdultClient = reader.nextBoolean();

        reader.close();

        String recommendedDrink = switch (chosenMenu) {
            case 1, 2 -> isAdultClient ? "Red wine" : "Cola";
            case 3 -> isAdultClient ? "White wine" : "Lemonade";
            case 4 -> isAdultClient ? "Port wine" : "Still Water";
            case 5 -> "Sparkling Water";
            default -> "Invalid menu choice!";
        };

        System.out.println("Recommended drink: " + recommendedDrink);
    }
}