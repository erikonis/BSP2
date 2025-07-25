import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Party {
    private final PartyComposition composition;
    private final List<Character> members;

    private Party(PartyComposition composition, List<Character> members) {
        this.composition = composition;
        this.members = new ArrayList<>(members);
    }

    public static Party createStandardParty() {
        return new Party(PartyComposition.STANDARD, List.of());
    }

    public Result<Party, String> addCharacter(Character character) {
        if (members.contains(character)) {
            return Result.failure("Character already in party");
        }

        if (!composition.canAddCharacter(character, members)) {
            return Result.failure("Cannot add another " + character.role().displayName());
        }

        List<Character> newMembers = new ArrayList<>(members);
        newMembers.add(character);
        return Result.success(new Party(composition, newMembers));
    }

    public List<Character> members() {
        return Collections.unmodifiableList(members);
    }

    @Override
    public String toString() {
        return members.isEmpty() 
            ? "Empty party" 
            : String.join("\n", members.stream().map(Character::toString).toList());
    }
}