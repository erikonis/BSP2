package lu.uni.programming1.lab6.exercise1;

public class GroupTicket extends Ticket {
    private Pavilion[] arpav;
    private int numpeople;
    
    public GroupTicket(Pavilion[] arpav, int num){
        super (arpav);
        this.arpav = arpav;
        this.numpeople = num;
    }
    
    @Override
    public double calcPrice(){
        int totalprice = 0;
        if (numpeople >= 6 && numpeople <= 12){ //case 1: number of people between 6 and 12 (included), price is the overall price with 30% discount
        for (int i = 0; i<9; i++){
            if (arpav[i]!=null){
                
                    totalprice += arpav[i].getPrice();
            }
        }
            return totalprice*0.7;    
        }
        else if (numpeople > 12){ //case 2: number of people between above 12, price is the overall price with 40% discount
            for (int i = 0; i<9; i++){
                if (arpav[i]!=null){
                    
                        totalprice += arpav[i].getPrice();
                }
            }
                return totalprice*0.6;
        }
        else { //case 3: number of people below 6, same price calculations as with a normal Ticket
            int count = 0;
            for (int i = 0; i<9; i++){
                if (arpav[i]!=null){
                    count ++;
                    if (count <= 3){
                        totalprice += arpav[i].getPrice();
                    }
                    else {
                        totalprice += arpav[i].getPrice()*0.7;
                    }
        
                }
            }
        }
        return totalprice;
    }
    @Override
public String toString(){

    
    return "** Group Ticket ** \n" + "--Welcome to Luxembourg History Museum--\n" + "Ticket ID: " + super.getUuid() + "\n" + "Date: " + super.getEmiDate() +"\n" + "Pavilion(s): " + super.sbf() + "\n" + String.format("Total cost is: $ %.2f", calcPrice());
}
}
