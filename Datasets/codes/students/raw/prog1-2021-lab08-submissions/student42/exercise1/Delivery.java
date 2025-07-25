package lu.uni.programming1.lab8.exercise1;

public class Delivery {
    
    public enum Method{
        NORUSH(0,8),
        CLASSIC(10,5),
        PRIORITY(50,3),
        EXPRESS(100,1);

        private int cost;
        private int delTime;


        Method(int cost, int delTime){
            Method.this.cost = cost;
            Method.this.delTime = delTime;
        }

    public int getCost(){
        return this.cost;
            
    }

    public int getdelTime(){
        return this.delTime;
    }
   
}

private Method method;

public Delivery(Method method){
    this.method = method;
}



    public Method getMethod() {
    return method;
}



public void setMethod(Method method) {
    this.method = method;
}



    @Override
    public String toString(){
        return "\t Shipping method: " + getMethod() + "[" + method.getCost() + " EUR]. " + "Handling in "  + method.getdelTime() + " day(s).\n";
    }
        






}
