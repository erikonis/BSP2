public interface OverflowChecker<T> {
    void checkUpperOverflow(T initialValue, int increments);
    void checkLowerOverflow(T initialValue, int decrements);
}