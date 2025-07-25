package lu.uni.programming.Lab6.exercise1;

public class GroupTicket extends Ticket {
    private int n;
    private Pavillon[] arPavillons;

    public GroupTicket(int pN){
        super();
        n = pN;
    }

    public double getGroupPrice(){
        double price=0;
        if(n<6){
            System.out.println("The group is too small");
        }
        else if(n<=12){
            for (int i = 0; i < arPavillons.length; i++) {
                price += (0.7*arPavillons[i].getPrice());
            }
        }
        else{
            for (int i = 0; i < arPavillons.length; i++) {
                price += (0.6*arPavillons[i].getPrice());
            }
        }
        return price;
    }

    @Override
    public String toString(){
        System.out.println("-** Group Ticket **-");
        super.toString();
        return "";
    }


}
