public class DoublePrecision {
    public static void main(String[] args) {
        double big = 1e16;
        double small = 1;

        double result = big + small;
        System.out.println("Big + Small: " + result); // Result is 1.0E16, small number is lost.
    }
}