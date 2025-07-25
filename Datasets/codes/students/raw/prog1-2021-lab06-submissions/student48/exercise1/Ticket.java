package lu.uni.programming1.lab6.exercise1;

import java.util.*;

public class Ticket {
    private UUID ticketID;
    private Date emissionDate;
    Pavilion[] pavilions;

    public Ticket(Pavilion[] pavilions) {
        ticketID = UUID.randomUUID();
        emissionDate = new Date();
        this.pavilions = pavilions;
    }

    public String getTicketID() {
        return ticketID.toString();
    }

    public Pavilion[] getPavilions() {
        return pavilions;
    }

    public String displayPavilions() {
        String s = "";
        for(int i = 0; i < pavilions.length; i++){
            s += pavilions[i].getName() + ", ";
        }
        return s;
    }

    public Date getEmissionDate() {
        return emissionDate;
    }

    public double costTicket() {
        double cost = 0;
        for(int i = 0; i < pavilions.length; i++){
            if(i >= 3){
                // 30% reduction aftet the first 3 pavilions
                cost += pavilions[i].getPrice()*0.7;
            }
            else{
                cost += pavilions[i].getPrice();
            } 
        }
        return cost;
    }

    @Override
    public String toString() {
        return  "\n-- Welcome to Luxembourg History Museum --" +
                "\n\tTicketID: " + getTicketID() +
                "\n\tDate: " + getEmissionDate() +
                "\n\tPavilions: " + displayPavilions() +
                "\n\tTotal " + String.format("%.2f",costTicket()) + "€\n";
            }
}
