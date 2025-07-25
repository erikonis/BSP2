package evangelion.contracts;

public interface Pilotable<T> {
    void assignPilot(T pilot);
    boolean start();
    String getStatus();
}