public class AccountOperations {

    public static void performDeposit(Account account, double amount) {
        account.deposit(amount);
    }

    public static void performWithdrawal(Account account, double amount) {
        account.withdraw(amount);
    }

    public static void displayBalance(Account account) {
        System.out.println("Current Balance: " + account.getBalance());
    }
}