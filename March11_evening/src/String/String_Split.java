package String;

public class String_Split {

	public static void main(String[] args) {
		
		
		String S1= "Pradeep";
		
		String S2[]= S1.split("");
		
		for(int i=0; i<S1.length(); i++) {
			
			System.out.print( " "+S2[i]);
		}

	}

}
