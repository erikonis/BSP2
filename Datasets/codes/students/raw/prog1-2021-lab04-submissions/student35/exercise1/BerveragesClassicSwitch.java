package lu.uni.programming1.lab4.exercise1;
import java.util.Scanner;

public class BerveragesClassicSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        //new code
        switch(menu){
            case 1:
                if (adult) 
                {
                    System.out.println("Red wine");
                }
              else 
                {
                    System.out.println("Cola");
                }
            break;
            case 2:
                if (adult) 
                {
                    System.out.println("Red wine");
                } 
                else 
                {
                 System.out.println("Cola");
                }
            break;
            case 3:
                if (adult) 
                {
                    System.out.println("White wine");
                } 
                else 
                {
                    System.out.println("Lemonade");
                }
            break;
            case 4:
                if (adult) 
                {
                    System.out.println("Port wine");
                } 
                else 
                {
                    System.out.println("Still Water");
                }
            break;
            case 5:
                System.out.println("The restaurant suggests: Sparkling Water");
            break;
            default:
                System.out.println("The restaurant does not have such a menu!");
            break;
        }

    }
}
