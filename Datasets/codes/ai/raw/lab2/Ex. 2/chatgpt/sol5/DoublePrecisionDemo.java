public class DoublePrecisionDemo {
    public static void main(String[] args) {
        System.out.println("=== Double Precision Loss Demo ===");
        double big = 1e30;
        double small = 1e-10;
        double result = big + small;

        System.out.println("Big number: " + big);
        System.out.println("Small number: " + small);
        System.out.println("Big + Small = " + result);
        System.out.println("Expected (ideally): " + (1e30 + 1e-10));
        System.out.println("Actual = Big (because small is too small to affect double at this magnitude)");

        System.out.println("Explanation: Double has precision ~15-17 digits. Small deltas are lost when added to huge values.");
    }
}
