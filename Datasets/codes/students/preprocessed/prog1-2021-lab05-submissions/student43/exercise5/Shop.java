import java.util.Random;

public class Shop {
    
    private int localNumberOfGiveaways;
    public static int maxNumberOfGiveaways;
    
    // Constructor for localNumberOfGiveaways

    public Shop(int localNumberOfGiveaways) {
        this.localNumberOfGiveaways=localNumberOfGiveaways;
    }

    public int getLocalNumberOfGiveaways() {
        return localNumberOfGiveaways;
    }

    // Method buy(Item item)  

    public void setLocalNumberOfGiveaways(int localNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
    }



    public void buy(Item item){
        System.out.println("This is the price for your item :" + item.getPrice() );
        System.out.println((localNumberOfGiveaways != 0)||(maxNumberOfGiveaways != 0)?
        "There is still giveaways.":"There is no more giveaways.");

        Random random = new Random();


        if ((localNumberOfGiveaways > 0)&&(maxNumberOfGiveaways > 0)){
            boolean x = false;
            if (item.getPrice() <=20){
                        x = random.nextInt(50) == 0;
                        System.out.println( x ? "You won a giveaway":"No giveaway for you today");          
            } 
            if ((item.getPrice()>20)&&(item.getPrice() <=100)){
                        x = random.nextInt(20) == 0;
                        System.out.println( x ? "You won a giveaway":"No giveaway for you today");          
            } 
            if (item.getPrice()>100){
                        x = random.nextInt(10) == 0;
                        System.out.println( x ? "You won a giveaway":"No giveaway for you today");
            } 
            if (x){
                --localNumberOfGiveaways; 
                --maxNumberOfGiveaways; 
            }  
                   
                        
            }     
        }

        
    }


