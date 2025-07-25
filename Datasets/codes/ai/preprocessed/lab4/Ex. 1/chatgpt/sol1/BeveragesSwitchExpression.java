public import java.util.Scanner;

public class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter menu type (veg/non-veg): ");
        String menu = scanner.next();

        System.out.print("Are you an adult? (true/false): ");
        boolean isAdult = scanner.nextBoolean();

        String beverage = switch (menu.toLowerCase()) {
            case "veg" -> isAdult ? "Red Wine" : "Apple Juice";
            case "non-veg" -> isAdult ? "Beer" : "Cola";
            default -> "Water";
        };

        System.out.println("Suggested beverage: " + beverage);
        scanner.close();
    }
}