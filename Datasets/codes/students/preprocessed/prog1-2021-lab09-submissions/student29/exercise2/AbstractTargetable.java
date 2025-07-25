public abstract class AbstractTargetable implements Targetable {

    private int Value;

    public AbstractTargetable(int value) {
        Value = value;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }


    
}
