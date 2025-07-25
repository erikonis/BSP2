package lu.uni.programming1.lab8.exercise1;

public class Launcher {

    public static void main(String[] args) {
        Country lu = Country.LUXEMBOURG;
        Country ger = Country.GERMANY;

        Method nor = Method.NORUSH;
        Method exp = Method.EXPRESS;

        Person per1 = new Person("Mr. Rothkgel", "Heustr. 18", "70174", "Stuttgart", ger, "Aquarium 30x50x80", exp);
        Person per2 = new Person("Mr. Topal", "64, Rue du Parch", "4321", "Differdange", lu, "VR-360", nor);

        System.out.println(per1.toString());
        System.out.println(per2.toString());
    }
}
