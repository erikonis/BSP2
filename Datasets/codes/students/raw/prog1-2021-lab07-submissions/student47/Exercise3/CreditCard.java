package Exercise3;

public class CreditCard extends Card {

    protected OverdraftAccount acc;

    public CreditCard(OverdraftAccount acc) {
        super(acc);
    }

    public OverdraftAccount getAcc() {
        return acc;
    }

}
