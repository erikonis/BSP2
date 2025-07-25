import java.util.ArrayList;
import java.util.List;

public class Party {
    private static final int MAX_MEMBERS = 4;
    private final List<Character> members = new ArrayList<>();

    public void addCharacter(Character character) throws PartyFullException, RoleConflictException {
        if (members.contains(character)) {
            throw new IllegalArgumentException("Character is already in the party.");
        }

        if (members.size() >= MAX_MEMBERS) {
            throw new PartyFullException("The party is already full.");
        }

        long healerCount = members.stream().filter(ch -> ch.getRole() == CharacterRole.HEALER).count();
        long tankCount = members.stream().filter(ch -> ch.getRole() == CharacterRole.TANK).count();
        long damageCount = members.stream().filter(ch -> ch.getRole() == CharacterRole.DAMAGE).count();

        switch (character.getRole()) {
            case HEALER:
                if (healerCount >= 1) throw new RoleConflictException("A Healer is already in the party.");
                break;
            case TANK:
                if (tankCount >= 1) throw new RoleConflictException("A Tank is already in the party.");
                break;
            case DAMAGE:
                if (damageCount >= 2) throw new RoleConflictException("Too many Damage dealers.");
                break;
        }

        members.add(character);
    }

    public void showParty() {
        if (members.isEmpty()) {
            System.out.println("Party is empty.");
        } else {
            members.forEach(System.out::println);
        }
    }
}