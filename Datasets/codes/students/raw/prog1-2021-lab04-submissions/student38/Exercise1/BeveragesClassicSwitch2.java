package lu.uni.programming1.lab4.Exercise1;

import java.util.Scanner;

public class BeveragesClassicSwitch2 {
    static String drink;
    static int menu;
    static boolean adult;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        AskUser();
    }
    private static int AskUser(){
        System.out.print("Please enter the selected menu id:\n" +
                "1 - Red wine\n" +
                "2 - Fish\n" +
                "3 - Pasta with tomato sauce\n" +
                "4 - Pasta with cream sauce\n" +
                "5 - Soup with sparkling water\n" +
                "What would you like to chose: ");
        menu = sc.nextInt();
        IsAdult();
        sc.close();
        return menu;
    }
    private static boolean IsAdult(){
        System.out.print("Please enter if the client is an adult: (true/false)  ");
        adult = sc.nextBoolean();
        GetBeverage(menu,adult);
        return adult;
    }
    private static void GetBeverage(int menu, boolean adult){
        switch (menu) {
            case 1:
                if (adult) {drink ="Red wine";}
                else{drink = "Cola";}
                System.out.println("Ordered meat with " + drink);
                break;
            case 2:
                if (adult) {drink = "Red wine";}
                else{drink = "Cola";}
                System.out.println("Ordered fish with " + drink);
                break;
            case 3:
                if (adult) {drink = "White wine";}
                else{drink = "Lemonade";}
                System.out.println("Ordered pasta with tomato sauce with " + drink);
                break;
            case 4:
                if (!adult) {drink = "Still Water";}
                else {drink = "Port wine";}
                System.out.println("Ordered pasta with cream sauce with " + drink);
                break;
            case 5:
                System.out.println("The restaurant suggests: Soup with sparkling water");
                break;
            default:
                System.out.println("The restaurant does not have such a menu!");

               sc.close();
        }
    }
}
    
    

