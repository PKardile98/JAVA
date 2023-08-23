package LOGICAL_PRO_STRING;

public class COUNTTHENO_SUM {

	public static void main(String[] args) {
		
		// Int =789---> 7+8+9= 24
		
		int i=789;
		int sum =0;
		
		while(i>0) {
			
			int Digit = i%10; // TO get the last digit
			sum = sum+Digit;
			i=i/10;// remove the last digit	
		}
		
		System.out.println(sum);

	}

}
