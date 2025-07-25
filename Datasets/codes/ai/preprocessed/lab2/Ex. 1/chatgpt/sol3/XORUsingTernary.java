public class XORUsingTernary {
    public static void main(String[] args) {
        boolean[] values = {false, true};

        // Test all combinations of a and b
        for (boolean a : values) {
            for (boolean b : values) {
                System.out.println("a = " + a + ", b = " + b);
                // Using ternary operator to implement XOR logic
                boolean xorResult = (a == b) ? false : true; // a ⊕ b is true if a and b are different
                System.out.println("a ⊕ b (using ternary operator): " + xorResult);
                System.out.println();
            }
        }
    }
}