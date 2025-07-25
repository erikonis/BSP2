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
    public void add(Character character) throws IllegalCharacterException, PartyFullException {
        if (characters.size() < 4) {
            int counter = 0;
            boolean isSameCharacter = false;
            for (int i = 0; i < characters.size(); i++) {
                if (characters.get(i).getRole() == character.getRole()) {
                    counter++;
                    if (characters.get(i).equals(character) && characters.get(i).hashCode() == character.hashCode()) {
                        isSameCharacter = true;
                    }
                }
            }
            if (counter == 0) {
                characters.add(character);
            } else if (counter == 1 && character.getRole() == CharacterRole.DAMAGE && !isSameCharacter) {
                characters.add(character);
            } else {
                throw new IllegalCharacterException("Can't add this character!");
            }
        } else {
            throw new PartyFullException("This Party is already full!");
        }
    }
}
