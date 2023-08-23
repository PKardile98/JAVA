package LOGICAL_PRO_STRING;

public class Character_occurrence_string {

	public static void main(String[] args) {

		String S1 = "PPPPPPPPPPPKKKKKUUUUUU";

		Character_occurrence_string PK = new Character_occurrence_string();
		PK.Charactercount(S1, 'P');
		PK.Charactercount(S1, 'K');
		PK.Charactercount(S1, 'U');

	}

	
	//HERE WE USED MWTHOD TO COUNT OF THE CHARATER REUSE.
	public void Charactercount(String S1, char Value) {

		int count = 0;

		for (char CH : S1.toCharArray()) {

			if (CH == Value) {

				count++;
			}
		}

		System.out.println( " Count OF"+" "+Value+"--> " + count);

	}

}
