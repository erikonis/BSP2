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
    public void add(Character character) {
        int roleMaxD = 0;
        int roleMaxH = 0;
        int roleMaxT = 0;
        boolean alreadyIn = false;
        for (int i = 0; i < characters.size(); i++) {
            if (characters.get(i).equals(character)) {
                System.out.println("Can't add " + character.toString() + " to party, they're already in it.");
                alreadyIn = true;
            }
        }
        if (!alreadyIn) {
            for (int i = 0; i < characters.size(); i++) {
                if (characters.get(i).getRole().equals("DAMAGE")) {
                    roleMaxD = roleMaxD + 1;
                }
                if (characters.get(i).getRole().equals("HEALER")) {
                    roleMaxT = roleMaxT + 1;
                }
                if (characters.get(i).getRole().equals("TANK")) {
                    roleMaxT = roleMaxT + 1;
                }
            }
            if (characters.size() < 4) {
                if (character.getRole().equals("DAMAGE")) {
                    if (roleMaxD < 2) {
                        characters.add(character);
                    } else {
                        System.out.println("Can't add " + character.toString()
                                + " to party: the party has reached the limit for the role DAMAGE");
                    }
                }
                if (character.getRole().equals("HEALER")) {
                    if (roleMaxH < 1) {
                        characters.add(character);
                    } else {
                        System.out.println("Can't add " + character.toString()
                                + " to party: the party has reached the limit for the role HEALER");
                    }
                }
                if (character.getRole().equals("TANK")) {
                    if (roleMaxT < 1) {
                        characters.add(character);
                    } else {
                        System.out.println("Can't add " + character.toString()
                                + " to party: the party has reached the limit for the role TANK");
                    }
                }
            } else {
                System.out.println("The party is full: no other characters can be added to it.");
            }
        }

    }
}
