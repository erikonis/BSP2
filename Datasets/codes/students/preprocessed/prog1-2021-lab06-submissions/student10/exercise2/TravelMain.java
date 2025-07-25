public class TravelMain {
    static Airport airport=new Airport("Paris","France","FRA");

    static Airport airport2=new Airport("Chennai","India","IND");

    static Travel flight=new Airport("JS2911", airport2, airport);

    public static void main(String[] args) {
        flight.setdeparture(airport2);
        flight.setarrival(airport);
        flight.setnumber("JS2911");

        System.out.println("Departure: "+ airport2.getcity()+ "\n"+
                "Country: " + airport2.getcountry()+ "\n"+
                "Airport Code: "+ airport2.getairportCode()+ "\n");

        System.out.println("Arrival: "+ airport.getcity()+ "\n"+
                "Country: " + airport.getcountry()+ "\n"+
                "Airport Code: "+ airport.getairportCode()+ "\n");
        
        System.out.println("Departure: "+ flight.setdeparture()+ "\n"+
                "Destination: " + flight.setarrival()+ "\n"+
                "Flight number "+ flight.setnumber("JS2911")+ "\n");        

    }
        
}    
    

