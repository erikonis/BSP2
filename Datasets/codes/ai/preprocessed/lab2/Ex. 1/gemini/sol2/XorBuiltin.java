public class XorBuiltin {
    public static void main(String[] args) {
        boolean[][] truthTable = {
                {false, false},
                {false, true},
                {true, false},
                {true, true}
        };

        for (boolean[] row : truthTable) {
            boolean a = row[0];
            boolean b = row[1];
            boolean xor = a ^ b;
            System.out.println(a + " " + b + " " + xor);
        }
    }
}