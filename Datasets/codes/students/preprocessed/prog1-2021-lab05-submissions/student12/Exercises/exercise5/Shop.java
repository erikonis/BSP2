import java.util.Scanner;

public class Shop
{
    private int localNumberOfGiveaways;
    private static int maxNumberOfGivaways;

    public Shop(int local)
    {
        this.localNumberOfGiveaways = local;
    }

    public void buy(Item item)
    {
        int price = item.getPrice();

        System.out.println(price);

        if(localNumberOfGiveaways ==0)
        {
            System.out.println("This shop has no more giftaways left.");
        }
        else if(maxNumberOfGivaways ==0)
        {
            System.out.println("There are no more giveaways left nationally");
        }

        int random = (int)(Math.random()*(100-0+1))+0;
        
        if(localNumberOfGiveaways !=0 || maxNumberOfGivaways !=0)
        {
            if(price <= 20)
            {
                if(random <2)
                {
                    System.out.println("Congratulation! You won in our give away!");
                }
            }
            else if(price <= 100)
            {
                if(random <5)
                {
                    System.out.println("Congratulation! You won in our give away!");
                }
            }
            else
            {
                if(random <10)
                {
                    System.out.println("Congratulation! You won in our give away!");
                }
            }
            localNumberOfGiveaways--;
            maxNumberOfGivaways--;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please put in the number of giveaways nationally: ");
        maxNumberOfGivaways = s.nextInt();
        s.close();
        
        int tmp = maxNumberOfGivaways;
        int third= maxNumberOfGivaways/3;
        Shop s1, s2, s3;

        s1 = new Shop(third);
        s2 = new Shop(third);
        s3 = new Shop(third);

        if(maxNumberOfGivaways%3 ==1)
        {
            s1 = new Shop(third+1);
        }
        else if(maxNumberOfGivaways%3 ==2)
        {
            s1 = new Shop(third+1);
            s2 = new Shop(third+1);
        }

        System.out.println("Shop1: " + s1.localNumberOfGiveaways);
        System.out.println("Shop2: " + s2.localNumberOfGiveaways);
        System.out.println("Shop3: " + s3.localNumberOfGiveaways);

        for(int i = tmp; i>0; i--)
        {
            int randomPrice = (int)(Math.random()*(120-0+1))+0;
            int randomShop = (int)(Math.random()*(2-0+1))+0;

            if(randomShop == 0)
            {
                Item item = new Item(randomPrice);

                s1.buy(item);

                System.out.println("There are " + s1.localNumberOfGiveaways + " giveaways left in the first store");
            }
            else if(randomShop == 1)
            {
                Item item = new Item(randomPrice);

                s2.buy(item);

                System.out.println("There are " + s2.localNumberOfGiveaways + " giveaways left in the second store store");
            }
            else
            {
                Item item = new Item(randomPrice);

                s3.buy(item);

                System.out.println("There are " + s2.localNumberOfGiveaways + " giveaways left in the first store");
            }
            System.out.println("There are a total of " + maxNumberOfGivaways + " giftaways left nationally");
        }
    }
}
