public class PeopleFilterApp {
    public static void main(String[] args) {
        // Create sample people
        Person[] people = {
            new Person("Alice", 25, false, true),
            new Person("Bob", 35, true, false),
            new Person("Charlie", 22, true, true),
            new Person("David", 60, true, false),
            new Person("Eve", 40, false, true),
            new Person("Frank", 28, true, true),
            new Person("Grace", 19, false, true)
        };

        // Test individual filters
        testFilter(new TeacherFilter(), people, "Teachers:");
        testFilter(new StudentFilter(), people, "Students:");
        testFilter(new TeachingAssistantFilter(), people, "Teaching Assistants:");
        testFilter(new JuniorFilter(), people, "Juniors (18-28):");
        testFilter(new MiddleAgedFilter(), people, "Middle Aged (29-55):");
        testFilter(new SeniorFilter(), people, "Seniors (55+):");

        // Test combined filter
        Filter combinedFilter = FilterUtils.combineFilters(
            new TeacherFilter(),
            new SeniorFilter()
        );
        testFilter(combinedFilter, people, "Senior Teachers:");
    }

    private static void testFilter(Filter filter, Person[] people, String title) {
        System.out.println("\n" + title);
        Person[] filtered = filter.apply(people);
        for (Person person : filtered) {
            System.out.println(person);
        }
    }
}