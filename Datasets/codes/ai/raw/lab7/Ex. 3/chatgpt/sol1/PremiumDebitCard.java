public class PremiumDebitCard extends DebitCard {
    public PremiumDebitCard(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    public boolean canPay(double amount) {
        // Premium debit card has higher limit
        return super.canPay(amount);
    }

    @Override
    public double executePayment(double amount) {
        // Premium debit cards do not return change
        return 0;
    }
}
