public class LecturerFilter extends AbstractFilter {

    @Override
    public Person[] result(Person[] list, Person[] newList) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                if (list[i].getStudies().equals("no") && list[i].getTeachers().equals("yes")) {
                    newList[i] = list[i];
                }
            }
        }
        return newList;
    }

    @Override
    public void print(Person[] list) {
        System.out.println("\nLecturers: ");
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                if (list[i].getStudies().equals("no") && list[i].getTeachers().equals("yes")) {
                    System.out.printf("%s  ", list[i].getName());
                }
            }
        }
        System.out.println();
    }
}
