package lu.uni.programming1.lab10.exercise1;

public class EnumException extends Exception {


    public EnumException (CharacterRole role  ) {

        boolean isit=false; 

for ( CharacterRole  i : CharacterRole.values()) { if (i==role)  isit=true; } 

if (isit==false) {System.out.println(" No such Character type");}; 
    }
    
}
