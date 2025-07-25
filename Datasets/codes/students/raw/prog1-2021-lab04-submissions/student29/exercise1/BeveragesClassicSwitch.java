package lu.uni.programming1.lab4.exercise1;

import java.util.Scanner;

public class BeveragesClassicSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();
        int adultInt = 0;

        scanner.close();

        if(adult == true){
            adultInt = 1;
        }

        switch(adultInt){
            case 1:
            switch(menu){
                default:
                System.out.println("The restaurant does not have such a menu!");
                break;
    
                case 1, 2:
                System.out.println("The restaurant suggests: Red wine");
                break;

                case 3:
                System.out.println("The restaurant suggests: White wine");
                break;

                case 4:
                System.out.println("The restaurant suggests: Port wine");
                break;

                case 5:
                System.out.println("The restaurant suggests: Sparkling Water");
                break;
            }
            break;

            case 0:
            switch(menu){
                default:
                System.out.println("The restaurant does not have such a menu!");
                break;
    
                case 1, 2:
                System.out.println("The restaurant suggests: Cola");
                break;

                case 3:
                System.out.println("The restaurant suggests: Lemonade");
                break;

                case 4:
                System.out.println("The restaurant suggests: Still Water");
                break;

                case 5:
                System.out.println("The restaurant suggests: Sparkling Water");
                break;
            }
            break;
        }
    }
}
