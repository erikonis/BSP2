import java.util.Scanner;
public class kellaci {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
		System.out.println("******************************************************************");
        //ask the user to enter a number
        System.out.println("Please enter a number");
        //define some integers
        //always define global varibale if possible
        int n = number.nextInt();
        int res = 0;
        int KnM1; 
        int KnM2; 
        int Kn;
        int i;
        //close the scanner
        number.close();
        //if the number given is 1 or 2 ,then the value of res is equal to 1
        if (n == 1 || n == 2) 
		{
            res = 1;
        } 
        //else give the variable the corresponding value
		else 
		{
             KnM1 = 1; 
             KnM2 = 1;
             Kn = 0;
             i = 3;
             // as long the value of i is small or not equal to the value of n
            while (i <= n) 
            {
                Kn = KnM1 + KnM2; //Kn has the value of both variables (KnM1+KnM2)
                KnM2 = KnM1; // switch the values (KnM2 has now the value of KnM1)
                KnM1 = Kn; //KnM1 has the value of Kn
                i++; //increase
                //finally, i is equal to n
                if (i == n) 
                {
                    //ouput
                    System.out.println("Kn-1 = " + KnM1);
                    System.out.println("Kn-2 = " + KnM2);
                }
            }
            //give the value of Kn to res
            res = Kn;
        }
		//output
        System.out.println("Kn = " + res);
		System.out.println("******************************************************************");
    }
}
