package lu.uni.programming1.lab5.exercise5;

public class Shop {
    int localNumberOfGiveaways = 2;
    int maxNumberOfGiveaways = 3;
    Item it = new Item();
    public void Buy(Item item){
        it.getPrice();

        switch (localNumberOfGiveaways){
            case 0 :
                System.out.println("No local giveways left.");
                break;
            default:
                break;
        }
        switch (maxNumberOfGiveaways){
            case 0:
                System.out.println("No maximum giveaways left !");
                break;
            default:
                break;
        }
        while (maxNumberOfGiveaways != 0 && localNumberOfGiveaways != 0) {
            int min_price = 0, max_price = 120, range_price = max_price - min_price + 1;
            int min_perc = 0, max_perc = 100, range_perc = max_perc - min_perc + 1;
            int randomPrice = (int) (Math.random() *range_price) + 1;
            int randPercentage = (int) (Math.random() * range_perc) + 1;

            System.out.println("Random price : " + randomPrice + " EUR.");
            maxNumberOfGiveaways--;
            localNumberOfGiveaways--;
            if (randomPrice < 20) {
                if (randPercentage <= 2) {
                    System.out.println("You won ! (" + randomPrice + " EUR item with " + randPercentage + "% )");
                } else {
                    System.out.println("You lost !");
                }
            } else if (randomPrice <= 100 || randomPrice == 20) {
                if (randPercentage <= 5) {
                    System.out.println("You won ! (" + randomPrice + " EUR item with " + randPercentage + "% )");
                } else {
                    System.out.println("You lost !");
                }
            } else {
                if (randPercentage <= 10) {
                    System.out.println("You won ! (" + randomPrice + " EUR item with " + randPercentage + "% )");
                } else {
                    System.out.println("You lost !");
                }
            }
        }
    }
}
