package lu.uni.programming1.lab8.exercise1;

public enum Handling {

        EXPRESS(100, 1),
        PRIORITY(50, 3),
        CLASSIC(10, 5),
        NORUSH(0, 8);
    
        private int cost;
        private int duration;

    Handling(int cost, int duration) {
        this.cost = cost;
        this.duration = duration;
    }
    public int getCost() {
            return cost;
    }
    public int getDuration() {
            return duration;
    }
}
