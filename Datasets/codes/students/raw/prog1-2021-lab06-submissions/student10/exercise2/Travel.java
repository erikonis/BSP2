public class Travel {
    private String number;

    private Airport departure;

    private Airport arrival;

    public Travel(String number, Airport departure, Airport arrival){
        this.number=number;
        this.departure=departure;
        this.arrival=arrival;

    }
    public String getnumber(String number){
        return number;

    }
    public Airport getdeparture(){
        return departure;

    }
    public Airport getarrival(){
        return arrival;

    }
    public void setnumber(String number){
        this.number=number;

    }
    public void setdeparture(Airport departure){
        this.departure=departure;

    }
    public void setarrival(Airport arrival){
        this.arrival=arrival;

    }

    
}
