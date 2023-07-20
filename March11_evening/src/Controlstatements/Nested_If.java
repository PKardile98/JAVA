package Controlstatements;

public class Nested_If {
	public static void main(String[] args) {
		
		// nested If-else control statement 
		/*if(Condition1) {
			statement 1 —> Executed when condition1 is true
			if(condition 2){
			statement 2—>Executed when Condition 2 is true
			}
			else{
			Statement 3 //Executed when condition 2 is false
			}*/
		
		// Check the highest Number
		
		int V1= 500;
		int V2= 900;
		int V3= 300;
		
		if(V1>V2) { // 100>200 False 
			if(V1>V3)
			System.out.println("V1 is the greatest No.");
		}
		else if(V2>V3) { //200>300 False
			
			System.out.println("V2 is the greatest No.");
		}
		else {
			System.out.println("V3 is the greatest No.");
		}
	}

}
