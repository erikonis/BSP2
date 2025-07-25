public class Main {
    public static void main(String[] args) {
        Recipient r1 = new Recipient("Alice Dupont", "123 Rue de Paris", Country.FRANCE);
        Package p1 = new Package(r1, "Laptop", ShippingMethod.EXPRESS);

        Recipient r2 = new Recipient("Bob Müller", "456 Berliner Strasse", Country.GERMANY);
        Package p2 = new Package(r2, "Books", ShippingMethod.NORUSH);

        p1.printPackageInfo();
        System.out.println();
        p2.printPackageInfo();
    }
}