import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Character> characters;
    private boolean hlr, tnk, atk;
    private int catk, c;

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
        CheckParty();
        if (characters.size()<4){
        switch(character.getRole()){
            case DAMAGE:
            if(atk == false){
                characters.add(character);}
            if(atk == true){
                System.out.println("Cannot add "+character.getName()+" to party.");
                System.out.println("Party already contains 2 Attacker Role members.");
            }
            case TANK:
            if(tnk == false){
                characters.add(character);}
            if(tnk == true){
                System.out.println("Cannot add "+character.getName()+" to party.");
                System.out.println("Party already contains Tank Role member");
            }
            case HEALER:
            if(hlr == false){
                characters.add(character);}
            if(hlr == true){
                System.out.println("Cannot add "+character.getName()+" to party.");
                System.out.println("Party already contains Healer Role member.");
            }
        }}
        if (characters.size()>= 4){
            System.out.println("Cannot add "+character.getName()+" to party.");
            System.out.println("Party is full!");
        }
    }

    private void CheckParty(){
        c = 0;
        hlr = false;
        atk = false;
        tnk = false;
        catk = 0;
        while(c < characters.size()){
            switch(characters.get(c).getRole()){
                case DAMAGE:
                catk = catk+1;
                if (catk == 2){
                    atk = true;}
                break;
                case HEALER:
                hlr = true;
                break;
                case TANK:
                tnk = true;}
            
        }
    }
}
