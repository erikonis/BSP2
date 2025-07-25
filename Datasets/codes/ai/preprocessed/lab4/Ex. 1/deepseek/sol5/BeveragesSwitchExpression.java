import java.util.Scanner;

class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id (1-5): ");
        int menu = scanner.nextInt();

        System.out.print("Is the client an adult? (true/false): ");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        String suggestion = switch (menu) {
            case 1, 2 -> adult ? "Red wine" : "Cola";
            case 3 -> adult ? "White wine" : "Lemonade";
            case 4 -> adult ? "Port wine" : "Still Water";
            case 5 -> "Sparkling Water";
            default -> null;
        };

        if (suggestion != null) {
            System.out.println("The restaurant suggests: " + suggestion);
        } else {
            System.out.println("The restaurant does not have such a menu!");
        }
    }
}