package Array;

public class Array1 {

	public static void main(String[] args) {
		// 1. Array declaration
		// Syntax 
		
		// DataType ArrayName[] = new DataType[Size of array]
		// eg: int Arr1[] = new int[10];
		
		// 2. Initialization
		// ArrayName[indexNo.]
		
		// Arr1[0];
		
		// usage --> System.out.println(Arr1[0]);
		
		int Arr1[] = new int[5];
		
		Arr1[0]=10;
		Arr1[1]=20;
		Arr1[2]=30;
		Arr1[3]=40;
		Arr1[4]=50;
		
		System.out.println(Arr1.length);
		
		System.out.println("Index 1="+Arr1[0]);
		
		for(int i=0; i<Arr1.length; i++) {
			
			System.out.println(Arr1[i]);
		}
	
	}

}
