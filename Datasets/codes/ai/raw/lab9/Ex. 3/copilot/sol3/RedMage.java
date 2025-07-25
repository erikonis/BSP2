public class RedMage extends Mage {
    private int magicPower;

    public RedMage(String name, int magicPower) {
        super(name);
        this.magicPower = magicPower;
    }

    public int getMagicPower() {
        return magicPower;
    }
}
