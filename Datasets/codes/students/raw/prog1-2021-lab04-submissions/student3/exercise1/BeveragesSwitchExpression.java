package lu.uni.programming1.lab4.exercise1;
import java.util.Scanner;
public class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        String result=switch(menu){ 
        case 1,2-> adult?"Red wine":"Cola";

        case 3-> adult?"White wine":"Lemonade";

        case 4-> adult?"Port wine":"Still Water";
            
        case 5-> "The restaurant suggests: Sparkling Water";
        default->"";
        };
        System.out.println(result);
    } 


     






     
}
