package lu.uni.programming1.lab7.exercise1;

public class Moves extends Actions {

    private String answer; 

    public Moves(String answer) {
        this.answer=answer;
    }

    @Override
    public int getBatteryCost() {
        return 10;
    }

    @Override
    public String getAction(){
        return "Robot moves " + answer + " by 20 cms" ;
    } 
    
}
