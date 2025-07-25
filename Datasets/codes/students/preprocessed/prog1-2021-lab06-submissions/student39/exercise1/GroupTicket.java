public class GroupTicket extends Ticket {
    // private int n, c1;
    // private double price;
    GroupTicket(int n, Pavilion... pav){
        super(pav);
        setPrice(n);
        //extends the Ticket for multiple people, only adding a number for the people in the group
        //sets the price appropiately
        }
        @Override
    public String toString(){
        return "\t –** Group Ticket **–"+super.toString();}
        //does prints the same thing as Ticket does, but emphasizing its a group ticket
    public double setPrice(int n){
        super.setPrice(n);
        return super.getPrice();}
        //setter for the price
    // public double setPrice(){
    //     while (c1<l){
    //         if (c1<=2){
    //             price = price + pav[c1].getPrice();}
    //         if (c1>2){
    //             price = price + ((pav[c1].getPrice())*0.7);}
    //         c1++;}}
    // }
}
