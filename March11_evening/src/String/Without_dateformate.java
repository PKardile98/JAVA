package String;

public class Without_dateformate {

	public static void main(String[] args) {
String inputDate = "10061998";
        
        if (inputDate.length() == 8) {
            int day = Integer.parseInt(inputDate.substring(0, 2));
            int month = Integer.parseInt(inputDate.substring(2, 4));
            int year = Integer.parseInt(inputDate.substring(4));
            
            String monthString = getMonthString(month);
            
            String outputDate = day + " " + monthString + " " + year;
            System.out.println(outputDate);
        } else {
            System.out.println("Invalid input date format.");
        }
    }
    
    private static String getMonthString(int month) {
        switch (month) {
            case 1: return "Jan";
            case 2: return "Feb";
            case 3: return "Mar";
            case 4: return "Apr";
            case 5: return "May";
            case 6: return "Jun";
            case 7: return "Jul";
            case 8: return "Aug";
            case 9: return "Sep";
            case 10: return "Oct";
            case 11: return "Nov";
            case 12: return "Dec";
            default: return "";
        }
    }
	}


