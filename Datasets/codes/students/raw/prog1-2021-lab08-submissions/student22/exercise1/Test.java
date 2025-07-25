package exercise1;

public class Test {
    public static void main(String[] args) {
        Client c1 = new Client("Mr. Rothkugel", "Heustr. 18, 70174, Stutgart", Country.GER);
        Item i1 = new Item("Aquarium 30x50x80");
        Shipping shipping1 = new Shipping(c1, i1, ShippingMethod.EXP);
        System.out.println(shipping1);

        Client c2 = new Client("Mr. Topal", "64, Rue Due Parch, 4321, Differdange", Country.LUX);
        Item i2 = new Item("VR-360");
        Shipping shipping2 = new Shipping(c2, i2, ShippingMethod.NOR);
        System.out.println(shipping2);
    }
}
