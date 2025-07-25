import java.util.Scanner;

public class BeveragesClassicSwitch {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the menu number: ");
        int menuNumber = userInput.nextInt();

        System.out.print("Is the customer an adult (true/false)? ");
        boolean isAdultCustomer = userInput.nextBoolean();

        userInput.close();

        System.out.print("The suggestion is: ");

        switch (menuNumber) {
            case 1: // Meat
            case 2: // Fish
                System.out.println(isAdultCustomer ? "Red wine" : "Cola");
                break;
            case 3: // Pasta with tomato sauce
                System.out.println(isAdultCustomer ? "White wine" : "Lemonade");
                break;
            case 4: // Pasta with cream sauce
                System.out.println(isAdultCustomer ? "Port wine" : "Still Water");
                break;
            case 5: // Soup
                System.out.println("Sparkling Water");
                break;
            default:
                System.out.println("No such menu option exists!");
        }
    }
}