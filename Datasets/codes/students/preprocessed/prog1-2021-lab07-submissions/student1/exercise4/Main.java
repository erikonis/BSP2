public class Main {
    public static void main(String[] args) {
        
       Programmer[] programmer = new Programmer[7];

       int nJuniors = 0;
       int iJuniors =0;
       int nTA = 0;
       int nLecturer = 0;
       int nLecturerSernior = 0;

       programmer[0] = new Programmer("Cierra", 34, true, false);
       programmer[1] = new Programmer("Alden", 23, true, true);
       programmer[2] = new Programmer("Thomas", 55, true, false);
       programmer[3] = new Programmer("Miranda", 46, true, false);
       programmer[4] = new Programmer("Brandy", 22, false, true);
       programmer[5] = new Programmer("Alvaro", 58, true, false);
       programmer[6] = new Programmer("Maggie", 20, false, true);
       
       for (Programmer programmers: programmer){
           if(programmers.student && !programmers.teacher){
               nJuniors++;
           }
           if(programmers.student && programmers.teacher){
            nTA++;
           }
           if(!programmers.student && programmers.teacher){
            nLecturer++;
            if(programmers.getAge()>=55);
            nLecturerSernior++;
           }

       }
        StudentFilter[] juniors = new StudentFilter[nJuniors];
        TAFilter[] tas= new TAFilter[nTA];
        LecturerFilter[] lecturer = new LecturerFilter[nLecturer];
        LecturerSenior[] lecturerSenior = new LecturerSenior[nLecturerSernior];

        for (Programmer programmers: programmer){
            if(programmers.student && !programmers.teacher){
                nJuniors++;
            }
            if(programmers.student && programmers.teacher){
             nTA++;
            }
            if(!programmers.student && programmers.teacher){
             nLecturer++;
             if(programmers.getAge()>=55);
             nLecturerSernior++;
            }
            
            System.out.println(juniors);
            System.out.println(tas);
            System.out.println(lecturer);
            System.out.println(lecturerSenior);

        }
    }

}
