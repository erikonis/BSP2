import java.util.Set;

public interface Item {
    String name();
    int value();
    Rarity rarity();
    Set<String> tags(); // "consumable", "trash", "gear"
    
    default boolean is(String tag) {
        return tags().contains(tag);
    }

    void use(); // effect or message
}
