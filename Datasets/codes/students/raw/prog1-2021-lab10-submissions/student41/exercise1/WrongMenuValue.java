package lu.uni.programming1.lab10.exercise1;

public class WrongMenuValue extends Exception{
    private int opt;

    public WrongMenuValue(int opt) {
        this.opt = opt;
    }

    public int getOpt() {
        return opt;
    }

    
}
