import java.util.Random;

public class Shop {
    private int localNumberOfGiveaways;

    public static int maxNumberOfGiveaways = 30;

    public Shop(int nb){
        this.localNumberOfGiveaways = nb;
    }

    public void buy(Item item){
        String msg = "This item price is  "+ item.getPrice() +"€";
        if (this.localNumberOfGiveaways == 0) {msg += "\n There are no more giveaway for this shop";}
        if (maxNumberOfGiveaways == 0) {msg += "\n There are no more giveaway in the whole country !";}
        else {
            //Giveaway calculation
        int probability;

        if (item.getPrice() < 20) {probability = 2;}
        else if (item.getPrice() < 100) {probability = 5;}
        else {probability = 10;}

        Random random = new Random();
        int nb = random.nextInt(100);
        System.out.println(nb);

        boolean won = nb <= probability ? true : false;

        this.localNumberOfGiveaways -= 1; maxNumberOfGiveaways -= 1;

        msg = won ? "You won a giveaway ! Congratulations !!!" : ";( you didn't won anything, buy something else to get another chance";

        System.out.println(msg);
        }
        
    }
}
