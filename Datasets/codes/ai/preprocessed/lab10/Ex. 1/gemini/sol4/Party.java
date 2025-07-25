import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Character> characters;
    private PartyState state;

    public Party() {
        this.characters = new ArrayList<>();
        this.state = new PartyState();
    }

    public List<Character> getCharacters() {
        return new ArrayList<>(characters); // Return a copy for safety
    }

    public void addCharacter(Character character) {
        if (character == null) {
            throw new IllegalArgumentException("Character to add cannot be null.");
        }
        if (characters.contains(character)) {
            throw new CharacterAlreadyInPartyException("Character is already in this party.");
        }
        if (!state.canAdd(character.getRole())) {
            String errorMessage;
            switch (character.getRole()) {
                case HEALER:
                    errorMessage = "Party already has the maximum allowed Healer (1).";
                    break;
                case TANK:
                    errorMessage = "Party already has the maximum allowed Tank (1).";
                    break;
                case DAMAGE:
                    errorMessage = "Party already has the maximum allowed Damage characters (2).";
                    break;
                default:
                    errorMessage = "Cannot add character due to party composition rules.";
                    break;
            }
            if (state.getCharacterCount() >= 4) {
                throw new PartyFullException("Party is full. Cannot add more characters.");
            }
            throw new InvalidPartyCompositionException(errorMessage);
        }

        characters.add(character);
        state = state.incrementRoleCount(character.getRole());
    }

    public void removeCharacter(Character character) {
        if (character == null) {
            throw new IllegalArgumentException("Character to remove cannot be null.");
        }
        if (!characters.contains(character)) {
            throw new IllegalArgumentException("Character is not in this party.");
        }
        characters.remove(character);
        state = state.decrementRoleCount(character.getRole());
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