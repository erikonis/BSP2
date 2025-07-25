public abstract class Action {

    private String action;

    public Action(String action_){
        this.action = action_;
    }

	public String getAction() {
        return action;
    }


    public void setAction(String action) {
        this.action = action;
    }

    public abstract void print();
    
}
