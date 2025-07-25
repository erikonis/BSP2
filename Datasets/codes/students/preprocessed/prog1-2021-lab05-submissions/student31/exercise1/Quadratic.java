public class Quadratic {
    private double disc;
    private double a,b,c;

    public double getA(double a) { return this.a; }

    public double getB(double b) {
        return this.b;
    }

    public double getC(double c) {
        return this.c;
    }

    public double getDiscriminant(double a,double b,double c){
        disc = Math.pow(b,2) - (4*a*c);
        return disc;
    }

    public double getRoot1(double a,double b,double c){
        double root1 = (-b+Math.sqrt(Math.pow(b,2)-(4*a*c))) / (2*a);

        return root1;
    }

    public double getRoot2(double a,double b,double c){
        double root2 = (-b-Math.sqrt(Math.pow(b,2)-(4*a*c))) / (2*a);
        return root2;
    }
}
