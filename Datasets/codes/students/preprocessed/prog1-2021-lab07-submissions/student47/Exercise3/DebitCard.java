public class DebitCard extends Card {

    protected BankAccount acc;

    public DebitCard(BankAccount acc) {
       super(acc);
    }

    public BankAccount getAcc()
    {return acc;
    }
}
