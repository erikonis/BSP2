package lu.uni.programming1.lab5.exercise3;

import java.text.SimpleDateFormat;  
import java.util.Date;  

public class BankAccount {
    private double balance = 0;
    private Person person;

    public BankAccount(double balance,String name, int id){
        this.balance = balance;
        this.person = new Person(id, name);
    }

    public void deposit(double amount){
        if(amount < 0){
            System.out.println("Depositing negative amount is not possible!");
        }
        else{
            balance += amount;
        }
    }

    public boolean withdraw(double amount){
        if(balance < Math.abs(amount)){
            return false;
        }
        else{
            balance -= Math.abs(amount);
            return true;
        }
    }

    public void printBalance(){
        System.out.println("Balance: " + balance);
    }

    public void transfer(BankAccount account, double amount){
        if(!withdraw(amount)){
            System.out.println("Not enough money in the account!");
        }
        else{
            withdraw(amount);
            account.deposit(amount);
            System.out.println("Transfer to " + account.person.getName() + " succeeded");

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();  
            System.out.println(formatter.format(date));
        }
    }
}
