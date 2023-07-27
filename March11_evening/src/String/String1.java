package String;

public class String1 {

	public static void main(String[] args) {
		// By using New keyword
		// Syntax--> String SRVN = new string("value");
		
		String S1 = new String("test"); // heap+ ref in SCP
		String S2 = new String("Test"); // Heap + ref in SCP
		String S3 = new String("Test"); // SCP
		
		System.out.println(" changes ");
		
		// Using literals
		
		String S4 = "Test"; // SCP
		String S5 = "Test"; 
		String S6 = "Java";
		String S7 = "Test";
		
		
		System.out.println(S2==S5);
		
		
		
	}

}
