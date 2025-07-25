public class MainClass
{
    public static void main(String[] args) {
        ArrayProduct ap = new ArrayProduct("TheOne");

        Product p1 = new Product("Coke", 0.8 , 100);
        Product p2 = new Product("KitKat", 0.7 , 250);
        Product p3 = new Product("OrangeJ", 0.72 , 350);
        Product p4 = new Product("Snickers", 1.6 , 150);
        Product p5 = new Product("Snickers", 1.6 , 150);
        Product p6 = new Product("Coke", 0.8 , 100);
        ap.add(p1);
        ap.add(p2);
        ap.add(p3);
        ap.add(p4);
        ap.add(p5);
        ap.add(p6);
        System.out.println(ap.printArray());
    }
}
