package Collectio_list;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		
		
		LinkedList<String> LL = new LinkedList<String>();
		
		LL.add("S");
		LL.add("A");
		LL.add("K");
		LL.add("C");
		LL.add("L");
		LL.add("E");
		LL.add("Q");
		
		System.out.println(LL);
		
		LinkedList<String> LL1 = new LinkedList<String>();
		
		LL1.addAll(LL);
		
		System.out.println();
		System.out.println(LL1);
		
		LL1.removeAll(LL1);
		System.out.println(LL1);
		// Collection
		
		System.out.println("Before Sort"+ LL);
		
		Collections.sort(LL);
		
		System.out.println("After sort"+LL);
		
		Collections.sort(LL, Collections.reverseOrder());
		
		System.out.println(LL);
		
		

	}

}
