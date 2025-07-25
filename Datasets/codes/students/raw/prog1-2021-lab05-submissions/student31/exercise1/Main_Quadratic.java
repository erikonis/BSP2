package lu.uni.programming1.lab5.exercise1;

import java.util.Scanner;

public class Main_Quadratic {
    static Quadratic quadratic = new Quadratic();
    static Scanner scanner = new Scanner(System.in);
    static double _a, _b, _c;
    public static void main(String[] args) {
        AskUser();
    }
    public static void AskUser(){
        System.out.println("a = ?");
        _a = scanner.nextDouble();
        System.out.println("b = ?");
        _b = scanner.nextDouble();
        System.out.println("c = ?");
        _c = scanner.nextDouble();

        StartCalc(_a,_b,_c);
    }
    private static void StartCalc(double _a,double _b,double _c){
        quadratic.getA(_a);
        quadratic.getB(_b);
        quadratic.getC(_c);

        DoQuickMaths(_a, _b, _c);
    }
    private static void DoQuickMaths(double _a,double _b,double _c){
        double quad = quadratic.getDiscriminant(_a,_b,_c);

        if(quad > 0){
            System.out.println("Root 1 :" + quadratic.getRoot1(_a,_b,_c));
            System.out.println("Root 2 :" + quadratic.getRoot2(_a,_b,_c));
        }
        else if(quad == 0){
            System.out.println("Root 1 :" + quadratic.getRoot1(_a,_b,_c));
        }
        else{
            System.out.println("The equation has no roots !");
        }
    }
}
