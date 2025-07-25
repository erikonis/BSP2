public class PartyFull extends Exception{
    String output;

    public PartyFull()
    {
        output="The party is full: no other characters can be added to it.";
    }

    public String toString()
    {
        return output;
    }
}
