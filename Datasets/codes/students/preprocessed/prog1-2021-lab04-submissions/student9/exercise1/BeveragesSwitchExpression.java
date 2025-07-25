import java.util.Scanner;

public class BeveragesSwitchExpression {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (True/false)");

        boolean adult = scanner.nextBoolean();
        String jan = "";
        scanner.close();

        jan = switch (menu) {
        case 1 -> "the restauraT" + (adult ? "Red wine" : "Cola");
        case 2 -> "the restauraT" + (adult ? "Red wine" : "Cola");
        case 3 -> "the restauraT" + (adult ? "white wine" : "lemonde");
        case 4 -> "the restauraT" + (adult ? "porte wine" : "still water");
        case 5 -> "the restauraT parking water";

        default -> ("The restaurant does not have such a menu!");

        };
        System.out.println(jan);
    }
}