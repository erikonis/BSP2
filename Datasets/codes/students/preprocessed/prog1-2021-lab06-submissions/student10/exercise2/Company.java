public class Company {
    String airline;

    Company(String name, String passportNO, String airline){
        super(name, passportNO);

        this.airline=airline;

    }
    public String getairline(){
        return airline;

    }
    public void setairline(String airline){
        this.airline=airline;
        
    }
}
