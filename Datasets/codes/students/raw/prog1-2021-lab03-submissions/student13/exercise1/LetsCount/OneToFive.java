package lu.uni.programming1.lab3.exercise1.LetsCount;

public class OneToFive {
    
    public static void main(String[] args) {
        for(int i=1; i<=5;i++)
        {
            System.out.print(i);

            switch(i)
            {
                case 5:
                System.out.print(".");
                break;
                default:
                System.out.print(", ");
                break;
            }

        }
    }
}
