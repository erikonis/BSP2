public class XORUsingMethod {
    // Custom XOR method
    public static boolean xor(boolean a, boolean b) {
        return (a && !b) || (!a && b);
    }

    public static void main(String[] args) {
        boolean[] values = {false, true};

        // Test all combinations of a and b
        for (boolean a : values) {
            for (boolean b : values) {
                System.out.println("a = " + a + ", b = " + b);
                // Using a custom XOR method
                boolean xorResult = xor(a, b);
                System.out.println("a ⊕ b (using custom method): " + xorResult);
                System.out.println();
            }
        }
    }
}