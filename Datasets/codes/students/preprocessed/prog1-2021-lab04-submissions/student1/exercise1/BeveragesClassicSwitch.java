import java.util.Scanner;

public class BeveragesClassicSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       

        System.out.print("Please enter the selected menu id: ");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult (true/false): ");
        boolean adult = scanner.nextBoolean();
        String Beverage; 
        scanner.close();

        switch (menu) {
            case 1:  //client ordered meat
            System.out.print("the restaurant suggests: ");
             Beverage = adult ? "Red wine" : "Cola";
              System.out.println(Beverage);      
                break;
            case 2: //client ordered fish
            System.out.print("the restaurant suggests: ");
             Beverage = adult ? "Red wine" : "Cola";
              System.out.println(Beverage);      
                break;
             case 3: //client ordered pasta with tomato sauce
             System.out.print("the restaurant suggests: ");
             Beverage = adult ? "White wine" : "Lemonade";
               System.out.println(Beverage);      
                break;
             case 4: //client ordered pasta with cream sauce 
             System.out.print("the restaurant suggests: ");
             Beverage = adult ? "Port wine" : "still water";
                System.out.println(Beverage);      
                 break;
             case 5: //client ordered fish
             System.out.print("the restaurant suggests: ");
              Beverage = adult? "Sparkling water" : "Sparkling water" ;
                System.out.println(Beverage);      
                 break;
            default: 
            System.out.println("The restaurant does not have such a menu!");
                break;
        }

    } 
}
