
package lu.uni.programming1.lab4.exercise1;

import java.util.Scanner;

public class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();
        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();
        scanner.close();
        String beverage = switch (menu){
            case 1 -> {
                yield adult==true ? "Red wine" : "Cola";
            }
            case 2 -> {
                yield adult==true ? "Red wine" : "Cola";
            }
            case 3 -> {
                yield adult==true ? "White wine" : "Lemonade";
            }
            case 4 -> {
                yield adult==true ? "Port wine" : "Still water";
            }
            case 5 -> {
                yield "The restaurant suggests sparkling water.";
            }
            default -> {
                yield "The restaurant does not have such a menu!";
            }
        };
        System.out.println("The restaurant suggests : " + beverage);
    }
}
