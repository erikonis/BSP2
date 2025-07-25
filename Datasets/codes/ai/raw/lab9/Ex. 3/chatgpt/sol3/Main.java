public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage("Vivi");
        RedMage redMage = new RedMage("Vivi", 42);

        System.out.println(mage.equals(redMage)); // ✅ true
        System.out.println(redMage.equals(mage)); // ✅ true
    }
}
