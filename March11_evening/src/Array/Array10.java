package Array;

public class Array10 {

	public static void main(String[] args) {
		// Max.no
		
		int A5[]= {1,4,890,8,89};
		
		int max=A5[0]; //initialize the maximum value to the first element
		
		for (int i=1; i<A5.length; i++) {
			
			if(A5[i]>max) {
				
				max=A5[i];
			}
		}
		
		System.out.println("Greatest No. is:"+max);
		

	}

}
