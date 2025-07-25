import java.util.Scanner;

public class BeveragesClassicSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter menu (1: Standard, 2: Vegetarian, 3: Vegan): ");
        int menu = scanner.nextInt();
        System.out.print("Is the client an adult? (true/false): ");
        boolean isAdult = scanner.nextBoolean();

        String beverage;
        switch (menu) {
            case 1:
                beverage = isAdult ? "Wine" : "Juice";
                break;
            case 2:
                beverage = isAdult ? "Beer" : "Soda";
                break;
            case 3:
                beverage = isAdult ? "Cider" : "Water";
                break;
            default:
                beverage = "Unknown";
                break;
        }

        System.out.println("Suggested beverage: " + beverage);
    }
}