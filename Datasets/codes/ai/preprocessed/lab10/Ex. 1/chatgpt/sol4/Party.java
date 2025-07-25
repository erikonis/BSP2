import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Character> characters;

    public Party() {
        characters = new ArrayList<>();
    }

    public void add(Character character) throws PartyFullException, RoleLimitExceededException, DuplicateCharacterException {
        if (characters.contains(character)) {
            throw new DuplicateCharacterException("This character is already in the party.");
        }

        if (characters.size() >= 4) {
            throw new PartyFullException("Party is already full.");
        }

        long roleCount = characters.stream().filter(c -> c.getRole() == character.getRole()).count();

        switch (character.getRole()) {
            case DAMAGE:
                if (roleCount >= 2)
                    throw new RoleLimitExceededException("Only 2 DAMAGE characters allowed.");
                break;
            case HEALER:
            case TANK:
                if (roleCount >= 1)
                    throw new RoleLimitExceededException("Only 1 " + character.getRole() + " allowed.");
                break;
        }

        characters.add(character);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Party (").append(characters.size()).append(" members):\n");
        for (Character c : characters) {
            sb.append("- ").append(c).append("\n");
        }
        return sb.toString();
    }
}