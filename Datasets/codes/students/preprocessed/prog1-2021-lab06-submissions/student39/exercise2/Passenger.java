public class Passenger extends Person{
    private String loyaltyCardNumber;
    // private Flight[] arrflights;
    private Flight[] finflights;
    private boolean onall;
    private int l, c1, c2, c3, c4, c5, l1;
    Passenger(String name, String passportNumber, String loyaltyCardNumber, Flight... arrflights) {
        super(name, passportNumber);
        this.loyaltyCardNumber=loyaltyCardNumber;
        // this.arrflights = arrflights;
        onall=true;
        l = arrflights.length;
        //extending person, passenger adds a loyalty card number and an array of flights
        //and now a long and complicated way to check if the series of flights allows the passenger to even take them all,
        // by comparing the destination of one flight with the origin of the next
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
                    }while((c2<l)&&(onall==true));
                    //loop comparing the destination of one flight with the origin of the next
                //if the all the origins and destinations line up:
            if (onall==true){
                c3=0;
                c4=0;
                // while (c3<l){
                //     arrflights[c3].setPilot(this);
                //     c3++;}
                    finflights = new Flight[l];
                while(c4<l){
                    finflights [c4] = arrflights[c4];
                    c4++;}}
                    //makes a copy of the array of flights to be used later
            else{
                c3=0;
                finflights = new Flight[c2];
                while (c3<c2){
                    finflights[c3]= arrflights[c3];
                    // finflights[c3].setPilot(this);
                    c3++;}}}
                    //if that's not the case, the loop checking it earler got cut off when it didn't add up
                    //then the flights up to that point will be copied into a perfectly sized array
                    else{finflights = new Flight[1];
                        finflights[0]=arrflights[0];}
                        //and if only one flight is input, it simply puts that one flight into an array that can only hold one value
                    
                }
    public String getLoyaltyCardNumber() {
        return loyaltyCardNumber;}

        public Flight[] getFlights(){
            return finflights;
        }
        //getters for the appropriate values
    public String getpasFlight(){
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
    //this prints out the list of flights the passenger is on, unfortunatlely this means that there's no way to list the passengers on a given flight
    
}
