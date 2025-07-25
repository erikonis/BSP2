package lu.uni.programming1.lab9.exercise2;

public class Ability extends Actions{

	public Ability(String name, Character user) {
		super(name, user);
	}

	public void execute(){
		Logs.log(super.toString());
	}
	
}
