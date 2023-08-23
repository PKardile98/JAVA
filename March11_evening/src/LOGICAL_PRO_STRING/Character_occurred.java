package LOGICAL_PRO_STRING;

public class Character_occurred {

	public static void main(String[] args) {

		// WITH Chararray

		String P1 = "Pradeep";

		int count = 0;

		for (char CH : P1.toCharArray()) {

			if (CH == 'e') {
				count++;
			}

		}
		System.out.println("Occurrence of e:" + count);
		
	}
	
	
	

}
