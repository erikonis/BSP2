package exercice1;

public class Main {
    public static void main(String[] args) {
        Delivery del1 = new Delivery("Mr. Rothkugel","Heustr. 18, 70714, Stuttgart ,GERMANY","Aquarium 30x50x80",Country.GERMANY,Shipping.EXPRESS);
        del1.ship();

        Delivery del2 = new Delivery("Mr. Topal","64, Rue Due Parch,4321, Differdange ,LUXEMBOURG","VR-360",Country.LUXEMBOURG,Shipping.NORUSH);
        del2.ship();
    }
}

