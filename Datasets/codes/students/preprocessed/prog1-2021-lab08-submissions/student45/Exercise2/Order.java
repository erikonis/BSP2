public class Order {
        private String productName;
        private double unitPrice,totalPrice;
        private int amount;

        public Order(String productName, double unitPrice, int amount) {
            this.productName = productName;
            this.unitPrice = unitPrice;
            this.amount = amount;
            totalPrice=unitPrice*amount;
        }


        
        public double getTotalPrice() {
            return totalPrice;
        }





        @Override
        public String toString() {
            return "Order : " + amount + " " + productName + " x " + unitPrice+" EURO = "
                    + totalPrice+ " EURO\n";
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + amount;
            result = prime * result + ((productName == null) ? 0 : productName.hashCode());
            long temp;
            temp = Double.doubleToLongBits(unitPrice);
            result = prime * result + (int) (temp ^ (temp >>> 32));
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Order other = (Order) obj;
            if (amount != other.amount)
                return false;
            if (productName == null) {
                if (other.productName != null)
                    return false;
            } else if (!productName.equals(other.productName))
                return false;
            if (Double.doubleToLongBits(unitPrice) != Double.doubleToLongBits(other.unitPrice))
                return false;
            return true;
        }

        

        

        

}
