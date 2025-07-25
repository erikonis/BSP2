import java.util.ArrayList;
import java.util.List;
// import java.util.Scanner;

public class Party {
	private List<Character> characters;

	Party() {
		characters = new ArrayList<>();
	}

	@Override
	public String toString() {
		String characterList = "";
		for (Character character : characters) {
			characterList += "- " + character + "\n";
		}
		return "\nParty (" + characters.size() + " members):\n" + characterList;
	}

	// Implement the body of this method (you can also modify the method's
	// signature...)
	public void add(Character character) throws PartyFullException, CharacterSlotFullException, DuplicateException{
		if (characters.contains(character)){
            throw new DuplicateException(character);
        } else if (characters.size() > 3){
			throw new PartyFullException();
		}
		int matches = 0;
		for (Character i : characters){
			if(i.getClass().equals(characters.getClass())){
				matches++;
			}
		}
		if (character.getClass().equals(CharacterRole.DAMAGE.getClass()) && matches < 2){
			characters.add(character);
		} else if (character.getClass().equals(CharacterRole.DAMAGE.getClass())){
			throw new CharacterSlotFullException(character);
		} else if (matches < 1){
			characters.add(character);
		} else {
			throw new CharacterSlotFullException(character);
		}
		System.out.println("Character added: " + character);
	}

	public void newChar(String name, String roleName) throws UnknowRoleException, NameOutOfBoundsException, PartyFullException, CharacterSlotFullException, DuplicateException{
		// Scanner scanner = new Scanner(System.in);
		// String name = scanner.next();
		if (name.length()>20){throw new NameOutOfBoundsException(name);}
		CharacterRole role;
		switch (roleName) {
			case "HEALER":
				role = CharacterRole.HEALER;
				break;
			case "TANK":
				role = CharacterRole.TANK;
				break;
			case "DAMAGE":
				role = CharacterRole.DAMAGE;
				break;

			default:
				System.err.println("Unknown character role.");
				// scanner.close();
				throw new UnknowRoleException();
		}
		// scanner.close();
		this.add(new Character(name, role));
	}
}


class UnknowRoleException extends Exception{
		public UnknowRoleException(){
		// calling the constructor of parent Exception
		super();
	}
}

class NameOutOfBoundsException extends Exception{
	private String name;
	public NameOutOfBoundsException(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}
} 

class PartyFullException extends Exception{
	public PartyFullException(){
		super();
	}
}

class CharacterSlotFullException extends Exception{
	private Character character;
	public CharacterSlotFullException(Character character){
		this.character = character;
	}
	public Character getCharacter(){
		return character;
	}
}

class DuplicateException extends Exception{
	private Character character;
	public DuplicateException(Character character){
		this.character = character;
	}
	public Character getCharacter(){
		return character;
	}
}