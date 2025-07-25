// Main.java
public class Main {
    public static void main(String[] args) {
        // Create recipients
        Recipient recipient1 = new Recipient("John Doe", "123 Main Street, Luxembourg City", Country.LUXEMBOURG);
        Recipient recipient2 = new Recipient("Jean Dupont", "456 Rue de Paris, Paris", Country.FRANCE);
        Recipient recipient3 = new Recipient("Jan Van Damme", "789 Grote Markt, Brussels", Country.BELGIUM);
        Recipient recipient4 = new Recipient("Hans Müller", "101 Berliner Allee, Berlin", Country.GERMANY);

        // Create packages
        Package package1 = new Package(recipient1, "Documents", ShippingMethod.EXPRESS);
        Package package2 = new Package(recipient2, "Electronics", ShippingMethod.PRIORITY);
        Package package3 = new Package(recipient3, "Books", ShippingMethod.CLASSIC);
        Package package4 = new Package(recipient4, "Clothes", ShippingMethod.NORUSH);
        Package package5 = new Package(recipient1, "Gift", ShippingMethod.NORUSH);
        Package package6 = new Package(recipient2, "Art", ShippingMethod.EXPRESS);

        // Print shipping labels
        package1.printShippingLabel();
        package2.printShippingLabel();
        package3.printShippingLabel();
        package4.printShippingLabel();
        package5.printShippingLabel();
        package6.printShippingLabel();
    }
}