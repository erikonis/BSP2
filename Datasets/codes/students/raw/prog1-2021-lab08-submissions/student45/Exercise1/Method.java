package Exercise1;

public enum Method {
    EXPRESS(100,"EXPRESS",1),
    PRIORITY(50,"PRIORITY",3),
    CLASSIC(10,"CLASSIC",5),
    NORUSH(0,"NORUSH",8);
    
    private int fee;
    private int days;
    private String name;
    Method(int fee, String name,int days)
     {this.fee=fee;
    this.name=name;
    this.days=days;
    }
     
    public int getFee() { return fee; }
    public int getDays() { return days; }
    public String getName(){return name;}

    @Override
    public String toString() {
    String d= "day";
    if(days>1)
    d=d+"s";
    return name+"["+fee+" EUR]. Handling in "
    +days+" "+d ;
    }

}
