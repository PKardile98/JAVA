package Inheritance;

public class Test1 { // Created a class to  of the program. 

	public static void main(String[] args) {

		Son S1 = new Son();
			S1.Bike();  
			S1.money();// Property of Father
			S1.house();// Property of Father
			S1.car();// Property of Father
			
			System.out.println();

			
			WhatsAppV1 T1 = new WhatsAppV1(); // Multilevel Inheritance
					   T1.textmessage();
					   
					   System.out.println();

					   
		   	WhatsAppV2 T2 = new WhatsAppV2();	   
		   			   T2.Phonecall();
		   			   T2.textmessage();
		   			   
		   			   System.out.println();
		   			   
   			WhatsAppV3 T3 = new WhatsAppV3();
   					   T3.videocall();
   					   T3.Phonecall();
   					   T3.textmessage();
   					   
   					System.out.println();
   					   
   			WhatsAppV4 T4 = new WhatsAppV4();
   					   T4.Payment();
   					   T4.textmessage();
   					   T4.videocall();
   					   T4.Phonecall();
   					   
   					System.out.println();
   		   
   			Son1 V1 = new Son1();
   			     V1.Bike();
   			     V1.car();
   			     V1.house();
   			     V1.money();
   			     
   			  System.out.println();
   			  
		    Son2 V2  = new Son2();
		    	 V2.Phone();
			     V2.car();
			     V2.house();
			     V2.money();
			     
			     System.out.println();
			     
			 Son3 V3 = new Son3();
			      V3.Laptop();
			      V3.car();
			      V3.house();
			      V3.money();
		   			
	}

}
