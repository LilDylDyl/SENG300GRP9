import java.util.*; 

public class Appointment{
    private Date date;
    private Account doctor;
    private Account patient;
    

    public static void main(String args[]) 
    { 
    	Calendar c = Calendar.getInstance(); 
    	int month = c.get(Calendar.MONTH);
        List<String> next12monthsList = new ArrayList<String>();
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i = month; i < monthNames.length; i++) {
        	String nextMonth = monthNames[i];
        	next12monthsList.add(monthNames[i]);
        }
        //System.out.println("The Current Date is: " + c.getTime()); 
        //System.out.println("Current Calendar's Year: " + c.get(Calendar.YEAR)); 
        //System.out.println("Current Calendar's Month: " + c.get(Calendar.MONTH)); 
        //System.out.println("Current DAY: " + c.get(Calendar.DAY_OF_WEEK)); 
        //System.out.println("Current DATE: " + c.get(Calendar.DATE)); 
        //System.out.println("Current HOUR: " + c.get(Calendar.HOUR)); 
        //System.out.println("Current MINUTE: " + c.get(Calendar.MINUTE)); 
        //System.out.println("Current SECOND: " + c.get(Calendar.SECOND)); 
        
        
        
        //System.out.println(next12monthsList);
        
        //System.out.println(getDates("March"));
        
    }
    public static List<String> getMonths() {
    	Calendar c = Calendar.getInstance(); 
    	int month = c.get(Calendar.MONTH);
        List<String> next12monthsList = new ArrayList<String>();
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i = month; i < monthNames.length; i++) {
        	String nextMonth = monthNames[i];
        	next12monthsList.add(monthNames[i]);
        }
        return next12monthsList;
    }
    
    
    public static List<String> getDates(String nameOfMonth) {
    	List<String> listOfDates = new ArrayList<String>();
    	Calendar c = Calendar.getInstance(); 
    	int month = c.get(Calendar.MONTH);
    	String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    	if ((nameOfMonth == "January") || (nameOfMonth == "March") || (nameOfMonth == "May") || (nameOfMonth == "July") || (nameOfMonth == "August") || (nameOfMonth == "October") || (nameOfMonth == "December")) {
    		String[] totalDates = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    		if ((nameOfMonth == monthNames[month])) {
    			int todaysDate = c.get(Calendar.DATE);
        		for (int i = todaysDate; i < totalDates.length; i++) {
                	String nextDay = totalDates[i];
                	listOfDates.add(totalDates[i]);
        		}
    		}
        	else {
        		for (int i = 0; i < totalDates.length; i++) {
                	String nextDay = totalDates[i];
                	listOfDates.add(totalDates[i]);
        		}
        	}
    	}
		return listOfDates;	
    }
}
