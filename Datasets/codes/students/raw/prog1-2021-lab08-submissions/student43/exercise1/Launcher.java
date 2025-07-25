package lu.uni.programming1.lab8.exercise1;

public class Launcher {
    public static void main(String[] args) {
        Recipient rothkugel = new Recipient("Mr","Rothkugel","Heustr. 18, 70174, Stuttgart", Country.GERMANY);  
        Shipping shipp1 = new Shipping(rothkugel,HandlingTimes.EXPRESS,"Aquarium 30x50x80");

        Recipient topal = new Recipient("Mr","Topal","64, Rue Due Parch, 4321, Differdange", Country.LUXEMBOURG);
        Shipping shipp2 = new Shipping(topal,HandlingTimes.NORUSH,"VR-360");

        System.out.println(shipp1.toString());
        System.out.println(shipp2.toString());
    }
}
