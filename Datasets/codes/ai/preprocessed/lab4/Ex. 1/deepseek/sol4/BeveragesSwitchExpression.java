import java.util.Scanner;

class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        if (menu < 1 || menu > 5) {
            System.out.println("The restaurant does not have such a menu!");
            return;
        }

        System.out.print("The restaurant suggests: ");

        String beverage = switch (menu) {
            case 1, 2 -> adult ? "Red wine" : "Cola";
            case 3 -> adult ? "White wine" : "Lemonade";
            case 4 -> adult ? "Port wine" : "Still Water";
            case 5 -> "Sparkling Water";
            default -> "";
        };

        System.out.println(beverage);
    }
}