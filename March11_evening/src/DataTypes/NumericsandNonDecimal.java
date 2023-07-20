package DataTypes;

public class NumericsandNonDecimal {

	public static void main(String[] args) 
	{
	    // Primitive Data Types
		// Data types are- Byte,int,short,long
		
		// 1.Byte ----> 1 byte = 8bit -----> -128 to 127
		// Syntax--- Datatype variablename = value; 
		//  Example: byte B1 = 60;
		
		 byte B1 = 60;
		 byte B2 = 127; // Max limit 
		//byte B3 = 128; // Not allowed 
		 
		System.out.println("*BYTE DATA TYPE*");
		System.out.println("Byte data type--->"+B1);
		System.out.println("Byte data type Max limit--->"+B2);
		System.out.println();
		
		byte B4= -127;
		byte B5= -128; // Min Limit 
		//byte B6= -130; // Not allowed As Min limit is -128
		
		
		System.out.println("Byte data type--->"+B4);
		System.out.println("Byte data type Min Limit--->"+B5);
		System.out.println();
		
		
		System.out.println("-------------------------------------------");
		
		
	    // 2. Short ----> 2 byte = 16 Bit ----> -32768 to 32767
		//    Syntax--- Datatype variablename = value; 
		//    short S1= 40;
		
		short S1= 100;
		short S2= 32767; // Max limit 
		//short S2= 32768; // Not allowed as exceeded the short data type storage value.
		
		System.out.println("*SHORT DATA TYPE*");
		System.out.println(" Short Data Type--->"+S1);
		System.out.println(" Short Data Type Max limit--->"+S2);
		System.out.println();
		
		short S3= -100;
		short S4= -32767;
		//short S5= -32768; // Not allowed as exceeded the short data type storage value.
		
	
		System.out.println(" Short Data Type--->"+S3);
		System.out.println(" Short Data Type Min Limit--->"+S4);
		System.out.println();
		
		System.out.println("-----------------------------------------------");
		
		// 3. Int -----> 4 byte = 32 bits -----> -2147484648 to 2147483647
		
		
		int i1= 230;
		int i2= 2147483647; // Max limit 
		//int I3= 2147484648; // Max limit exceeded 
		
		System.out.println("*INT DATA TYPE*");
		System.out.println(" INT Data Type--->"+i1);
		System.out.println(" INT Data Type Max Limit--->"+i2);
		System.out.println();
		
		
		int i3= -230;
		int i4= -2147483648;// Min limit 
		//int i5= -2147483649;// Min limit exceeded 
		
	
		System.out.println(" INT Data Type--->"+i3);
		System.out.println(" INT Data Type MIN Limit--->"+i4);
		System.out.println();
		
		// Long -----> 8 bytes-->64 bit
		System.out.println("---------------------------------------------------------------");
		long L1= 991848749747464772l;
		long L2= 827673458767717578l;
		
		long L3= -871746865728l;
		long L4= -837746578013677l;
		
		System.out.println(" Long Data Types--->"+L1);
		System.out.println(" Long Data Types--->"+L2);
		System.out.println();
		System.out.println(" Long Data Types--->"+L3);
		System.out.println(" Long Data Types--->"+L4);
		
				
	}

}
