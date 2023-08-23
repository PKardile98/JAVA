package LOGICAL_PRO_STRING;

public class DUPLICATE_IN_ARRAY {

	public static void main(String[] args) {
		
		
		System.out.println("NEW CHANGES");
		int ARR[]= {1,2,3,2,4};
		
		for(int i=0; i<ARR.length;i++) {
			
			for(int j=i+1; j<ARR.length; j++) {
				
				if(ARR[i]==ARR[j]) {
					
					System.out.println("NO is duplicate:" +ARR[j]);
				}
			}
		}
		
		
		

	}

}
