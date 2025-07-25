package lu.uni.programming1.lab10.exercise2;

public abstract class Obstacle {
    private int mental_toll;

    public Obstacle() {
    }

    public int getMental_toll() {
        return mental_toll;
    }

    public void setMental_toll(int mental_toll) {
        this.mental_toll = mental_toll;
    }

    @Override
    public String toString() {
        return "Obstacle ";
    }

}
