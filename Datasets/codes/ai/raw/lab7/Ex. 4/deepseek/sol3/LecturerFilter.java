public class LecturerFilter implements Filter {
    @Override
    public Person[] filter(Person[] people) {
        int count = 0;
        for (Person person : people) {
            if (person != null && person.teaches() && !person.studies()) {
                count++;
            }
        }

        Person[] result = new Person[count];
        int index = 0;
        for (Person person : people) {
            if (person != null && person.teaches() && !person.studies()) {
                result[index++] = person;
            }
        }
        return result;
    }
}