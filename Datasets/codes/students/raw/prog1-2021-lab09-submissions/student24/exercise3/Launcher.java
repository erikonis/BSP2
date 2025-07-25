package lu.uni.programming1.lab9.exercise3;

public class Launcher {
    public static void main(String[] args) {
        Mage person = new Mage("John");
        Mage person2 = new RedMage("John");
        System.out.println(person2.equals(person));
        System.out.println(person.equals(person2));
    }
}
