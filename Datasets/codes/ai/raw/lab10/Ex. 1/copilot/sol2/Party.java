import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Character> characters;

    Party() {
        characters = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder characterList = new StringBuilder();
        for (Character character : characters) {
            characterList.append("- ").append(character).append("\n");
        }
        return "\nParty (" + characters.size() + " members):\n" + characterList;
    }

    public void add(Character character) throws PartyFullException, RoleAlreadyExistsException, CharacterAlreadyInPartyException {
        if (characters.size() >= 4) {
            throw new PartyFullException("Party is already full.");
        }

        for (Character c : characters) {
            if (c.equals(character)) {
                throw new CharacterAlreadyInPartyException("Character is already in the party.");
            }
        }

        long healerCount = characters.stream().filter(c -> c.getRole() == CharacterRole.HEALER).count();
        long tankCount = characters.stream().filter(c -> c.getRole() == CharacterRole.TANK).count();
        long damageCount = characters.stream().filter(c -> c.getRole() == CharacterRole.DAMAGE).count();

        switch (character.getRole()) {
            case HEALER:
                if (healerCount >= 1) {
                    throw new RoleAlreadyExistsException("Party already has a Healer.");
                }
                break;
            case TANK:
                if (tankCount >= 1) {
                    throw new RoleAlreadyExistsException("Party already has a Tank.");
                }
                break;
            case DAMAGE:
                if (damageCount >= 2) {
                    throw new RoleAlreadyExistsException("Party already has enough Damage characters.");
                }
                break;
        }

        characters.add(character);
    }
}
