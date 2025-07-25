public class AgeFilters {
    public static class JuniorFilter implements Filter {
        @Override
        public Person[] filter(Person[] people) {
            return filterByAge(people, 18, 28);
        }
    }

    public static class MiddleFilter implements Filter {
        @Override
        public Person[] filter(Person[] people) {
            return filterByAge(people, 28, 55);
        }
    }

    public static class SeniorFilter implements Filter {
        @Override
        public Person[] filter(Person[] people) {
            return filterByAge(people, 55, Integer.MAX_VALUE);
        }
    }

    private static Person[] filterByAge(Person[] people, int min, int max) {
        Person[] result = new Person[people.length];
        int count = 0;
        for (Person p : people) {
            if (p != null && p.getAge() >= min && p.getAge() < max) {
                result[count++] = p;
            }
        }
        return compactArray(result, count);
    }

    private static Person[] compactArray(Person[] array, int count) {
        Person[] compact = new Person[count];
        System.arraycopy(array, 0, compact, 0, count);
        return compact;
    }
}