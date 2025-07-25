import java.util.ArrayList;
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
    boolean equal;
    public boolean isEqual(){
        for (Character character : characters){
            equal = character.equals(character);
        }
        return equal;
    }

    int healer = 0;
    int tank = 0;
    int damage = 0;
    int num = 0;

    public void adding(Character character) {

        if (healer == 0 && character.getRole() == CharacterRole.HEALER){
            characters.add(character);
            healer++;
            num++;
            
        }
        else if (tank == 0 && character.getRole() == CharacterRole.TANK){
            characters.add(character);
            tank++;
            num++;

        }   
        else if (character.getRole() == CharacterRole.DAMAGE && damage <2){
            characters.add(character);
            damage++;
            num++;
        }
        else{
            System.out.println("Unable to add " + character.toString() + " to the party. No space left for " + character.getRole() + "'s.");
        }
    }

    public int getNum(){
        return num;
    }
}
