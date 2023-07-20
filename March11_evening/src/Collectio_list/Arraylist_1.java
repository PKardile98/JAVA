package Collectio_list;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_1 {

	public static void main(String[] args) {
		
		
		ArrayList AL = new ArrayList();
		
		
		//1. Add element to the array list
	     AL.add("Pradepkardile");
	     AL.add(200);
	     AL.add('A');
		 AL.add(30.4);
		 AL.add(true);
		 
		 
		 //2. Size --. returns the the size of the array list 
		 
		 System.out.println("Size of the Arraylist -->"+AL.size());
		 
		 //3. remove --> to remove the element from the list
		 
		 AL.remove(true);
		 System.out.println(AL);
		 
		 //4. Insert --> Insert the element in the list 
		 
		 AL.add(0, "Prashant kardile");
		 System.out.println(AL);
		 
		 //5. retrive--> To get the specific info
		 
		      System.out.println(AL.get(1));
		      
		 //6. replace / replace 
		      // Set 
		      
	      AL.set(1, "Deepak");
	      AL.set(2, 30);
	      System.out.println(AL);
	      
	      System.out.println();
	      
	      //7. isempty 
	      
	      ArrayList AL1 = new ArrayList();
	      System.out.println(AL.isEmpty());
	      System.out.println(AL1.isEmpty());
	      
	      System.out.println();
	      
	      
	     //8. read/print data from arraylist
	      
	      
		  System.out.println("reading element using for loop");
		  
		  for(int i=0; i<AL.size(); i++) {
			  
			  
			  System.out.println(AL.get(i));
		  }
		  
		  // for each loop
		  
		  System.out.println();
		  
		  System.out.println("Reading element for each loop");
		  
		  for(Object obj: AL) {
			  
			  System.out.println(obj);
		  }
		  
		  // using iterator ---> doubt
		  
		  System.out.println("****************");
		  
		  Iterator AL2 = AL.iterator();
		  
		  while (AL2.hasNext()) {
			
			  System.out.println(AL2.next());
			
		}
		  
		  
		  
		  
		  
		  
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		
		

	}

}
