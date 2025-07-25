public class StudentList {
    private byte count = 0;
    private String[] lst;
    private int length;

    public StudentList(int length) {
        this.lst = new String[length];
        this.length = length;
    }

    public byte getCount() {return this.count;}

    public byte search(String student) {//retruns idx in the array or -1 if none was found
        for(byte i = 0; i < this.lst.length; ++i){
            if (this.lst[i].equals(student)){return i;}
        }

        System.out.println("Student not found!");
        return -1;

    }

    public void add(String student){
        if (this.count >= this.lst.length) {System.out.println("The list is full.");}
        else {
            this.count++;

            this.lst[this.count-1] = student;
            
        }
    }

    public void remove(String student){
        byte r = this.search(student);

        if (r >= 0) {
            this.lst[r] = null;
            this.count -= 1;

            for(byte i = 0; i < this.lst.length; ++i) {
                if (i != 0) {
                    if (this.lst[i] != null) {//if there is a missing spot behing the one we are dealing with
                        this.lst[i-1] = this.lst[i]; this.lst[i] = null;
                    }
                }
            }   
        }
    }
    
    public void report(String student) {
        byte r = this.search(student);

        if (r >= 0) {
            System.out.println(this.lst[r] + " has been reported.");
        }
    }

    public void removeAll(){
        this.lst = new String[this.length];
    }

    public String toString(){
        String msg = "";

        for(String s : this.lst){
            msg += s + "\n";
        }

        return msg;
    }
    
    
}
