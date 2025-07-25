public class XorDemo {
    public static void main(String[] args) {
        boolean a, b;

        // Test all combinations of a and b
        a = false; b = false;
        System.out.println(a + " XOR " + b + " = " + (a != b));

        a = false; b = true;
        System.out.println(a + " XOR " + b + " = " + (a != b));

        a = true; b = false;
        System.out.println(a + " XOR " + b + " = " + (a != b));

        a = true; b = true;
        System.out.println(a + " XOR " + b + " = " + (a != b));
    }
}