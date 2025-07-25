import java.util.Scanner;

public class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();
        String suggest;
        
        scanner.close();   
         
        suggest = switch (menu) {
    
            case 1,2 -> (adult) ? "Red wine" : "cola";
            case 3 -> (adult) ? "White wine" : "Lemonade";
            case 4 -> (adult) ? "Port wine" : "Still Water";
            case 5 -> "sparkling Water";

            default -> { 
                System.out.println("'yield'");
               yield "The restaurant does not have such a menu!" ;

            }
        
        };
System.out.println(" The restaurant suggests: " + suggest);

        
    }
    
}
