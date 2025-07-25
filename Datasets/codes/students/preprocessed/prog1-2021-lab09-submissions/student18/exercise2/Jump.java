public class Jump extends Action{

    public Jump(Character user) {
        super(user);
    }

    @Override
    public String exec() {
        return super.exec()+" jumped.";
    }
    
}
