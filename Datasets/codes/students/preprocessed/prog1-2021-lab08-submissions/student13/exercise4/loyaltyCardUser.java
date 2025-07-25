public class loyaltyCardUser extends loyaltyCard{

    private int user;
    private double points;

    public loyaltyCardUser(int user) {
        this.user = user;
    }
    public double getPoints() {
        return points;
    }
    public int getUser() {
        return user;
    }
    public void setPoints(double points) {
        this.points = points;
    }

}
