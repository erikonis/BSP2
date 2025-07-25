public class Jump extends Actions{

	public Jump(Character user) {
		super("jump", user);
	}

	public void execute(){
		Logs.log(super.toString());
	}
	
}
