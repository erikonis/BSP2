package Exercise5;

import java.util.Scanner;


public class Shop {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter the number of giveways you want per shop (this number will be equal for all shop):");
        int giveaway = scanner.nextInt();
        Shop.setMaxNumberOfGiveaways(giveaway);

        Shop sp1 = new Shop();
        Shop sp2 = new Shop();
        Shop sp3 = new Shop();

        int max = 120;
        int min = 0;
        

        while(maxNumberOfGiveaways != 0){
            int rnd = (int)(Math.random()*(max - min + 1))+min;
            int counter = (int)(Math.random()*(3-1+1))+1;
            switch(counter){ 
                case 1-> {
                    if(sp1.localNumberOfGiveaways>0)
                    {
                        sp1.buy(new Item(rnd));
                    }
                }
                case 2-> {
                    if(sp2.localNumberOfGiveaways>0)
                    {
                        sp2.buy(new Item(rnd));
                    }
                }
                case 3-> {
                    if(sp3.localNumberOfGiveaways>0)
                    {
                        sp3.buy(new Item(rnd));
                    }
                }
                default -> System.out.println("The is no shop like that");

            };
            
        }
        System.out.println("There are " + sp1.localNumberOfGiveaways + " giveaways left in the shop 1");
        System.out.println("There are " + sp2.localNumberOfGiveaways + " giveaways left in the shop 2");
        System.out.println("There are " + sp3.localNumberOfGiveaways + " giveaways left in the shop 3");
        System.out.println("In total there are " + Shop.maxNumberOfGiveaways + " giveaways left at the nation level");
       

        //close 
        scanner.close();
    }
    
    //attribute

    private int localNumberOfGiveaways;
    private static int maxNumberOfGiveaways;

    public Shop(){
            localNumberOfGiveaways = maxNumberOfGiveaways/3;
    }

    public static void setMaxNumberOfGiveaways(int max){
        maxNumberOfGiveaways = 3*max;
    }

    public void buy(Item item){
        //I made this because now i do not have to write everytime item.getPrice()
        double price = item.getPrice();
        System.out.println("The item costs " + price + " €");
        boolean local = false;
        boolean total = false;
        if(localNumberOfGiveaways < 0){
            System.out.println();
            System.out.println("This shop has no more giveaways");
            
        }
        else
        {
            System.out.println();
            System.out.println("This shop has " + localNumberOfGiveaways + " giveaways left");
            local = true;
        }
        if(maxNumberOfGiveaways < 0)
        {
            System.out.println();
            System.out.println("There are also no more giveaway at the national level");
        }
        else
        {
            System.out.println();
            System.out.println("There are " + maxNumberOfGiveaways + " giveaways left at the nation level");
            total = true;
        }
        
        int chance = 0;
        if(price<20 && price>=0)
        {
            chance = 2;
        }
        if(price>=20 && price<=100)
        {
            chance = 5;
        }
        if(price>100)
        {
            chance = 10;
        }
        int rnd = (int)(Math.random()*(100-1 +1))+1;

        switch(chance){
            case 2 ->{
                if(rnd <=2 && local == true ||rnd <=2 && total == true){
                    System.out.println("The customer won a giveaway ");
                    update(local);
                }
            }
            case 5->{
                if(rnd<=5 && local == true || rnd<=5 && total == true){
                    System.out.println("The customer won a giveaway ");
                    update(local);
                }
            }
            case 10->{
                if(rnd<=10&& local == true || rnd<=10 && total == true){
                    System.out.println("The customer won a giveaway ");
                    update(local);
                }
            } 
            default-> System.out.println("The customer can not have that chance");

        };

    }
    public void update(boolean local){
        if(local == true)
        {
            localNumberOfGiveaways--;
            maxNumberOfGiveaways--;
        }
        else
        {
            maxNumberOfGiveaways--;
        }
    }
}
