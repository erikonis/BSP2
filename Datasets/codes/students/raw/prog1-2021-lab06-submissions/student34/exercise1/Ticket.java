package lu.uni.programming1.lab6.exercise1;

import java.util.Date;
import java.text.SimpleDateFormat; 

 

public class Ticket {

    private int ticketID;
	private Date emissionDate;
    private Pavilon[] pavilons;
	private static int nextticketID = 90000;
	
	public Ticket(int ticketID_, Date emissionDate_, Pavilon[] pavilons_) {
		this.ticketID = ticketID_;
		this.emissionDate = emissionDate_;
        this.pavilons = pavilons_;
		initializeticketID();
	}

	private void initializeticketID(){
		ticketID = nextticketID++;
	}

	public String getemissionDate(){
	SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss 'CEST' yyyy");
	return dateFormat.format(emissionDate);
	}


	public int getticketID() {
	return ticketID;
	}


	public Pavilon[] getpavilons() {
	return pavilons;
	}

	public double gettotalcost(){
		double totalcost = 0;
		for (int i = 0 ; i < 3 ; i++){
			totalcost += getpavilons()[i].getprice();
		}
		for (int i = 3 ; i < getpavilons().length ; i++){
			totalcost += (getpavilons()[i].getprice()-(getpavilons()[i].getprice()*0.3));
		}
		return totalcost;

	}

	@Override
	public String toString() {
		String pavilionList = " ";
		for (int i = 0 ; i < getpavilons().length ; i++){
			pavilionList += getpavilons()[i].getname() + " ";
		}
	
		return "" + "— Welcome to Luxemobourg History Museum —\n" + "Ticket ID: " + getticketID() + "\nDate: " + getemissionDate()  +"\nYou can visit: " + pavilionList + "\nTotal cost : " + gettotalcost() ;
	}

    
}
