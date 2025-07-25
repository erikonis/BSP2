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

    public List<Character> getCharacters() {
        return characters;
    }

    public boolean fullRole(CharacterRole role) {
        if (role == CharacterRole.HEALER || role == CharacterRole.TANK) {

            int count = 0;

            for (Character partyCharacter : characters) {
                if (partyCharacter.getRole() == role) {
                    count++;
                }
            }

            if (count == 0) {
                return false;
            }
        }
        else {
            int count = 0;

            for (Character partyCharacter : characters) {
                if (partyCharacter.getRole() == role) {
                    count++;
                }
            }

            if (count < 2) {
                return false;
            }
        }

        return true;
    }

    // Implement the body of this method (you can also modify the method's
    // signature...)
    public void add(Character character) throws FullRoleException, AlreadyInException, FullPartyException {
        if (characters.size() < 4) {
            if (!fullRole(character.getRole())) {

                if (!characters.contains(character))
                    characters.add(character);
                else {
                    throw new AlreadyInException(character);
                }

            } else {
                throw new FullRoleException(character);
            }
        } else {
            throw new FullPartyException();
        }
    }    
}
