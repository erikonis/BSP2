public enum StudentFilter implements Filter {
    INSTANCE;

    @Override
    public Person[] filter(Person[] people) {
        List<Person> filteredList = new ArrayList<>();
        for (Person person : people) {
            if (!(person.isStudent() && !person.isLecturer())) {
                filteredList.add(person);
            }
        }
        return filteredList.toArray(new Person[0]);
    }

    @Override
    public Boolean apply(Person person, Person[] allPeople) {
        return person.isStudent() && !person.isLecturer();
    }
}