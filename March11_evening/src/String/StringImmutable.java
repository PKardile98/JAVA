package String;

public class StringImmutable {

	public static void main(String[] args) {
		//once we create object java doesn't allow to perform changes.
		//but if you are trying to perform any changes, with those changes new object will be created.
		
		String S1="Pradeep";
		String S2="Java";
		String S3="Prashant";
		
		S3="Deepak";
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);
		

	}

}
