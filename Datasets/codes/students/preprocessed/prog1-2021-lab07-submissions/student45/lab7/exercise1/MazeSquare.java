 public class MazeSquare {

    private int squareNumber;

    public MazeSquare(int squareNumber)
    {
        this.squareNumber = squareNumber;
    }

    public int getNumber() {
        return squareNumber;
    }
    
    public String toString()
    {
        return  "*";
    }
}