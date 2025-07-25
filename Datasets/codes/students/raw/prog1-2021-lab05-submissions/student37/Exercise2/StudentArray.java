package Exercise2;


public class StudentArray {


        String[] firstNames;
        String[] lastNames;
         boolean[] seats;

        public StudentArray(String[] firstNames, String[] lastNames, boolean[] seats ) 
        
        {
                   
            this.firstNames=firstNames; this.lastNames=lastNames; this.seats=seats; 
        
        }

        public void reset()  {  for ( int i=0; i<=14; i++) { firstNames[i]=null; lastNames[i]=null; seats[i]=false; }  }

        public int  howManyStudents () {

            int noOfStudents = 0;
            for (int i=0; i<=14; i++) if (seats[i]==true) noOfStudents+=1;
            return noOfStudents;
        }

        public int findAFreeSpot () {

            boolean foundone = false;
            int value=-1;
            for (int i=0; i<=14; i++) if (seats[i]==false && foundone==false) {  foundone=true; value=i;  };
            return value;
    
        }

        public void addStudent (String s1a, String s2a) {

            
            int freespot=findAFreeSpot();
            if (freespot==-1)  {System.out.println("The list is full! The student was not added! ");}
            else { seats[freespot]=true;  firstNames[freespot]=s1a; lastNames[freespot]=s2a; };
        }

        public int find(String s1f, String s2f) {

            boolean foundthestudent = false;

            int findIndex=-1;
    
            for (int i=0; i<=14; i++) { 

            if   (s1f.equals(firstNames[i])==true && s2f.equals(lastNames[i])==true)  
                { foundthestudent =true; findIndex=i; System.out.println("Student found at seat " + (findIndex+1)); };

    
        }; if (!foundthestudent) System.out.println("Student not found! ");
        return findIndex; }


        public  void removeStudent(String s1r, String s2r ) {


            int isthestudentthere=find(s1r,s2r);
        
            if (isthestudentthere==-1) System.out.println("The student cannot be removed because the student is not even on the list! ");
        
            else {firstNames[isthestudentthere]=null; lastNames[isthestudentthere]=null; seats[isthestudentthere]=false; System.out.println("The student was removed... ");}; }


        public void report()  {


            int studentnumbercomputed = howManyStudents();

            if ((studentnumbercomputed==0)) {System.out.println("The class is empty. ");}
        
            else { for (int i=0; i<=14; i++) {if (seats[i]==true) System.out.println((i+1) + " " + firstNames[i]+ " " + lastNames[i]);}; System.out.println(" The total number of students is: " + studentnumbercomputed); };}
        
}