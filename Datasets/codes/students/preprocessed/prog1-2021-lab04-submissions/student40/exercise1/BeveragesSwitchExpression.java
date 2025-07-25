import java.util.Scanner;

public class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false) ");
        boolean adult = scanner.nextBoolean();
        String drink = "";
        //setting up a placeholder value for the drink string
        scanner.close();
        
        if (adult){
            drink = switch(menu){
                case 1 ->"Red wine";
                case 2 ->"Red wine";
                case 3 ->"White Wine";
                case 4 ->"Port Wine";
                case 5 ->"Sparkling Water";
                default->{yield "Nothing, just like the existence of dish number "+menu+" on the menu";}};}
            //two different branches for the two states of "adult",
            //with 5 cases for the menu options and a sassy remark in case a different number is input
        if (!adult){drink = switch(menu){
            case 1 ->"Cola";
            case 2 ->"Cola";
            case 3 ->"Lemonade";
            case 4 ->"Still Water";
            case 5 ->"Sparkling Water";
            default->{yield "Nothing, just like the existence of dish number "+menu+" on the menu";}};}

            System.out.println("The restaurant recommends:");
            System.out.println(drink);

    //     // TODO: replace all of the code below by a better construct!
    //     //       Simplify conditions to make them more readable and make sure the suggestions are still the same!

    //     if ((menu < 1) || (menu > 5)) {
    //         System.out.println("The restaurant does not have such a menu!");
    //     } else {
    //         System.out.print("The restaurant suggests: ");
    //     }

    //     if (menu == 1) { // client ordered meat
    //         if (adult) {
    //             System.out.println("Red wine");
    //         } else {
    //             System.out.println("Cola");
    //         }
    //     } else if ((menu <= 2) && (menu >= 2)) { // client ordered fish
    //         if (adult) {
    //             System.out.println("Red wine");
    //         } else {
    //             System.out.println("Cola");
    //         }
    //     }
        
    //     if (menu == 3) { // client ordered pasta with tomato sauce
    //         if (adult) {
    //             System.out.println("White wine");
    //         } else {
    //             System.out.println("Lemonade");
    //         }
    //     } else if (menu + 1 == 5) { // client ordered pasta with cream sauce
    //         if (!adult) {
    //             System.out.println("Still Water");
    //         } else {
    //             System.out.println("Port wine");
    //         }
    //     }

    //     if (5 == menu) { // client ordered a soup
    //         System.out.println("The restaurant suggests: Sparkling Water");
    //     }
    } 
    
}
