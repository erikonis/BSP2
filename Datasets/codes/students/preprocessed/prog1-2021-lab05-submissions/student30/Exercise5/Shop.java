import java.util.Random;
public class Shop {
    int maxNumberOfGiveaways;
    Item item = new Item();
    Giveaway giveaway = new Giveaway();
    int localNumberOfGiveaways = giveaway.getNum();
    public void Buy(Item item, Giveaway giveaway){
        item.getPrice();
        
        System.out.println(localNumberOfGiveaways);

        maxNumberOfGiveaways = 3*localNumberOfGiveaways;
        
        if (localNumberOfGiveaways == 0){
            System.out.println("No local giveaways left: ");
        }
        if (maxNumberOfGiveaways == 0){
            System.out.println("No giveaways left: ");
        }
        else {
        while (maxNumberOfGiveaways != 0 && localNumberOfGiveaways !=0){
            Random random = new Random();
            int randomPrice = random.nextInt(121);
            int randomPerc = random.nextInt(101);

            System.out.println("Random price: " + randomPrice + " $.");
            maxNumberOfGiveaways--;
            localNumberOfGiveaways--;
            if (randomPerc < 20){
                if (randomPerc <= 2){
                    System.out.println("You won a " + randomPrice + "$ item.");
                }
                else {
                    System.out.println("You lost.");
                }
            }
            else if (randomPrice <=100 || randomPrice >= 20){
                if (randomPerc <= 5) {
                    System.out.println("You won a " + randomPrice + "$ item.");
                }
                else {
                    System.out.println("You lost.");
                }
            }
            else {
                if (randomPerc <= 10) {
                    System.out.println("You won ! (" + randomPrice + "$ item.");
                } else {
                    System.out.println("You lost !");
                }
            }
        }
            
            
        }
    }
}
