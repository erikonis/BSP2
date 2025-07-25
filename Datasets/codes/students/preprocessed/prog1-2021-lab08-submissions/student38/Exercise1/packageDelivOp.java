enum packageDelivOp {
    EXPRESS(1), PRIORITY(3), CLASSIC(5), NORUSH(8); // Numbers in-between brackets represent the handling time in days

    private int delivery;

    private packageDelivOp(int delivery) {
        this.delivery = delivery;
    }

    public String toString() {
        switch (delivery) {
        case 1:
            return "Express [100€]. Handling in 1 day,";
        case 3:
            return "PRIORITY [50€]. Handling in 3 days,";
        case 5:
            return "CLASSIC [10€]. Handling in 5 days,";
        case 8:
            return "NORUSH [0€]. Handling in 8 days,";
        default:
            return "Unknown delivery method!!";
        }
    }

    public int getPrice() {
        switch (delivery) {
        case 1:
            return 100;
        case 3:
            return 50;
        case 5:
            return 10;
        case 8:
            return 0;
        default:
            return -1;
        }
    }
}