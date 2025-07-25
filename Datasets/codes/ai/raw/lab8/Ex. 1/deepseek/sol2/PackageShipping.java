public class PackageShipping {
    public static void main(String[] args) {
        Country luxembourg = new Country("Luxembourg", 0);
        ShippingMethod express = new ShippingMethod("EXPRESS", 100, 1);

        Package package1 = new Package("John Doe", "123 Main St, Luxembourg", "Laptop", luxembourg, express);
        package1.printShippingDetails();
    }
}