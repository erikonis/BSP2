import java.util.Scanner;
public class Giveaway {
    static Shop shop1 = new Shop();
    static Shop shop2 = new Shop();
    static Shop shop3 = new Shop();
    
    static Item i = new Item();
    static Giveaway i2 = new Giveaway();
    
    Scanner scanner = new Scanner(System.in);
    
    public int getNum(){
        System.out.println("pls give amount of number: ");
        int number = scanner.nextInt();
        int newNumber = number/3;
        return newNumber;
    }

    public static void main(String[] args){
        Shops();
    }
    
    public static void Shops(){
        shop1.Buy(i, i2);
        shop2.Buy(i, i2);
        shop3.Buy(i, i2);
    }
    
}
