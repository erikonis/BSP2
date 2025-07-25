package lu.uni.programming1.lab7.exercise1;

public class takephoto extends Action{

    boolean HR;

    public takephoto(String action_, boolean HR_) {
        super(action_);
        this.HR = HR_;
        }
    

        public boolean getHR() {
            return HR;
        }



    @Override
	public void print() {
        if(HR){
		System.out.print("\nTook a high resolution photo");
        }
        else{
        System.out.print("\nTook a low resolution photo");   
        }
	}
    
}