package lu.uni.programming1.lab7.exercise1;

public class move extends Action{

    public move(String action_) {
        super(action_);
        }


    @Override
	public void print() {
		System.out.print("\nMove " + getAction() +" by 20 cm");
	}
    
}
