import java.util.Date;
import java.util.UUID;

public class Ticket {
    //atributes
    private UUID ticketID;
    private Date emissionDate;
    private Pavilion pavilionarr[] ;
    private float pavPrice = 80.91f; //price fixed
    protected float cost; 
    //constructor
    public Ticket (int pavs){
        ticketID = UUID.randomUUID(); //for random ID
        emissionDate = new Date(); //for current date
        pavilionarr = new Pavilion[pavs];

        //nb of pavilions can be changed in a main method 
        for(int i=0;i<pavs;i++){
            
            if(i<3){ 
                //First 3 tickets
                pavilionarr[i] = new Pavilion("pav"+(i+1),pavPrice);
            }else{ 
                //Further
                pavilionarr[i] = new Pavilion("pav"+(i+1),pavPrice*0.7);
            }
        }
        cost = getCost();

    }
    //get the cost of each pavilion
    public float getCost(){ 
        
        float cost = 0;
        
        for(Pavilion pav: pavilionarr)
            cost += pav.getPrice();
        
        return cost; 
    }
    //ToString method
    public String toString(){
        
        String txt = "— Welcome to Luxemobourg History Museum —";
        
        txt += "\n\tTicket ID: " + ticketID;
        txt += "\n\tDate: " + emissionDate;
        txt += "\n\tYou can visit: ";   
        
        for(Pavilion pav: pavilionarr){
            txt += pav.getName() + " ";
        }
        
        txt += "\n\tTotal cost is: $" + Math.round(cost);
        
        return txt;
    }
    

    

    

}
