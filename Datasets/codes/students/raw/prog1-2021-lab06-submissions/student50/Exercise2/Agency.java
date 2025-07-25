package Exercise2;


public class Agency {
    private String name;
    private Flight f[]= new Flight[20];
    private int flightc=0;
    

    Agency(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void addFlight(Flight f)
    {if(flightc<20)
        this.f[flightc++]=f;
    else System.out.println("Maximum number of flights permitted! Sorry");
    }

    public void passToFlight(Flight f, Passenger p)
    {f.addPassenger(p);
    }

    public void pilotToFlight(Flight f, Pilot pilot)
    {f.setPilot(pilot);
    }
    @Override
    public String toString() {
        String flights="";
        for(int i=0;i<flightc;i++) 
        flights=flights+f[i].toString()+"\n";
        return "***Agency "+name+"'s Flights: \n" + flights;
    }

    
}
