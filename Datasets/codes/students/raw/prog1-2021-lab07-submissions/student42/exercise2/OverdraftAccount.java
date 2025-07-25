package lu.uni.programming1.lab7.exercise2;

public class OverdraftAccount extends BankAccount {

	private double allowedOverdraft;

	public OverdraftAccount(double balance, double allowedOverdraft) {
		super(balance);
		this.allowedOverdraft = allowedOverdraft;
	}

	@Override
	public double maxWithdrawAmount() {
		return this.balance + this.allowedOverdraft;
	}
}