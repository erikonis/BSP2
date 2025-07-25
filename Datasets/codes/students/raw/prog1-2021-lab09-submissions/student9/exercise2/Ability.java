package lu.uni.programming1.lab9.exercise2;

public class Ability extends Action
{
    private String ability;

    public Ability(Character c1, String pAbility) {
        super(c1);
        ability = pAbility;
        Logger.add(toArray());
    }

    public String getAbility()
    {
        return ability;
    }
    
    public String toArray()
    {
        return super.toArray() + ", Ability: " + getAbility();
    }
}
