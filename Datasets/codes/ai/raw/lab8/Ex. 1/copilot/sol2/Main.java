public class Main {
    public static void main(String[] args) {
        Package pkg = PackageFactory.createPackage("John Doe", "123 Main St, Luxembourg", "Books", Country.LUXEMBOURG, ShippingMethod.EXPRESS);
        pkg.printDetails();
    }
}
