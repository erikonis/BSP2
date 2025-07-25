package lu.uni.programming1.lab4.exercise1;

import java.util.Scanner;

class BeveragesClassicSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();
        

        // TODO: replace all of the code below by a better construct!
        //       Simplify conditions to make them more readable and make sure the suggestions are still the same!

        switch(menu)
        {
            case 1:
            case 2: System.out.println("The restaurant suggests: " + (adult?"Red Wine":"Cola"));
                break;
            case 3: System.out.println("The restaurant suggests: " + (adult?"White Wine":"Lemonade"));
                break;
            case 4: System.out.println("The restaurant suggests: " + (adult?"Port Wine":"Still Water"));
                break;
            case 5: System.out.println("The restaurant suggests: Sparkling Water");
                break;
            default: System.out.println("The restaurant does not have such a menu!");
        }
    } 

}