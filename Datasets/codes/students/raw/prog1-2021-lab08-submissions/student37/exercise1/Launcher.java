package lu.uni.programming1.lab8.exercise1;


public class Launcher {

    public static void main(String[] args) {
        
    Individual Jimmy = new Individual("Jimmy Page", "Heustr. 18, 70174, Stuttgart",Country.GERMANY);
    Individual Bob = new Individual("Bob Johnson", "64, Rue Due Parch, 4321, Differdange", Country.LUXEMBOURG);

    Shipping JimShip = new Shipping(Jimmy, "Coffee Machine", Delivery.EXPRESS);
    Shipping BobShip = new Shipping(Bob, "Black Katana", Delivery.CLASSIC);

    JimShip.Display();
    BobShip.Display();

    
    }
}
