import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Character> characters;
    private static final int MAX_PARTY_SIZE = 4;

    Party() {
        characters = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder characterList = new StringBuilder();
        for (Character character : characters) {
            characterList.append("- ").append(character).append("\n");
        }
        return "\nParty (" + characters.size() + " members):\n" + characterList.toString();
    }


    public void add(Character character) throws PartyFullException, InvalidRoleException, CharacterAlreadyInPartyException {
        if (characters.size() >= MAX_PARTY_SIZE) {
            throw new PartyFullException("Party is full. Cannot add more characters.");
        }

        if (characters.contains(character)) {
             throw new CharacterAlreadyInPartyException("Character " + character.getName() + " is already in this party.");
        }

        // Check for role limits
        int healerCount = 0;
        int tankCount = 0;
        int damageCount = 0;
        for (Character c : characters) {
            if (c.getRole() == CharacterRole.HEALER) {
                healerCount++;
            } else if (c.getRole() == CharacterRole.TANK) {
                tankCount++;
            } else if (c.getRole() == CharacterRole.DAMAGE) {
                damageCount++;
            }
        }

        if (character.getRole() == CharacterRole.HEALER && healerCount >= 1) {
            throw new InvalidRoleException("Party already has a Healer.");
        } else if (character.getRole() == CharacterRole.TANK && tankCount >= 1) {
            throw new InvalidRoleException("Party already has a Tank.");
        } else if (character.getRole() == CharacterRole.DAMAGE && damageCount >= 2) {
            throw new InvalidRoleException("Party already has two Damage characters.");
        }

        characters.add(character);
        System.out.println("Character " + character.getName() + " added to party.");
    }
}
