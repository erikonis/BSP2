
public class Package {

	private String name;
	private Country C1;
	private Transport T1;

	public Package(String name, Country C1, Transport T1) {
		this.name = name;
		this.C1 = C1;
		this.T1 = T1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// calculate the price for transport
	// return the value
	public double price() {
		double price = C1.getPay() + T1.getPrice();
		return price;
	}

	@Override
	public String toString() {
		return "The Package name is " + name + " , country is " + C1 + " and the transport is " + T1 + " " + price()
				+ " ";
	}

}