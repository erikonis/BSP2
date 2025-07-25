import java.util.Scanner; 

public class BeveragesClassicSwitch {

    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        switch (menu){
            case 1 :
                System.out.println(adult ? "Red wine":"Cola");
                break;
            case 2 :
                System.out.println(adult ? "Red wine":"Cola");
                break;
            case 3 :
                System.out.println(adult ? "White wine":"Lemonade");
                break;
            case 4 :
                System.out.println(adult ? "Port wine":"Still water");
                break;
            case 5 :
                System.out.println("The restaurant suggests : sparkling water");
                break;
            default:
                System.out.println("The restaurant does not have such a menu!");


        }

        scanner.close();
    }
    
}
