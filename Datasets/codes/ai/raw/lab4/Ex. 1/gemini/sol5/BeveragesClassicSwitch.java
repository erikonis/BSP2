import java.util.Scanner;

public class BeveragesClassicSwitch {
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);

        System.out.print("Enter the selected menu ID (1-5): ");
        int selectedMenuId = keyboardIn.nextInt();

        System.out.print("Is the customer an adult (true/false): ");
        boolean isAdultClient = keyboardIn.nextBoolean();

        keyboardIn.close();

        System.out.print("Recommended beverage: ");

        switch (selectedMenuId) {
            case 1: // Meat
            case 2: // Fish
                System.out.println(isAdultClient ? "Red wine" : "Cola");
                break;
            case 3: // Pasta with tomato sauce
                System.out.println(isAdultClient ? "White wine" : "Lemonade");
                break;
            case 4: // Pasta with cream sauce
                System.out.println(isAdultClient ? "Port wine" : "Still Water");
                break;
            case 5: // Soup
                System.out.println("Sparkling Water");
                break;
            default:
                System.out.println("Sorry, that menu option is not available.");
        }
    }
}