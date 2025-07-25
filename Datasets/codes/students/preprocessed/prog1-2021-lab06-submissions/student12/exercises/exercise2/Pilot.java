public class Pilot extends Person
{
    private String airline;

    public Pilot(String pName, String pPP, String pAir) {
        super(pName, pPP);
        airline = pAir;
    }

    public String getAitline()
    {
        return airline;
    }

    public void setNumber(String pAir)
    {
        airline = pAir;
    }
}
