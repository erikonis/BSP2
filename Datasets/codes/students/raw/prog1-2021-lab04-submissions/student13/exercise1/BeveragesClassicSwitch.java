package lu.uni.programming1.lab4.exercise1;

import java.util.Scanner;

public class BeveragesClassicSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String drink;
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        switch(menu)
        {            
            case 1, 2:
            System.out.println("The restaurant suggests: ");
            drink = adult ? "Red wine" : "Cola";
            System.out.println(drink);
            break;

            case 3:
            System.out.println("The restaurant suggests: ");
            drink = adult ? "White wine" : "Lemonade";
            System.out.println(drink);
            break;

            case 4:
            System.out.println("The restaurant suggests: ");
            drink = adult ? "Port wine" : "Still Water";
            System.out.println(drink);
            break;

            case 5:
            System.out.println("Sparkling Water");
            break;

            default:
            System.out.println("The restaurant does not have such a menu!");
            break;
        }
    }

}
