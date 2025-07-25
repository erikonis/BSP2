public class OneTo100 {
    public static void main(String[] args) {
        for(int i=1; i<=100;i++)
        {
            System.out.print(i);

            switch(i)
            {
                case 100:
                System.out.print(".");
                break;
                default:
                System.out.print(", ");
                break;
            }
        }
    }
}
