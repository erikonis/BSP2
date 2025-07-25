public class Pilot extends Person{
    private String airline;
    // private Flight []arrflights;
    private Flight []finflights;
    // private Flight sflight;
    private int l, c1, c2, c3,c4,c5,l1;
    private boolean onall;
    Pilot(String name, String passportNumber, String airline, Flight...arrflights) {
        super(name, passportNumber);
        this.airline = airline;
        // this.arrflights =arrflights;
        onall=true;
        l = arrflights.length;
        // near identical setup to passenger, but sets up the name of the airline they work for instead of a loyalty card number

        // the checking for the consecutive list of flights is nearly identical to the one for a passenger, with a few key differences
        if (l>1){
            c1 = -1;
            c2 = 0;
                do{
                    c2++;
                    c1++;
                    if (arrflights[c1].getDestination()!=arrflights[c2].getOrigin()){
                        // sflight = arrflights[0];
                        // sflight.setPilot(this);
                        onall = false;}
                    }while((c2<l-1)&&(onall==true));
            if (onall==true){
                c3=0;
                c4=0;
                while (c3<l){
                    arrflights[c3].setPilot(this);
                    //first notable difference is that here the pilot gets set for all the flights if one always ends where the next begins
                    c3++;}
                    finflights = new Flight[l];
                while(c4<l){
                    finflights [c4] = arrflights[c4];
                    c4++;
                }}
            if (onall==false){
                c3=0;
                finflights = new Flight[c2];
                while (c3<c2){
                    finflights[c3]= arrflights[c3];
                    finflights[c3].setPilot(this);
                    //and if the check doesn't work, the pilot is set for all the flights up to the point where the check fails
                    c3++;}}}
                else{finflights = new Flight[1];
                        finflights[0]=arrflights[0];}}

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }
    
    public Flight[] getpilFlight(){
        return finflights;
    }
    //setters and getters for some of the variables

    public String getpilFlights(){
        l1=finflights.length;
        c5=0;
        System.out.println(" ");
        System.out.println("List of Flights:");
        while (c5<l1){
            System.out.print(finflights[c5].getNumber());
            System.out.print(", ");
            c5++;
        }
    return " ";}
    //printer for the values identical to the one in passengers
}
