public class Main {
    public static void main(String[] args) {
        Recipient recipient1 = new Recipient("Alice Dupont", "123 Rue Lafayette", Country.FRANCE);
        Package package1 = new Package("Smartphone", recipient1, ShippingMethod.PRIORITY);

        Recipient recipient2 = new Recipient("Max Müller", "45 Berliner Straße", Country.GERMANY);
        Package package2 = new Package("Laptop", recipient2, ShippingMethod.EXPRESS);

        Recipient recipient3 = new Recipient("Tom Becker", "12, Place d’Armes", Country.LUXEMBOURG);
        Package package3 = new Package("Books", recipient3, ShippingMethod.NORUSH);

        package1.printShippingLabel();
        package2.printShippingLabel();
        package3.printShippingLabel();
    }
}
