package Controlstatements;

public class If_else_ifstatement {

	public static void main(String[] args) {
		/*if else-if ladder statement
		syntax 
		if(condition 1){
		Statement 1 —> Execute when condition 1 is true
		}
		else if(condition 2){
		statement 2 —> Executed when condition 2 is true
		}
		else if (condition 3){
		statement 3 —> Executed when condition 3 is true
		}
		else{
		statement 4 —> Executed when all condition are false
		}*/
		
		// Used to check the Marks status:
		
		int Marks1= 30;
		
		if(Marks1>=65) { // False 
			
			System.out.println("Distiction");
		}
		else if(Marks1>=60) { // False
			
			System.out.println("First class");
		}
		else if(Marks1>=55) { // False
			
			System.out.println("Sceond class");
		}
		else if(Marks1>=50) { // true
			
			System.out.println("Third class");
		}
        else if(Marks1>=35) {
			
			System.out.println("Pass");
		}
        else {
        	
        	System.out.println("Failed");
        }
		
	}

}
