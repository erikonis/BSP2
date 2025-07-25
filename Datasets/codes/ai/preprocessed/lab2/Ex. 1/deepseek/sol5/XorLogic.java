public class XorLogic {
    public static boolean xor(boolean a, boolean b) {
        return (a || b) && !(a && b);
    }
}