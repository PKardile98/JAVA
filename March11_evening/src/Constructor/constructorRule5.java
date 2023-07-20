package Constructor;

public class constructorRule5 {

	public static void main(String[] args) {
		
		
		// Any no. of Constructor can be declare with same name as Class name, but  with different parameter 
		
		constructorRule5 B1 = new constructorRule5();
		constructorRule5 B2 = new constructorRule5(1);
		constructorRule5 B3 = new constructorRule5(1,2);
		constructorRule5 B4 = new constructorRule5(1,2,3);
		constructorRule5 B5 = new constructorRule5(1,2,3,4);
		
	}
	 public constructorRule5() {
		 
		 System.out.println("Zero input parameter constructor:");
	 }
	 
	 public constructorRule5(int i) {
		 
		 System.out.println("One input parameter constructor:");
		 
	 }
	 public constructorRule5(int i , int j) {
		 
		 
		 System.out.println("Two input parameter constructor:");
	 }
	 public constructorRule5(int i , int j , int k) {
		 
		 
		 System.out.println("Three input parameter constructor:");
	 }
	 public constructorRule5(int i , int j , int k, int l) {
		 
		 System.out.println("four input parameter constructor:"); 
		 
	 }

}
