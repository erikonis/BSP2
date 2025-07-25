package components;

import ecs.Component;

public class NameComponent extends Component {
    private final String name;

    public NameComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}