package String;

public class Stringmethods {

	public static void main(String[] args) {
		// 1.CharAt- It returns the char value at particular index

		String S1 = "Pradeep kardile";
		String S2 = "Pradeep kardile";

		System.out.println("Index-->" + S1.charAt(9));
		System.out.println("Index-->" + S1.charAt(10));

		System.out.println("Index-->" + S2.charAt(0));

		System.out.println(S1.length()); // length of the string

		// 2. .equal to check weather the content in the string are same or not.

		System.out.println(S1.equals(S2)); // true

		System.out.println();

		// 3.isEmpty- to check weather the string is empty or not.

		String S5 = "Prashant";
		System.out.println(S5.isEmpty());
		String S6 = "";
		System.out.println(S6.isEmpty());

		System.out.println();

		// 4.Replace -- replacing all occurrences of oldChar in this string with
		// newChar.

		String S7 = "AUTO";
		System.out.println(S7.replace('A', 'B'));
		System.out.println(S7.replace('T', 'O'));

		System.out.println();

		// 5. replace All-

		String S8 = "Manual and Automation";
		System.out.println(S8.replaceAll("Manual", "Java"));
		System.out.println(S8.replaceAll("Automation", "SQL"));

		System.out.println();

		// 6.Substring- It return substring for the given string
		// Starting index is included and ending index is excluded

		String S9 = "Manual and Automation";
		System.out.println(S9.substring(0, 6));
		System.out.println(S9.substring(11, 21));

		System.out.println();

		// 7. Indexof char- Gives out the index of the character.

		String S10 = "NITINNIN";
		System.out.println(S10.indexOf('N')); // -- 1st occurrence -- N
		System.out.println(S10.indexOf('N', S10.indexOf('N') + 1)); // -- 2nd occurrence -- N
		System.out.println(S10.indexOf('N', S10.indexOf('N', S10.indexOf('N') + 1) + 1));// -- 3rd Occurrence
		System.out.println(S10.indexOf('N', S10.indexOf('N', S10.indexOf('N', S10.indexOf('N') + 1) + 1) + 1));
		System.out.println(S10.indexOf('I'));
		System.out.println(S10.indexOf('I', S10.indexOf('I') + 1));
		System.out.println(S10.indexOf('I', S10.indexOf('I', S10.indexOf('I') + 1) + 1));

		System.out.println();

		// 8.lastindexof- Gives the last index

		String S11 = "RUHI";
		System.out.println(S11.lastIndexOf('I'));

		System.out.println();

		// 9. Touppercase- convert to upper case from lower case.

		String S12 = "ruhi";
		System.out.println(S12.toUpperCase());

		System.out.println();

		// 10. ToLowerCase - convert the upper case to lower case.

		String S13 = " PRADEEP ";
		System.out.println(S13.toLowerCase());

		System.out.println();

		// 11. Trim- with all leading and trailing space removed

		String S14 = "    PRADEEP ";
		System.out.println(S14);
		System.out.println(S14.trim());

		System.out.println();

		// 12.split

		String S15 = "PRASHANT/DEELIP/KARDILE";
		String S16[] = S15.split("/"); // Create a array
		for (int i = 0; i < S16.length; i++) {

			System.out.println(S16[i]);
		}

		System.out.println();

		String S20 = "02-06-1998";
		String S19[] = S20.split("-");

		for (int j = 0; j < S19.length; j++) {

			System.out.println(" " + S19[j]);

		}

		String P1 = "PALLAVI";
		String P3[] = P1.split("");

		for (int j = 0; j < P3.length; j++) {

			System.out.print(P3[j]+" ");
			
			
		}
		
		System.out.println(10+20+"BODY");
		System.out.println("BODY"+10+20);


	}

}
