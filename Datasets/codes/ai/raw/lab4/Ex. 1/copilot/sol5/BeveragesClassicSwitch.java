import java.util.Scanner;

public class BeveragesClassicSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id: ");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false) ");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        if (menu < 1 || menu > 5) {
            System.out.println("The restaurant does not have such a menu!");
        } else {
            System.out.print("The restaurant suggests: ");
            switch (menu) {
                case 1: // client ordered meat
                case 2: // client ordered fish
                    System.out.println(adult ? "Red wine" : "Cola");
                    break;
                case 3: // client ordered pasta with tomato sauce
                    System.out.println(adult ? "White wine" : "Lemonade");
                    break;
                case 4: // client ordered pasta with cream sauce
                    System.out.println(adult ? "Port wine" : "Still Water");
                    break;
                case 5: // client ordered a soup
                    System.out.println("Sparkling Water");
                    break;
            }
        }
    }
}
