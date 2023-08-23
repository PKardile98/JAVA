package Practise1;

public class occurrence {

	public static void main(String[] args) {
		
		
		String P1= "PPPPPPKJJJJJJHHHHGGGGG";

		OCC(P1, 'P');
		OCC(P1, 'J');
		OCC(P1, 'H');
		OCC(P1, 'G');
	}
	
	public static void OCC(String P1, char Value) {
		
		int count=0;
		
		for(char CH:P1.toCharArray()) {
			
			if(CH==Value) {
				
				count++;
			}
			
		}
		
		System.out.println("COUNT OF "+ Value+"-->"+count);
		
	}

}
