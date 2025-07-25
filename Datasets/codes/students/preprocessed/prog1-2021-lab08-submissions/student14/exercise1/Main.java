public class Main {public static void main(String[] args) {
    
    Item item1 = new Item("Aquarium 30X50X80");
    Item item2 = new Item("Black Compact Umbrella");
    Item item3 = new Item("Laser Printer");
    Item item4 = new Item("Smartphone");
    Item item5 = new Item("VR-360");

    Recipient recipient1 = new Recipient("Mr. Rothkughel","Heustr. 18",70174,"Stuttgart",Country.GERMANY);
    Recipient recipient2 = new Recipient("Mr. Topal","64, Rue De Parch",4321,"Stuttgart",Country.LUXEMBOURG);
    Recipient recipient3 = new Recipient("Ms. Grandjean","10 Rue De Champagne",57970,"Yutz",Country.FRANCE);
    Recipient recipient4 = new Recipient("Mr. Dubois","Rue de Béguinage 29",1000,"Bruxelles",Country.BELGIUM);

    Order order1 = new Order(recipient1, item1, ShippingMethods.EXPRESS);
    Order order2 = new Order(recipient2, item5, ShippingMethods.NORUSH);
    Order order3 = new Order(recipient3, item2, ShippingMethods.CLASSIC);
    Order order4 = new Order(recipient4, item3, ShippingMethods.PRIORITY);
    Order order5 = new Order(recipient1, item4, ShippingMethods.CLASSIC);

    System.out.println(order1.toString());
    System.out.println(order2.toString());
    System.out.println(order3.toString());
    System.out.println(order4.toString());
    System.out.println(order5.toString());
    
}
    
}
