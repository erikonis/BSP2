import java.util.Set;

public record Trash(String name, int value, Rarity rarity) implements Item {
    public Set<String> tags() { return Set.of("trash"); }

    public void use() {
        System.out.println(name + " is literal trash. Why would you?");
    }
}
