import java.util.Scanner;

public class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        String suggestion = switch (menu) {
            case 1, 2 -> adult ? "Red wine" : "Cola"; // meat or fish
            case 3 -> adult ? "White wine" : "Lemonade"; // pasta with tomato sauce
            case 4 -> adult ? "Port wine" : "Still Water"; // pasta with cream sauce
            case 5 -> "Sparkling Water"; // soup
            default -> "The restaurant does not have such a menu!";
        };

        System.out.print("The restaurant suggests: " + suggestion);
    }
}