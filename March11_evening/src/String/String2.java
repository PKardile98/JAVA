package String;

public class String2 {

	public static void main(String[] args) {
		// Diffrence between == and .equal to operators
		
		
		
		String S1= new String("Pradeep");
		String S2= new String("Pradeep");
		
		System.out.println(S1==S2); // False
		System.out.println(S1.equals(S2)); //true 
		
		String S3="Pradeep";
		String S4="pradeep";
		
		System.out.println(S3==S4); // False
		System.out.println(S3.equals(S4)); //False 
		
		
		
		
	}

}
