public class ByteOverflow {

	public static void main(String[] args) {
		byte a=0;
		byte b=0;
		
		System.out.println("a: "+a+"  b: "+b);
		a++;
		b--;
		System.out.println("a: "+a+"  b: "+b);

		while(b < 0){
			a++;
			b--;
			System.out.println("a: "+a+"  b: "+b);
		}

	}
}