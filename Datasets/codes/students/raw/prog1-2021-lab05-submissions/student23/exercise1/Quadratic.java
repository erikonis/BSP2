package lu.uni.programming1.lab5.exercise1;

public class Quadratic {
    private  double a, b, c;

    Quadratic(double a, double b, double c){//Constructor
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Getters
    public double getA(){return this.a;}
    public double getB(){return this.b;}
    public double getC(){return this.c;}
    
    //Discriminant
    public double getDiscriminant(){return Math.pow(this.b, 2) - 4*this.a * this.c; }//b^2 - 4*a*c

    public double getRoot1(){
        double disc = this.getDiscriminant();

        if (disc >= 0){
            return (-this.b + Math.sqrt(disc))/2*this.a; //Racine numéro 1
        } 
        else {
            return Double.NaN;//Returns Not A Number
        }
    }

    public double getRoot2(){
        double disc = this.getDiscriminant();

        if (disc >= 0){
            return (-this.b - Math.sqrt(disc))/2*this.a; //Racine numéro 1
        } 
        else {
            return Double.NaN;//Returns Not A Number
        }
    }
    
}
