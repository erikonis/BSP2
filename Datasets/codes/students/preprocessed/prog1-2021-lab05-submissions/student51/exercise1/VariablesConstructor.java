public class VariablesConstructor {

    private int a,b,c;
    
    
    VariablesConstructor(int a, int b, int c){
        
        this.a = a;
        this.b = b;
        this.c = c;
       
    }
    
    public void setA(int a){ //set a
        this.a =a;
    }
    public int getA(){  //get a
        return a;
    }

    public void setB(int b){    //set b
        this.b =b;
    }
    public int getB(){  //get b
        return b;
    }
    
    public double getSquare(){  //no need to set getsquare as we just need to get the value
        return Math.pow(b, 2);
    }

    public void setC(int c){    //set c
        this.c = c;
    }
    public int getC(){  //get c
        return c; 
    }

    public double getDiscriminant(){    //no need to set getdiscriminant as we just need to get the value
        return Math.pow(b, 2)-4*a*c;
    }

    public double getRoot1(){
        return (-b+(Math.sqrt(getDiscriminant())))/(2*a) ;  //same as getsquare
    }
   
    public double getRoot2(){   //same as getsquare
        return (-b-(Math.sqrt(getDiscriminant())))/(2*a) ;

    }

    public double getRoot(){    //same as getsquare
        return b/(2*a);
    }
    VariablesConstructor(){}    //intialise variablesconstructor

 
}
