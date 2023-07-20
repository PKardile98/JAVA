package Controlstatements;

public class IfElse_Statement {

	public static void main(String[] args) {
		/*Syntax
		if(condition){
			 Statement 1 //Executed when condition is true
		      }
		    else{
		   Statement 2////Executed when condition id false
             
	     }*/

		
		int Marks = 67;
		int Marks1= 23;
		
		if(Marks>=35) {
			
			System.out.println("Student is Pass:67 marks");
		}
		else {
			
			System.out.println("Student is Fail:");
		}
		
		if(Marks1>=35) {
			
			System.out.println("Student_1 is Pass:");
			
		}
		else {
			
			System.out.println("Student_1 is Fail:23 marks");
		}
		
		System.out.println("program Ended:");

		
}
	
	
	
	
}
