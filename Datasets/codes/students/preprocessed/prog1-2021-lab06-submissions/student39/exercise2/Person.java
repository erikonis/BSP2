public class Person {
    private String name = "unknown", passportNumber;
    Person(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;}
        //sets up variables for a person and their getters
    public String getName() {
        return name;
    }


    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
    
}
