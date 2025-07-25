import java.util.Scanner;

public class BeveragesRefactored {
    public static void main(String[] args) {
        MenuSelection selection = getCustomerSelection();
        String suggestion = getBeverageSuggestion(selection);
        System.out.println(suggestion);
    }

    private static MenuSelection getCustomerSelection() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id (1-5): ");
        int menuId = scanner.nextInt();

        System.out.print("Is the client an adult? (true/false): ");
        boolean isAdult = scanner.nextBoolean();

        scanner.close();
        return new MenuSelection(menuId, isAdult);
    }

    private static String getBeverageSuggestion(MenuSelection selection) {
        if (selection.menuId() < 1 || selection.menuId() > 5) {
            return "The restaurant does not have such a menu!";
        }

        return switch (selection.menuId()) {
            case 1, 2 -> selection.isAdult() ? "Red wine" : "Cola";
            case 3 -> selection.isAdult() ? "White wine" : "Lemonade";
            case 4 -> selection.isAdult() ? "Port wine" : "Still Water";
            case 5 -> "Sparkling Water";
            default -> "Invalid menu selection";
        };
    }

    record MenuSelection(int menuId, boolean isAdult) {}
}