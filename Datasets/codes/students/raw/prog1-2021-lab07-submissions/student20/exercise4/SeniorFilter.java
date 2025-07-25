public class SeniorFilter extends AbstractFilter {

    @Override
    public Person[] result(Person[] list, Person[] newList) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                if ((2021 - list[i].getBirthYears()) > 55) {
                    newList[i] = list[i];
                }
            }
        }
        return newList;
    }

    @Override
    public void print(Person[] list) {
        System.out.println("\nSeniors: ");
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                if ((2021 - list[i].getBirthYears()) > 55) {
                    System.out.printf("%s  ", list[i].getName());
                }
            }
        }
        System.out.println();
    }
}
