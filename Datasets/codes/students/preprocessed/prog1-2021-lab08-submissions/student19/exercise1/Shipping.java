    public enum Shipping{
        EXPRESS(1, 100),
        PRIORITY(3, 50),
        CLASSIC(5, 10),
        NORUSH(8, 0);

        private int days;
        private double price;

        private Shipping(int days, double price){
            this.days = days;
            this.price = price; 
        }

        public int getDays() {
            return days;
        }


        public double getPrice() {
            return price;
        }


        

}

