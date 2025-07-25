package Exercise1;

import java.util.Date;
import java.util.UUID;

public class Ticket {

    UUID ticketID;
    Date emissionDate = new Date();
    Pavilion[] pavilions= new Pavilion[9];
    boolean[] pavSelected = new boolean[9];




    




    public Ticket(Ticket ticket) {
    }




    public void generateRandomTicketID() {

        UUID somerandomUUID = UUID.randomUUID();
        this.ticketID=somerandomUUID;

    }

   // public void printEmissionDate() {

   //         Date rightnow = Date.

   // }




    public UUID getTicketID() {
        return this.ticketID;
    }

    public void setTicketID(UUID ticketID) {
        this.ticketID = ticketID;
    }

    public Date getEmissionDate() {
        return this.emissionDate;
    }

    public void setEmissionDate(Date emissionDate) {
        this.emissionDate = emissionDate;
    }




    public void resetPavs() {
        
        for (int i=0; i<=8; i++) {pavSelected[i]=false;
        
            pavilions[i] = new Pavilion(null, 0); 
            
        };

    }; 

    public int  howManyPav () {

        int noOfPav = 0;
        for (int i=0; i<=8; i++) if (pavSelected[i]==true) noOfPav+=1;
        return noOfPav;

    }

    public int findAFreePav () {

        boolean foundone = false;
        int value=-1;
        for (int i=0; i<=8; i++) if (pavSelected[i]==false && foundone==false) {  foundone=true; value=i;  };
        return value;

    }



    public void definePav(String thename, double theprice){

        int findFreePav=findAFreePav();

        if (findFreePav==-1) {System.out.println("The list of pavilions is full! ");}
        else { pavSelected[findFreePav]=true;  pavilions[findFreePav].setName(thename); pavilions[findFreePav].setPrice(theprice); };
    }

    public int findPav(String thepavname) {

        boolean foundthepav = false;

        int findIndex=-1;

        for (int i=0; i<=8; i++) { 

        if   (thepavname.equals(pavilions[i].getName())==true)  
            { foundthepav =true; findIndex=i; System.out.println("Pavilion found at index " + (findIndex+1)); };


    }; if (!foundthepav) System.out.println("Pavilion was not added! ");
    return findIndex; }


    public  void removePav(String thepavtoremove) {


        int isthepavthere=findPav(thepavtoremove);
    
        if (isthepavthere==-1) System.out.println("The pavilion cannot be removed because it wasn't even added! ");
    
        else {(pavilions[isthepavthere]).setName(null);  (pavilions[isthepavthere]).setPrice(0); pavSelected[isthepavthere]=false; System.out.println("The pavilion was removed... ");}; }

        public String report()  {
            String whattoreport= new String();

            int pavnumbercomputed = howManyPav();

            if ((pavnumbercomputed!=0)) {
                
               for (int i=0; i<=8; i++) {if (pavSelected[i]==true) whattoreport+= pavilions[i].getName()+" ";  }; };
            return whattoreport;}



            





            public void reportFinal() {

                System.out.println("-- Welcome to Luxembourg History Museum -- \n Ticket ID: \n " + ticketID.toString() + "\n " + emissionDate.toString() + "\n You can visit: " + report() + "\n The final price is: "   );


             }


             



}
