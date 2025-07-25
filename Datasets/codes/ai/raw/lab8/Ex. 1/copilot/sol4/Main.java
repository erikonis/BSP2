public class Main {
    public static void main(String[] args) {
        Package expressPackage = new ExpressPackage("John Doe", "123 Main St, Luxembourg", "Books", Country.LUXEMBOURG);
        expressPackage.printDetails();

        Package priorityPackage = new PriorityPackage("Jane Smith", "456 Elm St, France", "Electronics", Country.FRANCE);
        priorityPackage.printDetails();

        Package classicPackage = new ClassicPackage("Alice Brown", "789 Oak St, Belgium", "Clothes", Country.BELGIUM);
        classicPackage.printDetails();

        Package norushPackage = new NorushPackage("Bob White", "101 Pine St, Germany", "Furniture", Country.GERMANY);
        norushPackage.printDetails();
    }
}
