import java.util.Scanner;

public class BeveragesSwitchExpression {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();
        

        // TODO: replace all of the code below by a better construct!
        //       Simplify conditions to make them more readable and make sure the suggestions are still the same!

        String result;

        result = switch(menu)
        {
            case 1, 2 -> "The restaurant suggests: " + (adult?"Red wine":"Cola");
            case 3 -> "The restaurant suggests: " + (adult?"White wine":"Lemonade");
            case 4 -> "The restaurant suggests: " + (!adult?"Still Water":"Port wine");
            case 5 -> "The restaurant suggests: Sparkling Water";
            default -> {
                yield "The restaurant does not have such a menu!";
            }
        };

        System.out.println(result);
    }
}
