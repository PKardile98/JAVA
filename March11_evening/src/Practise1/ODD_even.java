package Practise1;

public class ODD_even {

	public static void main(String[] args) {
		
		
		// To separate the odd and even and calculate there sum
		
	  int A1[]= {1,2,3,4,5,6,7,8,9};
	  
	  int even =0;
	  int odd= 0;
	  
	  for(int i=0; i<A1.length; i++) {
		  
		  if(i%2==0) {
			  
			  even= even+i;
		  }
		  
		  else {
			  
			  odd = odd+i;
		  }
	  }
	  
	  System.out.println(even);
	  System.out.println(odd);

	}

}
