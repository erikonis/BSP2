import java.util.Scanner;

public class BeveragesClassicSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        String drink = "";
        String sugg = "The restaurant suggests: ";

        switch (menu) {
            case 1: drink = adult ? "Red wine" : "Cola"; System.out.println(sugg+drink);
                break;
            case 2: drink = adult ? "Red wine" : "Cola"; System.out.println(sugg+drink);  
                break; 
            case 3: drink = adult ? "White wine" : "Lemonade"; System.out.println(sugg+drink);  
                break;  
            case 4: drink = adult ? "Port wine" : "Still water"; System.out.println(sugg+drink);  
                break;   
            case 5: drink = "Sparkling water"; System.out.println(sugg+drink);   
                break;  
            default: System.out.println("The restaurant does not have such a menu!"); 
                break;           
        } 

        scanner.close();
    }
}
