import java.util.ArrayList;

public class log {
    ArrayList<String> alog = new ArrayList<>();

   public void add(String text)
   {
       alog.add(text);
   }

   public void print()
   {
       for(int i=0;i<alog.size();i++)
       {
        System.out.println(alog.get(i));
       }
   }

}
