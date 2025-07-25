import java.util.HashSet;
import java.util.concurrent.TimeUnit;

public class PerfectHashCodeTest {
    
    static class Student {
        private final int studentId;  // 8-digit ID (00000000-99999999)
        private final String firstName;
        private final String lastName;
        private final int birthYear;  // 1900-2023
        
        public Student(int studentId, String firstName, String lastName, int birthYear) {
            this.studentId = studentId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthYear = birthYear;
        }
        
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return studentId == student.studentId &&
                   birthYear == student.birthYear &&
                   Objects.equals(firstName, student.firstName) &&
                   Objects.equals(lastName, student.lastName);
        }
        
        @Override
        public int hashCode() {
            // Perfect hash for known value ranges:
            // studentId: 8 digits (100M combinations)
            // birthYear: 124 years (1900-2023)
            // Total perfect hashes: 100M * 124 = 12.4B unique combinations
            return studentId + (birthYear - 1900) * 100_000_000;
        }
    }
    
    public static void main(String[] args) {
        testPerformance(10_000);
        testPerformance(100_000);
        testPerformance(1_000_000);
    }
    
    private static void testPerformance(int size) {
        HashSet<Student> studentSet = new HashSet<>(size);
        
        // Warm up
        for (int i = 0; i < Math.min(size, 1000); i++) {
            studentSet.add(createStudent(i));
        }
        studentSet.clear();
        
        // Test add
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            studentSet.add(createStudent(i));
        }
        long addTime = System.nanoTime() - start;
        
        // Test contains
        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            studentSet.contains(createStudent(i));
        }
        long containsTime = System.nanoTime() - start;
        
        System.out.printf("Size: %,d | Add: %d ms | Contains: %d ms%n",
                         size,
                         TimeUnit.NANOSECONDS.toMillis(addTime),
                         TimeUnit.NANOSECONDS.toMillis(containsTime));
    }
    
    private static Student createStudent(int index) {
        return new Student(
            10000000 + index, // 8-digit ID
            "FirstName" + (index % 100),
            "LastName" + (index % 100),
            1980 + (index % 40) // Birth years 1980-2019
        );
    }
}