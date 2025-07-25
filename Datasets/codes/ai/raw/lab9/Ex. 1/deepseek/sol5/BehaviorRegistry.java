public class BehaviorRegistry {
    private static final Map<ItemType, ItemBehavior> behaviors = new EnumMap<>(ItemType.class);
    
    static {
        behaviors.put(ItemType.GEAR, new GearBehavior());
        behaviors.put(ItemType.CONSUMABLE, new ConsumableBehavior());
        behaviors.put(ItemType.TRASH, new TrashBehavior());
    }
    
    public static void registerBehavior(ItemType type, ItemBehavior behavior) {
        behaviors.put(type, behavior);
    }
    
    public static ItemBehavior getBehavior(ItemType type) {
        return behaviors.get(type);
    }
}