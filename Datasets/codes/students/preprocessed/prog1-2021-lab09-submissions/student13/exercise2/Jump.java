public class Jump extends Action{

    @Override
    public Recorder execute(Character character) {

        Recorder record;
        record= new Recorder(getClass().getSimpleName(), "successful!", character.getName(), null);
        return record;
    }


}
