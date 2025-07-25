import java.util.Scanner;

public class Giveaways {

    static int rnd0to120()  {    
    
        int min = 0;  
        int max = 120;  
        int rndintoutput = (int)(Math.random()*(max-min+1)+min);  
        
        return rndintoutput;
       
        }  

        static int rnd1to3()  {    
    
            int min = 1;  
            int max = 3;  
            int rndintoutput = (int)(Math.random()*(max-min+1)+min);  
            
            return rndintoutput;
           
            }  




        
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in); 

                System.out.println(" How many total giveaways: "); 

                int howManyGiveAways = sc.nextInt();

                Shop firstShop = new Shop();

                Shop secondShop = new Shop();

                Shop thirdShop = new Shop();

                int remainder = howManyGiveAways%3; 

                int howManyGiveAways2=howManyGiveAways/3; 

                int whichshop; int whichprice;

                Item randomItem = new Item(); 


                boolean firstshopgaveawayeverything = false;
                boolean secondshopgaveawayeverything = false;

                boolean thirdshopgaveawayeverything = false;






                firstShop.setLocalMaxNumberOfGiveaways(howManyGiveAways2);
                secondShop.setLocalMaxNumberOfGiveaways(howManyGiveAways2);
                thirdShop.setLocalMaxNumberOfGiveaways(howManyGiveAways2+remainder);

                // The third shop gets the remainder of the division by three.

                firstShop.setLocalNumberOfGiveaways(0);
                secondShop.setLocalNumberOfGiveaways(0);
                thirdShop.setLocalNumberOfGiveaways(0);


                while (howManyGiveAways!=0)                
        

                {       
                        if (firstShop.localNumberOfGiveaways==firstShop.maxNumberOfGiveaways && firstshopgaveawayeverything==false) {howManyGiveAways -= firstShop.localNumberOfGiveaways; firstshopgaveawayeverything=true;};
                        if (secondShop.localNumberOfGiveaways==secondShop.maxNumberOfGiveaways && secondshopgaveawayeverything==false) {howManyGiveAways -= secondShop.localNumberOfGiveaways;  secondshopgaveawayeverything=true;};
                        if (thirdShop.localNumberOfGiveaways==thirdShop.maxNumberOfGiveaways && thirdshopgaveawayeverything==false) {howManyGiveAways -= thirdShop.localNumberOfGiveaways; thirdshopgaveawayeverything=true;};

                        if (howManyGiveAways==0) {sc.close(); System.exit(9);};



                        whichshop = rnd1to3();

                        whichprice = rnd0to120();

                        randomItem.setPrice(whichprice);  

                        System.out.println(" A customer enters shop number " + whichshop + " and buys an item worth " + whichprice );

                            switch(whichshop) {
                                    case 1: firstShop.buy(randomItem);
                                    case 2: secondShop.buy(randomItem);
                                    case 3: thirdShop.buy(randomItem);
                            }


                        };

                    sc.close();

                }







          } 

    
    

