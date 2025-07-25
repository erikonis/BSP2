public class WrongMenuValue extends Exception{
    private int opt;

    public WrongMenuValue(int opt) {
        this.opt = opt;
    }

    public int getOpt() {
        return opt;
    }

    
}
