package ecs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class World {
    private int nextEntityId = 0;
    private final List<Entity> entities = new ArrayList<>();
    private final Map<Class<? extends System>, System> systems = new HashMap<>();

    public Entity createEntity() {
        Entity entity = new Entity(nextEntityId++);
        entities.add(entity);
        return entity;
    }

    public void removeEntity(Entity entity) {
        entities.remove(entity);
    }

    public <T extends System> void addSystem(T system) {
        systems.put(system.getClass(), system);
    }

    public <T extends System> T getSystem(Class<T> systemClass) {
        return systemClass.cast(systems.get(systemClass));
    }

    public void update(float deltaTime) {
        for (System system : systems.values()) {
            system.update(deltaTime);
        }
    }

    public List<Entity> getEntitiesWith(Set<Class<? extends Component>> components) {
        List<Entity> result = new ArrayList<>();
        for (Entity entity : entities) {
            boolean hasAll = true;
            for (Class<? extends Component> component : components) {
                if (!entity.hasComponent(component)) {
                    hasAll = false;
                    break;
                }
            }
            if (hasAll) {
                result.add(entity);
            }
        }
        return result;
    }
}