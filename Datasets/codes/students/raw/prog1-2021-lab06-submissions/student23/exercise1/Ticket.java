package lu.uni.programming1.lab6.exercise1;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Ticket {
    private UUID uuid;
    private Date emissionDate;
    private Pavilion[] pavs;

    public Ticket(Pavilion[] pavs){
        this.pavs = pavs;
        
        this.emissionDate = new Date(); this.emissionDate = Calendar.getInstance().getTime();

        this.uuid = new UUID(1, 64);
    }

    public UUID getUuid() {return this.uuid;}
    public Date getDate() {return this.emissionDate;}

    public double calculateCost(boolean discount){
        double totalCost = 0;

        //Loop over each pavs
        for (int i = 0; i< this.pavs.length; ++i) {
            if (i < 3) {
                totalCost += this.pavs[i].getPrice();
            }
            else if (discount && i > 2) {
                totalCost += this.pavs[i].getPrice() / 1.3; //Applying discount for every pavs after the first 3
            }
        }

        return totalCost;
    }

    @Override
    public String toString() {
        String msg = "*--- Welcome To Luxembourg's History Museum ---*";

        msg += "\t Ticket ID :" + this.uuid.toString() +"\n";
        msg += "\t Date : " + this.emissionDate.toString() + "\n";
        msg += "\t Accesible Pavilions : ";
        for(byte i = 0; i < this.pavs.length; ++i){
            msg += this.pavs[i].getName() + " ";
        }
        msg += "\n";

        msg += "\tTotal cost : " + this.calculateCost(true) + "€";

        return msg;
    }

}
