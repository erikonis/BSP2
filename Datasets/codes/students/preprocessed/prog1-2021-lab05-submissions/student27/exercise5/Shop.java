public class Shop {

    private int localNumberOfGiveaways;
    private int maxNumberOfGiveaways;

    public Shop(int localNumberOfGiveaways, int maxNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
        this.maxNumberOfGiveaways = maxNumberOfGiveaways;
    }

    public void buy(Item item) {
        System.out.println(item.getPrice() + "€");

        double random = Math.random() * 100;

        if (localNumberOfGiveaways == 0) {
            if (maxNumberOfGiveaways == 0) {
                System.out.println("There are national wide no more giveaways left.");
            } else {
                System.out.println("There are no more giveaways left in this shop.");
            }
        } else {
            if (item.getPrice() < 20) {
                if (random <= 2) {
                    System.out.println("You won a giveaway.");
                    localNumberOfGiveaways = localNumberOfGiveaways - 1;
                    maxNumberOfGiveaways = maxNumberOfGiveaways - 1;
                } else {
                    System.out.println("You didn't win a giveaway.");
                }
            } else if (item.getPrice() < 101) {
                if (random <= 5) {
                    System.out.println("You won a giveaway.");
                    localNumberOfGiveaways = localNumberOfGiveaways - 1;
                    maxNumberOfGiveaways = maxNumberOfGiveaways - 1;
                } else {
                    System.out.println("You didn't win a giveaway.");
                }
            } else if (item.getPrice() > 100) {
                if (random <= 10) {
                    System.out.println("You won a giveaway.");
                    localNumberOfGiveaways = localNumberOfGiveaways - 1;
                    maxNumberOfGiveaways = maxNumberOfGiveaways - 1;
                } else {
                    System.out.println("You didn't win a giveaway.");
                }
            }
        }
    }

    public  int getLocalNumberOfGiveaways() {
        return localNumberOfGiveaways;
    }

    public  void setTotalNumberofGiveaways(int totalNumberOfGiveaways){
        maxNumberOfGiveaways = totalNumberOfGiveaways;
    }
}
