import java.util.Objects;

public class TestObjectConstantHash {
    private String attribute1;
    private int attribute2;

    public TestObjectConstantHash(String attribute1, int attribute2) {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestObjectConstantHash that = (TestObjectConstantHash) o;
        return attribute2 == that.attribute2 && Objects.equals(attribute1, that.attribute1);
    }

    @Override
    public int hashCode() {
        return 1; // Constant hash code
    }
}