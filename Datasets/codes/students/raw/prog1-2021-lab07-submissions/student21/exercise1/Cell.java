package exercise1;

public class Cell {
    private String top;
    private String left;
    private String right;
    private String down;
    private String interaction;

    public Cell(String top, String left, String right, String down, String interaction) {
        this.top = top;
        this.left = left;
        this.right = right;
        this.down = down;
        this.interaction = interaction;
    }

    @Override
    public String toString() {
        return "Cell [down=" + down + ", interaction=" + interaction + ", left=" + left + ", right=" + right + ", top="
                + top + "]";
    }
}
