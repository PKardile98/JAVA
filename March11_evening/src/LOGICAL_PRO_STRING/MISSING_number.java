package LOGICAL_PRO_STRING;

public class MISSING_number {

	public static void main(String[] args) {
		
		// CHECK WETHER THE CHANGES REFLECT IN THE GIT REPO?
		
		int A1[]= {1,2,3,4,5,6,7,9,8,12};
		int Size = A1.length+1; // Because one no. was missing 
		
		int totalsum= (Size*(Size+1))/2; // Sum of total array 
		int Initalsum =0;
		
		for(int Num : A1) { // This is to calculate the sum of the given array
			
			Initalsum+=Num;
		}
		
		int Missingvalue=totalsum-Initalsum;
		System.out.println(Missingvalue);
			
	}

}
