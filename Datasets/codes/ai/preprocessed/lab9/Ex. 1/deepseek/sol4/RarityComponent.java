import ecs.Component;
import enums.Rarity;

public class RarityComponent extends Component {
    private final Rarity rarity;

    public RarityComponent(Rarity rarity) {
        this.rarity = rarity;
    }

    public Rarity getRarity() {
        return rarity;
    }
}