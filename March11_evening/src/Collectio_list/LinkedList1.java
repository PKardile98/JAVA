package Collectio_list;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList LL = new LinkedList(); 
		
		// Insertion in element
		
		LL.add("Pradeep");
		LL.add(10);
		LL.add('A');
		LL.add(true);
		LL.add("prashant");
		
		System.out.println(LL);
		System.out.println();
		
		System.out.println(LL.size());
		
		
		System.out.println(LL.remove("Pradeep"));
		
		
		
		LL.add(0, "Pradeep kardile");
		
		System.out.println(LL);
		
		// Get--> return the element at the specified position
		
		System.out.println(LL.get(4));
		
		// Get first
		
		System.out.println(LL.getFirst());
		
		// Get last
		
		System.out.println(LL.getLast());
		
		// is empty
		
		System.out.println(LL.isEmpty());
		
		// contains --> to check weather the element is present or not
		
		System.out.println(LL.contains("Deelip"));
		System.out.println(LL.contains("Pradeep kardile"));
		
		// to read the element
		
		System.out.println(" Using for Loop ");
		
		for( int i=0; i<LL.size(); i++) {
			
			System.out.println(LL.get(i));
		}
		
		System.out.println();
		
		// for each loop 
		
		for(Object N1: LL) {
			
			System.out.println(N1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
