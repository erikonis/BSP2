package exercise2;

import java.util.Scanner;

public class studentlist {
        Scanner scanner = new Scanner(System.in);
        private int c1, c2, c3, c3d, c4, rmst, capacity;
        private String [] []listarr; 
        private String firstname, lastname, searchname, result, del;
        private boolean endloop, sl;
        //sets up the many variables that are used for the actions related to the list of students

        public int setupList(){
            sl = true;
            //makes sure it loops during invalid numbers
            while (sl){
            System.out.print("How many people should fit on the list?: ");
            capacity = scanner.nextInt();
            //sets the size of the array
            if (capacity>0){
            c1 = 0;
            listarr = new String [capacity][2];
            System.out.println("List has been set up");
            sl = false;}
            //if its bigger than 0, it can end the loop
            else{System.out.println("Error: Invalid input");}}
            return capacity;}

        String addStudent(){
            result = " ";
            //sets a throwaway value for the output
            if (c1 >= capacity){
                result = "Error: list full!";}
                //accounts for the list being filled up
            if (c1 < capacity){
            System.out.print("Input first name: ");
                firstname = scanner.next();
                System.out.print("Input last name: ");
                lastname = scanner.next();
                //accepts inputs for the first and last names
            if((firstname != " ")&&(lastname!=" ")){
            listarr[c1] [0]= firstname;
            listarr[c1] [1]= lastname;
            c1++;
            result = "Student added!";}}
            //if the inputs actually contain symbols, numbers or letters, accepts the inputs and adds them to the bottom of the array
            else{result = "Error";}
            return result;} //returns the outcome

        String searchStudent(){
            System.out.print("Search for what name?: ");
            searchname = scanner.next();
            //asks for a first or last name to search for
            c2 = 0;
            endloop = false;
            //makes sure the loop doesn't end
            result = " ";
            if(searchname != " "){
            while (endloop == false){
                if ((listarr[c2][0].matches(searchname))||(listarr[c2][1].matches(searchname))){
                    result = ("That name is on the list of students.");
                    endloop = true;}
                    //checks a row for matches with the searched name, ends the loop if it finds one
                c2++;
                //increments the counter
                if((c2 == capacity)&&(endloop==false)){
                    result = ("The name is not in the list in any way");
                    endloop = true;}}}
                    //if the counter is one bigger than the index of the array (offset by arrays starting at 0)
                if (searchname == " "){
                    result="Error: Invalid Input";}
                    // System.out.println("test");
            return result;}

        String reportlist(){
            c3 = 0;
            System.out.println("Numbered list of students: ");
            while (c3<capacity){
                c3d = c3 + 1;
                System.out.println((c3d)+". "+listarr[c3][1]+" "+listarr[c3][0]);
                c3++;}
                //a loop that cycles through the array, printing the first and last names and a number before them
            return ("");}
        
        String removeStudent(){
            reportlist();
            System.out.print("What student should be removed? (Input number in list): ");
            rmst = scanner.nextInt()-1;
            //prints the list, then asks for what slot should be cleared
            result="";
            if ((rmst<=capacity-1)&&(rmst>0)){
            listarr[rmst][0] = "";
            listarr[rmst][1] = "";
            c1--;
            //checks if the input is valid, empties the slot and modifies the counter tracking the number of students
            while(rmst < capacity-1){
                listarr[rmst][0] = listarr[rmst+1][0];
                listarr[rmst][1] = listarr[rmst+1][1];
                rmst++;}
                //copies the names in each slot below the empty one into the one above
                listarr[capacity-1][0] = "";
                listarr[capacity-1][1] = "";
                //empties the bottom slot
                result = "Student removed from list";}
                
            else{result="Invalid input";}
            return result;
            }

            String removeAll(){
                System.out.print("Are you sure you want to clear the list?(Y/N): ");
                del = scanner.next();
                c4=0;
                switch (del) {
                    case "Y":
                        result= "Deleting list";
                        //asks for confirmation. Just to be safe
                        while (c4<capacity){
                            listarr[c4][0] = "";
                            listarr[c4][1] = "";
                            c4++;}
                            //cycles through the array, emptying all slots
                        break;
                    case "N":
                        result="Delete canceled";
                        break;
                    default:
                        result="Error: invalid input";
                        break;}
                return result;
            }
        
    }
