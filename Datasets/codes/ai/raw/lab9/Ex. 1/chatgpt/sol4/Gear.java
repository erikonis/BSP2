import java.util.Set;

public record Gear(String name, int value, Rarity rarity, int crit, int det, int direct) implements Item {
    public Set<String> tags() { return Set.of("gear"); }

    public void use() {
        System.out.println("You equip " + name + ": [Crit=" + crit + ", Det=" + det + ", Dir=" + direct + "]");
    }

    public int totalStats() {
        return crit + det + direct;
    }
}
