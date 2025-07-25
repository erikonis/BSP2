package Exercises.Exercise4;

public class MainClass
{
    public static void main(String[] args) {
        LoyaltyCard mom = new LoyaltyCard(13);
        Item DS = new Item(300.6);
        Item gum = new Item(5.3);
        System.out.println(DS.buy(mom));
        System.out.println(DS.buy(mom));
        System.out.println(gum.buyWithPoints(mom));
        System.out.println(gum.buyWithPoints(mom));
    }
}
