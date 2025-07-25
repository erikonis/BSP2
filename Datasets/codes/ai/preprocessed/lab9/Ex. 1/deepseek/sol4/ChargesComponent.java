import ecs.Component;

public class ChargesComponent extends Component {
    private final int maxCharges;
    private int currentCharges;

    public ChargesComponent(int maxCharges) {
        this.maxCharges = maxCharges;
        this.currentCharges = maxCharges;
    }

    public void useCharge() {
        currentCharges = Math.max(0, currentCharges - 1);
    }

    public int getCurrentCharges() { return currentCharges; }
    public int getMaxCharges() { return maxCharges; }
    public boolean isDepleted() { return currentCharges <= 0; }
}