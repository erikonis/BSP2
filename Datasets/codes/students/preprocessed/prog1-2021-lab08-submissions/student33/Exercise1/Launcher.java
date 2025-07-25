public class Launcher {
    public static void main(String[] args) {
        Item aquarium = new Item("Aquarium 30X50X80");
        Item vr = new Item("VR-360");

        Recipient rothkugel = new Recipient("Mr. Rothkugel", "Heustr. 18", "70174", "Stuttgart", "GERMANY");
        Recipient topal = new Recipient("Mr. Topal", "64, Rue Due Part", "4321", "Differdange", "LUXEMBOURG");

        Shipping rothkugelShipping = new Shipping(rothkugel, aquarium, ShippingMethod.EXPRESS, Country.GERMANY);
        Shipping topalShipping = new Shipping(topal, vr, ShippingMethod.NORUSH, Country.LUXEMBOURG);

        System.out.println(rothkugelShipping);
        System.out.println("\n----------------------\n");
        System.out.println(topalShipping);
        // Mettre un texte en commentaire = commande 1 shift + 7

    }
}
