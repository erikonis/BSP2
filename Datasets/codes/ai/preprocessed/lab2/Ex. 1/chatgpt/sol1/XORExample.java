public class XORExample {

    // Function to calculate XOR using basic logical operators
    public static boolean xorUsingLogicalOperators(boolean a, boolean b) {
        return (a && !b) || (!a && b);
    }

    // Main function to test the XOR logic
    public static void main(String[] args) {
        boolean[] values = {false, true};

        // Test all combinations of a and b
        for (boolean a : values) {
            for (boolean b : values) {
                // Print the values of a and b
                System.out.println("a = " + a + ", b = " + b);
                // Using the derived formula
                boolean xorResult = xorUsingLogicalOperators(a, b);
                System.out.println("a ⊕ b (using formula): " + xorResult);

                // Using the built-in XOR operator in Java
                boolean builtInXORResult = a ^ b; // Java's built-in XOR operator
                System.out.println("a ⊕ b (using built-in operator): " + builtInXORResult);
                System.out.println();
            }
        }
    }
}