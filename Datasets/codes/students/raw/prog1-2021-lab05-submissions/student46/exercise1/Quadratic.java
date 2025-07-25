package src.lu.uni.programming1.lab5.exercise1;

public class Quadratic {

private double a,b,c;

    public Quadratic(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;

    } 
    public double getDiscriminant(){
      return (b*b)-4*a*c;
    }

    public double getRoot1(){
        return (-b+Math.sqrt((b*b)-4*a*c))/2*a;
    }
    public double getRoot2(){
        return (-b-Math.sqrt((b*b)-4*a*c))/2*a;
    }

}
