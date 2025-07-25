import java.util.Scanner;

public class exercise5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number of giveaways: ");

        Shop m = new Shop(0,0);

        m.maxNumberOfGiveaways = sc.nextInt();
        m.localNumberOfGiveaways = m.maxNumberOfGiveaways/3;

        while (m.maxNumberOfGiveaways > 0)
        {
            m.buy();
        }
        
        sc.close();
    }
    
}
