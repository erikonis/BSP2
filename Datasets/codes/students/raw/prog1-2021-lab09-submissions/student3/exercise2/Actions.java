package lu.uni.programming1.lab9.exercise2;

public class Actions {
	private String name;
	private Character user;

	public Actions(String name, Character user) {
		this.name = name;
		this.user = user;
	}

	public Character getUser(){
		return this.user;
	}

	public void execute(){
		Logs.log(this.user + " preformed " + this.name);
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return this.user + " preformed " + this.name;
	}

	
}
