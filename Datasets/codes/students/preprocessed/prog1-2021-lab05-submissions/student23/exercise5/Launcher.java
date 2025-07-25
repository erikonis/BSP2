import java.util.Random;

public class Launcher {

    public static void main(String[] args) {

        Random random = new Random();

        //Shops
        Shop s1 = new Shop(10);
        Shop s2 = new Shop(10);
        Shop s3 = new Shop(10);

        //Item
        Item toBuy;

        //Loop
        while (Shop.maxNumberOfGiveaways > 1) {
            double rng = random.nextInt(130-5) + 5;
            toBuy = new Item(rng);

            s1.buy(toBuy);
            s2.buy(toBuy);
            s3.buy(toBuy);
        }
    }  
}
