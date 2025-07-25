public class SingleTarget implements Target {
    private Character target;

    public SingleTarget(Character target) {
        this.target = target;
    }

    @Override
    public Character resolveTarget() {
        return target;
    }
}