public class Person {
    String name;

    String passportNO;

    Person(String name, String passportNO){
        this.name=name;
        this.passportNO=passportNO;

    }
    public String getname(){
        return name;

    }
    public String getpassportNO(){
        return passportNO;

    }
    public void setpassportNO(String passportNO){
        this.passportNO=passportNO;
        
    }
}
