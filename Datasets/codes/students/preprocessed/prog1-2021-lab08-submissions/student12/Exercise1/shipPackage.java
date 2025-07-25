enum country {
    Luxembourg("Luxembourg"), France("France"), Belgium("Belgium"), Germany("Germany");

    private String countryName;

    private country(String counString) {
        this.countryName = counString;
    }

    public String toString() {
        return countryName;
    }

    public int getPrice() {
        switch (countryName) {
        case "Luxembourg":
            return 0;
        case "France":
            return 30;
        case "Belgium":
            return 50;
        case "Germany":
            return 40;
        default:
            return 0;
        }
    }
}

enum shipmentOpt {
    EXPRESS(1), PRIORITY(3), CLASSIC(5), NORUSH(8);

    private int shipment;

    private shipmentOpt(int shipment) {
        this.shipment = shipment;
    }

    public String toString() {
        switch (shipment) {
        case 1:
            return "Express [100€], Handling in 1 day";
        case 3:
            return "PRIORITY [50€], Handling in 3 days";
        case 5:
            return "CLASSIC [10€], Handling in 5 days";
        case 8:
            return "NORUSH [0€], Handling in 8 days";
        default:
            return "Unknown shipment method!!";
        }
    }

    public int getPrice() {
        switch (shipment) {
        case 1:
            return 100;
        case 3:
            return 50;
        case 5:
            return 10;
        case 8:
            return 0;
        default:
            return -1;
        }
    }
}

public class shipPackage {
    private String clientName, street, city, item;
    private int number, ZIPcode;
    private country destination;
    private shipmentOpt shippingMethod;

    public shipPackage(String clientName, String street, int number, int ZIPcode, String city, String item,
            country destination, shipmentOpt shippingMethod) {
        this.clientName = clientName;
        this.street = street;
        this.city = city;
        this.item = item;
        this.number = number;
        this.ZIPcode = ZIPcode;
        this.destination = destination;
        this.shippingMethod = shippingMethod;
    }

    public void displayPackage() {
        System.out.println("Shipping for " + clientName + "(" + street + number + ZIPcode + city + destination + ")");
        System.out.println("Item: " + item);
        System.out.println("Shipping method : " + shippingMethod);
        System.out.println("Total price : " + (destination.getPrice() + shippingMethod.getPrice()) + "€");
    }
}