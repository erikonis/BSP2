package lu.uni.programming1.lab5.exercise5;
import java.util.Random;

public class shop {
    private int localNumberOfGiveaways, maxNumberOfGiveaways;

    shop(int localNumberOfGiveaways_, int maxNumberOfGiveaways_ ) {
        this.localNumberOfGiveaways = localNumberOfGiveaways_;
        this.maxNumberOfGiveaways = maxNumberOfGiveaways_;
    }

    public int getshops() {
        return localNumberOfGiveaways;
    }   

    public int gettotal() {
        return maxNumberOfGiveaways;
    }

    
    public void buy(item item){
        System.out.print("\nPrice: " + item.getprice() );
       
        if (localNumberOfGiveaways>0 && maxNumberOfGiveaways>0){
            System.out.print("\nNumber of Giveaways in this shop: " + localNumberOfGiveaways + "\nTotal Number of Giveaways : " + maxNumberOfGiveaways);         
        }
        else if(localNumberOfGiveaways==0 && maxNumberOfGiveaways>0){
         System.out.print("\nNO Giveaways in this shop, but " + "\nTotal Number of Giveaways : " + maxNumberOfGiveaways);
        }
        else if(localNumberOfGiveaways==0 && maxNumberOfGiveaways==0){
            System.out.print("\nNO Giveaways at national level");
        }
    
        Random rd = new Random();
        int ran_num = rd.nextInt(100);


       if (localNumberOfGiveaways>0 && maxNumberOfGiveaways>0){
           if (item.getprice()<20 && ran_num > 97){
            System.out.println("\nYou win a Giveaway " + "2% chance");
            localNumberOfGiveaways--;
            maxNumberOfGiveaways--;
           }
           if(item.getprice()>=20&&item.getprice()<100 && ran_num > 94 ){
            System.out.println("\nYou win a Giveaway " + "5% chance");
            localNumberOfGiveaways--;
            maxNumberOfGiveaways--;
            }
           if(item.getprice()>100 && ran_num > 89){
            System.out.println("\nYou win a Giveaway " + "10% chance");
            localNumberOfGiveaways--;
            maxNumberOfGiveaways--;
            }
           

        }
    }
        

}
