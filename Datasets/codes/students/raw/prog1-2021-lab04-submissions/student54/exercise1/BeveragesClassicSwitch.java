package lu.uni.programming1.lab4.exercise1;

import java.util.Scanner;

public class BeveragesClassicSwitch {
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
        int menu = scanner.nextInt();;
        
        System.out.print("Please enter whether the client is an adult: (true/false) ");
        boolean adult = scanner.nextBoolean();

        scanner.close();

         
        switch (menu) {
            case 1: 
                beverage = adult ?drinkadult:bevvie;
                                        
                break;
            
            case 2:
                beverage = adult ?drinkadult:bevvie;
               
                break;
            
            case 3:
                beverage = adult ?wine:drinkTeen;
               

                break;
            
            case 4:
                beverage = adult ?otherDrink:drink;
                
            
                break;
            
            case 5:

            System.out.println("The restaurant suggests: Sparkling Water");
            
                break;
        
            default:

            System.out.println("The restaurant does not have such a menu!");
                
            break;
        }
        if (menu<=4){System.out.print("For menu type " + menu + " the restaurant suggests: " + beverage);}
    }
}
