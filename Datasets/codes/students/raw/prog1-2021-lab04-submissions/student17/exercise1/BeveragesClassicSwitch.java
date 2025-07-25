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
        

        // TODO: replace all of the code below by a better construct!
        //       Simplify conditions to make them more readable and make sure the suggestions are still the same!

        
        switch (menu) {
            case 1, 2: // client ordered meat
                System.out.print("The restaurant suggests: " + (adult?"Red wine":"Cola"));
            break;
            case 3: // client ordered pasta with tomato sauce
                System.out.print("The restaurant suggests: " + (adult?"White wine":"Lemonade"));
            break;
            case 4: // client ordered pasta with cream sauce
                System.out.print("The restaurant suggests: " + (!adult?"Still Water":"Port wine"));
            break;
            case 5: // client ordered a soup
                System.out.println("The restaurant suggests: Sparkling Water");
            break;
            default:
                System.out.println("The restaurant does not have such a menu!");
            break;
        }
    }
}
