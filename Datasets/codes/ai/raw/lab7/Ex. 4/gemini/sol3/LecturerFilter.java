// LecturerFilter.java
public enum LecturerFilter implements Filter {
    INSTANCE;

    @Override
    public Person[] filter(Person[] people) {
        List<Person> filteredList = new ArrayList<>();
        for (Person person : people) {
            if (!(person.isLecturer() && !person.isStudent())) {
                filteredList.add(person);
            }
        }
        return filteredList.toArray(new Person[0]);
    }

    @Override
    public Boolean apply(Person person, Person[] allPeople) {
        return person.isLecturer() && !person.isStudent();
    }
}

