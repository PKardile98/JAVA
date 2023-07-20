package Constructor;

public class Userdefined_withparameter2 {
	
	String Name; // Non static global variable 
	String Model; // Var declare
	int Price;
	String engine;
	
	Userdefined_withparameter2(String Name, String Model, int Price, String engine ){ // Constructor with parameter
		
		// Var initialization
		this.Name=Name;
		this.Model=Model;
		this.Price=Price;
		this.engine=engine;
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		
		Userdefined_withparameter2 UP1= new Userdefined_withparameter2("Kia","Sonent",2000,"Petrol");
		Userdefined_withparameter2 UP2= new Userdefined_withparameter2("Tata","nexon",4000,"Electric");
		Userdefined_withparameter2 UP3= new Userdefined_withparameter2("Maruti","800",1000,"Petrol");
		
		System.out.println(UP1.Name+" "+ UP1.Model+" "+ UP1.Price+" "+ UP1.engine);
		System.out.println(UP2.Name+" "+ UP2.Model+" "+ UP2.Price+" "+ UP2.engine);
		System.out.println(UP3.Name+" "+ UP3.Model+" "+ UP3.Price+" "+ UP3.engine);

	}

}
