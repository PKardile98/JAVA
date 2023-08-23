package LOGICAL_PRO_STRING;

public class DUPLICAT_IN_STRING {

	public static void main(String[] args) {

		String S1 = "JAVA";

		char[] C1 = S1.toCharArray();

		for (int i = 0; i < C1.length; i++) {

			for (int j = i + 1; j < C1.length; j++) {

				if (C1[i] == C1[j]) {

					System.out.println("duplicate Charater is:" + C1[j]);
				}
			}
		}

	}

}
