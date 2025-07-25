package lu.uni.programming1.lab8.exercise1;

public class Recipient {
    
    public enum Location {
        LUXEMBOURG(0), 
        FRANCE(30), 
        GERMANY(40), 
        BELGIUM(50);

        int fee;


        Location(int fee){
            this.fee = fee;
        }

        public int getFee(){
            return fee;
            //return this.fee;
        } 

    }

    private String title, firstname, name, street, city;
    private int num, pc;
    private Location country;
    private Delivery delivery;
    private Item item;


    public Recipient(String title, String firstname, String name, String street, String city, int num, int pc,
            Location country, Delivery delivery, Item item) {
        this.title = title;
        this.firstname = firstname;
        this.name = name;
        this.street = street;
        this.city = city;
        this.num = num;
        this.pc = pc;
        this.country = country;
        this.delivery = delivery;
        this.item = item;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getFirstname() {
        return firstname;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getStreet() {
        return street;
    }


    public void setStreet(String street) {
        this.street = street;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public int getNum() {
        return num;
    }


    public void setNum(int num) {
        this.num = num;
    }


    public int getPc() {
        return pc;
    }


    public void setPc(int pc) {
        this.pc = pc;
    }


    public Location getCountry() {
        return country;
    }


    public void setCountry(Location country) {
        this.country = country;
    }

    public int calc(){
        return country.getFee()+delivery.getMethod().getCost();
    }

    
    @Override   
    public String toString(){
        String result = "";
        if (getCountry() == Location.GERMANY){
            result = "Shipping for " + getTitle() + " " + getFirstname() + " " + getName() + ", (" + getStreet() + " " + getNum() + ", " + getCity() + " " + getPc() + ", " + getCountry() + "),\n"
           + item.toString() + delivery.toString()  + "\t TOTAL Cost: " + calc() + " EUR";
        }
        else {
            result = "Shipping for " + getTitle() + " " + getFirstname() + " " + getName() + ", (" + getNum() + ", " + getStreet() + ", " + getCity() + " " + getPc() + ", " + getCountry() + "),\n"
            + item.toString() + delivery.toString() + "\t TOTAL Cost: " + calc()+ " EUR";
        }
        return result;
        
    }

}
