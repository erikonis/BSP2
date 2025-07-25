import java.util.Scanner;

public class BeveragesSwitchExpression {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
    System.out.print("Please enter the selected menu id:");
    int menu = scanner.nextInt();

    System.out.print("Please enter whether the client is an adult: (true/false)");
    boolean adult = scanner.nextBoolean();

    scanner.close();
    

    // TODO: replace all of the code below by a better construct!
    //       Simplify conditions to make them more readable and make sure the suggestions are still the same!
    
    String out =switch (menu){
        
        case 1,2 -> adult==true?"Red wine" : "Cola";
        
        case 3 -> adult==true?"White wine" : "Lemonade";

        case 4 -> adult==true?"Port wine" : "Still Water";

        case 5 -> "The restaurant suggests: Sparkling Water";

        default -> menu<1 || menu>5?"The restaurant does not have such a menu!" : "The restaurant suggests: ";
    };
    
    System.out.println(out);
    
} 

}
    

