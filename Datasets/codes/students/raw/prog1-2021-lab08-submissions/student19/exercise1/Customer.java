package exercise1;

public class Customer {
    String name;
    String item;
    int housenumber;
    String adress;
    String city;
    int plz;
    Shipping shipping;
    Countries countries;
    String gender;



 
public Customer(String name, String item, int housenumber, String adress, String city, int plz, String gender, Shipping shipping, Countries countries){
    this.name = name;
    this.item = item;
    this.housenumber = housenumber;
    this.adress = adress;
    this.city = city;
    this.plz = plz;
    this.gender = gender;
    this.shipping = shipping;
    this.countries = countries;
}
 public double getTotal() {
     double total = shipping.getPrice() +  countries.getPrice();
     return total;
 }
 public String getGender() {
     if(gender.equals("Male")){
        return "Mr.";
     }
     else{
        return "Mrs.";
     }
 }

 public void printReceipt() {
    System.out.println("Shipping for " + getGender() + " " + name + ", (" + housenumber + ", " + adress + ", " + plz + ", " + city + ", " + countries );
    System.out.println("\t Item: " + item);
    System.out.println("\t Shipping method: " + shipping  + "[" + shipping.getPrice() + "]. Handling in " + shipping.getDays() + " day,");
    System.out.println("\t TOTAL cost: " + getTotal() + " EUR");
 }

}
