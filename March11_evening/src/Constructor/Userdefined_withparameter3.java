package Constructor;

public class Userdefined_withparameter3 {
	
	// Variable Dec
	
	String Name;
	int Class;
	char Grade;
	float Percentage;
	
	// Variable dec for addition
	
	int N1;
	int N2;
	int N3;
	
	String Name1;
	
	
	Userdefined_withparameter3(int N1, int b){ // Two input
		
		this.N1=N1;
		N2=b;
			
	}
	Userdefined_withparameter3(int a, int b ,int c){ // 3 input 
		
		N1=a;
		N2=b;
		N3=c;
		
	}
	Userdefined_withparameter3(String Name1){
		
		this.Name1=Name1;
		
	}
	public void Student() {
		

		
		String Name12=Name1;
		System.out.println("Student name="+Name12);
		
	}
	
	public void Multi1(){
		
		int multiplication= N1*N2*N3;
		System.out.println("Multipluication ="+multiplication);
		
	}
	
	
	public void ADD1() {
		
		int sum = N1+N2;
		System.out.println("Additon of Two no. is ="+sum);
		
	}
	
	public void SUB1() {
		
		int sub = N1-N2;
		System.out.println("Sub of Two no. is ="+sub);
		
	}
	
	
	 
	Userdefined_withparameter3(String Name, int Class, char Grade, Float Percentage){ // 4 input Parameter Constructor
		
	   this.Name=Name;
	   this.Class=Class;
	   this.Grade=Grade;
	   this.Percentage=Percentage;
		
	
	}
	

	public static void main(String[] args) {
		
		Userdefined_withparameter3 S1 = new Userdefined_withparameter3("Pradeep", 10, 'A', 90.7f);
		Userdefined_withparameter3 S2 = new Userdefined_withparameter3("Prashant", 11, 'c', 96.7f);
		Userdefined_withparameter3 S3 = new Userdefined_withparameter3("Deepak", 9, 'B', 94.7f);
		
		Userdefined_withparameter3 S4 = new Userdefined_withparameter3(100,50);
		S4.ADD1();
		S4.SUB1();
		
		Userdefined_withparameter3 S5 = new Userdefined_withparameter3(5,5,5);
		S5.Multi1();
		Userdefined_withparameter3 S6 = new Userdefined_withparameter3(2,2,2);
		S6.Multi1();
		Userdefined_withparameter3 S7 = new Userdefined_withparameter3("Pradeep");
		S7.Student();
		
		
		System.out.println("Student Details = "+S1.Name+" "+S1.Class+" "+S1.Grade+" "+S1.Percentage);
		System.out.println("Student Details = "+S2.Name+" "+S2.Class+" "+S2.Grade+" "+S2.Percentage);
		System.out.println("Student Details = "+S3.Name+" "+S3.Class+" "+S3.Grade+" "+S3.Percentage);
		
		
		
	}

}
