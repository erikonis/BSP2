package lu.uni.programming1.lab5.exercise5;



public class Shop {
    int localNumberOfGiveaways = 3;
    int maxNumberOfGiveaways = 3;
    Item it = new Item();

    public void Buy(Item item){
        it.getPrice();

        while (maxNumberOfGiveaways != 0 && localNumberOfGiveaways != 0) {
            int min_price = 0, max_price = 120, range_price = max_price - min_price + 1;
            int min_perc = 0, max_perc = 100, range_perc = max_perc - min_perc + 1;
            int randomPrice = (int) (Math.random() *range_price) + 1;
            int randomPerc = (int) (Math.random() * range_perc) + 1;

            System.out.println("\nPrice : " + randomPrice + " EUR.");
            maxNumberOfGiveaways--;
            localNumberOfGiveaways--;
            if (randomPrice < 20) {
                if (randomPerc <= 2) {
                    System.out.println("    You won ! ( with " + randomPerc +" % )");
                } else {
                    System.out.println("    You lost !");
                }
            } else if (randomPrice <= 100 || randomPrice == 20) {
                if (randomPerc <= 5) {
                    System.out.println("    You won ! ( with " + randomPerc +" % )");
                } else {
                    System.out.println("    You lost !");
                }
            } else {
                if (randomPerc <= 10) {
                    System.out.println("    You won ! ( with " + randomPerc +" % )");
                } else {
                    System.out.println("    You lost !");
                }
            }
            switch (localNumberOfGiveaways){
                case 0 :
                    System.out.println("\nNo local giveways left!");
                    break;
                case 1 :
                    System.out.println("\n1 local giveaway left!");
                    break;
                case 2 :
                    System.out.println("\n2 local giveaways left!");
                    break;
            }
        }
        System.out.println("No giveaways left in this shop!");
    }
}
