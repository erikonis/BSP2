package Exercise4;

public class Purchase{
    double cost;
    double points;

    public Purchase(double cost){
        this.cost = cost;
    }

    public double getPoints(){
        points = cost*0.1;
        return points;
    }
}
