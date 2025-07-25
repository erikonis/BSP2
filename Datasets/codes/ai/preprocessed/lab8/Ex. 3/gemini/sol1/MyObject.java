import java.util.Objects;

public class MyObject {
    private String name;
    private int value;

    public MyObject(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyObject myObject = (MyObject) o;
        return value == myObject.value && Objects.equals(name, myObject.name);
    }

    @Override
    public int hashCode() {
        return 42; // Constant hash code
    }
}