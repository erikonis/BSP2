package Exercises.exercise2;

public class Person {
    private String name;
    private String passporNumber;
    private Boolean pilot;

    public Person(String name, String passporNumber) {
        this.name = name;
        this.passporNumber = passporNumber;
        
    }
    public void setPilot(Boolean pilot)
    {
        this.pilot=pilot;
    }
    public Boolean getStatus()
    {
        return pilot;
    }

    public String getName() {
        return name;
    }

    public String getPassporNumber() {
        return passporNumber;
    }

    public void setPassporNumber(String passporNumber) {
        this.passporNumber = passporNumber;
    }

}
