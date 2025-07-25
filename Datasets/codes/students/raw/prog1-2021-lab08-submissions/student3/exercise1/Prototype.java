package lu.uni.programming1.lab8.exercise1;

public class Prototype {
    public static void main(String[] args) {

        // Shipping method = Shipping.EXPRESS;
        Shipping method = Shipping.CLASSIC;
        // Shipping method = Shipping.PRIORITY;
        // Shipping method = Shipping.NORUSH;

        Country country = Country.LUXEMBOURG;
        // Country country = Country.BELGIUM;
        // Country country = Country.FRANCE;
        // Country country = Country.GERMANY;

        Address address = new Address("Marco POLO", "84 Rue du Luxembourg", 2452, "Differdange");
        Item item = new Item("iPhone XX PRO MAX");

        System.out.println(address + ", " + country);
        System.out.println(item);
        System.out.println("Shipping method: "+Colors.ANSI_PURPLE + method + Colors.ANSI_RESET + "[" + method.getCost() + " EUR]. Handling in "+ method.getDays() + " days,");
        calculateShipping(method, country);

    }

    static void calculateShipping(Shipping method, Country country) {
        int shippingTotal = 0;
        switch (method) {
        case EXPRESS:
            shippingTotal = method.getCost() + country.getShippingCost();
            System.out.println("TOTAL cost: " + shippingTotal+" EUR");
            break;
        case PRIORITY:
            shippingTotal = method.getCost() + country.getShippingCost();
            System.out.println("TOTAL cost: " + shippingTotal+ " EUR");
            break;
        case CLASSIC:
            shippingTotal = method.getCost() + country.getShippingCost();
            System.out.println("TOTAL cost: " + shippingTotal+ " EUR");
            break;
        case NORUSH:
            shippingTotal = method.getCost() + country.getShippingCost();
            System.out.println("TOTAL cost: " + shippingTotal+ " EUR");
            break;
        default:
            break;
        }
    }
}
