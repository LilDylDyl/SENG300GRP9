import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewAppointmentPatient extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAppointmentPatient frame = new ViewAppointmentPatient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewAppointmentPatient() {
		setTitle("View Appointment");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		String uname = "", docName = "", date = "", month = "", time = "";
		Boolean valid = true;
		int numberOfAppointments = numberOfAppointments(RegPage.username);
        try{
            FileReader reader = new FileReader("appointments.txt");
            FileWriter writer = new FileWriter("appointments.txt", true);
            BufferedReader appointmentSymbols = new BufferedReader(reader);
            uname = appointmentSymbols.readLine();
            while(uname != null){
				if(uname.equals(RegPage.username)){
					valid = false;
					displayAppointment(RegPage.username, numberOfAppointments);
					docName = appointmentSymbols.readLine();
					date = appointmentSymbols.readLine();
					month = appointmentSymbols.readLine();
					time = appointmentSymbols.readLine();
				}
				uname = appointmentSymbols.readLine();	
				}
                appointmentSymbols.close();
    			if (valid){
    				JLabel lblNewLabelError = new JLabel("Sorry! No appointments were found!");
    				lblNewLabelError.setBounds(171, 185, 337, 25);
    				lblNewLabelError.setFont(new Font("Serif", Font.PLAIN, 20));
    				contentPane.add(lblNewLabelError);
    				
    				JButton btnNewButton = new JButton("Back");
    				btnNewButton.addActionListener(new ActionListener() {
    					public void actionPerformed(ActionEvent e) {
    						MainPagePatient mainpagepatient = new MainPagePatient();
    						mainpagepatient.setVisible(true);
    					}
    				});
    				btnNewButton.setBounds(265, 357, 117, 29);
    				contentPane.add(btnNewButton);

    				}
            //}
        }catch(IOException error){
            error.printStackTrace();
        }
	}
	
	public void displayAppointment(String username, int numberOfAppointments) {
		String uname = "", docName = "", date = "", month = "", time = "", docName2 = "", date2= "", month2 = "", time2 = "", docName3 = "", date3 = "", month3 = "", time3 = "", docName4 = "", date4 = "", month4 = "", time4 = "", docName5 = "", date5 = "", month5 = "", time5 = "", docName6 = "", date6 = "", month6 = "", time6 = "", docName7 = "", date7 = "", month7 = "", time7 = "", docName8 = "", date8 = "", month8 = "", time8 = "", docName9 = "", date9 = "", month9 = "", time9 = "", docName10 = "", date10 = "", month10 = "", time10 = "";
		JLabel lblNewLabel = new JLabel("Below are your confirmed appointments.");
		lblNewLabel.setBounds(160, 30, 360, 25);
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Doctor");
		lblNewLabel_1.setBounds(200, 65, 97, 16);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Date");
		lblNewLabel_2.setBounds(320, 65, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Timings");
		lblNewLabel_3.setBounds(410, 65, 61, 16);
		contentPane.add(lblNewLabel_3);
		if(numberOfAppointments == 1) {
	        try{
	            FileReader reader = new FileReader("appointments.txt");
	            FileWriter writer = new FileWriter("appointments.txt", true);
	            BufferedReader appointmentSymbols = new BufferedReader(reader);
	            uname = appointmentSymbols.readLine();
	            while(uname != null){
					if(uname.equals(username)){
						docName = appointmentSymbols.readLine();
						date = appointmentSymbols.readLine();
						month = appointmentSymbols.readLine();
						time = appointmentSymbols.readLine();
					}
					uname = appointmentSymbols.readLine();	
					}
	
	                
	                appointmentSymbols.close();
	                
	        }catch(IOException error){
	            error.printStackTrace();
	        }
			docName = Appointment.getAppointments(RegPage.username).get(1);
			date = Appointment.getAppointments(RegPage.username).get(2);
			month = Appointment.getAppointments(RegPage.username).get(3);
			time = Appointment.getAppointments(RegPage.username).get(4);
			
			JLabel srNo1 = new JLabel("1.");
			srNo1.setBounds(175, 90, 20, 16);
			contentPane.add(srNo1);
			
			JLabel pName1 = new JLabel(docName);
			pName1.setBounds(200, 90, 97, 16);
			contentPane.add(pName1);
			
			JLabel d1 = new JLabel(date + " " + month);
			d1.setBounds(300, 90, 150, 16);
			contentPane.add(d1);
			
			JLabel t1 = new JLabel(time);
			t1.setBounds(410, 90, 90, 16);
			contentPane.add(t1);
			
		}
		else if(numberOfAppointments == 2) {
			docName = Appointment.getAppointments(RegPage.username).get(1);
			date = Appointment.getAppointments(RegPage.username).get(2);
			month = Appointment.getAppointments(RegPage.username).get(3);
			time = Appointment.getAppointments(RegPage.username).get(4);
			docName2 = Appointment.getAppointments(RegPage.username).get(6);
			date2 = Appointment.getAppointments(RegPage.username).get(7);
			month2 = Appointment.getAppointments(RegPage.username).get(8);
			time2 = Appointment.getAppointments(RegPage.username).get(9);
			
			JLabel srNo1 = new JLabel("1.");
			srNo1.setBounds(175, 90, 20, 16);
			contentPane.add(srNo1);
			
			JLabel srNo2 = new JLabel("2.");
			srNo2.setBounds(175, 120, 20, 16);
			contentPane.add(srNo2);
			
			JLabel pName1 = new JLabel(docName);
			pName1.setBounds(200, 90, 97, 16);
			contentPane.add(pName1);
			
			JLabel pName2 = new JLabel(docName2);
			pName2.setBounds(200, 120, 97, 16);
			contentPane.add(pName2);
			
			JLabel d1 = new JLabel(date + " " + month);
			d1.setBounds(300, 90, 150, 16);
			contentPane.add(d1);
			
			JLabel d2 = new JLabel(date2 + " " + month2);
			d2.setBounds(300, 120, 150, 16);
			contentPane.add(d2);
			
			JLabel t1 = new JLabel(time);
			t1.setBounds(410, 90, 90, 16);
			contentPane.add(t1);
			
			JLabel t2 = new JLabel(time2);
			t2.setBounds(410, 120, 90, 16);
			contentPane.add(t2);
		}
		else if(numberOfAppointments == 3) {
			docName = Appointment.getAppointments(RegPage.username).get(1);
			date = Appointment.getAppointments(RegPage.username).get(2);
			month = Appointment.getAppointments(RegPage.username).get(3);
			time = Appointment.getAppointments(RegPage.username).get(4);
			docName2 = Appointment.getAppointments(RegPage.username).get(6);
			date2 = Appointment.getAppointments(RegPage.username).get(7);
			month2 = Appointment.getAppointments(RegPage.username).get(8);
			time2 = Appointment.getAppointments(RegPage.username).get(9);
			docName3 = Appointment.getAppointments(RegPage.username).get(11);
			date3 = Appointment.getAppointments(RegPage.username).get(12);
			month3 = Appointment.getAppointments(RegPage.username).get(13);
			time3 = Appointment.getAppointments(RegPage.username).get(14);
			
			JLabel srNo1 = new JLabel("1.");
			srNo1.setBounds(175, 90, 20, 16);
			contentPane.add(srNo1);
			
			JLabel srNo2 = new JLabel("2.");
			srNo2.setBounds(175, 120, 20, 16);
			contentPane.add(srNo2);
			
			JLabel srNo3 = new JLabel("3.");
			srNo3.setBounds(175, 150, 20, 16);
			contentPane.add(srNo3);
			
			JLabel pName1 = new JLabel(docName);
			pName1.setBounds(200, 90, 97, 16);
			contentPane.add(pName1);
			
			JLabel pName2 = new JLabel(docName2);
			pName2.setBounds(200, 120, 97, 16);
			contentPane.add(pName2);
			
			JLabel pName3 = new JLabel(docName3);
			pName3.setBounds(200, 150, 97, 16);
			contentPane.add(pName3);
			
			JLabel d1 = new JLabel(date + " " + month);
			d1.setBounds(300, 90, 150, 16);
			contentPane.add(d1);
			
			JLabel d2 = new JLabel(date2 + " " + month2);
			d2.setBounds(300, 120, 150, 16);
			contentPane.add(d2);
			
			JLabel d3 = new JLabel(date3 + " " + month3);
			d3.setBounds(300, 150, 150, 16);
			contentPane.add(d3);
			
			JLabel t1 = new JLabel(time);
			t1.setBounds(410, 90, 90, 16);
			contentPane.add(t1);
			
			JLabel t2 = new JLabel(time2);
			t2.setBounds(410, 120, 90, 16);
			contentPane.add(t2);
			
			JLabel t3 = new JLabel(time3);
			t3.setBounds(410, 150, 90, 16);
			contentPane.add(t3);
		}
		else if(numberOfAppointments == 4) {
			docName = Appointment.getAppointments(RegPage.username).get(1);
			date = Appointment.getAppointments(RegPage.username).get(2);
			month = Appointment.getAppointments(RegPage.username).get(3);
			time = Appointment.getAppointments(RegPage.username).get(4);
			docName2 = Appointment.getAppointments(RegPage.username).get(6);
			date2 = Appointment.getAppointments(RegPage.username).get(7);
			month2 = Appointment.getAppointments(RegPage.username).get(8);
			time2 = Appointment.getAppointments(RegPage.username).get(9);
			docName3 = Appointment.getAppointments(RegPage.username).get(11);
			date3 = Appointment.getAppointments(RegPage.username).get(12);
			month3 = Appointment.getAppointments(RegPage.username).get(13);
			time3 = Appointment.getAppointments(RegPage.username).get(14);
			docName4 = Appointment.getAppointments(RegPage.username).get(16);
			date4 = Appointment.getAppointments(RegPage.username).get(17);
			month4 = Appointment.getAppointments(RegPage.username).get(18);
			time4 = Appointment.getAppointments(RegPage.username).get(19);
			
			JLabel srNo1 = new JLabel("1.");
			srNo1.setBounds(175, 90, 20, 16);
			contentPane.add(srNo1);
			
			JLabel srNo2 = new JLabel("2.");
			srNo2.setBounds(175, 120, 20, 16);
			contentPane.add(srNo2);
			
			JLabel srNo3 = new JLabel("3.");
			srNo3.setBounds(175, 150, 20, 16);
			contentPane.add(srNo3);
			
			JLabel srNo4 = new JLabel("4.");
			srNo4.setBounds(175, 180, 20, 16);
			contentPane.add(srNo4);
			
			JLabel pName1 = new JLabel(docName);
			pName1.setBounds(200, 90, 97, 16);
			contentPane.add(pName1);
			
			JLabel pName2 = new JLabel(docName2);
			pName2.setBounds(200, 120, 97, 16);
			contentPane.add(pName2);
			
			JLabel pName3 = new JLabel(docName3);
			pName3.setBounds(200, 150, 97, 16);
			contentPane.add(pName3);
			
			JLabel pName4 = new JLabel(docName4);
			pName4.setBounds(200, 180, 97, 16);
			contentPane.add(pName4);
			
			JLabel d1 = new JLabel(date + " " + month);
			d1.setBounds(300, 90, 150, 16);
			contentPane.add(d1);
			
			JLabel d2 = new JLabel(date2 + " " + month2);
			d2.setBounds(300, 120, 150, 16);
			contentPane.add(d2);
			
			JLabel d3 = new JLabel(date3 + " " + month3);
			d3.setBounds(300, 150, 150, 16);
			contentPane.add(d3);
			
			JLabel d4 = new JLabel(date4 + " " + month4);
			d4.setBounds(300, 180, 150, 16);
			contentPane.add(d4);
			
			JLabel t1 = new JLabel(time);
			t1.setBounds(410, 90, 90, 16);
			contentPane.add(t1);
			
			JLabel t2 = new JLabel(time2);
			t2.setBounds(410, 120, 90, 16);
			contentPane.add(t2);
			
			JLabel t3 = new JLabel(time3);
			t3.setBounds(410, 150, 90, 16);
			contentPane.add(t3);
			
			JLabel t4 = new JLabel(time4);
			t4.setBounds(410, 180, 90, 16);
			contentPane.add(t4);
		}
		else if(numberOfAppointments == 5) {
			docName = Appointment.getAppointments(RegPage.username).get(1);
			date = Appointment.getAppointments(RegPage.username).get(2);
			month = Appointment.getAppointments(RegPage.username).get(3);
			time = Appointment.getAppointments(RegPage.username).get(4);
			docName2 = Appointment.getAppointments(RegPage.username).get(6);
			date2 = Appointment.getAppointments(RegPage.username).get(7);
			month2 = Appointment.getAppointments(RegPage.username).get(8);
			time2 = Appointment.getAppointments(RegPage.username).get(9);
			docName3 = Appointment.getAppointments(RegPage.username).get(11);
			date3 = Appointment.getAppointments(RegPage.username).get(12);
			month3 = Appointment.getAppointments(RegPage.username).get(13);
			time3 = Appointment.getAppointments(RegPage.username).get(14);
			docName4 = Appointment.getAppointments(RegPage.username).get(16);
			date4 = Appointment.getAppointments(RegPage.username).get(17);
			month4 = Appointment.getAppointments(RegPage.username).get(18);
			time4 = Appointment.getAppointments(RegPage.username).get(19);
			docName5 = Appointment.getAppointments(RegPage.username).get(21);
			date5 = Appointment.getAppointments(RegPage.username).get(22);
			month5 = Appointment.getAppointments(RegPage.username).get(23);
			time5 = Appointment.getAppointments(RegPage.username).get(24);
			
			JLabel srNo1 = new JLabel("1.");
			srNo1.setBounds(175, 90, 20, 16);
			contentPane.add(srNo1);
			
			JLabel srNo2 = new JLabel("2.");
			srNo2.setBounds(175, 120, 20, 16);
			contentPane.add(srNo2);
			
			JLabel srNo3 = new JLabel("3.");
			srNo3.setBounds(175, 150, 20, 16);
			contentPane.add(srNo3);
			
			JLabel srNo4 = new JLabel("4.");
			srNo4.setBounds(175, 180, 20, 16);
			contentPane.add(srNo4);
			
			JLabel srNo5 = new JLabel("5.");
			srNo5.setBounds(175, 210, 20, 16);
			contentPane.add(srNo5);
			
			JLabel pName1 = new JLabel(docName);
			pName1.setBounds(200, 90, 97, 16);
			contentPane.add(pName1);
			
			JLabel pName2 = new JLabel(docName2);
			pName2.setBounds(200, 120, 97, 16);
			contentPane.add(pName2);
			
			JLabel pName3 = new JLabel(docName3);
			pName3.setBounds(200, 150, 97, 16);
			contentPane.add(pName3);
			
			JLabel pName4 = new JLabel(docName4);
			pName4.setBounds(200, 180, 97, 16);
			contentPane.add(pName4);
			
			JLabel pName5 = new JLabel(docName5);
			pName5.setBounds(200, 210, 97, 16);
			contentPane.add(pName5);
			
			JLabel d1 = new JLabel(date + " " + month);
			d1.setBounds(300, 90, 150, 16);
			contentPane.add(d1);
			
			JLabel d2 = new JLabel(date2 + " " + month2);
			d2.setBounds(300, 120, 150, 16);
			contentPane.add(d2);
			
			JLabel d3 = new JLabel(date3 + " " + month3);
			d3.setBounds(300, 150, 150, 16);
			contentPane.add(d3);
			
			JLabel d4 = new JLabel(date4 + " " + month4);
			d4.setBounds(300, 180, 150, 16);
			contentPane.add(d4);
			
			JLabel d5 = new JLabel(date5 + " " + month5);
			d5.setBounds(300, 210, 150, 16);
			contentPane.add(d5);
			
			JLabel t1 = new JLabel(time);
			t1.setBounds(410, 90, 90, 16);
			contentPane.add(t1);
			
			JLabel t2 = new JLabel(time2);
			t2.setBounds(410, 120, 90, 16);
			contentPane.add(t2);
			
			JLabel t3 = new JLabel(time3);
			t3.setBounds(410, 150, 90, 16);
			contentPane.add(t3);
			
			JLabel t4 = new JLabel(time4);
			t4.setBounds(410, 180, 90, 16);
			contentPane.add(t4);
			
			JLabel t5 = new JLabel(time5);
			t5.setBounds(410, 210, 90, 16);
			contentPane.add(t5);
		}
		else if(numberOfAppointments == 6) {
			docName = Appointment.getAppointments(RegPage.username).get(1);
			date = Appointment.getAppointments(RegPage.username).get(2);
			month = Appointment.getAppointments(RegPage.username).get(3);
			time = Appointment.getAppointments(RegPage.username).get(4);
			docName2 = Appointment.getAppointments(RegPage.username).get(6);
			date2 = Appointment.getAppointments(RegPage.username).get(7);
			month2 = Appointment.getAppointments(RegPage.username).get(8);
			time2 = Appointment.getAppointments(RegPage.username).get(9);
			docName3 = Appointment.getAppointments(RegPage.username).get(11);
			date3 = Appointment.getAppointments(RegPage.username).get(12);
			month3 = Appointment.getAppointments(RegPage.username).get(13);
			time3 = Appointment.getAppointments(RegPage.username).get(14);
			docName4 = Appointment.getAppointments(RegPage.username).get(16);
			date4 = Appointment.getAppointments(RegPage.username).get(17);
			month4 = Appointment.getAppointments(RegPage.username).get(18);
			time4 = Appointment.getAppointments(RegPage.username).get(19);
			docName5 = Appointment.getAppointments(RegPage.username).get(21);
			date5 = Appointment.getAppointments(RegPage.username).get(22);
			month5 = Appointment.getAppointments(RegPage.username).get(23);
			time5 = Appointment.getAppointments(RegPage.username).get(24);
			docName6 = Appointment.getAppointments(RegPage.username).get(26);
			date6 = Appointment.getAppointments(RegPage.username).get(27);
			month6 = Appointment.getAppointments(RegPage.username).get(28);
			time6 = Appointment.getAppointments(RegPage.username).get(29);
			
			JLabel srNo1 = new JLabel("1.");
			srNo1.setBounds(175, 90, 20, 16);
			contentPane.add(srNo1);
			
			JLabel srNo2 = new JLabel("2.");
			srNo2.setBounds(175, 120, 20, 16);
			contentPane.add(srNo2);
			
			JLabel srNo3 = new JLabel("3.");
			srNo3.setBounds(175, 150, 20, 16);
			contentPane.add(srNo3);
			
			JLabel srNo4 = new JLabel("4.");
			srNo4.setBounds(175, 180, 20, 16);
			contentPane.add(srNo4);
			
			JLabel srNo5 = new JLabel("5.");
			srNo5.setBounds(175, 210, 20, 16);
			contentPane.add(srNo5);
			
			JLabel srNo6 = new JLabel("6.");
			srNo6.setBounds(175, 240, 20, 16);
			contentPane.add(srNo6);
			
			JLabel pName1 = new JLabel(docName);
			pName1.setBounds(200, 90, 97, 16);
			contentPane.add(pName1);
			
			JLabel pName2 = new JLabel(docName2);
			pName2.setBounds(200, 120, 97, 16);
			contentPane.add(pName2);
			
			JLabel pName3 = new JLabel(docName3);
			pName3.setBounds(200, 150, 97, 16);
			contentPane.add(pName3);
			
			JLabel pName4 = new JLabel(docName4);
			pName4.setBounds(200, 180, 97, 16);
			contentPane.add(pName4);
			
			JLabel pName5 = new JLabel(docName5);
			pName5.setBounds(200, 210, 97, 16);
			contentPane.add(pName5);
			
			JLabel pName6 = new JLabel(docName6);
			pName6.setBounds(200, 240, 97, 16);
			contentPane.add(pName6);
			
			JLabel d1 = new JLabel(date + " " + month);
			d1.setBounds(300, 90, 150, 16);
			contentPane.add(d1);
			
			JLabel d2 = new JLabel(date2 + " " + month2);
			d2.setBounds(300, 120, 150, 16);
			contentPane.add(d2);
			
			JLabel d3 = new JLabel(date3 + " " + month3);
			d3.setBounds(300, 150, 150, 16);
			contentPane.add(d3);
			
			JLabel d4 = new JLabel(date4 + " " + month4);
			d4.setBounds(300, 180, 150, 16);
			contentPane.add(d4);
			
			JLabel d5 = new JLabel(date5 + " " + month5);
			d5.setBounds(300, 210, 150, 16);
			contentPane.add(d5);
			
			JLabel d6 = new JLabel(date6 + " " + month6);
			d6.setBounds(300, 240, 150, 16);
			contentPane.add(d6);
			
			JLabel t1 = new JLabel(time);
			t1.setBounds(410, 90, 90, 16);
			contentPane.add(t1);
			
			JLabel t2 = new JLabel(time2);
			t2.setBounds(410, 120, 90, 16);
			contentPane.add(t2);
			
			JLabel t3 = new JLabel(time3);
			t3.setBounds(410, 150, 90, 16);
			contentPane.add(t3);
			
			JLabel t4 = new JLabel(time4);
			t4.setBounds(410, 180, 90, 16);
			contentPane.add(t4);
			
			JLabel t5 = new JLabel(time5);
			t5.setBounds(410, 210, 90, 16);
			contentPane.add(t5);
			
			JLabel t6 = new JLabel(time6);
			t6.setBounds(410, 240, 90, 16);
			contentPane.add(t6);
		}
		else if(numberOfAppointments == 7) {
			docName = Appointment.getAppointments(RegPage.username).get(1);
			date = Appointment.getAppointments(RegPage.username).get(2);
			month = Appointment.getAppointments(RegPage.username).get(3);
			time = Appointment.getAppointments(RegPage.username).get(4);
			docName2 = Appointment.getAppointments(RegPage.username).get(6);
			date2 = Appointment.getAppointments(RegPage.username).get(7);
			month2 = Appointment.getAppointments(RegPage.username).get(8);
			time2 = Appointment.getAppointments(RegPage.username).get(9);
			docName3 = Appointment.getAppointments(RegPage.username).get(11);
			date3 = Appointment.getAppointments(RegPage.username).get(12);
			month3 = Appointment.getAppointments(RegPage.username).get(13);
			time3 = Appointment.getAppointments(RegPage.username).get(14);
			docName4 = Appointment.getAppointments(RegPage.username).get(16);
			date4 = Appointment.getAppointments(RegPage.username).get(17);
			month4 = Appointment.getAppointments(RegPage.username).get(18);
			time4 = Appointment.getAppointments(RegPage.username).get(19);
			docName5 = Appointment.getAppointments(RegPage.username).get(21);
			date5 = Appointment.getAppointments(RegPage.username).get(22);
			month5 = Appointment.getAppointments(RegPage.username).get(23);
			time5 = Appointment.getAppointments(RegPage.username).get(24);
			docName6 = Appointment.getAppointments(RegPage.username).get(26);
			date6 = Appointment.getAppointments(RegPage.username).get(27);
			month6 = Appointment.getAppointments(RegPage.username).get(28);
			time6 = Appointment.getAppointments(RegPage.username).get(29);
			docName7 = Appointment.getAppointments(RegPage.username).get(31);
			date7 = Appointment.getAppointments(RegPage.username).get(32);
			month7 = Appointment.getAppointments(RegPage.username).get(33);
			time7 = Appointment.getAppointments(RegPage.username).get(34);
			
			JLabel srNo1 = new JLabel("1.");
			srNo1.setBounds(175, 90, 20, 16);
			contentPane.add(srNo1);
			
			JLabel srNo2 = new JLabel("2.");
			srNo2.setBounds(175, 120, 20, 16);
			contentPane.add(srNo2);
			
			JLabel srNo3 = new JLabel("3.");
			srNo3.setBounds(175, 150, 20, 16);
			contentPane.add(srNo3);
			
			JLabel srNo4 = new JLabel("4.");
			srNo4.setBounds(175, 180, 20, 16);
			contentPane.add(srNo4);
			
			JLabel srNo5 = new JLabel("5.");
			srNo5.setBounds(175, 210, 20, 16);
			contentPane.add(srNo5);
			
			JLabel srNo6 = new JLabel("6.");
			srNo6.setBounds(175, 240, 20, 16);
			contentPane.add(srNo6);
			
			JLabel srNo7 = new JLabel("7.");
			srNo7.setBounds(175, 270, 20, 16);
			contentPane.add(srNo7);
			
			JLabel pName1 = new JLabel(docName);
			pName1.setBounds(200, 90, 97, 16);
			contentPane.add(pName1);
			
			JLabel pName2 = new JLabel(docName2);
			pName2.setBounds(200, 120, 97, 16);
			contentPane.add(pName2);
			
			JLabel pName3 = new JLabel(docName3);
			pName3.setBounds(200, 150, 97, 16);
			contentPane.add(pName3);
			
			JLabel pName4 = new JLabel(docName4);
			pName4.setBounds(200, 180, 97, 16);
			contentPane.add(pName4);
			
			JLabel pName5 = new JLabel(docName5);
			pName5.setBounds(200, 210, 97, 16);
			contentPane.add(pName5);
			
			JLabel pName6 = new JLabel(docName6);
			pName6.setBounds(200, 240, 97, 16);
			contentPane.add(pName6);
			
			JLabel pName7 = new JLabel(docName7);
			pName7.setBounds(200, 270, 97, 16);
			contentPane.add(pName7);
			
			JLabel d1 = new JLabel(date + " " + month);
			d1.setBounds(300, 90, 150, 16);
			contentPane.add(d1);
			
			JLabel d2 = new JLabel(date2 + " " + month2);
			d2.setBounds(300, 120, 150, 16);
			contentPane.add(d2);
			
			JLabel d3 = new JLabel(date3 + " " + month3);
			d3.setBounds(300, 150, 150, 16);
			contentPane.add(d3);
			
			JLabel d4 = new JLabel(date4 + " " + month4);
			d4.setBounds(300, 180, 150, 16);
			contentPane.add(d4);
			
			JLabel d5 = new JLabel(date5 + " " + month5);
			d5.setBounds(300, 210, 150, 16);
			contentPane.add(d5);
			
			JLabel d6 = new JLabel(date6 + " " + month6);
			d6.setBounds(300, 240, 150, 16);
			contentPane.add(d6);
			
			JLabel d7 = new JLabel(date7 + " " + month7);
			d7.setBounds(300, 270, 150, 16);
			contentPane.add(d7);
			
			JLabel t1 = new JLabel(time);
			t1.setBounds(410, 90, 90, 16);
			contentPane.add(t1);
			
			JLabel t2 = new JLabel(time2);
			t2.setBounds(410, 120, 90, 16);
			contentPane.add(t2);
			
			JLabel t3 = new JLabel(time3);
			t3.setBounds(410, 150, 90, 16);
			contentPane.add(t3);
			
			JLabel t4 = new JLabel(time4);
			t4.setBounds(410, 180, 90, 16);
			contentPane.add(t4);
			
			JLabel t5 = new JLabel(time5);
			t5.setBounds(410, 210, 90, 16);
			contentPane.add(t5);
			
			JLabel t6 = new JLabel(time6);
			t6.setBounds(410, 240, 90, 16);
			contentPane.add(t6);
			
			JLabel t7 = new JLabel(time7);
			t7.setBounds(410, 270, 90, 16);
			contentPane.add(t7);
		}
		else if(numberOfAppointments == 8) {
			docName = Appointment.getAppointments(RegPage.username).get(1);
			date = Appointment.getAppointments(RegPage.username).get(2);
			month = Appointment.getAppointments(RegPage.username).get(3);
			time = Appointment.getAppointments(RegPage.username).get(4);
			docName2 = Appointment.getAppointments(RegPage.username).get(6);
			date2 = Appointment.getAppointments(RegPage.username).get(7);
			month2 = Appointment.getAppointments(RegPage.username).get(8);
			time2 = Appointment.getAppointments(RegPage.username).get(9);
			docName3 = Appointment.getAppointments(RegPage.username).get(11);
			date3 = Appointment.getAppointments(RegPage.username).get(12);
			month3 = Appointment.getAppointments(RegPage.username).get(13);
			time3 = Appointment.getAppointments(RegPage.username).get(14);
			docName4 = Appointment.getAppointments(RegPage.username).get(16);
			date4 = Appointment.getAppointments(RegPage.username).get(17);
			month4 = Appointment.getAppointments(RegPage.username).get(18);
			time4 = Appointment.getAppointments(RegPage.username).get(19);
			docName5 = Appointment.getAppointments(RegPage.username).get(21);
			date5 = Appointment.getAppointments(RegPage.username).get(22);
			month5 = Appointment.getAppointments(RegPage.username).get(23);
			time5 = Appointment.getAppointments(RegPage.username).get(24);
			docName6 = Appointment.getAppointments(RegPage.username).get(26);
			date6 = Appointment.getAppointments(RegPage.username).get(27);
			month6 = Appointment.getAppointments(RegPage.username).get(28);
			time6 = Appointment.getAppointments(RegPage.username).get(29);
			docName7 = Appointment.getAppointments(RegPage.username).get(31);
			date7 = Appointment.getAppointments(RegPage.username).get(32);
			month7 = Appointment.getAppointments(RegPage.username).get(33);
			time7 = Appointment.getAppointments(RegPage.username).get(34);
			docName8 = Appointment.getAppointments(RegPage.username).get(36);
			date8 = Appointment.getAppointments(RegPage.username).get(37);
			month8 = Appointment.getAppointments(RegPage.username).get(38);
			time8 = Appointment.getAppointments(RegPage.username).get(39);
			
			JLabel srNo1 = new JLabel("1.");
			srNo1.setBounds(175, 90, 20, 16);
			contentPane.add(srNo1);
			
			JLabel srNo2 = new JLabel("2.");
			srNo2.setBounds(175, 120, 20, 16);
			contentPane.add(srNo2);
			
			JLabel srNo3 = new JLabel("3.");
			srNo3.setBounds(175, 150, 20, 16);
			contentPane.add(srNo3);
			
			JLabel srNo4 = new JLabel("4.");
			srNo4.setBounds(175, 180, 20, 16);
			contentPane.add(srNo4);
			
			JLabel srNo5 = new JLabel("5.");
			srNo5.setBounds(175, 210, 20, 16);
			contentPane.add(srNo5);
			
			JLabel srNo6 = new JLabel("6.");
			srNo6.setBounds(175, 240, 20, 16);
			contentPane.add(srNo6);
			
			JLabel srNo7 = new JLabel("7.");
			srNo7.setBounds(175, 270, 20, 16);
			contentPane.add(srNo7);
			
			JLabel srNo8 = new JLabel("8.");
			srNo8.setBounds(175, 300, 20, 16);
			contentPane.add(srNo8);
			
			JLabel pName1 = new JLabel(docName);
			pName1.setBounds(200, 90, 97, 16);
			contentPane.add(pName1);
			
			JLabel pName2 = new JLabel(docName2);
			pName2.setBounds(200, 120, 97, 16);
			contentPane.add(pName2);
			
			JLabel pName3 = new JLabel(docName3);
			pName3.setBounds(200, 150, 97, 16);
			contentPane.add(pName3);
			
			JLabel pName4 = new JLabel(docName4);
			pName4.setBounds(200, 180, 97, 16);
			contentPane.add(pName4);
			
			JLabel pName5 = new JLabel(docName5);
			pName5.setBounds(200, 210, 97, 16);
			contentPane.add(pName5);
			
			JLabel pName6 = new JLabel(docName6);
			pName6.setBounds(200, 240, 97, 16);
			contentPane.add(pName6);
			
			JLabel pName7 = new JLabel(docName7);
			pName7.setBounds(200, 270, 97, 16);
			contentPane.add(pName7);
			
			JLabel pName8 = new JLabel(docName8);
			pName8.setBounds(200, 300, 97, 16);
			contentPane.add(pName8);
			
			JLabel d1 = new JLabel(date + " " + month);
			d1.setBounds(300, 90, 150, 16);
			contentPane.add(d1);
			
			JLabel d2 = new JLabel(date2 + " " + month2);
			d2.setBounds(300, 120, 150, 16);
			contentPane.add(d2);
			
			JLabel d3 = new JLabel(date3 + " " + month3);
			d3.setBounds(300, 150, 150, 16);
			contentPane.add(d3);
			
			JLabel d4 = new JLabel(date4 + " " + month4);
			d4.setBounds(300, 180, 150, 16);
			contentPane.add(d4);
			
			JLabel d5 = new JLabel(date5 + " " + month5);
			d5.setBounds(300, 210, 150, 16);
			contentPane.add(d5);
			
			JLabel d6 = new JLabel(date6 + " " + month6);
			d6.setBounds(300, 240, 150, 16);
			contentPane.add(d6);
			
			JLabel d7 = new JLabel(date7 + " " + month7);
			d7.setBounds(300, 270, 150, 16);
			contentPane.add(d7);
			
			JLabel d8 = new JLabel(date8 + " " + month8);
			d8.setBounds(300, 300, 150, 16);
			contentPane.add(d8);
			
			JLabel t1 = new JLabel(time);
			t1.setBounds(410, 90, 90, 16);
			contentPane.add(t1);
			
			JLabel t2 = new JLabel(time2);
			t2.setBounds(410, 120, 90, 16);
			contentPane.add(t2);
			
			JLabel t3 = new JLabel(time3);
			t3.setBounds(410, 150, 90, 16);
			contentPane.add(t3);
			
			JLabel t4 = new JLabel(time4);
			t4.setBounds(410, 180, 90, 16);
			contentPane.add(t4);
			
			JLabel t5 = new JLabel(time5);
			t5.setBounds(410, 210, 90, 16);
			contentPane.add(t5);
			
			JLabel t6 = new JLabel(time6);
			t6.setBounds(410, 240, 90, 16);
			contentPane.add(t6);
			
			JLabel t7 = new JLabel(time7);
			t7.setBounds(410, 270, 90, 16);
			contentPane.add(t7);
			
			JLabel t8 = new JLabel(time8);
			t8.setBounds(410, 300, 90, 16);
			contentPane.add(t8);
		}
		else if(numberOfAppointments == 9) {
			docName = Appointment.getAppointments(RegPage.username).get(1);
			date = Appointment.getAppointments(RegPage.username).get(2);
			month = Appointment.getAppointments(RegPage.username).get(3);
			time = Appointment.getAppointments(RegPage.username).get(4);
			docName2 = Appointment.getAppointments(RegPage.username).get(6);
			date2 = Appointment.getAppointments(RegPage.username).get(7);
			month2 = Appointment.getAppointments(RegPage.username).get(8);
			time2 = Appointment.getAppointments(RegPage.username).get(9);
			docName3 = Appointment.getAppointments(RegPage.username).get(11);
			date3 = Appointment.getAppointments(RegPage.username).get(12);
			month3 = Appointment.getAppointments(RegPage.username).get(13);
			time3 = Appointment.getAppointments(RegPage.username).get(14);
			docName4 = Appointment.getAppointments(RegPage.username).get(16);
			date4 = Appointment.getAppointments(RegPage.username).get(17);
			month4 = Appointment.getAppointments(RegPage.username).get(18);
			time4 = Appointment.getAppointments(RegPage.username).get(19);
			docName5 = Appointment.getAppointments(RegPage.username).get(21);
			date5 = Appointment.getAppointments(RegPage.username).get(22);
			month5 = Appointment.getAppointments(RegPage.username).get(23);
			time5 = Appointment.getAppointments(RegPage.username).get(24);
			docName6 = Appointment.getAppointments(RegPage.username).get(26);
			date6 = Appointment.getAppointments(RegPage.username).get(27);
			month6 = Appointment.getAppointments(RegPage.username).get(28);
			time6 = Appointment.getAppointments(RegPage.username).get(29);
			docName7 = Appointment.getAppointments(RegPage.username).get(31);
			date7 = Appointment.getAppointments(RegPage.username).get(32);
			month7 = Appointment.getAppointments(RegPage.username).get(33);
			time7 = Appointment.getAppointments(RegPage.username).get(34);
			docName8 = Appointment.getAppointments(RegPage.username).get(36);
			date8 = Appointment.getAppointments(RegPage.username).get(37);
			month8 = Appointment.getAppointments(RegPage.username).get(38);
			time8 = Appointment.getAppointments(RegPage.username).get(39);
			docName9 = Appointment.getAppointments(RegPage.username).get(41);
			date9 = Appointment.getAppointments(RegPage.username).get(42);
			month9 = Appointment.getAppointments(RegPage.username).get(43);
			time9 = Appointment.getAppointments(RegPage.username).get(44);
			
			JLabel srNo1 = new JLabel("1.");
			srNo1.setBounds(175, 90, 20, 16);
			contentPane.add(srNo1);
			
			JLabel srNo2 = new JLabel("2.");
			srNo2.setBounds(175, 120, 20, 16);
			contentPane.add(srNo2);
			
			JLabel srNo3 = new JLabel("3.");
			srNo3.setBounds(175, 150, 20, 16);
			contentPane.add(srNo3);
			
			JLabel srNo4 = new JLabel("4.");
			srNo4.setBounds(175, 180, 20, 16);
			contentPane.add(srNo4);
			
			JLabel srNo5 = new JLabel("5.");
			srNo5.setBounds(175, 210, 20, 16);
			contentPane.add(srNo5);
			
			JLabel srNo6 = new JLabel("6.");
			srNo6.setBounds(175, 240, 20, 16);
			contentPane.add(srNo6);
			
			JLabel srNo7 = new JLabel("7.");
			srNo7.setBounds(175, 270, 20, 16);
			contentPane.add(srNo7);
			
			JLabel srNo8 = new JLabel("8.");
			srNo8.setBounds(175, 300, 20, 16);
			contentPane.add(srNo8);
			
			JLabel srNo9 = new JLabel("9.");
			srNo9.setBounds(175, 330, 20, 16);
			contentPane.add(srNo9);
			
			JLabel pName1 = new JLabel(docName);
			pName1.setBounds(200, 90, 97, 16);
			contentPane.add(pName1);
			
			JLabel pName2 = new JLabel(docName2);
			pName2.setBounds(200, 120, 97, 16);
			contentPane.add(pName2);
			
			JLabel pName3 = new JLabel(docName3);
			pName3.setBounds(200, 150, 97, 16);
			contentPane.add(pName3);
			
			JLabel pName4 = new JLabel(docName4);
			pName4.setBounds(200, 180, 97, 16);
			contentPane.add(pName4);
			
			JLabel pName5 = new JLabel(docName5);
			pName5.setBounds(200, 210, 97, 16);
			contentPane.add(pName5);
			
			JLabel pName6 = new JLabel(docName6);
			pName6.setBounds(200, 240, 97, 16);
			contentPane.add(pName6);
			
			JLabel pName7 = new JLabel(docName7);
			pName7.setBounds(200, 270, 97, 16);
			contentPane.add(pName7);
			
			JLabel pName8 = new JLabel(docName8);
			pName8.setBounds(200, 300, 97, 16);
			contentPane.add(pName8);
			
			JLabel pName9 = new JLabel(docName9);
			pName9.setBounds(200, 330, 97, 16);
			contentPane.add(pName9);
			
			JLabel d1 = new JLabel(date + " " + month);
			d1.setBounds(300, 90, 150, 16);
			contentPane.add(d1);
			
			JLabel d2 = new JLabel(date2 + " " + month2);
			d2.setBounds(300, 120, 150, 16);
			contentPane.add(d2);
			
			JLabel d3 = new JLabel(date3 + " " + month3);
			d3.setBounds(300, 150, 150, 16);
			contentPane.add(d3);
			
			JLabel d4 = new JLabel(date4 + " " + month4);
			d4.setBounds(300, 180, 150, 16);
			contentPane.add(d4);
			
			JLabel d5 = new JLabel(date5 + " " + month5);
			d5.setBounds(300, 210, 150, 16);
			contentPane.add(d5);
			
			JLabel d6 = new JLabel(date6 + " " + month6);
			d6.setBounds(300, 240, 150, 16);
			contentPane.add(d6);
			
			JLabel d7 = new JLabel(date7 + " " + month7);
			d7.setBounds(300, 270, 150, 16);
			contentPane.add(d7);
			
			JLabel d8 = new JLabel(date8 + " " + month8);
			d8.setBounds(300, 300, 150, 16);
			contentPane.add(d8);
			
			JLabel d9 = new JLabel(date9 + " " + month9);
			d9.setBounds(300, 330, 150, 16);
			contentPane.add(d9);
			
			JLabel t1 = new JLabel(time);
			t1.setBounds(410, 90, 90, 16);
			contentPane.add(t1);
			
			JLabel t2 = new JLabel(time2);
			t2.setBounds(410, 120, 90, 16);
			contentPane.add(t2);
			
			JLabel t3 = new JLabel(time3);
			t3.setBounds(410, 150, 90, 16);
			contentPane.add(t3);
			
			JLabel t4 = new JLabel(time4);
			t4.setBounds(410, 180, 90, 16);
			contentPane.add(t4);
			
			JLabel t5 = new JLabel(time5);
			t5.setBounds(410, 210, 90, 16);
			contentPane.add(t5);
			
			JLabel t6 = new JLabel(time6);
			t6.setBounds(410, 240, 90, 16);
			contentPane.add(t6);
			
			JLabel t7 = new JLabel(time7);
			t7.setBounds(410, 270, 90, 16);
			contentPane.add(t7);
			
			JLabel t8 = new JLabel(time8);
			t8.setBounds(410, 300, 90, 16);
			contentPane.add(t8);
			
			JLabel t9 = new JLabel(time9);
			t9.setBounds(410, 330, 90, 16);
			contentPane.add(t9);
		}
		else if (numberOfAppointments == 10) {
			docName = Appointment.getAppointments(RegPage.username).get(1);
			date = Appointment.getAppointments(RegPage.username).get(2);
			month = Appointment.getAppointments(RegPage.username).get(3);
			time = Appointment.getAppointments(RegPage.username).get(4);
			docName2 = Appointment.getAppointments(RegPage.username).get(6);
			date2 = Appointment.getAppointments(RegPage.username).get(7);
			month2 = Appointment.getAppointments(RegPage.username).get(8);
			time2 = Appointment.getAppointments(RegPage.username).get(9);
			docName3 = Appointment.getAppointments(RegPage.username).get(11);
			date3 = Appointment.getAppointments(RegPage.username).get(12);
			month3 = Appointment.getAppointments(RegPage.username).get(13);
			time3 = Appointment.getAppointments(RegPage.username).get(14);
			docName4 = Appointment.getAppointments(RegPage.username).get(16);
			date4 = Appointment.getAppointments(RegPage.username).get(17);
			month4 = Appointment.getAppointments(RegPage.username).get(18);
			time4 = Appointment.getAppointments(RegPage.username).get(19);
			docName5 = Appointment.getAppointments(RegPage.username).get(21);
			date5 = Appointment.getAppointments(RegPage.username).get(22);
			month5 = Appointment.getAppointments(RegPage.username).get(23);
			time5 = Appointment.getAppointments(RegPage.username).get(24);
			docName6 = Appointment.getAppointments(RegPage.username).get(26);
			date6 = Appointment.getAppointments(RegPage.username).get(27);
			month6 = Appointment.getAppointments(RegPage.username).get(28);
			time6 = Appointment.getAppointments(RegPage.username).get(29);
			docName7 = Appointment.getAppointments(RegPage.username).get(31);
			date7 = Appointment.getAppointments(RegPage.username).get(32);
			month7 = Appointment.getAppointments(RegPage.username).get(33);
			time7 = Appointment.getAppointments(RegPage.username).get(34);
			docName8 = Appointment.getAppointments(RegPage.username).get(36);
			date8 = Appointment.getAppointments(RegPage.username).get(37);
			month8 = Appointment.getAppointments(RegPage.username).get(38);
			time8 = Appointment.getAppointments(RegPage.username).get(39);
			docName9 = Appointment.getAppointments(RegPage.username).get(41);
			date9 = Appointment.getAppointments(RegPage.username).get(42);
			month9 = Appointment.getAppointments(RegPage.username).get(43);
			time9 = Appointment.getAppointments(RegPage.username).get(44);
			docName10 = Appointment.getAppointments(RegPage.username).get(46);
			date10 = Appointment.getAppointments(RegPage.username).get(47);
			month10 = Appointment.getAppointments(RegPage.username).get(48);
			time10 = Appointment.getAppointments(RegPage.username).get(49);
			
			JLabel srNo1 = new JLabel("1.");
			srNo1.setBounds(175, 90, 20, 16);
			contentPane.add(srNo1);
			
			JLabel srNo2 = new JLabel("2.");
			srNo2.setBounds(175, 120, 20, 16);
			contentPane.add(srNo2);
			
			JLabel srNo3 = new JLabel("3.");
			srNo3.setBounds(175, 150, 20, 16);
			contentPane.add(srNo3);
			
			JLabel srNo4 = new JLabel("4.");
			srNo4.setBounds(175, 180, 20, 16);
			contentPane.add(srNo4);
			
			JLabel srNo5 = new JLabel("5.");
			srNo5.setBounds(175, 210, 20, 16);
			contentPane.add(srNo5);
			
			JLabel srNo6 = new JLabel("6.");
			srNo6.setBounds(175, 240, 20, 16);
			contentPane.add(srNo6);
			
			JLabel srNo7 = new JLabel("7.");
			srNo7.setBounds(175, 270, 20, 16);
			contentPane.add(srNo7);
			
			JLabel srNo8 = new JLabel("8.");
			srNo8.setBounds(175, 300, 20, 16);
			contentPane.add(srNo8);
			
			JLabel srNo9 = new JLabel("9.");
			srNo9.setBounds(175, 330, 20, 16);
			contentPane.add(srNo9);
			
			JLabel srNo10 = new JLabel("10.");
			srNo10.setBounds(175, 360, 20, 16);
			contentPane.add(srNo10);
			
			JLabel pName1 = new JLabel(docName);
			pName1.setBounds(200, 90, 97, 16);
			contentPane.add(pName1);
			
			JLabel pName2 = new JLabel(docName2);
			pName2.setBounds(200, 120, 97, 16);
			contentPane.add(pName2);
			
			JLabel pName3 = new JLabel(docName3);
			pName3.setBounds(200, 150, 97, 16);
			contentPane.add(pName3);
			
			JLabel pName4 = new JLabel(docName4);
			pName4.setBounds(200, 180, 97, 16);
			contentPane.add(pName4);
			
			JLabel pName5 = new JLabel(docName5);
			pName5.setBounds(200, 210, 97, 16);
			contentPane.add(pName5);
			
			JLabel pName6 = new JLabel(docName6);
			pName6.setBounds(200, 240, 97, 16);
			contentPane.add(pName6);
			
			JLabel pName7 = new JLabel(docName7);
			pName7.setBounds(200, 270, 97, 16);
			contentPane.add(pName7);
			
			JLabel pName8 = new JLabel(docName8);
			pName8.setBounds(200, 300, 97, 16);
			contentPane.add(pName8);
			
			JLabel pName9 = new JLabel(docName9);
			pName9.setBounds(200, 330, 97, 16);
			contentPane.add(pName9);
			
			JLabel pName10 = new JLabel(docName10);
			pName10.setBounds(200, 360, 97, 16);
			contentPane.add(pName10);
			
			JLabel d1 = new JLabel(date + " " + month);
			d1.setBounds(300, 90, 150, 16);
			contentPane.add(d1);
			
			JLabel d2 = new JLabel(date2 + " " + month2);
			d2.setBounds(300, 120, 150, 16);
			contentPane.add(d2);
			
			JLabel d3 = new JLabel(date3 + " " + month3);
			d3.setBounds(300, 150, 150, 16);
			contentPane.add(d3);
			
			JLabel d4 = new JLabel(date4 + " " + month4);
			d4.setBounds(300, 180, 150, 16);
			contentPane.add(d4);
			
			JLabel d5 = new JLabel(date5 + " " + month5);
			d5.setBounds(300, 210, 150, 16);
			contentPane.add(d5);
			
			JLabel d6 = new JLabel(date6 + " " + month6);
			d6.setBounds(300, 240, 150, 16);
			contentPane.add(d6);
			
			JLabel d7 = new JLabel(date7 + " " + month7);
			d7.setBounds(300, 270, 150, 16);
			contentPane.add(d7);
			
			JLabel d8 = new JLabel(date8 + " " + month8);
			d8.setBounds(300, 300, 150, 16);
			contentPane.add(d8);
			
			JLabel d9 = new JLabel(date9 + " " + month9);
			d9.setBounds(300, 330, 150, 16);
			contentPane.add(d9);
			
			JLabel d10 = new JLabel(date10 + " " + month10);
			d10.setBounds(300, 360, 150, 16);
			contentPane.add(d10);
			
			JLabel t1 = new JLabel(time);
			t1.setBounds(410, 90, 90, 16);
			contentPane.add(t1);
			
			JLabel t2 = new JLabel(time2);
			t2.setBounds(410, 120, 90, 16);
			contentPane.add(t2);
			
			JLabel t3 = new JLabel(time3);
			t3.setBounds(410, 150, 90, 16);
			contentPane.add(t3);
			
			JLabel t4 = new JLabel(time4);
			t4.setBounds(410, 180, 90, 16);
			contentPane.add(t4);
			
			JLabel t5 = new JLabel(time5);
			t5.setBounds(410, 210, 90, 16);
			contentPane.add(t5);
			
			JLabel t6 = new JLabel(time6);
			t6.setBounds(410, 240, 90, 16);
			contentPane.add(t6);
			
			JLabel t7 = new JLabel(time7);
			t7.setBounds(410, 270, 90, 16);
			contentPane.add(t7);
			
			JLabel t8 = new JLabel(time8);
			t8.setBounds(410, 300, 90, 16);
			contentPane.add(t8);
			
			JLabel t9 = new JLabel(time9);
			t9.setBounds(410, 330, 90, 16);
			contentPane.add(t9);
			
			JLabel t10 = new JLabel(time10);
			t10.setBounds(410, 360, 90, 16);
			contentPane.add(t10);
		}
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPagePatient mainPagePatient = new MainPagePatient();
				mainPagePatient.setVisible(true);
			}
		});
		btnNewButton.setBounds(265, 390, 117, 29);
		contentPane.add(btnNewButton);
	}
	
	
	public static int numberOfAppointments(String name) {
		int counter = 0;
		try {
	        FileReader reader = new FileReader("appointments.txt");
	        FileWriter writer = new FileWriter("appointments.txt", true);
	        BufferedReader appointmentSymbols = new BufferedReader(reader);
	        String uname = appointmentSymbols.readLine();
	        while(uname != null){
				if(uname.equals(name)){
					counter++;
				}
				uname = appointmentSymbols.readLine();	
				}
	            appointmentSymbols.close();
	            
		}catch(IOException error){
            error.printStackTrace();
        }
		return counter;
	}
}
