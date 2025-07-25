public class Jump extends Action
{

    public Jump(Character c1) {
        super(c1);
        Logger.add(toArray());
    }

    public String toArray()
    {
        return super.toArray() + " jumped";
    }
    
}
