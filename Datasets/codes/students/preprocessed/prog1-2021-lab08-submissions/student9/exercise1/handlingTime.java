public enum handlingTime{
    EXPRESS(1,100),PRIORITY(3,50),CLASSIC(5,10),NORUSH(8,0);

    private int day;

    public int getDay() {
        return day;
    }

    private handlingTime(int day,int price){
        this.day = day;
        this.price = price;
    }

    private int price;

    public int getPrice() {
        return price;
    }

}

