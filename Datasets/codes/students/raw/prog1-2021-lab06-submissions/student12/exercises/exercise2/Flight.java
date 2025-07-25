package exercises.exercise2;

public class Flight
{
    private String number;
    private Airport origin;
    private Airport destination;

    public Flight(String pNumber, Airport pOrigin, Airport pDestination)
    {
        number = pNumber;
        origin = pOrigin;
        destination = pDestination;
    }

    public String getNumber()
    {
        return number;
    }

    public Airport getOrigin()
    {
        return origin;
    }

    public Airport getDestination()
    {
        return destination;
    }

    public void setNumber(String pNum)
    {
        number = pNum;
    }

    public void setOrigin(Airport pOri)
    {
        origin = pOri;
    }

    public void setDestination(Airport pDes)
    {
        destination = pDes;
    }
}
