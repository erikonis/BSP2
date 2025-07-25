import java.util.Scanner;
public class BeveragesClassicSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();
        //Classic switch
        String result = "";

        switch(menu){
            
            case 1: System.out.print("The restaurant suggests: ");
                result = (adult)? "Red wine" : "Cola";
            break;
            case 2: System.out.print("The restaurant suggests: ");
                result = (adult)? "Red wine" : "Cola";
            break;
            case 3: System.out.print("The restaurant suggests: ");
                result = (adult)? "White wine" : "Lemonade";
            break;
            case 4: System.out.print("The restaurant suggests: ");
                result = (adult)? "Port wine" : "Still Water";
            break;
            case 5: System.out.print("The restaurant suggests: ");
                result = "Sparkling Water";
            break;
            default: System.out.println("The restaurant does not have such a menu!");
        }
        System.out.print(result);

    } 
    
}
