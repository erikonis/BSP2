public class launcher {
    public static void main(String[] args) {
        shipPackage package1 = new shipPackage("Mr. Rothkugel ", " Heustr ", 18, 70174, " Stuttgart ",
                " Aquarium 30x50x80", country.Ger, shipmentOpt.EXPRESS);
        shipPackage package2 = new shipPackage("Mr. Topal ", " Rue Due Parch ", 18, 4321, " Differdange ", " VR-360",
                country.Lux, shipmentOpt.NORUSH);
    }
}