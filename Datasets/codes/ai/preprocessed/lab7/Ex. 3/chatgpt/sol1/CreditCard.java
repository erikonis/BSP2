public class CreditCard extends DebitCard {
    private double allowedOverdraft;

    public CreditCard(BankAccount bankAccount, double allowedOverdraft) {
        super(bankAccount);
        this.allowedOverdraft = allowedOverdraft;
    }

    @Override
    public boolean canPay(double amount) {
        if (super.bankAccount.balance + allowedOverdraft >= amount) {
            return true;
        }
        return false;
    }

    @Override
    public double executePayment(double amount) {
        if (canPay(amount)) {
            super.bankAccount.balance -= amount;
            return 0; // No change for credit card
        } else {
            System.out.println("Credit limit exceeded.");
            return -1;
        }
    }
}