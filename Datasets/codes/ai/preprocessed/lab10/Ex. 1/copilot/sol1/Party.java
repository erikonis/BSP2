import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Character> characters;

    public Party() {
        characters = new ArrayList<>();
    }

    public void add(Character character) throws PartyFullException, InvalidRoleException, CharacterAlreadyInPartyException {
        if (characters.size() >= 4) {
            throw new PartyFullException("Party is already full.");
        }

        long healerCount = characters.stream().filter(c -> c.getRole() == CharacterRole.HEALER).count();
        long tankCount = characters.stream().filter(c -> c.getRole() == CharacterRole.TANK).count();
        long damageCount = characters.stream().filter(c -> c.getRole() == CharacterRole.DAMAGE).count();

        switch (character.getRole()) {
            case HEALER:
                if (healerCount >= 1) {
                    throw new InvalidRoleException("Party already has a Healer.");
                }
                break;
            case TANK:
                if (tankCount >= 1) {
                    throw new InvalidRoleException("Party already has a Tank.");
                }
                break;
            case DAMAGE:
                if (damageCount >= 2) {
                    throw new InvalidRoleException("Party already has enough Damage characters.");
                }
                break;
        }

        if (characters.contains(character)) {
            throw new CharacterAlreadyInPartyException("Character is already in the party.");
        }

        characters.add(character);
    }

    @Override
    public String toString() {
        StringBuilder characterList = new StringBuilder();
        for (Character character : characters) {
            characterList.append("- ").append(character).append("\n");
        }
        return "\nParty (" + characters.size() + " members):\n" + characterList;
    }
}