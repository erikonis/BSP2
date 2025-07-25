package lu.uni.programming1.lab4.exercise1;

import java.util.Scanner;

public class BeveragesClassicSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        switch (menu) {
            case 1,2: 
                System.out.print("The restaurant suggests: ");
                System.out.println(adult ? "Red wine" : "Cola");
                break;
            case 3:
                System.out.print("The restaurant suggests: "); 
                System.out.println(adult ? "White wine" : "Lemonade");
                break;
            case 4:
                System.out.print("The restaurant suggests: "); 
                System.out.println(adult ? "Port wine" : "Still water");
                break;
            case 5: 
                System.out.print("The restaurant suggests: ");
                System.out.println("Sparkling Water");
                break;
            default:
                System.out.println("The restaurant does not have such a menu!");
                break;
        }
    }
}
