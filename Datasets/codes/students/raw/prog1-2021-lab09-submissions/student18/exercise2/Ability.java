package lab9.exercise2;

public class Ability extends Action{
    private String name;

    public Ability(Character user, String name) {
        super(user);
        this.name = name;
    }

    @Override
    public String exec() {
        return super.exec()+" used the "+ getClass().getSimpleName()+": "+name;
    }
}
