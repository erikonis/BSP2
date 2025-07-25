import java.util.Scanner;

public class BeverageSwitch {
    public static void main(String[] args) {
        //Input, from Beverage.java
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        //Switch
        String header = "The Restaurant suggest :\n";
        String sugestion = "";

        sugestion += switch (menu) {
            case 1, 2 -> header + ((adult) ? "Red Wine" : "Cola");
            case 3 -> header + ((adult) ? "White Wine" : "Lemonade");
            case 4 -> header + ((adult) ? "Port Wine" : "Still Water");
            case 5 -> header +"Sparkling Water";
            default -> {
                System.out.println("The restaurant does not have such a menu!");
                yield "";
            }
        };

        System.out.println(sugestion);

    }
}
