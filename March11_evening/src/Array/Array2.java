package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {


		char C1[] = new char[5];
		
		C1[0]='A';
		C1[1]='C';
		C1[2]='B';
		C1[3]='E';
		C1[4]='D';
		
		System.out.println(C1[0]);
		System.out.println(C1.length);
		
		for(int i=0; i<C1.length; i++) {
			
			System.out.print(" "+C1[i]);
		}
		
		System.out.println();
		Arrays.sort(C1);
		
	for(int i=0; i<C1.length; i++) {
				
				System.out.print(" "+C1[i]);
			}
		
		

	}

}
