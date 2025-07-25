public class Main {
    public static void main(String[] args) {
    
    // Create an order and a customer

    Client client1 = new Client("Marion","1 rue Sébastopol","29200","Brest","FRANCE");
    Order orderForClient1 = new Order("Aquarium 30x50x80", Country.FRANCE, ShippingMethod.EXPRESS);
    
    System.out.println(
        "\nShipping for : " + client1.toString() +
        "\nItem : " + orderForClient1.getItemName() +
        "\nShipping method : " + orderForClient1.getShippingMethod() +
        "\nTotal Cost : " + orderForClient1.getTotalCost() +"\n"
    );

    // Create a second order and a customer

    Client client2 = new Client("Jean-Claude VANDHAMME","1 street of Actor Studio","L-2345","Luxembourg","LUXEMBOURG");
    Order orderForClient2 = new Order("Collection of DVDs : Best movies of JCV", Country.LUXEMBOURG, ShippingMethod.NORUSH);
    
    System.out.println(
        "\nShipping for : " + client2.toString() +
        "\nItem : " + orderForClient2.getItemName() +
        "\nShipping method : " + orderForClient2.getShippingMethod() +
        "\nTotal Cost : " + orderForClient2.getTotalCost() +"\n"
    );

    }
}
