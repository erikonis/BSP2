import java.util.*;
import java.util.stream.Collectors;

public final class Party {
    private static final int MAX_MEMBERS = 4;
    private static final Map<CharacterRole, Integer> ROLE_LIMITS = Map.of(
        CharacterRole.HEALER, 1,
        CharacterRole.TANK, 1,
        CharacterRole.DAMAGE, 2
    );

    private final Set<Character> members = new LinkedHashSet<>();

    public void addMember(Character character) throws PartyException {
        validateAddition(character);
        members.add(character);
    }

    private void validateAddition(Character character) throws PartyException {
        if (members.size() >= MAX_MEMBERS) {
            throw new PartyException("Party is full (max " + MAX_MEMBERS + " members)");
        }

        if (members.contains(character)) {
            throw new PartyException("Character already in party");
        }

        long roleCount = members.stream()
            .filter(c -> c.role() == character.role())
            .count();

        int limit = ROLE_LIMITS.getOrDefault(character.role(), 0);
        if (roleCount >= limit) {
            throw new PartyException(
                "Cannot add another " + character.role() +
                " (limit: " + limit + ")"
            );
        }
    }

    public List<Character> getMembers() {
        return new ArrayList<>(members);
    }

    @Override
    public String toString() {
        if (members.isEmpty()) {
            return "Empty party";
        }
        return members.stream()
            .map(c -> c.name() + " (" + c.role() + ")")
            .collect(Collectors.joining("\n"));
    }

    public static class PartyException extends Exception {
        public PartyException(String message) {
            super(message);
        }
    }
}