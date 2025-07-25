import java.util.Scanner;

public class Launcher {
	public static void main(String[] args) {
		Party party0 = new Party();
		Party party1 = new Party();

		Scanner scanner = new Scanner(System.in);

		byte selection = 1;

		while (selection != 0){
			try{
				System.out.print("Commands:\n0 - Exit\n1 - Create new character\n2 - Show party\n\nCommand: ");
				selection=scanner.nextByte();
				if (selection > 2 || selection < 0){
					System.err.println("Selection out of bounds");
					throw new IndexOutOfRangeException(selection);
				} else if (selection == 1){
					System.out.print("Enter name: ");
					String name = scanner.next();
					System.out.print("Enter role (DAMAGE, TANK, HEALER): ");
					String role = scanner.next();
					System.out.print("Add to party (0 or 1): ");
					byte choice = scanner.nextByte();
					switch (choice) {
						case 0:
							party0.newChar(name, role);
							break;
						case 1:
							party1.newChar(name, role);
							break;
						default:
							throw new IndexOutOfRangeException(choice);
					}
				} else if (selection == 2){
					System.out.println("Show party (0 or 1): ");
					byte choice = scanner.nextByte();
					switch (choice) {
						case 0:
							System.out.print(party0);
							break;
						case 1:
							System.out.print(party1);
							break;
						default:
							throw new IndexOutOfRangeException(choice);
					}
				}
			} catch (UnknowRoleException e){
				System.out.println("Unknown character role.");	
			} catch (NameOutOfBoundsException e){
				System.err.println("Invalid character name (name is too long - max 20 characters): " + e.getName());
			} catch (DuplicateException e){
				System.err.println("can't add " + e.getCharacter() + " to party, they're already in it");
			} catch (PartyFullException e){
				System.err.println("The party is full: no other characters can be added to it.");
			} catch (CharacterSlotFullException e){
				System.err.println("Can't add " + e.getCharacter() + " to party: the party has reached the limit for the role " + e.getCharacter().getRole());
			} catch (IndexOutOfRangeException e){
				System.err.println("Unexpected index: Index " + e.getIndex() + " out of bounds for length 2");
			} catch (Exception e){
				System.err.println("Wrong value type for this field.");
				scanner = new Scanner(System.in);
			}
		}
		scanner.close();
		System.out.println("Exiting!");
	}
}

class IndexOutOfRangeException extends Exception{
	private int index;
	public IndexOutOfRangeException(int index){
		this.index = index;
	}
	public int getIndex(){
		return index;
	}
}