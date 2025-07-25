package exercise1;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Ticket {
    private UUID ticketID;
    private Date emissionDate;
    private Pavilion[] pavilion;

    public Ticket(int size) {
        Random r=new Random();
        ticketID = UUID.randomUUID();
        emissionDate = new Date();
        pavilion = new Pavilion[size];
        for(int i=0;i<pavilion.length;i++){
            pavilion[i]= new Pavilion("pav"+i, r.nextInt(50)+r.nextDouble());
        }
    }

    public double calculatePrice(){
        double sum=0;
        for(int i=0;i<pavilion.length;i++){
            if(i>=3){
                sum+=0.7*pavilion[i].getPrice();
            }else{
                sum+=pavilion[i].getPrice();
            }
        }
        return sum;
    }

    public String getPavilion(){
        String tmp="";
        for(int i=0;i<pavilion.length;i++){
            tmp+=pavilion[i].getName();
            if(i!=pavilion.length-1){
                tmp+=" ";
            }
        }
        return tmp;
    }

    public String toString(double price){
        String text="";
        text+="--Welcome to the Luxembourg History Museum--\n";
        text+="Ticket ID: "+ticketID+"\n";
        text+="Date: "+emissionDate+"\n";
        text+="You can visit: "+getPavilion()+"\n";
        text+="Total cost is: $"+price;
        return text;
    }
}
