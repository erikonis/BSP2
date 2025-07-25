package Exercise1;

public enum Shipping {
    Nothing(0,0),
    EXPRESS (1,100),
    PRIORITY (3,50),
    CLASSIC (5, 10), 
    NORUSH (8, 0);

    private int day;
    private int fee;

    Shipping(int day, int fee){
        this.day = day;
        this.fee = fee; 
    }

    public int getDay() {
        return day;
    }

    public int getFee() {
        return fee;
    }
    

}
