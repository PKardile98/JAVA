package Controlstatements;

public class LeapYear {

	public static void main(String[] args) {
		// Condition for leap year 
		// Year should be divisible by 400 and 4 but not by 100

		int Year= 2000;
		
		if(Year%400==0) {
			
			System.out.println("The Year is Leap Year:"+Year);
		}
		else if(Year%100==0) {
			
			System.out.println("The Year not is Leap Year:"+Year);
		}
		else if(Year%4==0) {
					
					System.out.println("The Year is Leap Year:"+Year);
				}
		else {
			
			System.out.println( "Year is not leap year:"+ Year);
		}
		
	}

}
