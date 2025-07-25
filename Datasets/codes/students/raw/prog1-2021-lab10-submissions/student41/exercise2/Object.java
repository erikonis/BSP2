package lu.uni.programming1.lab10.exercise2;

public class Object extends Obstacle {

    public Object() {
        super.setMental_toll(0);
    }

    @Override
    public String toString() {
        return " Object " + super.toString() + "(" + super.getMental_toll() + ")";
    }
}
