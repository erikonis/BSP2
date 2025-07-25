public enum Country {
    BELGIUM(50), GERMANY(40), FRANCE(30), LUXEMBOURG(0);

    double fee;

    Country(double fee){
        Country.this.fee = fee;
    }
}
