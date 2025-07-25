import java.rmi.NotBoundException;
import java.util.Scanner;


public class Launcher {
    public static void main(String[] args) {
        int com=0;
        int partySlot=0;
        String name="";
        String role="";
        Party party0 = new Party();
        Party party1 = new Party();
        Scanner scan = new Scanner(System.in);
        // Implement the main program here, i.e. this is where you will read the various
        // inputs from the user.
        // Remember: your program should run forever, i.e. constantly expect input from
        // the user, until they explicitly enter '0' to exit the program.
        do {
            Commands(com);
            try {
                com =scan.nextInt();
                scan.nextLine();
                if(com<0 || com >2){
                    throw new NotBoundException();
                }
            } catch (NotBoundException e){
                System.out.println("This is not a command id.");
            }
            if (com == 1) {
                System.out.println("Command: "+com);
                System.out.println("Creating new Character ...");
                System.out.print("Enter name: ");
                try{
                    name = scan.nextLine();
                        if(name.length()==0){
                            throw new EmptyNameException();
                        }
                        if(name.length()>20){
                            throw new LenghtExceedException();
                        }
                    System.out.println("Enter role (DAMAGE, TANK, HEALER):");
                    role = scan.nextLine();
                        if(!role.equals("DAMAGE")&&!role.equals("HEALER")&&!role.equals("TANK")){
                            throw new ExceptionRoleNoExist();
                        }
                    CharacterRole characterRole = CharacterRole.valueOf(role);
                    Character ch = new Character(name, characterRole);
                    System.out.println("Add to party (0 or 1):");
                    partySlot = scan.nextInt();
                        if(partySlot<0 || partySlot>1){
                            throw new InvalidPartyException();
                        }
                        if(partySlot==0){
                            if(!party0.getCharacters().contains(ch)){
                                party0.add(ch);
                                System.out.println("Added "+ch.toString()+" to party 0.");
                            }else{
                                throw new SameCharException(); 
                            }

                        }if (partySlot==1){
                            if (party1.getCharacters().contains(ch)){
                                throw new PartyFullException();
                            }else{
                                party1.add(ch);
                                System.out.println("Added "+ch.toString()+" to party 1.");
                            }
                        }

                }catch (EmptyNameException e){
                    System.out.println("Invalid character name (name can't be empty):");
                }catch (LenghtExceedException e){
                    System.out.println("Invalid character name (name is too long - max 20 characters): "+name);
                }catch (ExceptionRoleExist e){
                    System.out.println("Role already exists.");
                }catch (InvalidPartyException e){
                    System.out.println("Unknown party slot.");
                }catch (PartyFullException e){
                    System.out.println("The party is full.");
                }catch (ExceptionRoleNoExist e){
                    System.out.println("Role doesn't exist.");
                }catch (SameCharException e){
                    System.out.println("exists already.");;
                }
                
            }
            if (com == 2) {
                System.out.println("Command: "+com);
                System.out.println("Show party (0 or 1): ");
                partySlot = scan.nextInt();
                if (partySlot==0){
                    System.out.println(party0);
                }if (partySlot==1){
                    System.out.println(party1);
                }
            }
           
        } while (com !=0);
        System.out.println("Command: "+com+"\nThank you & good luck");
        scan.close();
    }
    
    public static void Commands(int com){
        System.out.println("\nCommands:\n0 - Exit\n1 - Create new character\n2 - Show party");
    }
}
