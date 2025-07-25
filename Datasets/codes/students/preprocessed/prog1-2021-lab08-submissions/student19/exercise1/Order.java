public class Order {

    
    
    public static void  main(String[] args) {
        Customer customer = new Customer("Alex","Aquarium",69,"rue des champs","Oberkorn",6996,"Male", Shipping.EXPRESS, Countries.BELGIUM);



        customer.printReceipt();
    }
    
    
    
}
