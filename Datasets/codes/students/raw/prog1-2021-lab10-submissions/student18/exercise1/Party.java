package lu.uni.programming1.lab10.exercise1;

import java.util.ArrayList;
import java.util.List;

import lu.uni.programming1.lab10.exercise1.Exceptions.InvalidPArtyComposition;
import lu.uni.programming1.lab10.exercise1.Exceptions.PartyOverload;

public class Party {
    private List<Character> characters;

    private static int idSeed = 0; //Add

    private final int[] macCompo = {2, 1 ,1}; //DPS TANK HEAL
    private int partyId; //Added

    Party() {
        characters = new ArrayList<>();
        partyId = idSeed; //Added
        idSeed += 1; //Added
    }

    public int getId() {return partyId;} //Added

    @Override
    public String toString() {
        String characterList = "";
        for (Character character : characters) {
            characterList += "- " + character + "\n";
        }
        return "\nParty (" + characters.size() + " members):\n" + characterList;
    }

    private int getIdFromRole(CharacterRole r) {
        if (r == CharacterRole.DAMAGE) {return 0;}
        else if (r == CharacterRole.TANK) {return 1;}
        else {return 2;}
    }

    public int[] getCompo() {
        int[] compo = {0,0,0};

        for(Character e : characters) {
            int rid = getIdFromRole(e.getRole());
            switch (e.getRole()) {

                case DAMAGE : {compo[rid] += 1;}
                case TANK : {compo[rid] += 1;}
                case HEALER : {compo[rid] += 1;}
            }
        }

        return compo;
    }

    // Implement the body of this method (you can also modify the method's
    // signature...)
    public void add(Character character) throws Exception {
        if (characters.size() > 3) {//Full
            throw new PartyOverload();
        } else  {
            int[] c = getCompo();

            int rid = getIdFromRole(character.getRole());

            if (c[rid] + 1 <= macCompo[rid]) {
                characters.add(character);
            } else {
                throw new InvalidPArtyComposition();
            }

        }
    }
}
