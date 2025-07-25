public class Main {

  public static void main(String[] args) {

    Address address1 = new Address("Heustr", 18, 70174, "Stuttgart", "Germany");

    Package package1 = new Package("package1", Country.GER, Transport.Express);

    Person person1 = new Person("Rothkugel");
    Item item1 = new Item("Aquarium", "30*50*50");

    // Output

    System.out.println(address1.toString());
    System.out.println(package1.toString());
    System.out.println(person1.toString());
    System.out.println(item1.toString());

  }

}