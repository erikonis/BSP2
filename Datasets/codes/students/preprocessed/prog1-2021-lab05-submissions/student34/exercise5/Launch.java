import java.util.Scanner;
import java.util.Random;


public class Launch {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of Giveaways: ");

        int totalNumber = scanner.nextInt();
        int local = totalNumber/3;
        shop shop1 = new shop(local, totalNumber);
        shop shop2 = new shop(local, totalNumber);
        shop shop3 = new shop(local, totalNumber);
        int totalleft = totalNumber;
        do {
            Random rd = new Random();
            int ran_num = rd.nextInt(120);
            item Purchase1 = new item(ran_num);
            ran_num = rd.nextInt(120);
            item Purchase2 = new item(ran_num);
            ran_num = rd.nextInt(120);
            item Purchase3 = new item(ran_num);

            shop1.buy(Purchase1);
            shop2.buy(Purchase2);
            shop3.buy(Purchase3);
            totalleft = shop1.getshops()+shop2.getshops()+shop3.getshops();
            System.out.println("\nTotal left: " + totalleft);    
        }while (totalleft>0);
        
    }
    
}
