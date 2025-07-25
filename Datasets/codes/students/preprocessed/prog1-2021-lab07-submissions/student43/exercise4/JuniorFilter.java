public class JuniorFilter extends Filter {

    private Individual[] filteredList;

    public JuniorFilter(Individual[] list) {
        super(list);
        filteredList = new Individual[GetListSize()];
    }

    protected void ApplyFilter() {
        int needle = 0;
        for (int i = 0 ; i<GetListSize() ; i++) {
            if (GetListElement(i) != null) {
              if ((GetListElement(i).getAge() < 28) && (GetListElement(i).getAge() >= 18)) {
                  filteredList[needle] = GetListElement(i);
                  needle++;
              }
            }
        }
    }

    public Individual[] GetFilteredList() {
        ApplyFilter();
        return filteredList;
    }
    
    public void showfilter() {
        ApplyFilter();
        show(filteredList);
    }


}

