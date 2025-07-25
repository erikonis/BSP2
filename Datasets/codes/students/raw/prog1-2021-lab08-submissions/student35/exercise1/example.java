package exercise1;

public class example {
    public static void main(String[] args) {
        Person roth = new Person("Mr. Rothkugel", "Heustr. 18, 70174, Stuttgart");
        Person topal = new Person("Mr. Topal", "64, Rue Due Parch, 4321, Differdange");
        Packaging p1 = new Packaging(roth, Destination.GERMANY, ShippingSpeed.EXPRESS, "Aquarium 30x50x80");
        Packaging p2 = new Packaging(topal, Destination.LUXEMBOURG, ShippingSpeed.NORUSH, "VR-360");
        p1.Display();
        p2.Display();
        //showing off the examples from the exercise sheet
    }
}
