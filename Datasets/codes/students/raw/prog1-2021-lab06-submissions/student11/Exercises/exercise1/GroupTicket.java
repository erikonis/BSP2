package Exercises.exercise1;

public class GroupTicket extends Ticket {
    private int n;
    Pavilion array[];

    GroupTicket(int n,int number) {
        super(number);
        this.n = n;
    }
    public void setPavilion(int pos, String name, double price) {
       super.setPavilion(pos, name, price);

    }

    public double totalcost() {
        double total = 0;
        if (n < 6) {
            total = super.totalcost();
        }
        if (n >= 6 || n <= 12) {
            total = super.totalcost() * 0.7;
        }
        if (n > 12) {
            total = super.totalcost() * 0.6;
        }
        return total;
        
    }
    public String allPavnames() {
       return super.allPavnames();
    }
    public String toString() {
        return "-** Group Ticekt **-"+System.lineSeparator()+super.toString();
                
    }

    

}
