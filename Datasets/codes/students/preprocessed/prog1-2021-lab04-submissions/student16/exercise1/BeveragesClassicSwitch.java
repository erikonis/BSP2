import java.util.Scanner;

public class BeveragesClassicSwitch {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();
        

        // TODO: replace all of the code below by a better construct!
        //       Simplify conditions to make them more readable and make sure the suggestions are still the same!
        switch(menu){
            default: String check = menu<1 || menu>5?"The restaurant does not have such a menu!" : "The restaurant suggests: ";
                System.out.print(check);
            break;

            case 1: String check1 = adult==true?"Red wine" : "Cola";   // client ordered meat
                System.out.print(check1);
            break;

            case 2: String check2 = adult==true?"Red wine" : "Cola";  // client ordered fish
                System.out.print(check2);
            break;

            case 3: String check3 = adult==true?"White wine" : "Lemonade";  // client ordered pasta with tomato sauce
                System.out.print(check3);
            break;

            case 4: String check4 = adult==true?"Port wine" : "Still Water"; // client ordered pasta with cream sauce
                System.out.print(check4);
            break;

            case 5: // client ordered a soup
                System.out.println("The restaurant suggests: Sparkling Water");
            break;
        }

    } 
}
    

