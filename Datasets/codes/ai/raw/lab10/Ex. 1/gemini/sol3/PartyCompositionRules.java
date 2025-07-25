import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PartyCompositionRules {
    private final Map<CharacterRole, Integer> maxAllowed;

    public PartyCompositionRules() {
        maxAllowed = Map.of(
                CharacterRole.HEALER, 1,
                CharacterRole.TANK, 1,
                CharacterRole.DAMAGE, 2
        );
    }

    public boolean canAdd(List<Character> currentParty, Character newCharacter) {
        Map<CharacterRole, Long> currentRoleCounts = currentParty.stream()
                .collect(Collectors.groupingBy(Character::getRole, Collectors.counting()));

        CharacterRole newRole = newCharacter.getRole();
        long currentCount = currentRoleCounts.getOrDefault(newRole, 0L);

        return maxAllowed.containsKey(newRole) && currentCount < maxAllowed.get(newRole);
    }

    public int getMaxAllowed(CharacterRole role) {
        return maxAllowed.getOrDefault(role, 0);
    }
}