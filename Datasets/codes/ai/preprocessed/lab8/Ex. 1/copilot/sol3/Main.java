public class Main {
    public static void main(String[] args) {
        Package pkg = PackageFactory.createPackage("Alice Smith", "789 Oak St, Belgium", "Clothing", Country.BELGIUM, ShippingMethod.CLASSIC);
        pkg.printPackageDetails();
    }
}