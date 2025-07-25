import java.util.Scanner;

public class Shop {

    static Scanner scanner = new Scanner(System.in);
    private static int localNumberOfGiveaways, maxNumberOfGiveaways, shop1, shop2, shop3;
    static Item item = new Item();

    public void setNOG() {
        System.out.print("Please enter the number of giveaways on a national scale: ");
        ;
        maxNumberOfGiveaways = scanner.nextInt();
        localNumberOfGiveaways = maxNumberOfGiveaways / 3;
        shop1 = localNumberOfGiveaways;
        System.out.println("There are " + shop1 + " giveaways in shop 3.");
        shop2 = localNumberOfGiveaways;
        System.out.println("There are " + shop2 + " giveaways in shop 3.");
        shop3 = localNumberOfGiveaways;
        System.out.println("There are " + shop3 + " giveaways in shop 3.");
    }
    public static int getNOG() {
        return maxNumberOfGiveaways;
    }
    public  void buyItem() {
        double chance = Math.random();
        item.getInitialPrice();

        if (maxNumberOfGiveaways == 0) {
            System.out.println("There are no more giveaways left.");
        }
        if (shop1==0){
        System.out.println("There are no more giveaways left in shop 1.");}
        if (shop2==0){
            System.out.println("There are no more giveaways left in shop 2.");}
        if (shop3==0){
                System.out.println("There are no more giveaways left in shop 3.");}

        if (item.getInitialPrice() < 20) {
            if (chance <= 0.02) {
                shop1--;
                System.out.println("You are a winner");
                maxNumberOfGiveaways--;}
            else if (chance <= 0.02)  {
                shop2--;
                System.out.println("You are a winner");
                maxNumberOfGiveaways--;}  
            else if (chance<=0.02){
                shop3--;
                System.out.println("You are a winner");
                maxNumberOfGiveaways--;}
            else {
                    System.out.println("You didn't win a giveaway.");
                System.out.println("There are "+ maxNumberOfGiveaways+ " giveaways left in total.");
                System.out.println("There are "+shop1+ " giveaways left in shop 1.");
                System.out.println("There are "+shop2+ " giveaways left in shop 2.");
                System.out.println("There are "+shop3+ " giveaways left in shop 3.");
            }
        }            
         else if (item.getInitialPrice() >= 20 && item.getInitialPrice() < 100) {
            if (chance <= 0.05) {
                shop1--;
                System.out.println("You are a winner");
                maxNumberOfGiveaways--;}
            else if (chance <= 0.05)  {
                shop2--;
                System.out.println("You are a winner");
                maxNumberOfGiveaways--;}  
            else if (chance<=0.05){
                shop3--;
                System.out.println("You are a winner");
                maxNumberOfGiveaways--;}
                else {
                    System.out.println("You didn't win a giveaway.");}
                System.out.println("There are "+ maxNumberOfGiveaways+ " giveaways left in total.");
                System.out.println("There are "+shop1+ " giveaways left in shop 1.");
                System.out.println("There are "+shop2+ " giveaways left in shop 2.");
                System.out.println("There are "+shop3+ " giveaways left in shop 3.");
                
            }             
        else if (item.getInitialPrice() >= 100) {
            if (chance <= 0.1) {
                shop1--;
                System.out.println("You won a giveaway in shop 1");
                maxNumberOfGiveaways--;}
            else if (chance <= 0.1)  {
                shop2--;
                System.out.println("You won a giveaway in shop 2");
                maxNumberOfGiveaways--;}  
            else if (chance<=0.1){
                shop3--;
                System.out.println("You won a giveaway in shop 3");
                maxNumberOfGiveaways--;}
                else {
                    System.out.println("You didn't win a giveaway.");
                System.out.println("There are "+ maxNumberOfGiveaways+ " giveaways left in total.");
                System.out.println("There are "+shop1+ " giveaways left in shop 1.");
                System.out.println("There are "+shop2+ " giveaways left in shop 2.");
                System.out.println("There are "+shop3+ " giveaways left in shop 3.");
                
            } 
            }
        }   
    }
