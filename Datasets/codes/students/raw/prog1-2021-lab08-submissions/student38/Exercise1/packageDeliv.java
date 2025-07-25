package lu.uni.programming1.lab8.Exercise1;

public class packageDeliv {
    private String nameOfThePerson, street, city, item;
    private int number, postalCode;
    private country destination; // <-- enumeration (private country)
    private packageDelivOp shippingMethod;// <-- enumeration (private packageDelivOp)

    public packageDeliv(String nameOfThePerson, String street, int number, int postalCode, String city, String item,
            country destination, packageDelivOp shippingMethod) {
        this.nameOfThePerson = nameOfThePerson;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
        this.item = item;
        this.destination = destination;
        this.shippingMethod = shippingMethod;
    }

    public void displayPackage() {
        System.out.println(
                "\nShipping for " + nameOfThePerson + "(" + street + number + postalCode + city + destination + ")");
        System.out.println("\tItem: " + item);
        System.out.println("\tShipping method : " + shippingMethod);
        System.out.println("\tTotal price : " + (destination.getPrice() + shippingMethod.getPrice()) + "€");
    }
}