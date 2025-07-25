public class Package {

    private String item;
    private Shipping shipping;
    private Address address;
    private Country country;

    public Package(String item, Shipping shipping, Address address) {
        this.item = item;
        this.shipping = shipping;
        this.address = address;
        this.country = Country.valueOf(address.getCountry());
    }

    public int price() {
        int price = 0;
        
        switch (country) {
            case FRANCE:
                price += 30;
                break;
            case GERMANY:
                price += 40;
                break;
            case BELGIUM:
                price += 50;
                break;
            default:
                break;
        }

        price += shippingPrice();
    
        return price;
    }

    public int shippingPrice() {

        int price = 0;

        switch (shipping) {
            case CLASSIC:
                price += 10;
                break;
            case PRIORITY:
                price += 50;
                break;
            case EXPRESS:
                price += 100;
                break;
            default:
                break;
        }

        return price;

    }

    public int handlingTime() {
        int time = 0;
     
        switch (shipping) {
            case CLASSIC:
                time += 5;
                break;
            case PRIORITY:
                time += 3;
                break;
            case EXPRESS:
                time += 1;
                break;
            default:
                time += 8;
                break;
        }

        return time;
    }
    
    public String toString() {
        String output = "Shipping for ";
        switch (address.getPerson().getGender()) {
            case "Female", "female", "F", "f":
                output += "Ms. ";
                break;
        
            default:
                output += "Mr. ";
                break;
        }

        output += address.getPerson().getName() + ", ";

        switch (country) {
            case GERMANY:
                output += "(" + address.getStreet() + " " + address.getNumber() + ", " + address.getPostalCode() + ", " + address.getCity() + ", " + address.getCountry() + "),\n";
                break;
        
            default:
                output += "(" + address.getNumber() + ", " + address.getStreet() + ", ";

                if (country == Country.LUXEMBOURG) {
                    output += "L-";
                }
                
                output += address.getPostalCode() + ", " + address.getCity() + ", " + address.getCountry() + "),\n";
                break;
        }

        output += "\tItem: " + item + ",\n";
        output += "\tShipping method: " + shipping + "[" + shippingPrice() + " EUR]. Handling in " + handlingTime();
        switch (handlingTime()) {
            case 1:
                output += " day,\n";
                break;
            default:
                output += " days,\n";
        }
        
        output += "\tTOTAL cost: " + price() + ".00 EUR\n";

        return output;
    }

}
