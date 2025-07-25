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

    public void add(Character character) {

        boolean available = true;
        if(characters.size() == 4)
        {
            System.out.println("Party is already full.");
            available = false;
        }
        else
        {
            for (int i = 0; i<characters.size() && available; i++)
            {
                if (characters.get(i).hashCode() == character.hashCode())
                {
                    System.out.println("This character is already in this party.");
                    available = false;
                } 
            }
        }
        if (available)
        {
            for (int i = 0; i<characters.size() && available; i++)
            {
                switch (character.getRole())
                {
                    case HEALER :
                    {
                        if (characters.get(i).getRole() == CharacterRole.HEALER)
                        {
                            System.out.println("This Party already contains a Healer.");
                            available = false;
                        }
                    }
                    break;
                    case TANK :
                    {
                        if (characters.get(i).getRole() == CharacterRole.TANK)
                        {
                            System.out.println("This Party already contains a Tank.");
                            available = false;
                        }
                    }
                    break;
                    case DAMAGE : 
                    {
                        int counter = 0;
                        if (characters.get(i).getRole() == CharacterRole.DAMAGE)
                        {
                            ++counter;
                        }
                        if (counter == 2)
                        {
                            System.out.println("This Party already contains 2 Damagers.");
                            available = false;
                        }
                    }
                    break;
                }
            }
        }
        if (available)
        {
            characters.add(character);
            System.out.println("Added " + character.getName() + " to the party.");
        }
    }
}
