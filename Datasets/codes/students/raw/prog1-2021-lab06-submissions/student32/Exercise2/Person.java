package Exercise2;

public class Person {
    
    //attribues
    private String Name;
    private String passportName;
   
    //methodes
    public Person(String name, String passportName) {
        Name = name;
        this.passportName = passportName;
    }


    public String getName() {
        return Name;
    }

    public String getPassportName() {
        return passportName;
    }

    public void setPassportName(String passportName) {
        this.passportName = passportName;
    }

    
}
