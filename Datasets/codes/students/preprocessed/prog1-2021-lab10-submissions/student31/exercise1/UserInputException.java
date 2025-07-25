public class UserInputException extends Exception {


    public UserInputException (int someint ) {

        if (someint!=0 && someint!=1 && someint!=2) {


        String message = "Invalid option, try again: ";

        System.out.println(message);

        };



    }


    
}
