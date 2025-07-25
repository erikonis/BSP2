public class RedMage extends Mage {
    private final int magicPower;

    public RedMage(String name, int magicPower) {
        super(name);
        this.magicPower = magicPower;
    }

    // Optional: no need to override equals if it inherits Mage's logic
}