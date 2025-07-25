import java.util.Scanner;

class BeveragesClassicSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        if (menu < 1 || menu > 5) {
            System.out.println("The restaurant does not have such a menu!");
            return;
        }

        System.out.print("The restaurant suggests: ");
        
        switch (menu) {
            case 1: // meat
            case 2: // fish
                System.out.println(adult ? "Red wine" : "Cola");
                break;
            case 3: // pasta with tomato sauce
                System.out.println(adult ? "White wine" : "Lemonade");
                break;
            case 4: // pasta with cream sauce
                System.out.println(adult ? "Port wine" : "Still Water");
                break;
            case 5: // soup
                System.out.println("Sparkling Water");
                break;
        }
    }
}