package lu.uni.programming1.lab9.exercise2;

public class Jump extends Actions{

	public Jump(Character user) {
		super("jump", user);
	}

	public void execute(){
		Logs.log(super.toString());
	}
	
}
