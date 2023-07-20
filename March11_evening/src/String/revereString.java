package String;

public class revereString {

	public static void main(String[] args) 
	{
		// Method 1
		String S1="Welcome to Automation";
		
		String P1="";
		
		//System.out.println(S1.length());
		
		for(int i=S1.length()-1; i>=0; i--)
		{
			
			P1=P1+S1.charAt(i);
			
		}
		
		System.out.println("Revstring is -->"+P1);
		
		
		
//		String S3="Java to Python";
//		System.out.println(S3.replaceAll("Java to Python", "Python to Java"));
		
//		String S8[]=S1.split(" ");
//		for(int i=S8.length-1; i>=0; i--)
//		{
//			P1= P1+S8[i]+" ";    //0=welcome,1=to, 2= automation
//			
//			
//		}
//		
//		System.out.println("Srting is --> "+P1);
		
		

	}
	
	

}
