import java.util.Scanner;

public class BeveragesClassicSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter menu id: ");
        int menuChoice = input.nextInt();

        System.out.print("Is the client an adult (true/false)? ");
        boolean isAdult = input.nextBoolean();

        input.close();

        System.out.print("Suggestion: ");

        switch (menuChoice) {
            case 1: // Meat
            case 2: // Fish
                System.out.println(isAdult ? "Red wine" : "Cola");
                break;
            case 3: // Pasta with tomato sauce
                System.out.println(isAdult ? "White wine" : "Lemonade");
                break;
            case 4: // Pasta with cream sauce
                System.out.println(isAdult ? "Port wine" : "Still Water");
                break;
            case 5: // Soup
                System.out.println("Sparkling Water");
                break;
            default:
                System.out.println("Invalid menu selection!");
        }
    }
}