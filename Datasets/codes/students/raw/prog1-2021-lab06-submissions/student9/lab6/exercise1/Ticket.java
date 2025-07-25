
import java.util.Date;
import java.util.UUID;


public class Ticket {
    UUID ticketID;
    Date emissionDate;
    Pavilion[] pavArray;
    int counter;       

    public Ticket(Pavilion[] pavArray){
        ticketID=UUID.randomUUID();
        emissionDate= new Date();
        this.pavArray=pavArray;
    }

    public double cost (){
        double cost=0;

        for(int i=0;i<pavArray.length;i++){     //counts the total elements in the pavArray
            if(pavArray[i]!=null)
            counter++;
        }
        
        int counter3=0;
        for(int i=0; i<pavArray.length;i++){    //goes through the whole array
            if(pavArray[i]!=null){              //ignores null elements
                if(counter<3 || counter3<3){                       //if the array has less that 3 elements 
                    cost += pavArray[i].getPrice();
                    counter3++;                                     //counter3 is there to ignore the first 3 cases 
                }
                else 
                    cost += 0.7*pavArray[i].getPrice();
            }
            
        }
        return cost;       
    }

    @Override
    public String toString(){
        String taux="";
        String s1="---------------------— Welcome to Luxemobourg History Museum —-----------------------\n";
        String s11="Ticket ID: "+ticketID+"\n";
        String s15="Date :"+emissionDate+"\n";
        String s2="\nThe price of your ticket is : "+(int)(Math.round(cost() * 100))/100.0+"$\n"; //way to only keep 2 decimal places
        String s3="\nYou have access to the following pavilion : \n";
        String s4="";

        int counter3=0;
        for(int i=0;i<pavArray.length;i++){
            if(pavArray[i]!=null){
                counter3++;                     //counter3 is there to skip the first 3 elements of the array
                if(counter>3 && counter3>3)
                taux="(-30%)";
            s4 = s4+"-"+pavArray[i].getName()+" "+taux+"\n";
            }
        }
        
        return s1+s11+s15+s3+s4+s2;
    }

    public static void main(String[] args) {
        Pavilion pav1 =  new Pavilion("Pavilion Culture", 14.5);
        Pavilion pav2 =  new Pavilion("Pavilion Astronomie", 9.5);
        Pavilion pav3 =  new Pavilion("Pavilion Atristique", 20);
        Pavilion pav4 =  new Pavilion("Pavilion Aquatique", 10);
        Pavilion pav5 =  new Pavilion("Pavilion Galactique",20);
        Pavilion[] pavArray = new Pavilion[10];
        pavArray[0]=pav1;
        pavArray[1]=pav2;
        pavArray[5]=pav3;
        pavArray[7]=pav4;
        pavArray[9]=pav5;
        Ticket t1 = new Ticket(pavArray);
        System.out.println(t1.toString());      
    }
}
