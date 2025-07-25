import java.util.Random;

public class Shop {
    private int localGiveAways;
    static public int maxGiveaways;

    Shop(int localGiveAways) {
        this.localGiveAways = localGiveAways;
    }

    public void buy(Item item) {
        System.out.println("Price of the purchased item: " + item.getPrice());
        Random random = new Random();
        if (localGiveAways == 0) {
            System.out.println("Sorry we are out of giveaways!");
        } else {
            if (item.getPrice() < 20) {
                if (random.nextInt(50) == 3) {
                    System.out.println("You won with your 2% of winning chance!");
                    --localGiveAways;
                    --maxGiveaways;
                }
            } else if (item.getPrice() >= 20 && item.getPrice() <= 100) {
                if (random.nextInt(20) == 3) {
                    System.out.println("You won with your 5% of winning chance!");
                    --localGiveAways;
                    --maxGiveaways;
                }
            } else {
                if (random.nextInt(10) == 3) {
                    System.out.println("You won with your 10% of winning chance!");
                    --localGiveAways;
                    --maxGiveaways;
                }
            }
            System.out.println("Local number of giveaways item left: " + localGiveAways);
        }
    }
}