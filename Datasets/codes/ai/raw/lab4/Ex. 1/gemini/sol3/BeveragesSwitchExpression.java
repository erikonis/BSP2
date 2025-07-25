import java.util.Scanner;

public class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Select menu (1-5): ");
        int selectedMenu = inputReader.nextInt();

        System.out.print("Adult? (true/false): ");
        boolean isClientAdult = inputReader.nextBoolean();

        inputReader.close();

        String suggestedBeverage = switch (selectedMenu) {
            case 1, 2 -> isClientAdult ? "Red wine" : "Cola";
            case 3 -> isClientAdult ? "White wine" : "Lemonade";
            case 4 -> isClientAdult ? "Port wine" : "Still Water";
            case 5 -> "Sparkling Water";
            default -> "Invalid menu!";
        };

        System.out.println("Recommended beverage: " + suggestedBeverage);
    }
}