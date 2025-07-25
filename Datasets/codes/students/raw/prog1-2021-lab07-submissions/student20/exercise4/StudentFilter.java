public class StudentFilter extends AbstractFilter {

    @Override
    public Person[] result(Person[] list, Person[] newList) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                if (list[i].getStudies().equals("yes") && list[i].getTeachers().equals("no")) {
                    newList[i] = list[i];
                }
            }
        }
        return newList;
    }

    @Override
    public void print(Person[] list) {
        System.out.println("\nStudents: ");
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                if (list[i].getStudies().equals("yes") && list[i].getTeachers().equals("no")) {
                    System.out.printf("%s  ", list[i].getName());
                }
            }
        }
        System.out.println();
    }
}
