package exercise1;

public class Quadratic {
    private int a, b, c, d;
    private double root1, root2;
    //setup of variables for the methods for the class relating to the formula ax^2+bx+c=0
    Quadratic(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;}
        //recieves the variables for a, b and c from somewhere else
    public int getA(){
        return a;}
    public int getB(){
        return b;}
    public int getC(){
        return c;}
    //these make getting the variables again easy
    public void reset(){
        a = b = c = 0;}
        //resets them to 0

    public int getDiscriminant(){
        d = ((b*b)-(4*a*c));
        return d;}
        //returns the Delta used for figuring out the roots with a different formula
    public String getEquation(){
        String s = (a+"x^2 + "+b+"x + "+c+" = 0");
        return s;}
        //returns the values of a,b&c in the equation as a string variable
    public Double getRoot1(){
        root1 = ((-b+(Math.sqrt(getDiscriminant())))/(2*a));
        return root1;}
    public Double getRoot2(){
        root2 = ((-b-(Math.sqrt(getDiscriminant())))/(2*a));
        return root2;}
        //the two formulas for figuring out the root of the equation with the discriminant figured out earlier
}