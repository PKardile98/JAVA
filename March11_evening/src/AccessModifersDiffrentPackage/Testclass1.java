package AccessModifersDiffrentPackage;

import AccessModifiers.Default1;
import AccessModifiers.Private1;
import AccessModifiers.Public1;
import AccessModifiers.protected1;

public class Testclass1 extends protected1 {
	
	public static void main(String[] args) {
		
		
		Public1 PU1 = new Public1(); // Public access the data in other package also
		PU1.P1();
		PU1.P2();
		System.out.println(PU1.i);
		System.out.println(PU1.j);
		
		System.out.println();
		
		Private1 PR1 = new Private1(); // Can't access outside the package
		//PR1.Test();
		//PR1.Test1();
		//System.out.println(PR1.a);
		
		Default1 DD1 = new Default1(); // Can't access outside the package
		//DD1.D1();
		//DD1.D2();
		//System.out.println(DD1.num);
		
		Testclass1 PPP1 = new Testclass1(); // For accessing the the protected class outside the package we have to create the object.
		// The class where we are extending the child class.=
				
				PPP1.demo1();
				PPP1.demo1();
				System.out.println(PPP1.A);
			}

}
