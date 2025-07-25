
import java.util.Scanner;

public class BeveragesSwitchExpression
{
    public static void main(String[] args) 
    {
        // Initialisation of a Scanner object
        Scanner info = new Scanner (System.in);

        // Requesting user input about menu number and adulthood status from standard input stream
        System.out.println("Please enter the number (integer range from 1 to 5) of the selected menu: ");
            int menu = info.nextInt();

        System.out.println("Please enter whether the client is adult or not (true or false): ");
            boolean adulthood = info.nextBoolean();

        System.out.println("--------------------------------------------------------------------------");
        // Suggestion of beverages according to menu number and adulthood status
        String beverage;
        beverage = switch (menu)
        {
            case 1, 2 -> adulthood ? "Red wine" : "Cola";                 // client ordered meat or fish
            case 3 -> adulthood ? "White wine" : "Lemonade";              // client ordered pasta with tomato sauce
            case 4 -> adulthood ? "Port wine" : "Still water";            // client ordered pasta with cream sauce
            case 5 -> "Sparkling water";                                  // client ordered soup
            default -> "nothing, as the menu you entered does not exist!"; // bad input
        };
        System.out.println("The restaurant suggests: " + beverage);


        // Closure of the stream
        info.close();

    }
}