import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Character> characters;

    Party() {
        characters = new ArrayList<>();
    }

    @Override
    public String toString() {
        String characterList = "";
        for (Character character : characters) {
            characterList += "- " + character + "\n";
        }
        return "\nParty (" + characters.size() + " members):\n" + characterList;
    }

    // Implement the body of this method (you can also modify the method's
    // signature...)
    public void add(Character character) throws Exception
    {

        if(characters.size() == 4)
        {
            throw new IllegalArgumentException("The party is full: no other characters can be added to it.");
        }
        if(characters.contains(character))
        {
            throw new IllegalArgumentException("Can't add " + character.toString() + " to party, they're already in it.");
        }

        int counter=0;
        for(int i=0; i< characters.size(); i++)
        {
            if(characters.get(i).getRole() == character.getRole())
            {
                counter++;
            }
        }

        if(character.getRole() == CharacterRole.HEALER && counter == 1)
        {
            throw new IllegalArgumentException("Can't add " + character.toString() + " to party: the party has reached the limit for the role HEALER");
        }
        else if(character.getRole() == CharacterRole.TANK && counter == 1)
        {
            throw new IllegalArgumentException("Can't add " + character.toString() + " to party: the party has reached the limit for the role TANK");
        }
        else if(character.getRole() == CharacterRole.DAMAGE && counter == 2)
        {
            throw new IllegalArgumentException("Can't add " + character.toString() + " to party: the party has reached the limit for the role DAMAGE");
        }
        else
        {
            characters.add(character);
        }
        
    }
}
