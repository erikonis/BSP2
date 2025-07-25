package lu.uni.programming1.lab9.exercise2;

public class jump extends action{

    public jump(character p1) {
        super(p1);
    }

    @Override
    public void execute(log log)
    {
        log.addAction(new jump(getPlayer()));
    }    

    public String toString()
    {
        String description = (player.getName() + " jumped.");
        return description;
    }
    
}
