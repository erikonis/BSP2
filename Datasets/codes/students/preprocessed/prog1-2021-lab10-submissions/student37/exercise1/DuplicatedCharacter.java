/**
 * DuplicatedCharacter
 */
public class DuplicatedCharacter extends Exception{

    String output;

    public DuplicatedCharacter(Character character)
    {
        output = "Can't add "+character.toString()+" to party, they're already in it.";
    }

    public String toString()
    {
        return output;
    }
}