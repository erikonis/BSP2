public class RedMage extends Mage {
    private final int extraPower;

    public RedMage(String name, int extraPower) {
        super(name);
        this.extraPower = extraPower;
    }

    // No need to override equals() since we only care about name
}