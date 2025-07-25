package lu.uni.programming1.lab9.exercise2;

public class Jump extends Action {


    

    public Jump (Character character) {
        
        String jumpactionstring = character.getName() + "jumps";
        
        System.out.println(jumpactionstring); Logger.logs.add(jumpactionstring);} 
    
}
