package exercise4;

public abstract class Filter {
    private boolean filtered;
    private boolean filteredtwice;
    public abstract void FilterJunior();
    public abstract void FilterMiddle();
    public abstract void FilterSenior();
    public abstract void FilterTA();
    public abstract void FilterLecturer();
    public abstract void FilterStudent();
    public void Multifilter(String a, String b){
        filtered = false;
        filteredtwice = false;
        switch (a) {
            case "Junior":
                FilterJunior();
                filtered = true;
                break;
            case "Middle":
                FilterMiddle();
                filtered = true;
                break;
            case "Senior":
                FilterSenior();
                filtered = true;
                break;
            default:
                break;}
        switch(b){
            case "Student":
                FilterStudent();
                filteredtwice = true;
                break;
            case "Lecturer":
                FilterLecturer();
                filteredtwice = true;
                break;
            case "TA":
                FilterTA();
                filteredtwice = true;
                break;
            default:
                break;}

    }
    public boolean isFilteredtwice() {
        return filteredtwice;
    }
    public void setFilteredtwice(boolean filteredtwice) {
        this.filteredtwice = filteredtwice;
    }
    public abstract void Displaylist();

    public boolean getFiltered(){
        return filtered;
    }
}
