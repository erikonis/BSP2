import java.util.Set;

public abstract class System {
    protected World world;

    public System(World world) {
        this.world = world;
    }

    public abstract void update(float deltaTime);
    public abstract Set<Class<? extends Component>> getRequiredComponents();
}