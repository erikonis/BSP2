package Exercise4;

public class TAFilter extends Filter2{
    
    public TAFilter(Person[] list, String filterApplied) {
        super(list, filterApplied);
    }

    public void sort() {
        int counter=0;
        Person[] temp = new Person[list.length];
        for(int i=0; i<list.length;i++){
            if(list[i]!=null && list[i].student==true && list[i].teacher==true){
                temp[i]=list[i];
                counter++;
            }
                
        }
        Person[] newList = new Person[counter];
        int n=0;
        for(int i=0; i<temp.length;i++){
            if(temp[i]!=null){
                newList[n]=temp[i];
                n++;
            }   
        }
        filterApplied = filterApplied +" -> TA";
        System.out.println("Filter : "+filterApplied);
        list=newList;
        printOut();   
    }
}
