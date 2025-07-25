public class Main {
    public static void main(String[] args) {
        Package myPackage = new Package();
        // Set package details...
        myPackage.setRecipientName("John Doe");
        myPackage.setRecipientAddress("123 Main St");
        myPackage.setItemShipped("Laptop");
        myPackage.setDestinationCountry(Country.FRANCE);
        myPackage.setShippingMethod(ShippingMethod.EXPRESS);

        myPackage.printPackageDetails();
    }
}