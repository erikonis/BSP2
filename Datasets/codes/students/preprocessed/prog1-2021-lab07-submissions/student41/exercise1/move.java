public class move extends Action{

    public move(String action_) {
        super(action_);
        }


    @Override
	public void print() {
		System.out.print("\nMove " + getAction() +" by 20 cm");
	}
    
}
