import java.util.List;

public class Orderlist {
    String name;
	List<Order> liste;
    public Orderlist(List<Order> liste) {
		this.liste = liste;
	}
	public List<Order> getOrders() {
		return liste;
		
	}
	
}