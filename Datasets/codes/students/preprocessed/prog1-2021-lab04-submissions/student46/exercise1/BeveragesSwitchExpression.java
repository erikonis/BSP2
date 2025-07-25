import java.util.Scanner;

public class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the selected menu id :");
        int menu = scanner.nextInt();
        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();
        String right;
        scanner.close();
        right = switch (menu) {
        case 1, 2 -> "The restaurant suggests: " + (adult ? "Red wine " : "Cola");
        case 3 -> "The restaurant suggests: " + (adult ? "White wine " : "Lemonade");
        case 4 -> "The restaurant suggests: " + (adult ? "Port wine " : "Still water");
        case 5 -> "The restaurant suggests: Sparkling Water";
        default -> "The restaurant does not have such a menu!";
        };
        System.out.println(right);
    }
}