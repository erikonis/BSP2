import java.util.EnumMap;
import java.util.Map;

public record PartyComposition(
    int maxSize,
    Map<Class<? extends Role>, Integer> roleLimits
) {
    public static final PartyComposition STANDARD = new PartyComposition(
        4,
        new EnumMap<>(Map.of(
            Healer.class, 1,
            Tank.class, 1,
            DamageDealer.class, 2
        ))
    );

    public boolean canAddCharacter(Character character, List<Character> currentMembers) {
        if (currentMembers.size() >= maxSize) return false;
        
        Class<? extends Role> roleType = character.role().getClass();
        long currentCount = currentMembers.stream()
            .filter(c -> c.role().getClass() == roleType)
            .count();
            
        return currentCount < roleLimits.getOrDefault(roleType, 0);
    }
}