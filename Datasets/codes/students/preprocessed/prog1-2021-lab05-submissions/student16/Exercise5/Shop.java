public class Shop {
    
    protected int localNumberOfGiveaways;
    private int maxNumberOfGiveaways;
    private int played=0;

    public Shop(int localNumberOfGiveaways)
    {
        this.localNumberOfGiveaways=localNumberOfGiveaways;
    }

    public void buy(Item item)
    {
        System.out.println("This item costs" + item.getPrice());
        if(localNumberOfGiveaways<=0)
        {
            System.out.println("No more giveaways left in this shop!");
        }
        else if(played>maxNumberOfGiveaways)
        {
            System.out.println("No more giveaways left on a national level!");
        }
        else
        {
            played++;
            int chance= (int) (Math.random()*(100-1+1))+1;
            if(item.getPrice()<20)
            {
                if(chance<=2)
                {
                    System.out.println("You won the giveaway!");
                }
                else
                {
                    System.out.println("You lost the giveaway.");
                }
            }
            else if(item.getPrice()>=20 && item.getPrice()<=100)
            {
                if(chance<=5)
                {
                    System.out.println("You won the giveaway!");
                }
                else
                {
                    System.out.println("You lost the giveaway.");
                }
            }
            else
            {
                if(chance<=10)
                {
                    System.out.println("You won the giveaway!");
                }
                else
                {
                    System.out.println("You lost the giveaway.");
                }
            }
            localNumberOfGiveaways--;
        }
    }
}
