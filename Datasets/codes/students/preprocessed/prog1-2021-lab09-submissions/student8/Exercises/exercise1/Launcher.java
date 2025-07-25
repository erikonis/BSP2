
public class Launcher {
    public static void main(String[] args) {
        Inventory inventory= new Inventory(4);
        Gear gear = new Gear("Helmed", 400, "White" ,10, 20, 30);
        inventory.add(gear);
    }
    
}
