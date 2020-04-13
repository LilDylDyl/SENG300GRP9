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
					System.out.println(uname);
					docName = appointmentSymbols.readLine();
					System.out.println(docName);
					date = appointmentSymbols.readLine();
					System.out.println(date);
					month = appointmentSymbols.readLine();
					System.out.println(month);
					time = appointmentSymbols.readLine();
					System.out.println(time);
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
		String uname = "", docName = "", date = "", month = "", time = "", docName2 = "", date2= "", month2 = "", time2 = "", docName3 = "", date3 = "", month3 = "", time3 = "", docName4 = "", date4 = "", month4 = "", time4 = "";
		if(numberOfAppointments == 1) {
	        try{
	            FileReader reader = new FileReader("appointments.txt");
	            FileWriter writer = new FileWriter("appointments.txt", true);
	            BufferedReader appointmentSymbols = new BufferedReader(reader);
	            uname = appointmentSymbols.readLine();
	            while(uname != null){
					if(uname.equals(username)){
						System.out.println(uname);
						docName = appointmentSymbols.readLine();
						System.out.println(docName);
						date = appointmentSymbols.readLine();
						System.out.println(date);
						month = appointmentSymbols.readLine();
						System.out.println(month);
						time = appointmentSymbols.readLine();
						System.out.println(time);
					}
					uname = appointmentSymbols.readLine();	
					}
	
	                
	                appointmentSymbols.close();
	            //}
	        }catch(IOException error){
	            error.printStackTrace();
	        }
	        JLabel lblNewLabel = new JLabel("Below are your confirmed appointments");
			lblNewLabel.setBounds(171, 46, 337, 16);
			lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 20));
			contentPane.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Doctor:");
			lblNewLabel_1.setBounds(252, 132, 61, 16);
			contentPane.add(lblNewLabel_1);
			
			JLabel label = new JLabel("Date:");
			label.setBounds(252, 174, 61, 16);
			contentPane.add(label);
			
			JLabel label_1 = new JLabel("Time:");
			label_1.setBounds(252, 216, 61, 16);
			contentPane.add(label_1);
			
			JLabel lblNewLabel_2 = new JLabel(docName);
			lblNewLabel_2.setBounds(330, 132, 134, 16);
			contentPane.add(lblNewLabel_2);
			
			JLabel label_3 = new JLabel(date + " " + month);
			label_3.setBounds(330, 174, 134, 16);
			contentPane.add(label_3);
			
			JLabel label_4 = new JLabel(time);
			label_4.setBounds(330, 216, 134, 16);
			contentPane.add(label_4);
			
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
		else if(numberOfAppointments == 2) {
			docName = Appointment.getAppointments(RegPage.username).get(1);
			date = Appointment.getAppointments(RegPage.username).get(2);
			month = Appointment.getAppointments(RegPage.username).get(3);
			time = Appointment.getAppointments(RegPage.username).get(4);
			docName2 = Appointment.getAppointments(RegPage.username).get(6);
			date2 = Appointment.getAppointments(RegPage.username).get(7);
			month2 = Appointment.getAppointments(RegPage.username).get(8);
			time2 = Appointment.getAppointments(RegPage.username).get(9);
			
			JLabel lblNewLabel = new JLabel("Below are your confirmed appointments");
			lblNewLabel.setBounds(171, 40, 337, 16);
			lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 20));
			contentPane.add(lblNewLabel);
			
			JLabel lblNewLabel_3 = new JLabel("Doctor:");
			lblNewLabel_3.setBounds(81, 125, 109, 16);
			contentPane.add(lblNewLabel_3);
			
			JLabel label = new JLabel("Date:");
			label.setBounds(81, 168, 109, 16);
			contentPane.add(label);
			
			JLabel label_1 = new JLabel("Time:");
			label_1.setBounds(81, 214, 109, 16);
			contentPane.add(label_1);
			
			JLabel label_2 = new JLabel(docName);
			label_2.setBounds(195, 214, 109, 16);
			contentPane.add(label_2);
			
			JLabel label_3 = new JLabel(date + " " + month);
			label_3.setBounds(195, 168, 109, 16);
			contentPane.add(label_3);
			
			JLabel label_4 = new JLabel(time);
			label_4.setBounds(195, 125, 109, 16);
			contentPane.add(label_4);
			
			JLabel label_11 = new JLabel("Doctor:");
			label_11.setBounds(400, 125, 109, 16);
			contentPane.add(label_11);
			
			JLabel label_12 = new JLabel("Date:");
			label_12.setBounds(400, 168, 109, 16);
			contentPane.add(label_12);
			
			JLabel label_13 = new JLabel("Time:");
			label_13.setBounds(400, 214, 109, 16);
			contentPane.add(label_13);
			
			JLabel label_14 = new JLabel(docName2);
			label_14.setBounds(514, 125, 109, 16);
			contentPane.add(label_14);
			
			JLabel label_15 = new JLabel(date2 + " " + month2);
			label_15.setBounds(514, 168, 109, 16);
			contentPane.add(label_15);
			
			JLabel label_16 = new JLabel(time2);
			label_16.setBounds(514, 214, 109, 16);
			contentPane.add(label_16);
			
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
			
			JLabel lblNewLabel = new JLabel("Below are your confirmed appointments");
			lblNewLabel.setBounds(171, 40, 337, 16);
			lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 20));
			contentPane.add(lblNewLabel);
			
			JLabel lblNewLabel_3 = new JLabel("Doctor:");
			lblNewLabel_3.setBounds(11, 125, 109, 16);
			contentPane.add(lblNewLabel_3);
			
			JLabel label = new JLabel("Date:");
			label.setBounds(11, 168, 109, 16);
			contentPane.add(label);
			
			JLabel label_1 = new JLabel("Time:");
			label_1.setBounds(11, 214, 109, 16);
			contentPane.add(label_1);
			
			JLabel label_2 = new JLabel(time);
			label_2.setBounds(80, 214, 109, 16);
			contentPane.add(label_2);
			
			JLabel label_3 = new JLabel(date + " " + month);
			label_3.setBounds(80, 168, 109, 16);
			contentPane.add(label_3);
			
			JLabel label_4 = new JLabel(docName);
			label_4.setBounds(80, 125, 109, 16);
			contentPane.add(label_4);
			
			JLabel label_11 = new JLabel("Doctor:");
			label_11.setBounds(505, 125, 109, 16);
			contentPane.add(label_11);
			
			JLabel label_12 = new JLabel("Date:");
			label_12.setBounds(505, 168, 109, 16);
			contentPane.add(label_12);
			
			JLabel label_13 = new JLabel("Time:");
			label_13.setBounds(505, 214, 109, 16);
			contentPane.add(label_13);
			
			JLabel label_14 = new JLabel(docName2);
			label_14.setBounds(574, 125, 109, 16);
			contentPane.add(label_14);
			
			JLabel label_15 = new JLabel(date2 + " " + month2);
			label_15.setBounds(574, 168, 109, 16);
			contentPane.add(label_15);
			
			JLabel label_16 = new JLabel(time2);
			label_16.setBounds(574, 214, 109, 16);
			contentPane.add(label_16);
			
			JLabel label_17 = new JLabel("Doctor:");
			label_17.setBounds(250, 125, 109, 16);
			contentPane.add(label_17);
			
			JLabel label_18 = new JLabel("Date:");
			label_18.setBounds(250, 168, 109, 16);
			contentPane.add(label_18);
			
			JLabel label_19 = new JLabel("Time:");
			label_19.setBounds(250, 214, 109, 16);
			contentPane.add(label_19);
			
			JLabel label_20 = new JLabel(docName3);
			label_20.setBounds(320, 125, 109, 16);
			contentPane.add(label_20);
			
			JLabel label_21 = new JLabel(date3 + " " + month3);
			label_21.setBounds(320, 168, 109, 16);
			contentPane.add(label_21);
			
			JLabel label_22 = new JLabel(time3);
			label_22.setBounds(320, 214, 109, 16);
			contentPane.add(label_22);
			
			

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
		else if(numberOfAppointments >= 4) {
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
			
	        JLabel lblNewLabel = new JLabel("Below are your confirmed appointments");
			lblNewLabel.setBounds(171, 20, 337, 16);
			lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 20));
			contentPane.add(lblNewLabel);
			
			JLabel lblNewLabel_3 = new JLabel("Doctor:");
			lblNewLabel_3.setBounds(81, 65, 109, 16);
			contentPane.add(lblNewLabel_3);
			
			JLabel label = new JLabel("Date:");
			label.setBounds(81, 108, 109, 16);
			contentPane.add(label);
			
			JLabel label_1 = new JLabel("Time:");
			label_1.setBounds(81, 154, 109, 16);
			contentPane.add(label_1);
			
			JLabel label_2 = new JLabel(docName);
			label_2.setBounds(165, 154, 109, 16);
			contentPane.add(label_2);
			
			JLabel label_3 = new JLabel(date + " " + month);
			label_3.setBounds(165, 108, 109, 16);
			contentPane.add(label_3);
			
			JLabel label_4 = new JLabel(time);
			label_4.setBounds(165, 65, 109, 16);
			contentPane.add(label_4);
			
			JLabel label_5 = new JLabel("Doctor:");
			label_5.setBounds(81, 239, 109, 16);
			contentPane.add(label_5);
			
			JLabel label_6 = new JLabel("Date:");
			label_6.setBounds(81, 282, 109, 16);
			contentPane.add(label_6);
			
			JLabel label_7 = new JLabel("Time:");
			label_7.setBounds(81, 328, 109, 16);
			contentPane.add(label_7);
			
			JLabel label_8 = new JLabel(docName2);
			label_8.setBounds(165, 239, 109, 16);
			contentPane.add(label_8);
			
			JLabel label_9 = new JLabel(date2 + " " + month2);
			label_9.setBounds(165, 282, 109, 16);
			contentPane.add(label_9);
			
			JLabel label_10 = new JLabel(time2);
			label_10.setBounds(165, 328, 109, 16);
			contentPane.add(label_10);
			
			JLabel label_11 = new JLabel("Doctor:");
			label_11.setBounds(430, 65, 109, 16);
			contentPane.add(label_11);
			
			JLabel label_12 = new JLabel("Date:");
			label_12.setBounds(430, 108, 109, 16);
			contentPane.add(label_12);
			
			JLabel label_13 = new JLabel("Time:");
			label_13.setBounds(430, 154, 109, 16);
			contentPane.add(label_13);
			
			JLabel label_14 = new JLabel(docName3);
			label_14.setBounds(514, 65, 109, 16);
			contentPane.add(label_14);
			
			JLabel label_15 = new JLabel(date3 + " " + month3);
			label_15.setBounds(514, 108, 109, 16);
			contentPane.add(label_15);
			
			JLabel label_16 = new JLabel(time3);
			label_16.setBounds(514, 154, 109, 16);
			contentPane.add(label_16);
			
			JLabel label_17 = new JLabel("Doctor:");
			label_17.setBounds(430, 239, 109, 16);
			contentPane.add(label_17);
			
			JLabel label_18 = new JLabel("Date:");
			label_18.setBounds(430, 282, 109, 16);
			contentPane.add(label_18);
			
			JLabel label_19 = new JLabel("Time");
			label_19.setBounds(430, 328, 109, 16);
			contentPane.add(label_19);
			
			JLabel label_20 = new JLabel(docName4);
			label_20.setBounds(514, 239, 109, 16);
			contentPane.add(label_20);
			
			JLabel label_21 = new JLabel(date4 + " " + month4);
			label_21.setBounds(514, 282, 109, 16);
			contentPane.add(label_21);
			
			JLabel label_22 = new JLabel(time4);
			label_22.setBounds(514, 328, 109, 16);
			contentPane.add(label_22);
			
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
					System.out.println(uname);
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
