package Exercise5;
import java.util.Random; 

public class Shop {

    int localNumberOfGiveaways;



    int maxNumberOfGiveaways; 

    public void setLocalNumberOfGiveaways(int localNumberOfGiveaways)  { this.localNumberOfGiveaways=localNumberOfGiveaways; } 

    public void setLocalMaxNumberOfGiveaways(int maxNumberOfGiveaways)  { this.maxNumberOfGiveaways=maxNumberOfGiveaways; } 



    public boolean prob(int probprice) {

        int thepriceprob=probprice;

        int chance; 

        boolean theprob; 

        Random rnd = new Random();

        if (thepriceprob<20)  chance = rnd.nextInt(50); else if (thepriceprob<100) chance = rnd.nextInt(20); else chance = rnd.nextInt(10);

        if (chance == 1) {
           theprob=true;  ;
        } else {
           theprob=false;
        }

        return theprob;
     }


    public void buy(Item item ) {   

        System.out.println("The item price is " + item.price);

        if (localNumberOfGiveaways==maxNumberOfGiveaways ) {  System.out.println(" No more giveaways left! ");   }

        else { if (prob(item.price))  {localNumberOfGiveaways++;  System.out.println(" You won a giveaway! ");}; 


        
  
        
        }


    }

    
}
