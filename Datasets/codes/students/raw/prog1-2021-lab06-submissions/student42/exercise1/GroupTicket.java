package lu.uni.programming1.lab6.exercise1;

public class GroupTicket extends Ticket {

    public GroupTicket(Pavilion[] selection, int size) {

        super(selection);

        if (size >= 6) {
            if (size > 12) {
                totalprice = totalprice / 100 * 60;
            } else {
                totalprice = totalprice / 100 * 70;
            }
        }

    }

    @Override
    public void totalC() {
        for (int i = 0; i < selection.length; i++) {

            if (selection[i] != null) {
                price = selection[i].getPrice();
                totalprice += price;
            }

        }

    }

    @Override
    public String toString() {
        return "-** Group Ticket **-" + "\n" + super.toString();
    }

}
