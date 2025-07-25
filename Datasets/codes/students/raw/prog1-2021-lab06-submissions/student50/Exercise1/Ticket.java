package Exercise1;

import java.util.Date;
import java.util.UUID;

public class Ticket {

private UUID ticketID= UUID.randomUUID();
private Date emissionDate;
private Pavilion[] pav;
protected double price=0;

public Ticket(Pavilion[] pav) {
    this.emissionDate = new Date();
    this.pav = pav;

    for(int i=0;i<pav.length;i++)
        if(i<3)
        price+=pav[i].getPrice();
        else 
        price+=pav[i].getPrice()*0.7;}
    
@Override
public String toString()
{   //didn't like the generated arrayToString, so I did it my own :)
    String pavi="";
for(int i=0;i<pav.length;i++)
    pavi=pavi+pav[i].getName()+" ";
return "--Welcome to Luxembourg History Museum -- \n Ticket ID: "
+ticketID+"\n Date: "+emissionDate
+"\n You can visit: "+pavi+"\n Total cost is: $"+ price+"\n";
}
    
}







    

