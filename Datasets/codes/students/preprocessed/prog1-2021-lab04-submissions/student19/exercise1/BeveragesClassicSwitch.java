
import java.util.Scanner;

public class BeveragesClassicSwitch 
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

          System.out.println("---------------------------------------------------------------------------");
          // Suggestion of beverages according to menu number and adulthood status
          switch (menu)
          {
               case 1: // client ordered meat
               {
                    String beverage1;
                    System.out.print("The restaurant suggests: ");
                    beverage1 = (adulthood) ? "Red wine" : "Cola";
                    System.out.println(beverage1);
                    break;
               }
               case 2: // client ordered fish
               {
                    String beverage2;
                    System.out.print("The restaurant suggests: ");
                    beverage2 = (adulthood) ? "Red wine" : "Cola";
                    System.out.println(beverage2);
                    break;
               }
               case 3: // client ordered pasta with tomato sauce
               {
                    String beverage3;
                    System.out.print("The restaurant suggests: ");
                    beverage3 = (adulthood) ? "White wine" : "Lemonade";
                    System.out.println(beverage3);
                    break;
               }
               case 4: // client ordered pasta with cream sauce
               {
                    String beverage4;
                    System.out.print("The restaurant suggests: ");
                    beverage4 = (adulthood) ? "Port wine" : "Still water";
                    System.out.println(beverage4);
                    break;
               }
               case 5: // client ordered a soup
               {
                    System.out.print("The restaurant suggests: ");
                    System.out.println("Sparkling water");
                    break;
               }
               default:
               {
                    System.out.println("Unfortunately, the restaurant does not offer such a menu!");
                    break;
               }
          }


          // Closure of the stream
          info.close();
     }   
}
