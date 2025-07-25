package lu.uni.programming1.lab8.Exercise1;

public class Launcher {
    public static void main(String[] args) {

        Shipping method = Shipping.NORUSH;
        // Shipping method = Shipping.CLASSIC;
        // Shipping method = Shipping.PRIORITY;
        // Shipping method = Shipping.NORUSH;
        //Country country = Country.BELGIUM;
        // Country country = Country.LUXEMBOURG;
        // Country country = Country.FRANCE;
        Country country = Country.BELGIUM;
        Address address = new Address("Mr. Rothkugel", "Heustr. 18", 70174, "Stuttgart");
        Item item = new Item("Aquarium 30x50x80");

        System.out.println(address + ", " + country);
        System.out.println(item);
        System.out.println("Shipping method: " + method + "[" + method.getCost() + " EUR]. Handling in "
                + method.getDays() + " days,");
        calculateShipping(method, country);

    }

    static void calculateShipping(Shipping method, Country country) {
        int shippingTotal = 0;
        switch (method) {
        case EXPRESS:
            shippingTotal = method.getCost() + country.getShippingCost();
            System.out.println("TOTAL cost: " + shippingTotal);
            break;
        case PRIORITY:
            shippingTotal = method.getCost() + country.getShippingCost();
            System.out.println("TOTAL cost: " + shippingTotal);
            break;
        case CLASSIC:
            shippingTotal = method.getCost() + country.getShippingCost();
            System.out.println("TOTAL cost: " + shippingTotal);
            break;
        case NORUSH:
            shippingTotal = method.getCost() + country.getShippingCost();
            System.out.println("TOTAL cost: " + shippingTotal);
            break;
        default:
            break;
        }
    }
}// calculate shipping --> associate country with shippping
