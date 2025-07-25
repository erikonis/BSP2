import java.lang.Math;


public class Quadratic {
    //properties
    private double a , b, c;

    //Constructor
     Quadratic (double a,double b,double c){
       this.a = a;
       this.b = b;
       this.c = c;
    }
    
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    //Methods

  public double getDiscriminant(){
    double discriminant = Math.pow(b, 2) - 4*a*c;
    return discriminant;
  }

  public double getRoot1(){
    double root1 = (-b + Math.sqrt(getDiscriminant()))/(2*a);
    return root1;
  }

  public double getRoot2(){
    double root1 = (-b - Math.sqrt(getDiscriminant()))/(2*a);
    return root1;
  }
  public double getRoot3(){
      double root3 = -b/2*a;
      return root3;
  }
  private boolean checkDiscriminant1(){
      return getDiscriminant() > 0;
  }
  private boolean checkDiscriminant2(){
    return getDiscriminant() == 0;
  }
  private boolean checkDiscriminantt3(){
    return getDiscriminant() < 0;
  }
  public void calculate(){
      if(checkDiscriminant1()){
          System.out.println("There are two roots: ");
          System.out.print("root1: "+getRoot1()+" root2: "+getRoot2());
      }else if(checkDiscriminant2()){
          System.out.println("there is one root: "+getRoot3());
      }else if(checkDiscriminantt3()){
        System.out.println("The equation has no roots!");
      }
  }
        
    
}
