package lu.uni.programming1.lab6.exercise2;

public class Pilot extends Person{

    private String airline;
	
	public Pilot(String name_, String passportNumber_, String airline_) {
        super(name_, passportNumber_);
        this.airline = airline_;
	}


    public String getairline() {
        return airline;
    }

    public void setairline(String airline_) {
        this.airline = airline_;
    }


    @Override
    public String toString() {
        return "Pilot [airline=" + airline + "]";
    }

    
    
}
