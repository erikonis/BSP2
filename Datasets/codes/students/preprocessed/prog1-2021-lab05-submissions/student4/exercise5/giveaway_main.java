public class giveaway_main {
    static Shop shop1 = new Shop();
    static Shop shop2 = new Shop();
    static Shop shop3 = new Shop();
    static Item i1 = new Item();
    static Item i2 = new Item();
    static Item i3 = new Item();

    private static void Shops(){
        shop1.Buy(i1);
        shop2.Buy(i2);
        shop3.Buy(i3);
    }

    public static void main(String[] args) {
        Shops();
        System.out.println("\nThere are no more giveaways left in any shop!! \n");
    }

    
}
