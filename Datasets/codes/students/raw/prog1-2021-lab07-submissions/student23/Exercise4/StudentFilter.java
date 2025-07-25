package Exercise4;

public class StudentFilter extends FilterTemplate {
    

    public StudentFilter(Person person[]) {
        super(person);
    }

    @Override
    public void check(){
        int count = 0;
        int index[] = new int[per.length];
        for(int i = 0; i<per.length;i++)
        {
            
            if(per[i].isStuding() == true && per[i].isTeaching() == false){
                index[count] = i;
                count++;
                
            }
        }
        result = new Person[count];
        for(int i = 0;i<result.length;i++){
            result[i] = per[index[i]];
        }
        if(result.length>=0)
        {
            System.out.println("Only Lectures: \n");
            for(int i = 0;i<result.length;i++){
                System.out.println(result[i].getName());
                
            }
            System.out.println("\n");
        }
    }
}
