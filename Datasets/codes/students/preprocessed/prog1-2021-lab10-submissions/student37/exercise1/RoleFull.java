public class RoleFull extends Exception{
    String output;

    public RoleFull(Character character)
    {
        output="Can't add "+character.toString()+" to party: the party has reached the limit for the role "+character.getRole();
    }

    public String toString()
    {
        return output;
    }
}
