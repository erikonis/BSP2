package lu.uni.programming1.lab6.exercise1;

public class GroupTicket extends Ticket {
    //atribute
    private int n; 
    //constructor (sub-class)
    public GroupTicket(int pavs, int n) {      
        super(pavs);
        this.n = n;
    }
    //ToString method
    public String toString(){
        //calculates the cost of tickets depending on the people on a group
        if(n >= 12)
            super.cost *= .6;
        else if(n >= 6)
            super.cost *= .7;
              
        String txt = "\t–** Group Ticket **–\n" + super.toString();
        
        return txt;
    }
    
}

