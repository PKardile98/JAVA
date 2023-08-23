package LOGICAL_PRO_STRING;

public class MISSING_number_using_method {

	public static void main(String[] args) {
		
		int Arr[]= {1,2,3,4,5,6,7,8,9,10,12};
		
		
		missing_no(Arr, 12);
	}
	
	public  static void missing_no(int Arr[], int totalcount) {
		
		int expsum= totalcount*(totalcount+1)/2;
		int initalsum=0;
		
		for(int N1:Arr) {
			
			initalsum+=N1;
		}
		
		  int MISSINGNO=expsum-initalsum;
		  System.out.println(MISSINGNO);
		
		
		
	}
	
	

}
