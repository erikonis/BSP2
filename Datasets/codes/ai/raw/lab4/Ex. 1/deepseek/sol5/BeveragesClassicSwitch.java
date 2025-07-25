import java.util.Scanner;

class BeveragesClassicSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id (1-5): ");
        int menu = scanner.nextInt();

        System.out.print("Is the client an adult? (true/false): ");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        System.out.print("The restaurant suggests: ");
        
        switch (menu) {
            case 1: // Meat
            case 2: // Fish
                System.out.println(adult ? "Red wine" : "Cola");
                break;
            case 3: // Pasta with tomato sauce
                System.out.println(adult ? "White wine" : "Lemonade");
                break;
            case 4: // Pasta with cream sauce
                System.out.println(adult ? "Port wine" : "Still Water");
                break;
            case 5: // Soup
                System.out.println("Sparkling Water");
                break;
            default:
                System.out.println("\nThe restaurant does not have such a menu!");
        }
    }
}