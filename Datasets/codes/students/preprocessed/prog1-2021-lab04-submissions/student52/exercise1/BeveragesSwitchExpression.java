import java.util.Scanner;

class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult (true/false): ");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        String suggestion;

        suggestion = switch (menu)

        {
        case 1 -> adult ? "Red wine" : "Cola";

        case 2 -> adult ? "Red wine" : "Cola";

        case 3 -> adult ? "White wine" : "Lemonade";

        case 4 -> adult ? "Port wine" : "Still Water";

        case 5 -> "Sparkling water";

        default -> {
            System.out.println("The restaurant does not have such a menu!");
            yield "unknown";
        }

        };

        if (menu >= 1 && menu <= 5)
            System.out.print("The restaurant suggests: " + suggestion);
    }

}