import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

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
    // add method
    public void add(Character character) throws IndexOutOfBoundsException, InputMismatchException {
        // as long as the size of the arraylist is smaller than 4
        // The party is empty or less then four people are in the party
        if (characters.size() < 4) {
            // define int and boolean variable
            int count = 0;
            boolean add = true;
            // go through the loop
            for (int s = 0; s < characters.size(); s++) {
                if (character.getRole() == characters.get(s).getRole()) {
                    // increase count
                    count++;
                }
                if (character.equals(characters.get(s)) && character.hashCode() == characters.get(s).hashCode()) {
                    add = false;
                }
            }
            // if count is 0 and add is true
            if (count == 0 && add) {
                characters.add(character);
            }
            // check if count is equal to 1 and add is true and getRole is equal to the
            // CharacterRole.Damage (ENUM-> see CharacterRole.java)
            // add character
            else if (count == 1 && add & character.getRole() == CharacterRole.DAMAGE) {
                characters.add(character);
            }
            // so if add is false, then throw new exception
            // output->The character is already given or already exist
            else if (!add) {
                throw new InputMismatchException("This character already exists " + character.toString());
            }
            // can not add a charcter, the role has been added to often
            else {
                throw new InputMismatchException(
                        "You can't add a character, this role has been already been used to often"
                                + character.toString());
            }

        }
        // The Party is full, so there are already 4 people in the party
        else {
            throw new IndexOutOfBoundsException("The Party is full");
        }
    }
}
