public class Shop {

    private int localNumberOfGiveaways;
    private int maxNumberOfGiveaways;

    public Shop(int localNumberOfGiveaways, int maxNumberOfGiveaways)
    { 
        this.localNumberOfGiveaways = localNumberOfGiveaways;
        this.maxNumberOfGiveaways = maxNumberOfGiveaways;
    }

    public int getLocalNumberOfGiveaways(){return localNumberOfGiveaways;}

    public void buy(Item item)
    {
        System.out.println("The item costs : "+item.getPrice()+" €");

        if(localNumberOfGiveaways<=0) System.out.println("This shop has no giveaways left");
        else if (maxNumberOfGiveaways<=0) System.out.println("There are no more giveaways left at national level");
        else
        {
            int giveawayChance=0;
            if(item.getPrice()<20) giveawayChance = 2;
            else if(item.getPrice()>=20&&item.getPrice()<100) giveawayChance = 5;
            else if(item.getPrice()>=100) giveawayChance = 10;

            if((Math.random()*100)<giveawayChance) System.out.println("The customer won the giveaway");

            localNumberOfGiveaways--;
            maxNumberOfGiveaways--;
        }
    }
}
