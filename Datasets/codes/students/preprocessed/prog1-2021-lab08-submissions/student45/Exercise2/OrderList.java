import java.util.HashSet;

public class OrderList {
    private HashSet<Order> list;
    private String name;
    private double price;

    public OrderList(String name) {
        this.name = name;
        list = new HashSet<>();
        price=0;
    }

    public void addItem(Order o)
    {if(!list.contains(o))
   { list.add(o);
    price+=o.getTotalPrice();}}

    public void order()
    {System.out.println(toString());}

   
    @Override
    public String toString() {
        String orders="";
        Order o[] = list.toArray(new Order[list.size()]);
        for(int i=0;i<list.size();i++)
        orders=orders+"\t "+(i+1)+". " +o[i].toString();
        return "OrderList for " + name + ". You ordered "+list.size()+
        " different products. Total cost is: "+price+" EURO\n"+orders;
    }

    

}
