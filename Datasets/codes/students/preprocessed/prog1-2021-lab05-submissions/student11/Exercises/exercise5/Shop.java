public class Shop {
    int localNumberOfGiveaways;

    Shop(int pNumber) {
        localNumberOfGiveaways = pNumber;
    }

    public void buy(Item item) {
        double random = Math.random();
        System.out.println(item.price);
        if (localNumberOfGiveaways == 0) {
            System.out.println("Sorry the Shop has no more giveaways left");
        }

        if (item.getPrice() < 20) {
            if (random <= 0.02) {
                System.out.println(" The customer won a giveaway");
                localNumberOfGiveaways--;
               
            }

        }

        if (item.getPrice() >= 20 && item.getPrice() <= 100) {
            if (random <= 0.05) {
                System.out.println(" The customer won a giveaway");
                localNumberOfGiveaways--;
            }
        }
        if (item.getPrice() > 100) {
            if (random <= 0.1) {
                System.out.println(" The customer won a giveaway");
                localNumberOfGiveaways--;
            }
        }

    }
}
