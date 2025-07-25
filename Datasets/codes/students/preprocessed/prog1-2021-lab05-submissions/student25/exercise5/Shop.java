import java.util.Random;

public class Shop {

    private int localNumberOfgiveaways;
    private static int maxNumberOfGiveaways;

    public Shop(int localNumberOfgiveaways) {
        this.localNumberOfgiveaways = localNumberOfgiveaways;
    }

    public void setNumberOfNationalGiveaways(int maxNumberOfGiveaways) {
        Shop.maxNumberOfGiveaways = maxNumberOfGiveaways;
    }

    public boolean localGiveawaysLeft() {
        if (localNumberOfgiveaways == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean nationalGiveawaysLeft() {
        if (maxNumberOfGiveaways == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void checkVictory(int i, int j) {
        Random ran = new Random();
        int random = ran.nextInt(100);
        if (random >= i && random <= j) {
            System.out.println("You won a giveaway");
            localNumberOfgiveaways--;
            maxNumberOfGiveaways--;
        } else {
            System.out.println("Sorry you didn't win this time");
        }
    }

    public void buy(Item item) {
        System.out.println("Price: " + item.getPrice());
        if (localNumberOfgiveaways == 0 || maxNumberOfGiveaways == 0) {
            System.out.println("Sorry, there are no giveaways left :(");
        } else {
            if (item.getPrice() < 20) {
                checkVictory(1, 2);
            } else if (item.getPrice() < 100) {
                checkVictory(1, 5);
            } else if (item.getPrice() >= 100) {
                checkVictory(1, 10);
            }
            System.out.println("There are " + localNumberOfgiveaways + " giveaways left for this store and " + maxNumberOfGiveaways + " giveaways left in the country.");
        }
    }

}
