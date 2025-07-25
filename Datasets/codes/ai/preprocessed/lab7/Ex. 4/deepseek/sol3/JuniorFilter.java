public class JuniorFilter implements Filter {
    @Override
    public Person[] filter(Person[] people) {
        int count = 0;
        for (Person person : people) {
            if (person != null && person.getAge() >= 18 && person.getAge() <= 28) {
                count++;
            }
        }

        Person[] result = new Person[count];
        int index = 0;
        for (Person person : people) {
            if (person != null && person.getAge() >= 18 && person.getAge() <= 28) {
                result[index++] = person;
            }
        }
        return result;
    }
}