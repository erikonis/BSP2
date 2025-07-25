package lu.uni.programming1.lab10.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Character> characters;

    Party() {
        characters = new ArrayList<>(4);
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
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
    public void add(Character character) throws ExceptionRoleExist, PartyFullException {
        int limitDamage = 0;

        if (characters.size() == 4) {
            throw new PartyFullException();
        }
        for (Character person : characters) {

            if (person.getRole()==CharacterRole.TANK && character.getRole()==CharacterRole.TANK) {
                throw new ExceptionRoleExist();
            }
            if (person.getRole()==(CharacterRole.HEALER) && character.getRole()==CharacterRole.HEALER) {
                throw new ExceptionRoleExist();
            }
            if (person.getRole()==(CharacterRole.DAMAGE) && character.getRole()==CharacterRole.DAMAGE) {
                limitDamage++;
                if (limitDamage >= 2 && character.getRole() == CharacterRole.DAMAGE) {
                    throw new ExceptionRoleExist();
                }
            }
            
        }
        characters.add(character);
            
    }
}
