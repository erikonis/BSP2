import java.util.Scanner;

public class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner consoleReader = new Scanner(System.in);

        System.out.print("Choose a menu item (enter ID 1-5): ");
        int chosenMenuItem = consoleReader.nextInt();

        System.out.print("Is the guest an adult (true/false): ");
        boolean isAdultGuest = consoleReader.nextBoolean();

        consoleReader.close();

        String beverageSuggestion = switch (chosenMenuItem) {
            case 1, 2 -> isAdultGuest ? "Red wine" : "Cola";
            case 3 -> isAdultGuest ? "White wine" : "Lemonade";
            case 4 -> isAdultGuest ? "Port wine" : "Still Water";
            case 5 -> "Sparkling Water";
            default -> "Invalid menu item selected.";
        };

        System.out.println("The suggested beverage is: " + beverageSuggestion);
    }
}