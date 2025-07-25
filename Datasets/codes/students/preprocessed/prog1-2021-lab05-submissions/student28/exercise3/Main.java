import java.util.Scanner;  

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number of giveaways you want to give: (divisible by 3)");
        int giveaways = scan.nextInt();  // Read user input
        Shop shop1 = new Shop(giveaways/3);
        Shop shop2 = new Shop(giveaways/3);
        Shop shop3 = new Shop(giveaways/3);
        shop1.buy();
    }
}


