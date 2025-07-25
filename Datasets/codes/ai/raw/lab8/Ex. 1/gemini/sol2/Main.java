public class Main {
    public static void main(String[] args) {
        CostCalculator calculator = new CountryCostCalculator();
        Package myPackage = new Package(calculator);
        myPackage.setRecipientName("John Doe");
        myPackage.setRecipientAddress("123 Main St");
        myPackage.setItemShipped("Laptop");
        myPackage.setDestinationCountry(Country.FRANCE);
        myPackage.setShippingMethod(ShippingMethod.EXPRESS);
        myPackage.printPackageDetails();
    }
}