package lu.uni.programming1.lab5.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Adds first account
        System.out.println("Name: ");
        String name = sc.next();
        System.out.println("ID: ");
        int id = sc.nextInt();
        System.out.println("Balance: ");
        double balance = sc.nextDouble();
        BankAccount first = new BankAccount(balance, name, id);
        System.out.println("First account added!");
        
        // Adds second account
        System.out.println("Name: ");
        name = sc.next();
        System.out.println("ID: ");
        id = sc.nextInt();
        System.out.println("Balance: ");
        balance = sc.nextDouble();
        BankAccount second = new BankAccount(balance, name, id);
        System.out.println("Second account added!");

        // Deposit
        System.out.println("Add amount to first balance \nAmount: ");
        double amount = sc.nextDouble();
        first.deposit(amount);
        first.printBalance();

        // Withdraw
        System.out.println("Withdraw amount from first balance \nAmount: ");
        amount = sc.nextDouble();
        first.withdraw(amount);
        first.printBalance();

        // Transfer
        System.out.println("Which amount should be transfered from first to second account? \nAmount: ");
        amount = sc.nextDouble();
        first.transfer(second, amount);
        


        sc.close();
    }
}
