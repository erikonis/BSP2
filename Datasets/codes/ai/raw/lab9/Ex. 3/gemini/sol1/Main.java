public class Main {
    public static void main(String[] args) {
        Mage mage1 = new Mage("Gandalf", 100);
        RedMage redMage1 = new RedMage("Gandalf", 150, "Longsword", 20);
        Mage mage2 = new Mage("Saruman", 120);
        RedMage redMage2 = new RedMage("Radagast", 90, "Staff", 5);

        System.out.println("mage1 equals redMage1: " + mage1.equals(redMage1)); // Output: true
        System.out.println("redMage1 equals mage1: " + redMage1.equals(mage1)); // Output: true (due to symmetry)
        System.out.println("mage1 equals mage2: " + mage1.equals(mage2));       // Output: false
        System.out.println("redMage1 equals redMage2: " + redMage1.equals(redMage2)); // Output: false
    }
}