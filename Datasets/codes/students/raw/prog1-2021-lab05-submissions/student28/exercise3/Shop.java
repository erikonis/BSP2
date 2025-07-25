package exercise3;
import java.util.Scanner;  

    public class Shop{
        private double localNumberOfGiveaways;
        public double maxNumberOfGiveaways;
        Shop(double localNumberOfGiveaways)
        {
            this.localNumberOfGiveaways=localNumberOfGiveaways;
            this.maxNumberOfGiveaways = localNumberOfGiveaways * 2;
        }
        public double buy(){
            System.out.println("Number of giveaways for locals:  "+localNumberOfGiveaways);
            System.out.println("Number of giveaways for for foreigners:  "+maxNumberOfGiveaways);
            while(localNumberOfGiveaways != 0)
            {
            Scanner scan = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter price of your purchased item: ");
            int price = scan.nextInt();  // Read user input
            Item itemprice = new Item(price);
            System.out.println("Price of the purchased item: "+itemprice.getPrice());
            if(price <= 20){
                 System.out.println("You have 2% chance to get giveaway!");
                 if(localNumberOfGiveaways >= 0) {
                    System.out.println("Congratulations for the giveaway !");
                    localNumberOfGiveaways -= 1;
                 }
            }
                 
            else if(price >= 21 && price <= 100){
                 System.out.println("You have 5% chance to get giveaway!");
                 if(localNumberOfGiveaways >= 0) {
                    System.out.println("Congratulations for the giveaway !");
                    localNumberOfGiveaways -= 1;
                 }
            }
            else if(price >= 101){
                System.out.println("You have 10% chance to get giveaway!");
                if(localNumberOfGiveaways >= 0) {
                    System.out.println("Congratulations for the giveaway !");
                    localNumberOfGiveaways -= 1;
                }
                
            }
            }
            System.out.println("Sorry! No more giveaways are left! Better luck next time");
            return 0;
            }
    }

