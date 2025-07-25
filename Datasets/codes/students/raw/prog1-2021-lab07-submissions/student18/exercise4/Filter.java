public abstract class Filter {
    private String name;
    
    public Filter(String name){
        this.name = name;
    } 

    public String getName() {
        return name;
    }

    public abstract boolean matchesFilter(Person person);
}
