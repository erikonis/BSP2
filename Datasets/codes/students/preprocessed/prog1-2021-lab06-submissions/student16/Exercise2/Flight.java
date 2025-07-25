public class Flight {
    
    private String number;
    private Airport origin,
    destination;

    private Person[] list;
    private int counter;

    private Pilot pilot;
    private Pilot copilot;
    
    public Flight(String number, Airport origin, Airport destination, int size, Pilot p, Pilot c) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;

        this.counter = 0;

        list= new Person[size]; 

        this.pilot=p;
        this.copilot=c;

    }

    public boolean add(Passenger p)
    {
        if(counter<list.length)
        {
            list[counter] = p;
            counter++;
            return true;
        }
        return false;
    }

    public void printParticipants()
    {
        System.out.println(pilot);
        System.out.println(copilot);
        for(int i=0; i<counter; i++)
        {
            System.out.println(list[i]);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Airport getOrigin() {
        return origin;
    }

    public void setOrigin(Airport origin) {
        this.origin = origin;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        String result = "";
        for(int i=0; i< counter-1; i++)
        {
            result += list[i].getName() + ",";
        }
        result += list[counter-1].getName();
        return "Flightnumber: " + number + " --> Pilot:[" + pilot + "]; Copilot:[" + copilot + "]; [List of passengers=" + result + "]; [Number of passengers in flight=" + counter + "]";
    }

    
}
