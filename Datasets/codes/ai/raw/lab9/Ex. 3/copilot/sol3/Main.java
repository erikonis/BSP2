public class Main {
    public static void main(String[] args) {
        Mage mage1 = new Mage("Gandalf");
        RedMage redMage1 = new RedMage("Gandalf", 100);

        System.out.println(mage1.equals(redMage1)); // Should print true
        System.out.println(redMage1.equals(mage1)); // Should print true
    }
}
