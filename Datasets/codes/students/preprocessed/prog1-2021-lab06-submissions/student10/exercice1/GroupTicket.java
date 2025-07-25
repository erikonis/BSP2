public class GroupTicket extends Ticket{
    
    private int visitorNumber;

    public GroupTicket(Pavilion[] pavilions, int visitorNumber){
        super(pavilions);
        this.visitorNumber=visitorNumber;

    }
    public double prices(){
        double price=0;
        if (visitorNumber>5 && visitorNumber<13){
            price=0.7 * super.price();

        }else
            if(visitorNumber>12){
                price=0.6 * super.price();

            }
            return price;

    }
    
    public String GrpTicket(){
        return "    -** Group Ticket **-"+
        "— Welcome to Luxembourg History Museum — \n" +
        "   Ticket ID: "+ticketID+ "\n" +
        "   Date: "+emissionDate+ "\n" +
        "   You can visit: "+super.getpavilion()+ "\n" +
        "   Total cost is: $"+prices()+ "\n";

    }
    
    public String toString(){
        return GrpTicket();
    }
}
