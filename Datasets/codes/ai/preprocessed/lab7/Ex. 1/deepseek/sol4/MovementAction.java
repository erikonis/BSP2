public abstract class MovementAction implements Action {
    protected static final int COST = 10;

    @Override
    public int getBatteryCost() {
        return COST;
    }
}