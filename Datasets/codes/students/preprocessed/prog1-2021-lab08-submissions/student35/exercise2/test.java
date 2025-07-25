public class test {
    public static void main(String[] args) {
        Order o1 = new Order("name", 1.0, 1);
        Order o2 = new Order("name", 1.0, 1);
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        //copy of the example shown in the exercise sheet
    }
}
