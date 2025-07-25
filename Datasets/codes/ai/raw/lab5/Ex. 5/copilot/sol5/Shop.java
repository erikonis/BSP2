import java.util.Random;

public class Shop {
    private int localNumberOfGiveaways;
    private static int maxNumberOfGiveaways;

    public Shop(int localNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
    }

    public static void setMaxNumberOfGiveaways(int maxGiveaways) {
        maxNumberOfGiveaways = maxGiveaways;
    }

    public void buy(Item item) {
        System.out.println("Item price: " + item.getPrice() + " e");

        if (localNumberOfGiveaways <= 0) {
            System.out.println("No more giveaways left in this shop.");
            return;
        }

        if (maxNumberOfGiveaways <= 0) {
            System.out.println("No more giveaways left at national level.");
            return;
        }

        double price = item.getPrice();
        Random random = new Random();
        boolean wonGiveaway = false;

        if (price < 20 && random.nextInt(100) < 2) {
            wonGiveaway = true;
        } else if (price >= 20 && price <= 100 && random.nextInt(100) < 5) {
            wonGiveaway = true;
        } else if (price > 100 && random.nextInt(100) < 10) {
            wonGiveaway = true;
        }

        if (wonGiveaway) {
            System.out.println("Congratulations! You won a giveaway.");
            localNumberOfGiveaways--;
            maxNumberOfGiveaways--;
        } else {
            System.out.println("Sorry, no giveaway this time.");
        }
    }

    public int getLocalNumberOfGiveaways() {
        return localNumberOfGiveaways;
    }

    public static int getMaxNumberOfGiveaways() {
        return maxNumberOfGiveaways;
    }
}
