import java.util.Scanner;
public class maxNumberOfGiveaways {
    int maxNumberOfGiveaways;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of giveaways");
        int max=scanner.nextInt();
        Shop shop1= new Shop(max/3);
        Shop shop2= new Shop(max/3);
        Shop shop3= new Shop(max/3);
        while(max>0)
        {
            Item item1= new Item((Math.random()*121));
            Item item2= new Item((Math.random()*121));
            Item item3= new Item((Math.random()*121));

            shop1.buy(item1);
            shop2.buy(item2);
            shop3.buy(item3);
            max=shop1.localNumberOfGiveaways+shop2.localNumberOfGiveaways+shop3.localNumberOfGiveaways;
            System.out.println("Shop 1 amount of Giveaway left: "+shop1.localNumberOfGiveaways);
            System.out.println("Shop 2 amount of Giveaway left: "+shop2.localNumberOfGiveaways);
            System.out.println("Shop 3 amount of Giveaway left: "+shop3.localNumberOfGiveaways);
            System.out.println("National level amount ofGiveaway left: "+max);
            
        }
        System.out.println("There are no more giveaways left in a National level!");
       scanner.close();

        

    }
}
