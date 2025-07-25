package lu.uni.programming1.lab4.ex1;
import java.util.Scanner;

class Beverages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();
        String drink="";
        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        switch(menu){
            case 1:    // client ordered meat
               drink = adult? "Red wine" : "Cola";
            break;
            case 2:
                drink =adult? "Red wine" : "Cola";
            break;
            case 3:
                drink= adult? " White wine" : "Cola";
            break;
            case 4:
                drink= adult? "Still water" : "Port wine";
            case 5:
                drink="The restaurant suggests: Sparkling Water";
            break;
            default:
                System.out.println("The restaurant does not have such a menu!");
        }
        System.out.println("The restaurant suggests: "+drink);
    }
}
        
            