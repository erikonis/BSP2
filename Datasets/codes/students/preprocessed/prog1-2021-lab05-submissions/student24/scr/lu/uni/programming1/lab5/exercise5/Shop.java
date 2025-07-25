public class Shop {
    private int localNumberOfGiveaways;

    public Shop(int localNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
    }

    public boolean buy(Item item) {
        int chance;
        System.out.println("This item costs "+ item.getPrice() + "$");
        // System.out.printf("This item costs %.2f€\n", item.getPrice());
        if (localNumberOfGiveaways == 0) {
            System.out.println("There are no more giveaways.");
        }
        if (localNumberOfGiveaways > 0) {
            chance = (int) (Math.random() * (100 - 1 + 1)) + 1;
            if (item.getPrice() < 20 && chance <= 2) {
                localNumberOfGiveaways--;
                System.out.println("You won our giveaway!");
                return true;
            } else if (item.getPrice() < 100 && chance <= 5) {
                localNumberOfGiveaways--;
                System.out.println("You won our giveaway!");
                return true;
            } else if (item.getPrice() >= 100 && chance <= 10) {
                localNumberOfGiveaways--;
                System.out.println("You won our giveaway!");
                return true;
            }
        }
        return false;
        
    }

    public int getLocalNumberOfGiveaways(){
        return localNumberOfGiveaways;
    }
}
