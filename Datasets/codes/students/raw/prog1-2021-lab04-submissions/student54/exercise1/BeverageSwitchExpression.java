package lu.uni.programming1.lab4.exercise1;

import java.util.Scanner;

public class BeverageSwitchExpression {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String drinkadult="red wine";
        String drinkTeen="lemonade";
        String wine = "white wine";
        String drink = "still water";
        String otherDrink = "port wine";
        String beverage="";
        String bevvie = "cola";
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();
        
        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        beverage =switch (menu) {
            
            case 1-> adult ?drinkadult:bevvie;   
              
            case 2 ->adult ?drinkadult:bevvie;

            case 3 ->adult ?wine:drinkTeen;

            case 4 ->adult ?otherDrink:drink;

            case 5 ->"sparkling water";

            
            default-> {
            System.out.println("The restaurant does not have such a menu!");
                yield "unknown";
            
            }
                
            };System.out.println("For menu type " + menu + ", the restaurant suggests: " +beverage);
        scanner.close();
    }
}
