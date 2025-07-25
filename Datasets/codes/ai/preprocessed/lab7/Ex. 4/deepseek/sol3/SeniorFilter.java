public class SeniorFilter implements Filter {
    @Override
    public Person[] filter(Person[] people) {
        int count = 0;
        for (Person person : people) {
            if (person != null && person.getAge() > 55) {
                count++;
            }
        }

        Person[] result = new Person[count];
        int index = 0;
        for (Person person : people) {
            if (person != null && person.getAge() > 55) {
                result[index++] = person;
            }
        }
        return result;
    }
}