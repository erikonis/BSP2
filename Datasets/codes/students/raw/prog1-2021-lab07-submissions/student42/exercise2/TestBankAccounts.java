package lu.uni.programming1.lab7.exercise2;

public class TestBankAccounts {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(2000);
		b1.withdraw(1500);
		b1.withdraw(800);

		BankAccount b2 = new OverdraftAccount(2000, 500);
		b2.withdraw(1500);
		b2.withdraw(800);
		b2.withdraw(300);
	}
}