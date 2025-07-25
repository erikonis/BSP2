package exercise1;

public class Sender {
    String name,item;
    Adress adress;
    ShipMethode sm;
    double cost;

    public Sender(String name, Adress adress, ShipMethode shipMethode, String item) {
        this.name = name;
        this.adress = adress;
        this.sm = shipMethode;
        this.item = item;
        cost=sm.price + adress.country.price;  
    }

    @Override
    public String toString() {
        String s1 = "Shipping for "+name+", ("+adress.toString()+")\n";
        String s2 = "Item: "+item+"\n";
        String s3 = "Shipping Methode: "+sm+"["+sm.price+"$]. Handeling in "+sm.day+" day."+"\n";
        String s4 = "Total cost: "+cost+"$"+"\n";
        return s1+s2+s3+s4;
    }
}
