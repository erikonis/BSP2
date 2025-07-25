import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Character> characters;
    int healerclass = 0;
    int tankclass = 0;
    int damageclass = 0;
    int amount = 0;

    
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
    public void add(Character character) {
        if (healerclass == 0 && character.getRole() == CharacterRole.HEALER){
            characters.add(character);
            healerclass++;
            amount++;
        }

        else if (tankclass == 0 && character.getRole() == CharacterRole.TANK){
            characters.add(character);
            tankclass++;
            amount++;
        }   
        
        else if (character.getRole() == CharacterRole.DAMAGE && damageclass < 2){
            characters.add(character);
            damageclass++;
            amount++;
        }

        else{
            System.out.println("Can't add " + character.toString() + " to party: the party has reached the limit for the role " + character.getRole());
        }

        }
        public int getNum(){
            return amount;
        }
    }
