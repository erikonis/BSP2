public class Shipping {

    String name;
    String address;

    Shipping(String name,String address){
        this.name = name;
        this.address = address;
    }




    public String firstShipping(){
        return "Shipping for Mr. Sandanassamy,(" + address + "),\n\t" 
        + "Item: " + name + ",\n\t" + "Shipping method: " +   
        ". Handling in " +  ",\n\t" + "TOTAL cost: ";
    }



}
