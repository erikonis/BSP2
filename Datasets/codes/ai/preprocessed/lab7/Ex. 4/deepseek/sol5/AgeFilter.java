public class AgeFilter {
    public static Filter junior() {
        return range(18, 28);
    }

    public static Filter middle() {
        return range(28, 55);
    }

    public static Filter senior() {
        return range(55, Integer.MAX_VALUE);
    }

    private static Filter range(int min, int max) {
        return people -> {
            Person[] result = new Person[people.length];
            int count = 0;
            for (Person p : people) {
                if (p != null && p.getAge() >= min && p.getAge() < max) {
                    result[count++] = p;
                }
            }
            return compact(result, count);
        };
    }

    private static Person[] compact(Person[] array, int count) {
        Person[] compact = new Person[count];
        System.arraycopy(array, 0, compact, 0, count);
        return compact;
    }
}