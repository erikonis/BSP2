import java.util.*;

public class NtoM implements Iterable<Integer> {
    private final int start;
    private final int end;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new NtoM(sc.nextInt(), sc.nextInt()).forEach(System.out::println);
        sc.close();
    }
    
    public NtoM(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int current = start;
            
            @Override
            public boolean hasNext() {
                return current <= end;
            }
            
            @Override
            public Integer next() {
                return current++;
            }
        };
    }
}