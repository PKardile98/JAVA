package Collectio_list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylist_2 {

	public static void main(String[] args) {
		
		
		
		ArrayList AL = new ArrayList();
		
		AL.add("My");
		AL.add("Name");
		AL.add("Is");
		AL.add("Pradeep");
//		AL.add('Z');
		
		System.out.println(AL);
		
		System.out.println();
		
		
		// 1. Add all
		
		ArrayList Duplicate = new ArrayList();
		Duplicate.addAll(AL);
		
		System.out.println(Duplicate);
		
		System.out.println();
		
		// 2. Remove All
		
		Duplicate.removeAll(AL);
		System.out.println(Duplicate);
		
		// Collections Methods 
		
		// 1. sort 
		
		System.out.println(AL);
	    Collections.sort(AL);
	    System.out.println(AL);
	    
	    System.out.println();
	    
	    // 2. Reverse order 
	    
	   
	    Collections.sort(AL, Collections.reverseOrder());
	    System.out.println(AL);
	    
	    // 3. Shuffle 
	    
	    Collections.shuffle(AL);
	    System.out.println(AL);
		
		
		
//		String A1[]= {"Pradeep","Prashant"};
//		
//		ArrayList a3 =  new ArrayList(Arrays.asList(A1));
//		
//		System.out.println(a3);
		
		
		
		
		

	}
	
	

}
