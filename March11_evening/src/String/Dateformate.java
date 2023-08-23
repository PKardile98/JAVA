package String;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformate {

	public static void main(String[] args) {
		
		
		String Input = "02061998";
		
		try {
			
			SimpleDateFormat InputDate =  new SimpleDateFormat("ddmmyyyy");
			Date D1= InputDate.parse(Input);
			
			
			SimpleDateFormat OutputDate =  new SimpleDateFormat("dd MMM yyyy");
			String OP1= OutputDate.format(D1);
			
			System.out.println(OP1);
			
			
			
		} catch (ParseException e) {
			
			System.out.println("Error msg " + e.getMessage());
			
		}

	}

}
