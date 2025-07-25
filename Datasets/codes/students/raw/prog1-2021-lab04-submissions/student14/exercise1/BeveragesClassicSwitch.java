


import java.util.Scanner;

public class BeveragesClassicSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id :");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();
        String right = "true";
        scanner.close();

        switch (menu) {
        case 1:
            System.out.println("The restaurant suggests: ");
            right = adult ? "Red wine " : "Cola";
            System.out.println(right);
            break;
        case 2:
            System.out.println("The restaurant suggests: ");
            right = adult ? "Red wine " : "Cola";
            System.out.println(right);
            break;
        case 3:
            System.out.println("The restaurant suggests: ");
            right = adult ? "White wine " : "Lemonade";
            System.out.println(right);
            break;
        case 4:
            System.out.println("The restaurant suggests: ");
            right = adult ? "Still water " : "Port wine";
            System.out.println(right);
            break;
        case 5:
            System.out.println("The restaurant suggests: ");
            System.out.println("Sparkling water");
            break;
        default:
            System.out.println("The restaurant does not have such a menu!");
        }
    }
}