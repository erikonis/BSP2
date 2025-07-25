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
        //using a classic switch instead of a series of "if" conditions, 
        //simplifies the structure and makes it easier to read
        switch(menu){
            case 1:{
                if (adult) {
                    System.out.println("Red wine");}
                    else {
                    System.out.println("Cola");}}
            case 2:{
                if (adult) {
                    System.out.println("Red wine");}
                    else {
                    System.out.println("Cola");}}
            case 3:{
                if (adult) {
                    System.out.println("White wine");}
                else {
                    System.out.println("Lemonade");}}
            case 4:{
                if (adult) {
                    System.out.println("Port wine");}
                    else {
                    System.out.println("Still Water");}}
            case 5:{
                System.out.println("Sparkling Water");}
            default:{
                System.out.println("The restaurant does not have such a menu!");}


        // }
        // if ((menu < 1) || (menu > 5)) {
        //     System.out.println("The restaurant does not have such a menu!");
        // } else {
        //     System.out.print("The restaurant suggests: ");
        // }

        // if (menu == 1) { // client ordered meat
        //     if (adult) {
        //         System.out.println("Red wine");
        //     } else {
        //         System.out.println("Cola");
        //     }
        // } else if ((menu <= 2) && (menu >= 2)) { // client ordered fish
        //     if (adult) {
        //         System.out.println("Red wine");
        //     } else {
        //         System.out.println("Cola");
        //     }
        // }
        
        // if (menu == 3) { // client ordered pasta with tomato sauce
        //     if (adult) {
        //         System.out.println("White wine");
        //     } else {
        //         System.out.println("Lemonade");
        //     }
        // } else if (menu + 1 == 5) { // client ordered pasta with cream sauce
        //     if (!adult) {
        //         System.out.println("Still Water");
        //     } else {
        //         System.out.println("Port wine");
        //     }
        // }

        // if (5 == menu) { // client ordered a soup
        //     System.out.println("Sparkling Water");
        }
    }
}
