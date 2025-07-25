package exercise1;

public class Person {
private String name;
private String address;
    Person(String name, String address){
        this.name = name;
        this.address = address;}
        //constructor, followed by getters for the name and address of the recipient of a package
    public String getName() {
        return name;
    }
    // public void setName(String name) {
    //     this.name = name;
    // }
    public String getAddress() {
        return address;
    }
    // public void setAddress(String address) {
    //     this.address = address;
    // }
    
}
