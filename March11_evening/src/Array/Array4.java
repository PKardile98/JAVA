package Array;

public class Array4 {

	public static void main(String[] args) {
		// 
		
		String S1[][] = new String[4][5];
		
		System.out.println(S1.length); // No. of rows
		System.out.println(S1[2].length); // No.of Column
		
		S1[0][0]="A1"; // 1st row
		S1[0][1]="A2";
		S1[0][2]="A3";
		S1[0][3]="A4";
		S1[0][4]="A5";
		
		System.out.println(S1[0][4]);
			
		S1[1][0]="B1"; // 2nd row
		S1[1][1]="B2";
		S1[1][2]="B3";
		S1[1][3]="B4";
		S1[1][4]="B5";
		
		System.out.println(S1[1][4]);
		
		S1[2][0]="C1"; //3rd row
		S1[2][1]="C2";
		S1[2][2]="C3";
		S1[2][3]="C4";
		S1[2][4]="C5";
		
		System.out.println(S1[2][4]);
		
		S1[3][0]="D1"; //4rd row
		S1[3][1]="D2";
		S1[3][2]="D3";
		S1[3][3]="D4";
		S1[3][4]="D5";
		
		System.out.println(S1[3][4]);
		
		// 0<4-- true
		//4<4-- False
		
		for(int row=0; row<S1.length; row++ ) 
		
		{
			
			//0<5- true 
			//1<5- true
			//2<5- true
			//3<5- true
			//4<5- true
			//5<5-true
			
			for(int col=0; col<S1[2].length; col++ ) 
			
			{
				
				  System.out.print(S1[row][col]+" ");
				//System.out.print(S1[0][0]+" "); -------A1
				//System.out.print(S1[0][1]+" "); -------A2
				//System.out.print(S1[0][2]+" "); -------A3
				//System.out.print(S1[0][3]+" "); -------A4
				//System.out.print(S1[0][4]+" "); -------A5
			}
			System.out.println();
			
		}

	}

}
