package lu.uni.programming1.lab10.exercise1;

import java.rmi.NotBoundException;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) throws PartyNotRecognizedException {

        Party tatoineParty = new Party();
        Party deathStarParty = new Party();

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        int answer = 0;
        int answerShow = 0;
        int answerParty = 0;

        do {
            try {
                System.out.println("\nCommands:\n0 - Exit\n1 - Create new character\n2 - Show party");
                answer = input.nextInt();
                if ((answer != 0)&&(answer != 1)&&(answer != 2)) {
                    throw new NotBoundException();
                }
            } catch (NotBoundException e) {
                System.out.println("\nCommand: this is not a command id\nWrong value type for this field.");
            }

            if (answer == 1) {
                System.out.println("\nCommand: 1\nCreating new character...\nEnter name :");
                String answerName = input.next();
                System.out.println("Enter role (DAMAGE, TANK, HEALER): ");
                String answerRole = input.next();
                Character p = null;

                System.out.println("Add to party (0 or 1): ");
                answerParty = input.nextInt();

                try {
                    p = new Character(answerName, answerRole);
                    if (answerParty == 0) {
                        tatoineParty.add(p);
                        System.out
                                .println("Added " + answerName + " (" + p.getRole() + ") to party 0 'Tatoine Party'.");
                    } else if (answerParty == 1) {
                        deathStarParty.add(p);
                        System.out.println(
                                "Added " + answerName + " (" + p.getRole() + ") to party 1 'DeathStar Party'.");
                    } 
                    
                } catch (NameEmptyException e) {
                    System.out.println("Invalid character name (name can't be empty): " + answerName);
                } catch (NameTooLongException e) {
                    System.out.println("Invalid character name (name is too long - max 20 characters):" + answerName);
                } catch (NameEqualityException e){
                    System.out.println("Can't add "+ p.getName() + " (" + p.getRole()
                    + ") to party, they're already in it.");
                } catch (UnknownRole e) {
                    System.out.println("Unknown character role.");
                } catch (Exception e) {
                    System.out.println("Can't add " + p.getName() + " (" + p.getRole()
                            + ") to party: the party has reached the limit for the role " + p.getRole());
                }

            }else if (answer == 2) {
                    System.out.println("Show party (0 or 1) :");
                    answerShow = input.nextInt();

                try {
                    if (answerShow == 0) {
                        System.out.println(tatoineParty);
                    } else if (answerShow == 1) {
                        System.out.println(deathStarParty);
                    } else if ((answerShow !=1)||(answerParty!=0)){
                        throw new PartyNotRecognizedException();
                    }
                } catch (PartyNotRecognizedException e) {
                    System.out.println("Unexpected index: Index "+answerShow+" out of bounds for length "+ (answerShow-1));
                }  
            }
        } while (answer != 0);
        System.out.println("Exiting !");

        input.close();
    }
}
