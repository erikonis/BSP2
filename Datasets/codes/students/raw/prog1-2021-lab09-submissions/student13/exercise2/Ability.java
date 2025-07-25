package lu.uni.programming1.lab9.exercise2;

public class Ability extends Action{

    private String name;

    public Ability(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Recorder execute(Character character) {
        Recorder record;
        record= new Recorder(name, "successful!", character.getName(), null);
        return record;
    }

}
