package lu.uni.programming1.lab8.exercise1;

public class Launcher {
    public static void main(String[] args) {
        Shipping method = Shipping.EXPRESS;
        // Shipping method = Shipping.PRIORITY;
        // Shipping method = Shipping.CLASSIC;
        // Shipping method = Shipping.NORUSH;

        // Country country = Country.Luxembourg;
        // Country country = Country.Belgium;
        // Country country = Country.France;
        Country country = Country.Germany;

        // Address address = new Address("Mr.John Smith", "21 rue de la Gare", 8845,
        // "Mersch");
        // Item item = new Item("Samsung TV 53 inches FHD ");
        // System.out.println(address + ", " + country);
        // System.out.println(item);
        // System.out.println("Shipping method: " + method + "[" + method.getCost() + "
        // EUR]. Handling in "
        // + method.getDays() + " days,");
        // calculateShipping(method, country);

        Address address = new Address("Mme.Sarah Jones", "34 rue de Bavaria", 4571, "Munchen");
        Item item = new Item("X-Max package & Winter sucks & MacBook Pro M1 256Go,");
        System.out.println(address + ", " + country + ",");
        System.out.println(item);
        System.out.println("Shipping method: " + method + "[" + method.getCost() + " EUR]. Handling in, "
                + method.getDays() + " days,");
        calculateShipping(method, country);
    }

    static void calculateShipping(Shipping method, Country country) {
        double shippingTotal = 0;
        switch (method) {
        case EXPRESS:
            shippingTotal = method.getCost() + country.getcostOfShipping();
            System.out.printf("TOTAL cost: " + shippingTotal + " EUR\n");
            break;
        case PRIORITY:
            shippingTotal = method.getCost() + country.getcostOfShipping();
            System.out.printf("TOTAL cost: " + shippingTotal + " EUR\n");
            break;
        case CLASSIC:
            shippingTotal = method.getCost() + country.getcostOfShipping();
            System.out.printf("TOTAL cost: " + shippingTotal + " EUR\n");
            break;
        case NORUSH:
            shippingTotal = method.getCost() + country.getcostOfShipping();
            System.out.printf("TOTAL cost: " + shippingTotal + " EUR\n");
            break;
        default:
            break;
        }
    }
}
