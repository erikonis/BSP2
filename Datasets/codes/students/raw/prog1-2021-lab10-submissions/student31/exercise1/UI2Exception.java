package lu.uni.programming1.lab10.exercise1;

public class UI2Exception extends Exception {

    public UI2Exception (int theint) {

        if (theint!=0 && theint!=1) System.out.println(" Invalid option: ");


    }
    
}
