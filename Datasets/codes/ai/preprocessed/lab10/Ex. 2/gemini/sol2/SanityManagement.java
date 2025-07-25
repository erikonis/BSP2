public interface SanityManagement {
    int getSanity();
    void reduceSanity(int amount);
    boolean canAct();
}