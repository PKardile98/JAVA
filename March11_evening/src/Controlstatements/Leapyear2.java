package Controlstatements;

public class Leapyear2 {

	public static void main(String[] args) {
		// using logical operators to reduce the number of if-else statements 
       //Year should be divisible by 400 and 4 but not by 100
		int Year1= 2000;
		
		if((Year1%400==0) || ((Year1%4==0) && (Year1% 100!=0))) {
			
			System.out.println("Year is leap Year:"+ Year1);
				
		}
		else {
			
			System.out.println("Year is not leap Year:"+ Year1);
		}
	}

}
