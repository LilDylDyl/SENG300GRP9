import java.util.*; 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class Appointment{
    private String patient;
	private String doctor;
	private String date;
	private String month;
    private String time;
	
	public Appointment(String pat, String doc, String dte, String mnth, String tim){
		Boolean valid = true;
        try{
            FileReader reader = new FileReader("appointments.txt");
            FileWriter writer = new FileWriter("appointments.txt", true);
            BufferedReader appointmentSymbols = new BufferedReader(reader);
            String line = appointmentSymbols.readLine();
            while(line != null){
				if(line.equals(doc)){
					line = appointmentSymbols.readLine();
					if (line.equals(dte)){
						line = appointmentSymbols.readLine();
						if(line.equals(mnth)){
							line = appointmentSymbols.readLine();
							if(line.equals(tim)){
								valid = false;
								break;
							}

						}
						
					}
				} 

                line = appointmentSymbols.readLine();

            }
			appointmentSymbols.close();
			if (valid){
            writer.write("\n");
            writer.write(pat + "\n");
            writer.write(doc + "\n");
            writer.write(dte + "\n");
            writer.write(mnth + "\n");
            writer.write(tim + "\n");
			writer.close();
			}

        }catch(IOException error){
            error.printStackTrace();
        }
        this.patient = pat;
        this.doctor = doc;
        this.date = dte;
        this.month = mnth;
        this.time = tim;
	}
	
	public String getPatient(){
        
        String pat = this.patient;

        return pat;

	}
	
	public String getDoctor(){
        
        String doc = this.doctor;

        return doc;

	}
	
	public String getDate(){
        
        String dte = this.date;

        return dte;

	}
	
	public String getMonth(){
        
        String mnth = this.month;

        return mnth;

	}
	
	public String getTiming(){
        
        String timing = this.time;

        return timing;

	}
	
	public void setPatient(String newPatient){
        try{
            FileReader reader = new FileReader("appointments.txt");
            BufferedReader appointmentsInput = new BufferedReader(reader);
            StringBuffer inputBuffer = new StringBuffer();
            //The following saves everything into a String buffer and appends the one line.
            String currentLine = appointmentsInput.readLine();
            while(currentLine != null){
                    if (currentLine.equals(this.patient)){
                        currentLine = newPatient;
                        inputBuffer.append(currentLine);
                        inputBuffer.append("\n");
                    } else{
                        inputBuffer.append(currentLine);
                        inputBuffer.append("\n");
                    }

                currentLine = appointmentsInput.readLine();

            }
            appointmentsInput.close();
            //This reprints the String buffer created above
            FileOutputStream fileOut = new FileOutputStream("appointments.txt");
            fileOut.write(inputBuffer.toString().getBytes());
            fileOut.close();
            this.patient = newPatient;

        }catch(IOException error){
            error.printStackTrace();
        }
	}
	
	public void setDoctor(String newDoctor){
        //String userN = this.userName;
        //this.type = tpe;
        try{
            FileReader reader = new FileReader("appointments.txt");
            BufferedReader appointmentsInput = new BufferedReader(reader);
            StringBuffer inputBuffer = new StringBuffer();
            //The following saves everything into a String buffer and appends the one line.
            String currentLine = appointmentsInput.readLine();
            while(currentLine != null){
                    if (currentLine.equals(this.patient)){
                        int counter = 1;
                        while(counter < 2){
                            inputBuffer.append(currentLine);
                            inputBuffer.append("\n");
                            currentLine = appointmentsInput.readLine(); 
                            counter += 1; 
                        }
                        currentLine = newDoctor;
                        inputBuffer.append(currentLine);
                        inputBuffer.append("\n");
                    } else{
                        inputBuffer.append(currentLine);
                        inputBuffer.append("\n");
                    }

                currentLine = appointmentsInput.readLine();

            }
            appointmentsInput.close();
            //This reprints the String buffer created above
            FileOutputStream fileOut = new FileOutputStream("appointments.txt");
            fileOut.write(inputBuffer.toString().getBytes());
            fileOut.close();
            this.doctor = newDoctor;

        }catch(IOException error){
            error.printStackTrace();
        }
	}
	
	public void setDate(String newDate){
        //String userN = this.userName;
        //this.type = tpe;
        try{
            FileReader reader = new FileReader("appointments.txt");
            BufferedReader appointmentsInput = new BufferedReader(reader);
            StringBuffer inputBuffer = new StringBuffer();
            //The following saves everything into a String buffer and appends the one line.
            String currentLine = appointmentsInput.readLine();
            while(currentLine != null){
                    if (currentLine.equals(this.patient)){
                        int counter = 1;
                        while(counter < 3){
                            inputBuffer.append(currentLine);
                            inputBuffer.append("\n");
                            currentLine = appointmentsInput.readLine(); 
                            counter += 1; 
                        }
                        currentLine = newDate;
                        inputBuffer.append(currentLine);
                        inputBuffer.append("\n");
                    } else{
                        inputBuffer.append(currentLine);
                        inputBuffer.append("\n");
                    }

                currentLine = appointmentsInput.readLine();

            }
            appointmentsInput.close();
            //This reprints the String buffer created above
            FileOutputStream fileOut = new FileOutputStream("appointments.txt");
            fileOut.write(inputBuffer.toString().getBytes());
            fileOut.close();
            this.doctor = newDate;

        }catch(IOException error){
            error.printStackTrace();
        }
	}
	
	public void setMonth(String newMonth){
        //String userN = this.userName;
        //this.type = tpe;
        try{
            FileReader reader = new FileReader("appointments.txt");
            BufferedReader appointmentsInput = new BufferedReader(reader);
            StringBuffer inputBuffer = new StringBuffer();
            //The following saves everything into a String buffer and appends the one line.
            String currentLine = appointmentsInput.readLine();
            while(currentLine != null){
                    if (currentLine.equals(this.patient)){
                        int counter = 1;
                        while(counter < 4){
                            inputBuffer.append(currentLine);
                            inputBuffer.append("\n");
                            currentLine = appointmentsInput.readLine(); 
                            counter += 1; 
                        }
                        currentLine = newMonth;
                        inputBuffer.append(currentLine);
                        inputBuffer.append("\n");
                    } else{
                        inputBuffer.append(currentLine);
                        inputBuffer.append("\n");
                    }

                currentLine = appointmentsInput.readLine();

            }
            appointmentsInput.close();
            //This reprints the String buffer created above
            FileOutputStream fileOut = new FileOutputStream("appointments.txt");
            fileOut.write(inputBuffer.toString().getBytes());
            fileOut.close();
            this.doctor = newMonth;

        }catch(IOException error){
            error.printStackTrace();
        }
	}
	
	public void setTiming(String newTiming){
        //String userN = this.userName;
        //this.type = tpe;
        try{
            FileReader reader = new FileReader("appointments.txt");
            BufferedReader appointmentsInput = new BufferedReader(reader);
            StringBuffer inputBuffer = new StringBuffer();
            //The following saves everything into a String buffer and appends the one line.
            String currentLine = appointmentsInput.readLine();
            while(currentLine != null){
                    if (currentLine.equals(this.patient)){
                        int counter = 1;
                        while(counter < 5){
                            inputBuffer.append(currentLine);
                            inputBuffer.append("\n");
                            currentLine = appointmentsInput.readLine(); 
                            counter += 1; 
                        }
                        currentLine = newTiming;
                        inputBuffer.append(currentLine);
                        inputBuffer.append("\n");
                    } else{
                        inputBuffer.append(currentLine);
                        inputBuffer.append("\n");
                    }

                currentLine = appointmentsInput.readLine();

            }
            appointmentsInput.close();
            //This reprints the String buffer created above
            FileOutputStream fileOut = new FileOutputStream("appointments.txt");
            fileOut.write(inputBuffer.toString().getBytes());
            fileOut.close();
            this.doctor = newTiming;

        }catch(IOException error){
            error.printStackTrace();
        }
	}

	public static void cancelAppointment(String uname, String docName, String date, String month, String time)
	{
        int position = getPositionOnDataBase(uname, docName, date, month, time);
        int counter = 0;
		try{
			PrintWriter writer = new PrintWriter("temp.txt", "UTF-8");
			FileReader reader = new FileReader("appointments.txt");
            BufferedReader appointmentSymbols = new BufferedReader(reader);
            StringBuffer inputBuffer = new StringBuffer();
            //The following saves everything into a String buffer and appends the one line.
			String line ="";
			while(line != null){
				line = appointmentSymbols.readLine();
				if (line != null){
					if(line.equals(uname)){
                        counter += 1;
                        if (counter == position){
                            line = appointmentSymbols.readLine();
                        }
						if(line.equals(docName)){
							line = appointmentSymbols.readLine();
							if (line.equals(date)){
								line = appointmentSymbols.readLine();
								if(line.equals(month)){
									line = appointmentSymbols.readLine();
									if(line.equals(time)){
										line = appointmentSymbols.readLine();
										line = appointmentSymbols.readLine();
									}
								}
							}
						} 
					} 
					if(line != null)
						writer.println(line);
				}
            }
			appointmentSymbols.close();
			writer.close();

			File old = new File("appointments.txt");
			File newFile = new File("temp.txt");
			boolean b = old.delete();
			boolean rename = newFile.renameTo(old);
			
			if (rename){
				System.out.println("renamed");
			}
			if (b){
				System.out.println("deleted");
			}
		} catch (IOException error){
			error.printStackTrace();
		}

}

public static int getPositionOnDataBase(String username, String docName, String date, String month, String time) {
		int counter = 0;
		try {
	        FileReader reader = new FileReader("appointments.txt");
	        FileWriter writer = new FileWriter("appointments.txt", true);
	        BufferedReader appointmentSymbols = new BufferedReader(reader);
	        String uname = appointmentSymbols.readLine();
	        while(uname != null){
				if(uname.equals(username)){
                    counter++;
                    uname = appointmentSymbols.readLine();
                    if(uname.equals(docName)){
                        uname = appointmentSymbols.readLine();
                        if(uname.equals(date)){
                            uname = appointmentSymbols.readLine();
                            if(uname.equals(month)){
                                uname = appointmentSymbols.readLine();
                                if(uname.equals(time)){
                                    break;
                                }
                            }
                        }
                    }
					//System.out.println(uname);
				}
				uname = appointmentSymbols.readLine();	
				}
	            appointmentSymbols.close();
	            
		}catch(IOException error){
            error.printStackTrace();
        }
		return counter;
	}
    public static void main(String args[]) 
    { 
		/**
		 * Calendar c = Calendar.getInstance(); 
    		int month = c.get(Calendar.MONTH);
        	List<String> next12monthsList = new ArrayList<String>();
        	String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        	for (int i = month; i < monthNames.length; i++) {
        	String nextMonth = monthNames[i];
        	next12monthsList.add(monthNames[i]);
        	}
		 */

		 Appointment test = new Appointment("Matt", "doc", "2", "April", "10:30");
		 Appointment test2 = new Appointment("Matt2", "doc2", "3", "May", "7:45");

		 //test.setPatient("newMatt");
		 //test.setDoctor("newDoctor");
		 //test.setDate("3");
		 //test.setMonth("May");
		 //test.setTiming("20:15");
    	
        
    }
    public static List<String> getMonths() {
    	Calendar c = Calendar.getInstance(); 
    	int month = c.get(Calendar.MONTH);
        List<String> next12monthsList = new ArrayList<String>();
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        next12monthsList.add("--Choose month--");
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
    	else if ((nameOfMonth == "April") || (nameOfMonth == "June") || (nameOfMonth == "September") || (nameOfMonth == "November")){
    		String[] totalDates = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
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
    	//Case when month is February
    	else {
    		String[] totalDates = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28"};
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
    	List<String> listOfDates2 = new ArrayList<String>();
    	listOfDates2.add("--Choose date--");
    	listOfDates2.addAll(listOfDates);
		return listOfDates2;
    }
    
    public static List<String> getTime() {
    	List<String> timeList = new ArrayList<String>();
        String[] timings = {"--Choose Time--", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM"};
        Collections.addAll(timeList, timings);
        return timeList;
    }
    
    public static ArrayList<String> getAppointments(String name){
        //String name = user.getName();
        int amountOfAppointments = ViewAppointmentPatient.numberOfAppointments(name);
        ArrayList<String> appointmentInfo = new ArrayList<String>();
        try{
            FileReader reader = new FileReader("appointments.txt");
            BufferedReader appointmentSymbols = new BufferedReader(reader);
            String line = appointmentSymbols.readLine();
            while(amountOfAppointments != 0){
				if(line.equals(name)){
                    appointmentInfo.add(line);
					line = appointmentSymbols.readLine();
                    appointmentInfo.add(line);
                    line = appointmentSymbols.readLine();
                    appointmentInfo.add(line);
                    line = appointmentSymbols.readLine();
                    appointmentInfo.add(line);
                    line = appointmentSymbols.readLine();
                    appointmentInfo.add(line);
                    amountOfAppointments -= 1;
				} 
                line = appointmentSymbols.readLine();
            }
            appointmentSymbols.close();
            
            
        } catch (IOException error){
			error.printStackTrace();
        }
        //System.out.println(appointmentInfo);
        return appointmentInfo;
    }
    
    public static ArrayList<String> getAppointmentsDoctor(String name){
        String info = "";
        int amountOfAppointments = ViewAppointmentDoctor.numberOfAppointmentsDoctor(name);
        ArrayList<String> appointmentInfo = new ArrayList<String>();
        try{
            FileReader reader = new FileReader("appointments.txt");
            FileReader reader2 = new FileReader("appointments.txt");
            BufferedReader appointmentSymbols = new BufferedReader(reader);
            BufferedReader collectInfoReader = new BufferedReader(reader2);
            String line = appointmentSymbols.readLine();
            while(amountOfAppointments != 0){
				if(line.equals(name)){
                    appointmentInfo.add(info);
                    line = appointmentSymbols.readLine();
                    info = collectInfoReader.readLine();
                    appointmentInfo.add(info);
                    line = appointmentSymbols.readLine();
                    info = collectInfoReader.readLine();
                    appointmentInfo.add(info);
                    line = appointmentSymbols.readLine();
                    info = collectInfoReader.readLine();
                    appointmentInfo.add(info);
                    line = appointmentSymbols.readLine();
                    info = collectInfoReader.readLine();
                    appointmentInfo.add(info);
                    amountOfAppointments -= 1;
				} 

                line = appointmentSymbols.readLine();
                info = collectInfoReader.readLine();

            }
            appointmentSymbols.close();
            collectInfoReader.close();
            
            
        } catch (IOException error){
			error.printStackTrace();
        }
        //System.out.println(appointmentInfo);
        return appointmentInfo;
    }
}
