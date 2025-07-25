package lu.uni.programming1.lab10.exercise1;

public class PartyFullException extends Exception{
    


    public PartyFullException (Party party)

    {


        String already = " The party already contains a "; 
        
        if (party.getPartySize()==4) {System.out.println("Party full! ");}

        if (party.isThereAHealer()==true) {System.out.println(already + "healer");}; 

        if (party.isThereATank()==true) {System.out.println(already + "tank");}; 

        if (party.areThereTwoDamage()==true) {System.out.println(already + "pair of damage characters ");}; 


    }
}
