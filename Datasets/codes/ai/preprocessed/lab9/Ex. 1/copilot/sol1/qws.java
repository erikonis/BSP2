import java.util.Objects;

enum Rarity {
    WHITE, PINK, GREEN, BLUE, PURPLE
}

abstract class Item {
    private String name;
    private int value;
    private Rarity rarity;

    public Item(String name, int value, Rarity rarity) {
        this.name = name;
        this.value = value;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public Rarity getRarity() {
        return rarity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return name.equals(item.name) && rarity == item.rarity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rarity);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", rarity=" + rarity +
                '}';
    }
}

class TrashItem extends Item {
    public TrashItem(String name, int value, Rarity rarity) {
        super(name, value, rarity);
    }
}

class GearItem extends Item {
    private int criticalHit;
    private int determination;
    private int directHit;

    public GearItem(String name, int value, Rarity rarity, int criticalHit, int determination, int directHit) {
        super(name, value, rarity);
        this.criticalHit = criticalHit;
        this.determination = determination;
        this.directHit = directHit;
    }

    public int getCriticalHit() {
        return criticalHit;
    }

    public int getDetermination() {
        return determination;
    }

    public int getDirectHit() {
        return directHit;
    }

    @Override
    public String toString() {
        return super.toString() + " GearItem{" +
                "criticalHit=" + criticalHit +
                ", determination=" + determination +
                ", directHit=" + directHit +
                '}';
    }
}

class ConsumableItem extends Item {
    private int charges;

    public ConsumableItem(String name, int value, Rarity rarity, int charges) {
        super(name, value, rarity);
        this.charges = charges;
    }

    public int getCharges() {
        return charges;
    }

    public void use() {
        if (charges > 0) {
            charges--;
            System.out.println("Used " + getName() + ". Remaining charges: " + charges);
        } else {
            System.out.println(getName() + " has no charges left.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " ConsumableItem{" +
                "charges=" + charges +
                '}';
    }
}