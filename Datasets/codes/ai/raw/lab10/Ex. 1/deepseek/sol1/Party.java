import java.util.ArrayList;
import java.util.List;

public class Party {
    private final List<Character> members;
    private int healerCount = 0;
    private int tankCount = 0;
    private int damageCount = 0;

    public Party() {
        this.members = new ArrayList<>();
    }

    public void add(Character character) throws PartyException {
        if (members.size() >= 4) {
            throw new PartyFullException("Party is full (maximum 4 members)");
        }

        if (members.contains(character)) {
            throw new CharacterAlreadyInPartyException("Character already exists in party");
        }

        switch (character.getRole()) {
            case HEALER:
                if (healerCount >= 1) throw new InvalidPartyCompositionException("Only 1 healer allowed");
                healerCount++;
                break;
            case TANK:
                if (tankCount >= 1) throw new InvalidPartyCompositionException("Only 1 tank allowed");
                tankCount++;
                break;
            case DAMAGE:
                if (damageCount >= 2) throw new InvalidPartyCompositionException("Only 2 damage dealers allowed");
                damageCount++;
                break;
        }

        members.add(character);
    }

    public List<Character> getMembers() {
        return new ArrayList<>(members);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Party (" + members.size() + " members):\n");
        for (Character member : members) {
            sb.append("- ").append(member).append("\n");
        }
        return sb.toString();
    }
}