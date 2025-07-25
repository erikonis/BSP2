public class TAFilter extends Filter {

    private Individual[] filteredList;

    public TAFilter(Individual[] list) {
        super(list);
        filteredList = new Individual[GetListSize()];
    }

    protected void ApplyFilter() {
        int needle = 0;
        for (int i = 0 ; i<GetListSize() ; i++) {
            if (GetListElement(i) != null) {
              if (GetListElement(i).GetStudies() && GetListElement(i).GetTeaches()) {
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

