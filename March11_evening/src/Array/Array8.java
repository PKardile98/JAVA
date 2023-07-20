package Array;

public class Array8 {

	public static void main(String[] args) {


		// 4*5
	    int A5 [][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
	    
	    System.out.print(A5.length+"*");
	    System.out.print(A5[0].length);
	    
	    System.out.println();
	    
	    for(int i=0; i< A5.length; i++) {
	    	
	    	for(int j=0; j<A5[0].length; j++) {
	    		
	    	  System.out.print(A5[i][j]+" ");
	    		
	    	}
	    	System.out.println();
	    	
	    	
	    }

	


}
	
}