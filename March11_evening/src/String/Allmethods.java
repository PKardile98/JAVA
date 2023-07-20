package String;

public class Allmethods {

	public static void main(String[] args) {
		String S1 = "      PradeePP    ";
		String S2 = "Pradeep";
		System.out.println(S1.charAt(0));
		
		System.out.println(S1.equals(S2));
		
		System.out.println(S1.isEmpty());
		
		System.out.println(S1.indexOf('P'));//--> 1st occ
		
		System.out.println(S1.indexOf('P',S1.indexOf('P')+1));
		
		System.out.println(S1.indexOf('P',S1.indexOf('P',S1.indexOf('P')+1)+1));
		
		System.out.println(S1.replace('P', 'R'));
		
		System.out.println(S1.replaceAll("Pradeep", "RAVI"));
		
		System.out.println(S1.substring(3, 7));
		
		System.out.println(S1.lastIndexOf('e'));
		
		String S4 ="02/06/1998";
		
		String S5[] = S4.split(" /");
		
		for(int i=0; i<S5.length; i++) {
			
			System.out.println(S5[i]);
		}
		
		System.out.println(S1.trim());
		
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
