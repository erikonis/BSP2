public class EqualityChecker {
    public static void main(String[] args) {
        Mage mage1 = new Mage("Gandalf", 100);
        RedMage redMage1 = new RedMage("Gandalf", 150, "Longsword", 20);
        Mage mage2 = new Mage("Saruman", 120);
        RedMage redMage2 = new RedMage("Radagast", 90, "Staff", 5);

        NameComparator nameComparator = new NameComparator();

        System.out.println("Using NameComparator:");
        System.out.println("mage1 and redMage1 have equal names: " + nameComparator.areNamesEqual(mage1, redMage1)); // Output: true
        System.out.println("redMage1 and mage1 have equal names: " + nameComparator.areNamesEqual(redMage1, mage1)); // Output: true
        System.out.println("mage1 and mage2 have equal names: " + nameComparator.areNamesEqual(mage1, mage2));       // Output: false
        System.out.println("redMage1 and redMage2 have equal names: " + nameComparator.areNamesEqual(redMage1, redMage2)); // Output: false

        System.out.println("\nUsing Mage's equals method:");
        System.out.println("mage1 equals redMage1: " + mage1.equals(redMage1)); // Output: false (due to different classes)
        System.out.println("redMage1 equals mage1: " + redMage1.equals(mage1)); // Output: false (RedMage uses default equals)
        System.out.println("mage1 equals mage2: " + mage1.equals(mage2));       // Output: false (different names)
        System.out.println("redMage1 equals new RedMage(\"Gandalf\", 150, \"Longsword\", 20): " + redMage1.equals(new RedMage("Gandalf", 150, "Longsword", 20))); // Output: false (default object equality)
    }
}