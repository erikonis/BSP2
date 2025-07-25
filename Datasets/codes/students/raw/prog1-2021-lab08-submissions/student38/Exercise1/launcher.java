package lu.uni.programming1.lab8.Exercise1;

public class launcher {
    public static void main(String[] args) {
        packageDeliv package1 = new packageDeliv("Mr. Rothkugel ", " Heustr ", 18, 70174, " Stuttgart ",
                " Aquarium 30x50x80 ", country.Germany, packageDelivOp.EXPRESS);
        package1.displayPackage();
    }
}