import java.util.*;

public class Party {
    private Map<CharacterRole, List<Character>> characters = new HashMap<>();

    public Party() {
        characters.put(CharacterRole.HEALER, new ArrayList<>());
        characters.put(CharacterRole.TANK, new ArrayList<>());
        characters.put(CharacterRole.DAMAGE, new ArrayList<>());
    }

    public void add(Character character) throws Exception {
        List<Character> roleList = characters.get(character.getRole());

        if (roleList.size() >= (character.getRole() == CharacterRole.DAMAGE ? 2 : 1)) {
            throw new RoleAlreadyExistsException("Party already has enough " + character.getRole() + " characters.");
        }

        if (characters.values().stream().flatMap(List::stream).count() >= 4) {
            throw new PartyFullException("Party is already full.");
        }

        if (roleList.contains(character)) {
            throw new CharacterAlreadyInPartyException("Character is already in the party.");
        }

        roleList.add(character);
    }

    public void printParty() {
        characters.values().stream().flatMap(List::stream).forEach(System.out::println);
    }
}
