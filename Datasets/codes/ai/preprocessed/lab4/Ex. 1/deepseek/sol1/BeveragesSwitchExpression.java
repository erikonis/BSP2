import java.util.Scanner;

public class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter menu (1: Standard, 2: Vegetarian, 3: Vegan): ");
        int menu = scanner.nextInt();
        System.out.print("Is the client an adult? (true/false): ");
        boolean isAdult = scanner.nextBoolean();

        String beverage = switch (menu) {
            case 1 -> isAdult ? "Wine" : "Juice";
            case 2 -> isAdult ? "Beer" : "Soda";
            case 3 -> isAdult ? "Cider" : "Water";
            default -> "Unknown";
        };

        System.out.println("Suggested beverage: " + beverage);
    }
}