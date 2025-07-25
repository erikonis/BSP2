import java.util.Scanner;
public class GiveAways {
    class Item{
        int Price;
        public Item(int price){
            price = Price;
        }

        public int getPrice(){
            return Price;
        }
    }
    
    public class Shop{
        int localNumberOfGiveaways, maxNumberOfGiveaways, result;
        
        public Shop(int allGiveaways){
            allGiveaways = maxNumberOfGiveaways;
        }
        
        public void localNumberOfGiveaways(){

        }

        public void buy(Item item){
            int price;
        
        }
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please print amount of giveaways: ");
            int AskedNumOfGiveaways = scanner.nextInt();
            
            Shop initial = new Shop(AskedNumOfGiveaways);

            
            
        }
        
    }
}
