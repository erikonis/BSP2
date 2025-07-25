import java.util.Scanner;
public class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();
        
        
        String result = "";
        //Switch expression
        result = switch(menu){
            
            case 1 -> { 
                yield result = (adult)? "The restaurant suggests: Red wine" : "The restaurant suggests: Cola";
                }
            case 2 -> { 
                yield result = (adult)? "The restaurant suggests: Red wine" : "The restaurant suggests: Cola";
                }
            case 3 -> { 
                yield result = (adult)? "The restaurant suggests: White wine" : "The restaurant suggests: Lemonade";
                }
            case 4 -> { 
                yield result = (adult)? "The restaurant suggests: Port wine" : "The restaurant suggests: Still Water";
                }
            case 5 -> { 
               yield "The restaurant suggests: Sparkling Water";
                }
        
            default -> {yield "The restaurant does not have such a menu!";}
        };
        System.out.print(result);

    } 
}
