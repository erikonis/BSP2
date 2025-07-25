public class Ability extends Actions{

	public Ability(String name, Character user) {
		super(name, user);
	}

	public void execute(){
		Logs.log(super.toString());
	}
	
}
