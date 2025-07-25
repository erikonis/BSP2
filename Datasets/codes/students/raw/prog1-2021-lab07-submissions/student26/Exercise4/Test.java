package Exercise4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<Person>();

        Person pCierra = new Person("Cierra", 1987, 3, 4, false, true);
        Person pAiden = new Person ("Aiden", 1998, 5, 12, true, true);
        Person pThomas = new Person ("Thomas", 1965, 12, 25, false, true);
        Person pMiranda = new Person ("Miranda", 1974, 11, 29, false, true);
        Person pBrandy = new Person ("Brandy", 1999, 6, 20, true, false);
        Person pAlvaro = new Person ("Alvaro", 1963, 2, 18, false, true);
        Person pMaggie = new Person ("Maggie", 2001, 8, 23, true, false);


        people.add(0, pCierra);
        people.add(1, pAiden);
        people.add(1, pThomas);
        people.add(1, pMiranda);
        people.add(1, pBrandy);
        people.add(1, pAlvaro);
        people.add(1, pMaggie);

        Iterator<Person> it = people.iterator();

        Scanner sc = new Scanner(System.in);
        int userchoice =0;


        System.out.println("This is the list of people: ");
        for (Person i : people) {
            System.out.println(i.name.toString()+ " " + i.ageY + " " + i.ageM + " " + i.ageD + " studies: "+ i.studies + " teaches: " + i.teaches ) ;
          }
          System.out.println("What would like to filter out? Type ");
          System.out.println("1 for Lecturers ");
          System.out.println("2 for Students ");
          System.out.println("3 for TAs ");
          System.out.println("4 for Juniors ");
          System.out.println("5 for Middle ");
          System.out.println("6 for Seniors ");

        userchoice = sc.nextInt();
        if (userchoice<1 || userchoice>6) {System.out.println("Invalid choice. Exiting..."); sc.close(); System.exit(0);};
        
        switch (userchoice){
            case 1:   //      for (Person i : people) {
      //              if (i.teaches==true && i.studies==false) people.remove(i);
     //         }

        while(it.hasNext()) {
        Person i = it.next();
        if(i.teaches==true && i.studies==false) {
          it.remove();
        }
      }
                



            case 2: // for (Person i : people) {
     //           if (i.teaches==false && i.studies==true) people.remove(i);
     //     }


     while(it.hasNext()) {
        Person i = it.next();
        if(i.teaches==false && i.studies==true) {
          it.remove();
        }
      }



            case 3: // for (Person i : people) {
         //       if (i.teaches==true && i.studies==true) people.remove(i);
       //   }


       while(it.hasNext()) {
        Person i = it.next();
        if(i.teaches==true && i.studies==true) {
          it.remove();
        }
      }




            case 4: // for (Person i : people) {
     //           if ( (2021-(i.ageY))>=18 && (2021-(i.ageY))<28) people.remove(i);
    //      }



    while(it.hasNext()) {
        Person i = it.next();
        if((2021-(i.ageY))>=18 && (2021-(i.ageY))<28) {
          it.remove();
        }
      }



            case 5: // for (Person i : people) {
       //         if ( (2021-(i.ageY))>=28 && (2021-(i.ageY))<55) people.remove(i);
       //   }

       while(it.hasNext()) {
        Person i = it.next();
        if((2021-(i.ageY))>=28 && (2021-(i.ageY))<55) {
          it.remove();
        }
      }


            case 6: // for (Person i : people) {
      //           if ( (2021-(i.ageY))>=55) people.remove(i);
    //      }
    while(it.hasNext()) {
        Person i = it.next();
        if((2021-(i.ageY))>=55) {
          it.remove();
        }
      }



                 };


                 System.out.println("This is the list of people filtered out: ");
                 for (Person i : people) {
                    System.out.println(i.name.toString()+ " " + i.ageY + " " + i.ageM + " " + i.ageD + " studies: "+ i.studies + " teaches: " + i.teaches ) ;
        
    };

}
}