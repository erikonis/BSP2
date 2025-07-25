package Exercise1;

public enum Country {
    LUXEMBOURG(0),
     FRANCE(30),
     BELGIUM(50),
     GERMANY(40);

     private int fee;

     Country(int fee)
     {this.fee=fee;}

    public int getFee() { return fee; }

     
}

