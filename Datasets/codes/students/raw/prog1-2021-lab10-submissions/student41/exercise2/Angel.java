package lu.uni.programming1.lab10.exercise2;

public class Angel extends Obstacle {

    public Angel(int mental_toll) {
        super.setMental_toll(Math.min(100, Math.max(0, mental_toll)));
    }

    @Override
    public String toString() {
        return " Angel " + super.toString() + "(" + super.getMental_toll() + ")";
    }

}
