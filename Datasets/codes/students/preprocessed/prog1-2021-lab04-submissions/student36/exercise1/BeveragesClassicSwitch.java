import java.util.Scanner;

public class BeveragesClassicSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id: ");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false) ");
        boolean adult = scanner.nextBoolean();

        scanner.close();


        switch (menu) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.print("The restaurant suggests: ");
            break;
            default:
            System.out.println("The restaurant does not have such a menu!");
        }


        switch (menu) {
            case 1: // client ordered meat
            case 2: // client ordered fish
            if (adult == true) {
            System.out.println("Red wine");
            } else {
            System.out.println("Cola");
            }
            break;
        }

        switch (menu) {
            case 3: // client ordered pasta with tomato sauce
            if (adult == true) {
            System.out.println("White wine");
            } else {
            System.out.println("Lemonade");
            }
            break;
        }

        switch (menu) {
            case 4: // client ordered pasta with cream sauce
            if (adult == true) {
            System.out.println("Port wine");
            } else {
            System.out.println("Still Water");
            }
            break;
        }

        switch (menu) {
            case 5: // client ordered a soup
            System.out.println("The restaurant suggests: Sparkling Water");
            break;
        }
    
    }
}
