import java.util.Scanner;

public class BeveragesClassicSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id: ");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult (true/false): ");
        boolean isAdult = scanner.nextBoolean();

        scanner.close();

        if (menu < 1 || menu > 5) {
            System.out.println("The restaurant does not have such a menu!");
            return;
        }

        System.out.print("The restaurant suggests: ");

        switch (menu) {
            case 1:
            case 2:
                System.out.println(isAdult ? "Red wine" : "Cola");
                break;
            case 3:
                System.out.println(isAdult ? "White wine" : "Lemonade");
                break;
            case 4:
                System.out.println(isAdult ? "Port wine" : "Still Water");
                break;
            case 5:
                System.out.println("Sparkling Water");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}