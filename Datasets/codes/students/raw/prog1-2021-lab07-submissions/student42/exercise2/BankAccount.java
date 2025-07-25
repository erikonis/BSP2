package lu.uni.programming1.lab7.exercise2;

public class BankAccount {

	protected double balance;

	public BankAccount(double balance) {
		this.balance = Math.max(balance, 0);
		this.printBalance();
	}

	public void deposit(double amount) {
		if (amount >= 0) {
			this.balance = this.balance + amount;
			this.printBalance();
		} else {
			System.out.println("Amount to deposit has to be positive");
		}
	}
	
	public double maxWithdrawAmount() {
		return this.balance;
	}

	public boolean withdraw(double amount) {
		if (amount < 0) {
			System.out.println("Amount to withdraw has to be positive");
			return false;
		} else if (amount <= maxWithdrawAmount()) {
			this.balance = this.balance - amount;
			this.printBalance();
			return true;
		}

		System.out.println("Insufficient funds");
		return false;

	}

	public void printBalance() {
		System.out.println("Balance of the account: " + this.balance);
	}
}