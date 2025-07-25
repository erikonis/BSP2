package exercise5;

public class Shop {
    private int localNumberOfGiveaways;
    private int maxNumberOfGiveaways = 3 * localNumberOfGiveaways;

    public Shop(int localNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
    }

    public boolean buy(Item item) {
        int r;
        System.out.printf("This item costs %.2f€\n", item.getPrice());
        if (localNumberOfGiveaways == 0 || maxNumberOfGiveaways == 0) {
            System.out.println("There are no more giveaways.");
            return false;
        }
        if (localNumberOfGiveaways > 0 || maxNumberOfGiveaways > 0) {
            r = (int) (Math.random() * (100 - 1 + 1)) + 1;
            if (item.getPrice() < 20 && r <= 2) {
                localNumberOfGiveaways--;
                System.out.println("You won our giveaway!");
            } else if (item.getPrice() < 100 && r <= 5) {
                localNumberOfGiveaways--;
                System.out.println("You won our giveaway!");
            } else if (item.getPrice() >= 100 && r <= 10) {
                localNumberOfGiveaways--;
                System.out.println("You won our giveaway!");
            }
        }
        return true;
    }

    public int getLocalNumberOfGiveaways(){
        return localNumberOfGiveaways;
    }
}
