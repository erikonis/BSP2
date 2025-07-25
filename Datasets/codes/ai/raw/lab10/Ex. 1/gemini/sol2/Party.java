import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Character> characters;
    private static final int MAX_PARTY_SIZE = 4;

    public Party() {
        this.characters = new ArrayList<>();
    }

    public List<Character> getCharacters() {
        return new ArrayList<>(characters); // Return a copy for safety
    }

    public void addCharacter(Character character) {
        if (character == null) {
            throw new IllegalArgumentException("Character to add cannot be null.");
        }
        if (characters.size() >= MAX_PARTY_SIZE) {
            throw new PartyFullException("Party is full. Cannot add more characters.");
        }
        if (characters.contains(character)) {
            throw new CharacterAlreadyInPartyException("Character is already in this party.");
        }

        int healerCount = 0;
        int tankCount = 0;
        int damageCount = 0;

        for (Character c : characters) {
            switch (c.getRole()) {
                case HEALER:
                    healerCount++;
                    break;
                case TANK:
                    tankCount++;
                    break;
                case DAMAGE:
                    damageCount++;
                    break;
            }
        }

        switch (character.getRole()) {
            case HEALER:
                if (healerCount >= 1) {
                    throw new InvalidPartyCompositionException("Party already contains a Healer.");
                }
                break;
            case TANK:
                if (tankCount >= 1) {
                    throw new InvalidPartyCompositionException("Party already contains a Tank.");
                }
                break;
            case DAMAGE:
                if (damageCount >= 2) {
                    throw new InvalidPartyCompositionException("Party already contains two Damage characters.");
                }
                break;
        }

        characters.add(character);
    }

    @Override
    public String toString() {
        if (characters.isEmpty()) {
            return "Party is empty.";
        }
        StringBuilder sb = new StringBuilder("Party Members:\n");
        for (Character character : characters) {
            sb.append("- ").append(character.toString()).append("\n");
        }
        return sb.toString();
    }
}

// Custom Exception Classes (same as before)
class PartyFullException extends RuntimeException {
    public PartyFullException(String message) {
        super(message);
    }
}

class InvalidPartyCompositionException extends RuntimeException {
    public InvalidPartyCompositionException(String message) {
        super(message);
    }
}

class CharacterAlreadyInPartyException extends RuntimeException {
    public CharacterAlreadyInPartyException(String message) {
        super(message);
    }
}