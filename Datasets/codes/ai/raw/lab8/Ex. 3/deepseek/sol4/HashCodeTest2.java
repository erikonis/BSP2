import java.util.HashSet;
import java.util.Objects;

public class HashCodeTest2 {
    static class Employee {
        private final String name;
        private final int employeeId;
        private final String department;
        private int hash; // For caching
        
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
        
        // High-quality hashCode using all fields with caching
        @Override
        public int hashCode() {
            int h = hash;
            if (h == 0) {
                h = employeeId;
                h = 31 * h + name.hashCode();
                h = 31 * h + department.hashCode();
                hash = h;
            }
            return h;
        }
    }

    public static void main(String[] args) {
        testHashSetPerformance(10000);
        testHashSetPerformance(100000);
        testHashSetPerformance(1000000);
    }
    
    private static void testHashSetPerformance(int size) {
        HashSet<Employee> employees = new HashSet<>();
        
        // Warm up JVM
        for (int i = 0; i < Math.min(size, 1000); i++) {
            employees.add(new Employee("Employee" + i, i, "Dept" + (i % 10)));
        }
        employees.clear();
        
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
        
        System.out.printf("Quality Hash - Size: %,d | Add: %,d ns | Contains: %,d ns%n",
                        size, addTime, containsTime);
    }
}