package LOGICAL_PRO_STRING;

public class DUPLICATE_IN_USING_METHOD {

	public static void main(String[] args) {
		
		String STR ="DEEP";
		String STR1 ="DEPP";
		
		String STR2 ="BBBGH";
		
		
		DUPLICATE(STR);
		DUPLICATE(STR1);
		DUPLICATE(STR2);
		
		
		System.out.println("NEW changes added to the code");
	

	}
	
	public  static void DUPLICATE(String STRINPUT) {
		
		char C2[]= STRINPUT.toCharArray();
		
		for(int i=0; i<C2.length; i++) {
			
			for(int j=i+1; j<C2.length; j++) {
				
				if(C2[i]==C2[j]) {
					
					System.out.println("Duplicate Char is:"+C2[j]);
				}
			}
			
			
		}
		
		
		
		
	}

}
