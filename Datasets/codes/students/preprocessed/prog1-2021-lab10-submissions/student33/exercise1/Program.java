
import java.util.Scanner;

public class Program {

    Scanner scanner;

    boolean running;

    Party first;
    Party second;
    
    public Program(Scanner scanner) {
        running = true;
        first = new Party();
        second = new Party();
        this.scanner=scanner;
        
    }

    private void MainMenu() throws InvalidInput, InvalidCharacterNameException {
    
        System.out.println("0 : Exit" + "\n" + "1 : Create new character" + "\n" + "2 : Show party");
        
        String input = "";
        while (input == "") {input = scanner.nextLine();}

    if (input.matches("[0-9]+")) {
    
        switch (input) {
            case "0" : System.out.println("Exiting !");
            running = false;
            break;
            case "1" : CreateCharacter();
            break;
            case "2" : ShowParty();
            break;
            default : throw new InvalidInput("Invalid input ! 0 or 1 or 2 expected.");
            
        }
    }
    else {throw new InvalidInput("Invalid type ! Expected an integer value !");}
        
    }

    private void CreateCharacter() throws InvalidInput, InvalidCharacterNameException {

        int choice = 0;

        System.out.println("Creating new character...");
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        if (name.length()>20) {
            throw new InvalidCharacterNameException("Name too long ! Max 20 characters.");
        }

        if (name.isEmpty()) {
            throw new InvalidCharacterNameException("Name empty !");
        }

        
        
        System.out.println("Enter Role (DAMAGE, TANK, HEALER):");
        String rolestring = scanner.next().toUpperCase();
        
        if (!rolestring.matches("DAMAGE") && !rolestring.matches("TANK") && !rolestring.matches("HEALER")) {
            throw new InvalidInput("Invalid Character role !");
        }
        CharacterRole role = CharacterRole.valueOf(rolestring);
        System.out.println("Add to party (0 or 1):");
        
        String choicestring = scanner.next();
        scanner.nextLine();

        if (choicestring.matches("[0-9]+")) {

            try { choice = Integer.parseInt(choicestring);}
            catch (NumberFormatException n) {}

            

            switch (choice) {
            case 0 : try {first.Add(new Character(name, role, choice));}
                     catch (FullPartyException a) {
                         throw new InvalidInput("This party is already full !");}
                     catch (DuplicateException b) {
                        throw new InvalidInput("This character is already in this party !");
                     }
                     catch (PartyCompositionException c) {
                        throw new InvalidInput("This party has reached the limit for this role !");
                     }
            break;
            case 1 : try {second.Add(new Character(name, role, choice));}
                    catch (FullPartyException a) {
                        throw new InvalidInput("This party is already full !");}
                    catch (DuplicateException b) {
                        throw new InvalidInput("This character is already in this party !");
                     }
                    catch (PartyCompositionException c) {
                        throw new InvalidInput("This party has reached the limit for this role !");
                     }
                    
            break;
            default : throw new InvalidInput("Invalid input ! 0 or 1 expected.");

            }
        }
        else {throw new InvalidInput("Invalid type ! Expected an integer value !");}

    }

    private void ShowParty() throws InvalidInput {
        
        System.out.println("Choose party to view: (0 or 1)");
        String input = "";
        while (input == "") {input = scanner.nextLine();}

        if (input.matches("[0-9]+")) {
        
          switch (input) {
            case "0" : System.out.println(first.toString());
            break;
            case "1" : System.out.println(second.toString());
            break;
            default : throw new InvalidInput("Invalid input ! 0 or 1 expected.");
            }
        }
        else {throw new InvalidInput("Invalid type ! Expected an integer value !");}
           
    }

    public void Run() {
            
           while (running) {
               try { 
                   MainMenu();
                } catch (InvalidInput n) {System.err.println(n.getMessage());}
                catch (InvalidCharacterNameException o) {System.err.println(o.getMessage());}

           }
            
    }

}
