import java.time.format.DateTimeFormatter;  //For date and time getting and formating
import java.time.LocalDateTime;  

public class BankAccount {
    private Person holder;
    private double balance = 0;

    public BankAccount(Person holder){
        this.holder = holder;
    }

    public Person getHolder(){return this.holder;}
    public double getBalance(){return this.balance;}

    public void deposit(double amount) {
        amount = Math.abs(amount);//Ensure that values are positive

        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        amount = Math.abs(amount);

        if (this.balance - amount < 0) {
            System.out.println("You don't have enought money.");
            return false;
        } else {
            this.balance -= amount;
            return true;
        }
    }

    public void printBalance(){
        System.out.println(this.holder.getName() + "'s balance is : " + this.balance + "€");
    }

    public void transfer(BankAccount dst, double amount){
        boolean canTransfer = this.withdraw(amount);

        if (canTransfer) {
            dst.deposit(amount);

            DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy @ HH:mm:ss");  
            LocalDateTime current = LocalDateTime.now();  

            String formated = f.format(current);

            System.out.println("Succesfully transfered " + amount + "€ from " + this.holder.getName() + "'s account to " + dst.holder.getName() + "'s\n" + formated);
        }
    }
    
}
