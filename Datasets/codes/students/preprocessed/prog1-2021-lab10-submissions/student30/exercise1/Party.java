import java.util.ArrayList;
import java.util.List;

import lu.uni.programming1.lab10.exercise1.exceptions.PartyCompleteException;
import lu.uni.programming1.lab10.exercise1.exceptions.RoleCompleteException;

public class Party {
    private List<Character> characters;

    public Party() {
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
    public void add(Character character) throws RoleCompleteException, PartyCompleteException {
        CharacterRole role = character.getRole();
        if (characters.size() < 4) {
            int found = 0;
            for (Character element : characters) {
                if (role == element.getRole()) {
                    found++;
                }
            }
            if (found == 0) {
                this.characters.add(character);
            } else if (found == 1 && role == CharacterRole.DAMAGE) {
                this.characters.add(character);
            } else {
                throw new RoleCompleteException();
            }
        } else {
            throw new PartyCompleteException();
        }
    }
}
