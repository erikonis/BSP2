package lu.uni.programming1.lab6.exercise1;

import java.util.Arrays;

public class GroupTicket extends Ticket {

    private int n; // number of visitor in a group

    public GroupTicket(Pavilion[] pavilion, int n) {
        super(pavilion);
        this.n = n;
    }

    public int getN() {
        return n;
    }

    private double GroupCost() {
        double GroupCost = 0;
        if (n > 6 && n <= 12) {
            for (int i = 0; i < pavilion.length; i++) {
                GroupCost = (GroupCost + (pavilion[i].getPrice() - pavilion[i].getPrice() * 0.3));
            }
        }
        if (n > 12) {
            for (int i = 0; i < pavilion.length; i++) {
                GroupCost = (GroupCost + (pavilion[i].getPrice() - pavilion[i].getPrice() * 0.4));
            }
        }
        return GroupCost = GroupCost * n;
    }

    @Override
    public String toString() {
        return "\n -** Group Ticket **- \n-- Welcome to Luxembourg History Museum -- \n Ticket ID : " 
                + ticketID
                + "\n Date :" + emissionDate 
                + "\n You can visit :" + Arrays.toString(pavilion) 
                + "\n Total cost is : €"+ String.format("%,.2f\n", GroupCost());
    }

}
