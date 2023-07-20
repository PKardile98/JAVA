package Array;

import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		// sorting of the no.
		
		int A2[]={9,2,5,4,8,1,7,6};

		//System.out.println(A2.length);

		for(int i=0; i<A2.length; i++)
		{

		   System.out.print(A2[i]+" ");

		}
		
		System.out.println();
		
		Arrays.sort(A2);
		
		for(int i=0; i<A2.length; i++)
		{

		   System.out.print(A2[i]+" ");

		}

		
		
		
	}

}
