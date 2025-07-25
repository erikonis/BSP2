import java.util.UUID;

/**
 * Base class for all ECS components with common functionality
 */
public abstract class Component {
    private final String componentId;
    private Entity owner;

    protected Component() {
        this.componentId = UUID.randomUUID().toString();
    }

    /**
     * Called when this component is added to an entity
     */
    public void onAdded(Entity owner) {
        this.owner = owner;
    }

    /**
     * Called when this component is removed from an entity
     */
    public void onRemoved() {
        this.owner = null;
    }

    /**
     * Called each frame if registered with the world
     */
    public void update(float deltaTime) {
        // Optional per-component update logic
    }

    public Entity getOwner() {
        return owner;
    }

    public String getComponentId() {
        return componentId;
    }

    /**
     * Checks if this component can coexist with another component of the same type
     */
    public boolean allowsMultiple() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Component)) return false;
        Component that = (Component) o;
        return componentId.equals(that.componentId);
    }

    @Override
    public int hashCode() {
        return componentId.hashCode();
    }
}