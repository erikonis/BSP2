package payment_system.model.cards;

import payment_system.model.BankAccount;

public class DebitCard implements Card {
    private final BankAccount linkedAccount;
    
    public DebitCard(BankAccount account) {
        this.linkedAccount = account;
    }
    
    @Override
    public boolean authorize(double amount) {
        return linkedAccount.canWithdraw(amount);
    }
    
    @Override
    public boolean process(double amount) {
        return linkedAccount.withdraw(amount);
    }
    
    @Override
    public String getCardDetails() {
        return "Debit Card linked to account " + linkedAccount.getAccountNumber();
    }
}