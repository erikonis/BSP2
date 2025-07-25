import java.util.Scanner;

public class BeveragesClassicSwitch {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        String suggestion = "";

        switch (menu)
            {
                case 1,2:
                    suggestion = (adult) ? "Red Wine" : "Cola";
                break;

                case 3:
                    suggestion = (adult) ? "White wine" : "Lemonade";
                break;

                case 4:
                    suggestion = (adult) ? "Port Wine" : "Still water";
                break;

                case 5:
                    suggestion = "Sparkling water";
                break;

                default:
                    System.out.println("The restaurant does not have such a menu!");
                    System.exit(0);
                break;

            }
        
        System.out.println(suggestion);
    }
    
}
