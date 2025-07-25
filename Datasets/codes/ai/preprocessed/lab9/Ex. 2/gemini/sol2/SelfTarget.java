public class SelfTarget implements Target {
    private Character self;

    public SelfTarget(Character self) {
        if (self == null) {
            throw new IllegalArgumentException("Self cannot be null.");
        }
        this.self = self;
    }

    @Override
    public Character resolveTarget() {
        return self;
    }
}