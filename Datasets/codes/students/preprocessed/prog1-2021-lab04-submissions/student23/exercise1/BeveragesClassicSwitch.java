import java.util.Scanner;

public class BeveragesClassicSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();
        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();
        scanner.close();
        System.out.print("The restaurant suggests: ");
        switch (menu){
            case 1:
            String beverage1 = adult==true ? "Red wine" : "Cola";
            System.out.println(beverage1);
            break;
            case 2:
            String beverage2 = adult==true ? "Red wine" : "Cola";
            System.out.println(beverage2);
            break;
            case 3:
            String beverage3 = adult==true ? "White wine" : "Lemonade";
            System.out.println(beverage3);
            break;
            case 4:
            String beverage4 = adult==true ? "Port wine" : "Still water";
            System.out.println(beverage4);
            break;
            case 5:
            System.out.println("The restaurant suggests sparkling water.");
            break;
            default : System.out.println("The restaurant does not have such a menu!");
        }
    }
}
