package finalfantasy_alt;

import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Character> members = new ArrayList<>();
    private int damageCount = 0, tankCount = 0, healerCount = 0;

    public void add(Character character) throws PartyFullException, InvalidRoleException, DuplicateCharacterException {
        if (members.contains(character)) {
            throw new DuplicateCharacterException("Character is already in the party.");
        }
        if (members.size() >= 4) {
            throw new PartyFullException("Party is already full.");
        }

        switch (character.getRole()) {
            case DAMAGE:
                if (damageCount >= 2) throw new InvalidRoleException("Too many damage characters.");
                damageCount++;
                break;
            case TANK:
                if (tankCount >= 1) throw new InvalidRoleException("Party already has a tank.");
                tankCount++;
                break;
            case HEALER:
                if (healerCount >= 1) throw new InvalidRoleException("Party already has a healer.");
                healerCount++;
                break;
        }
        members.add(character);
    }

    public void printParty() {
        if (members.isEmpty()) {
            System.out.println("Party is empty.");
            return;
        }
        members.forEach(System.out::println);
    }
}