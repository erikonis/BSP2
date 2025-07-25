package lu.uni.programming1.lab8.exercise1;

public class Launcher {
    public static void main(String[] args) {
        Person Rothkugel = new Person("Rothkugel", "Male");
        Person Topal = new Person("Topal", "m");

        Address Ger = new Address(Rothkugel, 18, "Heustr.", 70174, "Stuttgart", "GERMANY");
        Address Lux = new Address(Topal, 64, "Rue Due Parch", 4321, "Differdange", "LUXEMBOURG");
        
        Package Aquarium = new Package("Aquarium 30x50x80", Shipping.EXPRESS, Ger);
        Package VR = new Package("VR 360", Shipping.NORUSH, Lux);

        System.out.println(Aquarium);
        System.out.println(VR);

    }
}
