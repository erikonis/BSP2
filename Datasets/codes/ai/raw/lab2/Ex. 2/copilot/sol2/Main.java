public class Main {
    public static void main(String[] args) {
        // Byte overflow
        byte b = 127;
        System.out.println("Byte max value: " + b);
        b++;
        System.out.println("Byte overflow: " + b);
        b = -128;
        System.out.println("Byte min value: " + b);
        b--;
        System.out.println("Byte underflow: " + b);

        // Int overflow
        int i = Integer.MAX_VALUE;
        System.out.println("Int max value: " + i);
        i++;
        System.out.println("Int overflow: " + i);
        i = Integer.MIN_VALUE;
        System.out.println("Int min value: " + i);
        i--;
        System.out.println("Int underflow: " + i);

        // Double precision
        double big = 1e308;
        double small = 1e-308;
        double result = big + small;
        System.out.println("Big: " + big);
        System.out.println("Small: " + small);
        System.out.println("Result: " + result);
    }
}