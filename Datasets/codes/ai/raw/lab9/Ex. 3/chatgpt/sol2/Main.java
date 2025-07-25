public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage("Lulu");
        RedMage redMage = new RedMage("Lulu", 10);

        System.out.println(mage.equals(redMage)); // ✅ true
        System.out.println(redMage.equals(mage)); // ✅ true
    }
}
