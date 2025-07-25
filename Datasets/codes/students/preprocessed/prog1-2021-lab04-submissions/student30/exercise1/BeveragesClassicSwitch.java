

import java.util.Scanner;


public class BeveragesClassicSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();
        switch(menu)
        {
            case 1:
                if (adult) {
                    System.out.print("The restaurant suggests: ");
                    System.out.println("Red wine");
                } else {
                    System.out.print("The restaurant suggests: ");
                    System.out.println("Cola");}
                break;
            case 2:
                if (adult) {
                    System.out.print("The restaurant suggests: ");
                    System.out.println("Red wine");
                } else {
                    System.out.print("The restaurant suggests: ");
                    System.out.println("Cola");
                }
                break;
                   
            case 3:
                if (adult) {
                System.out.print("The restaurant suggests: ");
                System.out.println("White wine");
                } else {
                    System.out.print("The restaurant suggests: ");
                    System.out.println("Lemonade");}
                break;
            case 4:
                if (!adult) {
                    System.out.print("The restaurant suggests: ");
                    System.out.println("Still Water");
                } else {
                    System.out.println("Port wine");
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
