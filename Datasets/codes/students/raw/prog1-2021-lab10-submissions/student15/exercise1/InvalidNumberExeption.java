package lu.uni.programming1.lab10.exercise1;

public class InvalidNumberExeption extends Exception {

    public InvalidNumberExeption(){

        super("\nYou have to write a number between 0 and 2! Try again");


    }

    public InvalidNumberExeption(String message){

        super(message);

        
    }
    
}
