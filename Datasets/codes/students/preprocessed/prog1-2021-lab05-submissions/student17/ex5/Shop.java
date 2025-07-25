import java.util.Scanner;
//public class shop
//attributes
public class Shop {
    private int localNumberOfGiveaways;
    public class  maxNumberOfGiveaways {
        public int numberOfGiveaways=16;
        public int getNumberOfGiveaways(){
            return numberOfGiveaways;
        }
    }

    public Shop(int localNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
    }
    
    public void buy(Item item)
    {
        System.out.println(item.getPrice());
        //check if there are still some giveaways available
        if (localNumberOfGiveaways==0) {
            if (maxNumberOfGiveaways==0) {
                System.out.println("There are no more giveaways left at national level");
            }
            else
            {
                System.out.println("There are no more giveaways left at local level");
            }
        }
        //check for the purchases and chance
        if(localNumberOfGiveaways>0 && maxNumberOfGiveaways>0)
        {
            double random;
            if (item.getPrice()<20) {

                double chance= item.getPrice()/100*2;// 2percent
                System.out.println("The chance is about " + chance);
            }
            if (item.getPrice()>20 && item.getPrice()<100) {
                
                double chance= item.getPrice()/100*5;//5 percent
                System.out.println("The chance is about " + chance);
            }
            if (item.getPrice()>100) {
                
                double chance= item.getPrice()/100*10;//10 percent
                System.out.println("The chance is about " + chance);
            }

        }
        
    }



}
