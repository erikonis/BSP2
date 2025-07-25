public class Position {
    boolean u = true, d = true, l = true, r = true;
    int x, y, c = 0;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isU() {
        return u;
    }

    public void setU(boolean x) {
        u = x;
    }

    public boolean isD() {
        return d;
    }

    public void setD(boolean x) {
        d = x;
    }

    public boolean isL() {
        return l;
    }

    public void setL(boolean x) {
        l = x;
    }

    public boolean isR() {
        return r;
    }

    public void setR(boolean x) {
        r = x;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
