public class Quadratic {

    double a;
    double b;
    double c;

    // Constructor
    Quadratic(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter method for a,b,c
    double geta(){
        return this.a;
    }
    double getb(){
        return this.b;
    }
    double getc(){
        return this.c;
    }

    // Method getDiscriminant()

    double getDiscriminant(){
        return (this.b)*(this.b) - 4*(this.a*this.c);
    }

    //Method getRoot1()

    double getRoot1(){
        return (-(this.b)+ Math.sqrt(getDiscriminant()))/(2*this.a);
    }

     //Method getRoot2()

     double getRoot2(){
        return (-(this.b)- Math.sqrt(getDiscriminant()))/(2*this.a);
    }
    


        
    


}
