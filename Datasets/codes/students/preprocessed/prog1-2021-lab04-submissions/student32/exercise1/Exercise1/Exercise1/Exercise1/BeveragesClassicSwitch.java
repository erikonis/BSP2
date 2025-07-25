import java.util.Scanner;
public class BeveragesClassicSwitch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();
        String Truth;
        scanner.close();
        
        switch (menu){
            case 1: System.out.println("The restaurant suggests: ");
                    Truth = adult ? "Red wine" : "cola";
                    System.out.println(Truth);
                break;
            case 2: System.out.println("The restaurant suggests: ");
                    Truth = adult ? "Red wine" : "cola";
                    System.out.println(Truth);
                break;
            case 3: System.out.println("The restaurant suggests: ");
                    Truth = adult ? "White wine" : "Lemonade";
                    System.out.println(Truth);
                break;
            case 4: System.out.println("The restaurant suggests: ");
                    Truth = adult ? "Port wine" : "Still water";
                    System.out.println(Truth);
                break;
            case 5: System.out.println("The restaurant suggests: ");
                    System.out.println("Sparkling water");
                break;
            default: System.out.println("The restaurant does not have such a menu!");
                    
        }
    }
}
