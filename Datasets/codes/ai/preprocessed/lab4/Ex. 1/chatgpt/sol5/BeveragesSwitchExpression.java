import java.util.Scanner;

public class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id: ");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult (true/false): ");
        boolean isAdult = scanner.nextBoolean();

        scanner.close();

        if (menu < 1 || menu > 5) {
            System.out.println("The restaurant does not have such a menu!");
        } else {
            String suggestion = switch (menu) {
                case 1, 2 -> isAdult ? "Red wine" : "Cola";
                case 3 -> isAdult ? "White wine" : "Lemonade";
                case 4 -> isAdult ? "Port wine" : "Still Water";
                case 5 -> "Sparkling Water";
                default -> "Unknown";
            };
            System.out.println("The restaurant suggests: " + suggestion);
        }
    }
}