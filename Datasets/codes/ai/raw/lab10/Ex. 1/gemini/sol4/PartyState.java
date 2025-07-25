import java.util.HashMap;
import java.util.Map;

public class PartyState {
    private final Map<CharacterRole, Integer> roleCounts = new HashMap<>();
    private int characterCount = 0;

    public PartyState() {
        for (CharacterRole role : CharacterRole.values()) {
            roleCounts.put(role, 0);
        }
    }

    public PartyState(PartyState other) {
        this.roleCounts.putAll(other.roleCounts);
        this.characterCount = other.characterCount;
    }

    public int getRoleCount(CharacterRole role) {
        return roleCounts.getOrDefault(role, 0);
    }

    public int getCharacterCount() {
        return characterCount;
    }

    public PartyState incrementRoleCount(CharacterRole role) {
        PartyState newState = new PartyState(this);
        newState.roleCounts.put(role, newState.roleCounts.get(role) + 1);
        newState.characterCount++;
        return newState;
    }

    public PartyState decrementRoleCount(CharacterRole role) {
        PartyState newState = new PartyState(this);
        if (newState.roleCounts.get(role) > 0) {
            newState.roleCounts.put(role, newState.roleCounts.get(role) - 1);
            newState.characterCount--;
        }
        return newState;
    }

    public boolean canAdd(CharacterRole role) {
        return characterCount < 4 &&
               (role == CharacterRole.HEALER && roleCounts.get(role) < 1 ||
                role == CharacterRole.TANK && roleCounts.get(role) < 1 ||
                role == CharacterRole.DAMAGE && roleCounts.get(role) < 2);
    }
}