import java.util.UUID;

import java.util.Date;

public class Ticket {
        
    protected  UUID ticketID;
    
    protected  Date emissionDate;

    protected static  Pavilion[] pavilions;


    public Ticket(Pavilion[] pavilions){

        ticketID=UUID.randomUUID();
        emissionDate=new Date();
        Ticket.pavilions=pavilions;

    }
    public double price(){
        double price=0;
        for(int i=0; i<pavilions.length; i++){
            if(i<3){
                price+=Pavilion.getprice();
            }
            else{price+=Pavilion.getprice()*0.7;
            
            }
        }
        return price;
    }
    public String getpavilion(){
        String name="";
        for (int i=0;i<pavilions.length;i++){
            name+=Pavilion.getname()+ " ";

        }
        return name;
    }
    public String sigleTicket(){
        return ("— Welcome to Luxembourg History Museum — \n" +
        "       Ticket ID :" + ticketID + "\n" +
        "       Date : " + emissionDate + "\n" +
        "       You can visit : " + getpavilion() + "\n" +
        "       Total cost is : $" + price() +"\n");

    }
    @Override
    public String toString(){
        return sigleTicket();
    }
}
