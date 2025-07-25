public enum Delay {
    EXPRESS(1, 100),PRIORITY(3, 50),CLASSIC(5, 10),NORUSH(8, 0);
    private int days, price;

    public int getPrice(){
        return price;
    }

    private Delay(int days, int price){
        this.days = days;
        this.price = price;
    }

    public int getDays(){
        return days;
    }
}

