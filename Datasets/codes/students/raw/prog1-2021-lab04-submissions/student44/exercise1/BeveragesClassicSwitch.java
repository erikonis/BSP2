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

        String answer;

        switch (menu) {

            case 1 : answer = adult == true? "Red Wine":"Cola";
            System.out.println("The restaurant suggests: " + answer);
            break;
            case 2 : answer = adult == true? "Red Wine":"Cola";
            System.out.println("The restaurant suggests: " + answer);
            break;
            case 3 : answer = adult == true? "White Wine":"Lemonade";
            System.out.println("The restaurant suggests: " + answer);
            break;
            case 4 : answer = adult == true? "Port Wine":"Still Water";
            System.out.println("The restaurant suggests: " + answer);
            break;
            case 5 : System.out.println("The restaurant suggests: Sparkling Water");
            break;
            default : System.out.println("The restaurant does not have such a menu!");
            break;
        }
        
    } 

}