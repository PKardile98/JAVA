package Constructor;

public class Userdefined_withparameter1 {
	
	int num1;
	int num2;
	String sName;
	
	Userdefined_withparameter1(int a, int b){ // 2 para
		
		num1=a;
		num2=b;
		
	}
	
	Userdefined_withparameter1(String str){ // 1 para 
		
		sName= str;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Userdefined_withparameter1 P1 = new Userdefined_withparameter1(20,30);
		                           P1.Addition1();
		                           P1.Substration1();    
	                               P1.multiplication();
	                               P1.Division();
	    Userdefined_withparameter1 P2 = new Userdefined_withparameter1("Pradeep");
	                               P2.StudentName1();
	}
	
	public void Addition1() {
		
		int Addvalue= num1+num2;
		System.out.println("Addtion value=" +Addvalue);
		
	}
	
	public void Substration1() {
		
		int Subvalue= num1-num2;
		System.out.println("Sub value=" +Subvalue);
	}
	
	public void multiplication() {
		
		int mulValue= num1*num2;
		System.out.println("Mul value=" +mulValue);
		
	}
	
	public void Division() {
		
		int divValue = num1/num2;
		System.out.println("Div value=" +divValue);
		
	}
	
	public void StudentName1() {
		
		String Name = sName;
		System.out.println("Student Name= "+Name);
		
	}
	
	

}
