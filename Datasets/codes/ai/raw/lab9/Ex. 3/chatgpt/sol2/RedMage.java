public class RedMage extends Mage {
    private final int firePower;

    public RedMage(String name, int firePower) {
        super(name);
        this.firePower = firePower;
    }

    @Override
    protected boolean canEqual(Object obj) {
        return obj instanceof RedMage || obj instanceof Mage;
    }
}
