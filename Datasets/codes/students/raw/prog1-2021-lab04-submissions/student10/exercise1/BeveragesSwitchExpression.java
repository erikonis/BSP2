package lu.uni.programming1.lab4.exercise1;

import java.util.Scanner;

class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();
        

        // TODO: replace all of the code below by a better construct!
        //      Simplify conditions to make them more readable and make sure the suggestions are still the same!


        String suggestion = switch(menu){

        case 1 ->  // client ordered meat
            (adult)?"Red wine" : "Cola";
        case 2 ->  // client ordered fish
            (adult)?"Red wine" : "Cola";
        case 3-> // client ordered pasta with tomato sauce
            (adult)?"White wine" : "Lemonade";
        case 4->  // client ordered pasta with cream sauce
            (adult)?"Port wine" : "Still Water";
        case 5->  // client ordered a soup
            "The restaurant suggests: Sparkling Water";
        default-> 
            "The restaurant does not have such a menu!";
            };
        System.out.println(suggestion);
    } 

}