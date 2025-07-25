import java.util.HashSet;
import java.util.Objects;

public class HashCodeTest1 {
    static class Employee {
        private final String name;
        private final int employeeId;
        private final String department;

        public Employee(String name, int employeeId, String department) {
            this.name = name;
            this.employeeId = employeeId;
            this.department = department;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return employeeId == employee.employeeId &&
                   Objects.equals(name, employee.name) &&
                   Objects.equals(department, employee.department);
        }

        // Basic hashCode using only employeeId
        @Override
        public int hashCode() {
            return employeeId; // Only using one field
        }
    }

    public static void main(String[] args) {
        testHashSetPerformance(10000);
        testHashSetPerformance(100000);
        testHashSetPerformance(1000000);
    }

    private static void testHashSetPerformance(int size) {
        HashSet<Employee> employees = new HashSet<>();

        // Test adding elements
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            employees.add(new Employee("Employee" + i, i, "Dept" + (i % 10)));
        }
        long addTime = System.nanoTime() - startTime;

        // Test contains operation
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            employees.contains(new Employee("Employee" + i, i, "Dept" + (i % 10)));
        }
        long containsTime = System.nanoTime() - startTime;

        System.out.printf("Basic Hash - Size: %,d | Add: %,d ns | Contains: %,d ns%n",
                        size, addTime, containsTime);
    }
}