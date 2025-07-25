package exercise1;

public class Launcher {

    public static void main(String[] args) {
        Adress ad1 = new Adress("Rue Jean-Pierre", "Bascharage", 14, 3874, Country.LUXEMBURG);
        Adress ad2 = new Adress("Hauptstr", "Hamburg", 45, 48828, Country.GERMANY);

        Sender s1 = new Sender("Luc", ad1, ShipMethode.NORUSH, "Aquarium 30x30");
        System.out.println(s1.toString());
        Sender s2 = new Sender("Hans", ad2, ShipMethode.EXPRESS, "Lederhose");
        System.out.println(s2.toString());

    }
    
}
