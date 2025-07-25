

public class Person {

    private String Name;
   private String address;
   private static Countries country;


 
 
 
 
   public Person(String name, String address,   Countries country) {
    Name = name;
    this.address = address;
    Person.country = country;
}

public String getName() {
    return Name;
}

public String getAddress() {
    return address;
}

public Countries getCountry() {
    return country;
}






}
    

