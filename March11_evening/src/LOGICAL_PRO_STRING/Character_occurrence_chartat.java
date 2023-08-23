package LOGICAL_PRO_STRING;

public class Character_occurrence_chartat {

	public static void main(String[] args) {

		String D1 = "DDDDDDDDHHHHHHHKKKKKKK";
		count_the_OccUrrence(D1, 'D');
		count_the_OccUrrence(D1, 'H');
		count_the_OccUrrence(D1, 'K');

	}

	public static void count_the_OccUrrence(String D1, char value) {
		int count = 0;

		for (int i = 0; i < D1.length(); i++) {

			if (D1.charAt(i) == value) {

				count++;

			}
		}

		System.out.println("count of " + value + "-->" + "" + count);

	}

}
