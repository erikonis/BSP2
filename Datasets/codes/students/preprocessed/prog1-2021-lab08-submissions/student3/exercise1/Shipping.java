public enum Shipping {
  
    EXPRESS(1,100), 
    PRIORITY(3,50),
    CLASSIC(5, 10),
    NORUSH(8, 0);

    public int days, cost;

    private Shipping(int days, int cost) {
        this.days = days;
        this.cost = cost;
    }

    public int getDays() {
        return days;
    }

    public int getCost() {
        return cost;
    }
     
}
