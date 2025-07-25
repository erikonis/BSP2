public class listLab {
    private int lenght, counter;
    private String[] arr;

    listLab (int lenght_,  String[] arr_) {
        this.lenght = lenght_;
        this.arr = arr_;
    }

    public void addstudent(String name, int index) {
        arr[index]=name;
        counter ++;
    }

    public int searchStudent(String name){
        for (int i=0; i<lenght; i++){
            if (name.equals(arr[i])){
            return i;
            }

        }
        System.out.println("The name is not in the list");
        return -1;
        
    }


    public void removeName(String name ){
        int pos = searchStudent(name);
        arr[pos] = null;

        for (int i = pos; i < arr.length -1  ;i ++){
            arr[i] = arr[(i+1)];
        }
        arr[arr.length-1] = null;
        counter --;
    }

    public void removeall(){
        for (int i = 0; i < arr.length  ;i ++){
            arr[i] = null;
            counter--;
        }
    }

    public void report() {
        for (int i=0 ; i<arr.length ; ++i) {
            System.out.print("arr[" + i + "] == " + arr[i] + "   \n");
            }
            System.out.println();
    }

}
