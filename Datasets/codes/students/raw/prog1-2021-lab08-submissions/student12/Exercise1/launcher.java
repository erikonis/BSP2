package lu.uni.programming1.lab8.Exercise1;

public class launcher {
    public static void main(String[] args) {
        shipPackage package1 = new shipPackage("Mr. Rothkugel ", " Heustr ", 18, 70174, " Stuttgart ",
                " Aquarium 30x50x80", country.Germany, shipmentOpt.EXPRESS);
        package1.displayPackage();
        shipPackage package2 = new shipPackage("Mr. Topal ", " Rue Due Parch ", 18, 4321, " Differdange ", " VR-360",
                country.Luxembourg, shipmentOpt.NORUSH);
        package2.displayPackage();
    }
}