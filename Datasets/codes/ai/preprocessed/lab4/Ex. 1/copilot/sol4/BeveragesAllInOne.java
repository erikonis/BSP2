import java.util.Scanner;

public class BeveragesAllInOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter menu type (1: Vegetarian, 2: Non-Vegetarian): ");
        int menuType = scanner.nextInt();
        System.out.println("Is the client an adult? (true/false): ");
        boolean isAdult = scanner.nextBoolean();

        String beverage = switch (menuType) {
            case 1 -> isAdult ? "Wine" : "Juice";
            case 2 -> isAdult ? "Beer" : "Soda";
            default -> "Water";
        };

        System.out.println("Suggested beverage: " + beverage);
    }
}