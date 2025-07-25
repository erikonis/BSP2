package lu.uni.programming1.lab10.exercise1;

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
        if(characters.size() <4)
        {
            boolean exists = false;
            int counter =0;

            for (int i = 0; i < characters.size(); i++)
            {
                if(character.getRole() == characters.get(i).getRole())
                {
                    counter++;
                }

                if(characters.get(i).equals(character)
                && characters.get(i).hashCode() == character.hashCode())
                {
                    exists = true;
                }
            }

            if(counter == 0 && !exists)
            {
                characters.add(character);
            }
            else if(counter == 1
            && character.getRole() == CharacterRole.DAMAGE
            && !exists)
            {
                characters.add(character);
            }
            else if(exists)
            {
                throw new ExistingCharacterArgument("Can't add " + character.toString() + " to party, they're already in it.");
            }
            else
            {
                throw new Exception("Can't add " + character.toString() + " to party: the party has reached the limit for the role " + character.getRole());
            }
        }
        else
        {
            throw new IndexOutOfBoundsException("The party is full: no other characters can be added to it.");
        }
    }
}
