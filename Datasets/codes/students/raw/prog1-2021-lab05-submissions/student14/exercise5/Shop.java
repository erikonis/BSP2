import java.util.Scanner;

public class Shop {

    public double localNumberOfGiveaways;
    public double maxNumberOfGiveaways;

    Shop(double localN, double maxN) {

        localNumberOfGiveaways = localN;
        maxNumberOfGiveaways = maxN;

    }
    public void setlocal(int f)
    {
        localNumberOfGiveaways = f;
    }
    public void setNat(int g)
    {
        maxNumberOfGiveaways = g;
    }

    public void buy()
    {
        Scanner sc = new Scanner(System.in);
        Item i = new Item(sc.nextDouble());
        sc.close();
        boolean winner = false;
        System.out.println("Price of Item = " + i.getItem());
        if (localNumberOfGiveaways == 0)
        {
            if (maxNumberOfGiveaways == 0)
            {
                System.out.println("There are no more giveaways available in any shops.");
            }
            else 
            {
                System.out.println("There are no more giveaways in this shop.");
            }
        }
        else
        {
            int random = ((int)Math.random()*100);
            
            if (i.getItem() < 20)
            {
                winner = (random < 2)  ? true :false;
            }
            if ((i.getItem() >= 20) && (i.getItem() <= 100))
            {
                winner = (random < 5)  ? true :false;
            }
            if (i.getItem() > 100)
            {
                winner = (random < 10)  ? true :false;
            }
        }
        if (winner = true)
        {
            System.out.println("You are the proud winner of this giveaway!");
            winner = false;
            --localNumberOfGiveaways;
            --maxNumberOfGiveaways;
        }
    }
    public class Item {

        double price;
    
            Item(double price)
            {
                this.price = price;
            }
    
        public double getItem() {
            return price;
        }
        public void setItem(double setPrice) {
            price = setPrice;
        }
    }
    
    
}
