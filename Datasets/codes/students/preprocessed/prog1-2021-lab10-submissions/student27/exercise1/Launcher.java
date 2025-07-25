import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) throws ContainsRoleException, InvalidCharacterNameException, WrongTypeException {
        // Implement the main program here, i.e. this is where you will read the various
        // inputs from the user.
        // Remember: your program should run forever, i.e. constantly expect input from
        // the user, until they explicitly enter '0' to exit the program.

        Party p0 = new Party();
        Party p1 = new Party();
        
        Scanner scanner = new Scanner(System.in);
        int command = -1; 
        boolean condition = true;
        Character c = null;
        String name = "";
        while(condition!= false){
            try {
                System.out.println("Command: \n0 - Exit \n1 - Create new character \n2 - Show party");
                if(scanner.hasNextInt()){
                    command = scanner.nextInt();
                }
                else{
                    scanner.next();
                    throw new WrongTypeException();
                }
               
                switch(command){
                    case 0 -> {
                        condition = false;
                        System.out.println("Command: 0 \nExiting!");
                    }
                    case 1 ->{
                        System.out.println("Creating new character... \nEnter name: ");
                        scanner.nextLine();
                        name = scanner.nextLine().trim();
                        System.out.println("Enter role (DAMAGE, TANK, HEALER): ");
                        String Role = scanner.next().toUpperCase();
                        if(name.length()>20 || name.length()==0){
                            throw new InvalidCharacterNameException();
                        }
                        switch(Role){
                            case "DAMAGE" -> c = new Character(name, CharacterRole.DAMAGE);
                            case "TANK" -> c = new Character(name, CharacterRole.TANK);
                            case "HEALER" -> c = new Character(name, CharacterRole.HEALER);
                            default -> throw new UnknownCharacterRoleException();
                        }
                        System.out.println("Add to party (0 or 1): ");
                        
                        if(scanner.hasNextInt()){
                            int party = scanner.nextInt();
                            switch(party){
                                case 0 -> {
                                    p0.add(c);
                                    System.out.println("Added " + c.toString() + " to party " + party);
                                }
                                case 1 -> {
                                    p1.add(c);
                                    System.out.println("Added " + c.toString() + " to party " + party);
                                }
                                default -> throw new IndexOutOfBoundsException();
                            }
                        }else{
                            throw new WrongTypeException();
                        }

                        
                        
                        
                        

                    }
                    case 2 ->{
                        System.out.println("Show party (0 or 1): ");
                        if(scanner.hasNextInt()){
                            int party = scanner.nextInt();
                            switch(party){
                                case 0 -> System.out.println(p0.toString());
                                case 1 -> System.out.println(p1.toString());
                                default -> throw new IndexOutOfBoundsException();
                            }
                        }else{
                            throw new WrongTypeException();
                        }
                    }
                    default -> throw new NotACommandException();
                }
            } catch (NotACommandException e) {
                System.out.println("Command: this is not a command id \n Wrong value type for this field.");
            } catch (UnknownCharacterRoleException e) {
                System.out.println("Unknown character role.");
            } catch (PartyFullException e) {
                System.out.println("The party is full: no other character can be added to it");
            } catch (DuplicateException e) {
                System.out.println("Can't add " + c.toString() + " to party, they're already in it.");
            } catch (ContainsRoleException e) {
                System.out.println("Can't add " + c.toString() + " to party: the party has reached the limit for the role " + c.getRole());
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Unexpected index: Index 3 out of bounds for length 2");
            } catch (InvalidCharacterNameException e) {
                if(name.length()>20)
                {
                    System.out.println("Invalid character name (name is too long - max 20 characters): " + name);
                }else{
                    System.out.println("Invalid character name (name can't be empty):");
                } 
            } catch (WrongTypeException e) {
                System.out.println("You entered no integer value");
            }
            
        }
        scanner.close();
    }
}
