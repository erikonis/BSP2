import java.util.Date;

public class GroupTicket extends Ticket {

    private int n;
	
	public GroupTicket(int ticketID_, Date emissionDate_, Pavilon[] pavilons_, int n_) {
        super(ticketID_, emissionDate_, pavilons_);
        this.n = n_;
	}

    @Override 
	public double gettotalcost(){
		double totalcost = 0;
		for (int i = 0 ; i < getpavilons().length ; i++){
			totalcost += getpavilons()[i].getprice();
		}

        if (n>5&&n<13){
            totalcost = totalcost -(totalcost*0.3);
        }
        if (n>12) {
            totalcost = totalcost -(totalcost*0.4);
        }
		return totalcost;
    }

    @Override
    public String toString() {
        String pavilionList = " ";
        for (int i = 0 ; i < getpavilons().length ; i++){
            pavilionList += getpavilons()[i].getname() + " ";
        }
    
        return "--** Group ticket**--\n" + "— Welcome to Luxemobourg History Museum —\n" + "Ticket ID: " + getticketID() + "\nDate: " + getemissionDate()  +"\nYou can visit: " + pavilionList + "\nTotal cost : " + gettotalcost() ;
    }
    
}
