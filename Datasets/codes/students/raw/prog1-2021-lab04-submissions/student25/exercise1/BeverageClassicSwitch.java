package lu.uni.programming1.lab4.exercise1;

import java.util.Scanner;

class BeverageClassicSwitch{
    public static void main(String[] args) {
        
        //Input, from Beverage.java
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        //Switch
        String sugestion = "The Restaurant suggest :\n";

        switch (menu) {
            case 1: 
            case 2: {
                sugestion += (adult) ? "Red Wine" : "Cola";
                break;
            }
            case 3: {
                sugestion += (adult) ? "White Wine" : "Lemonade";
                break;
            }
            case 4: {
                sugestion += (adult) ? "Port Wine" : "Still Water";
                break;
            }
            case 5: {
                sugestion += "Sparkling Water";
                break;
            }
            default: {
                sugestion = "The restaurant does not have such a menu!";
            }
        }

        System.out.println(sugestion);

    }

}