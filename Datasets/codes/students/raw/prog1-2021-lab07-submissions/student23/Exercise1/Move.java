package Exercise1;

public class Move extends Action {

    public Move() {
        
    }
    public int goFoward(){
        super.setNeededTime(10);
        return 1;
    }
    public int goBackwards(){
        super.setNeededTime(10);
        return -1;
    }
    public int goLeft(){
        super.setNeededTime(10);
        return -1;
    }
    public int goRight(){
        super.setNeededTime(10);
        return 1;
    }

        

    
}
