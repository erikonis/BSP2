public class PackageFactory {
    public static Package createPackage(String recipientName, String recipientAddress, String item, Country country, ShippingMethod shippingMethod) {
        return new Package(recipientName, recipientAddress, item, country, shippingMethod);
    }
}
