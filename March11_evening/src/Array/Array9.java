package Array;

public class Array9 {

	public static void main(String[] args) {
		// Printing duplicate no.
		
		int C1[]= {1,2,3,4,2,5}; // length= 6 , index =5 
		
		// 0<5--true
		
		for(int i=0; i<C1.length-1; i++) 
		{
			
			// j=0+1
			for(int j=i+1; j<C1.length; j++) 
			{

				if(C1[i]==C1[j]) {
					
					
					System.out.println("Duplicate no. found:"+C1[j]);
				}
				
				
			}
			
		}

	
	}
}
