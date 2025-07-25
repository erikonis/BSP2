public class Account {
    protected double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
        } else {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
    }

    public static class OverdraftAccount extends Account {
        private double allowedOverdraft;

        public OverdraftAccount(double initialBalance, double allowedOverdraft) {
            super(initialBalance);
            this.allowedOverdraft = allowedOverdraft;
        }

        public double getAllowedOverdraft() {
            return allowedOverdraft;
        }

        public void setAllowedOverdraft(double allowedOverdraft) {
            this.allowedOverdraft = allowedOverdraft;
        }

        @Override
        public void withdraw(double amount) {
            if (amount > 0 && (balance - amount) >= -allowedOverdraft) {
                balance -= amount;
                System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
            } else {
                System.out.println("Withdrawal failed. Cannot exceed allowed overdraft of " + allowedOverdraft + ".");
            }
        }
    }
}