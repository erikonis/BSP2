import java.util.Scanner;

public class GroupTicket extends Ticket {

    Scanner scan = new Scanner(System.in);
    private int n;

    public GroupTicket(Pavilion[] pavi) {
        super(pavi);
        System.out.println("Number of people pls: ");
        this.n = scan.nextInt();
        if(n>=6 && n<=12)
            totalprice = totalprice*0.7;
        if (n>12)
            totalprice = totalprice*0.6;
    }

    public String toString() {
        return "                ――* Group Ticket *――\n        ――― Welcome to Luxembourg Museum ―――\n\n   Ticket ID: "+ ticketID + "\n   Date: "+ emissionDate +"\n   You can access: "+ name +"\n   You need to pay: $"+ totalprice + "\n";
    }
    
    
}
