public class XORUsingEnum {
    // Enum to represent XOR results
    enum XORResult {
        FALSE, TRUE;
    }

    public static XORResult xor(boolean a, boolean b) {
        return (a == b) ? XORResult.FALSE : XORResult.TRUE;
    }

    public static void main(String[] args) {
        boolean[] values = {false, true};

        // Test all combinations of a and b
        for (boolean a : values) {
            for (boolean b : values) {
                System.out.println("a = " + a + ", b = " + b);
                // Using the enum-based XOR method
                XORResult xorResult = xor(a, b);
                System.out.println("a ⊕ b (using enum): " + xorResult);
                System.out.println();
            }
        }
    }
}