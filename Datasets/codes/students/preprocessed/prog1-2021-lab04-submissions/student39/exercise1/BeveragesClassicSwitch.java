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

        if ((menu < 1) || (menu > 5)) {
            System.out.println("The restaurant does not have such a menu!");
        } else {
            System.out.print("The restaurant suggests: ");
        }

        switch(menu)  {
            case 1, 2: if (adult) { System.out.println("Red wine"); } else { System.out.println("Cola"); };
            case 3: if (adult) { System.out.println("White wine");} else { System.out.println("Lemonade"); };
            case 4: if (!adult) { System.out.println("Still Water"); } else { System.out.println("Port wine"); };
            case 5: System.out.println("The restaurant suggests: Sparkling Water");
        };

    } 
    
}