import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ViewAppointmentDoctor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAppointmentDoctor frame = new ViewAppointmentDoctor();
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
	public ViewAppointmentDoctor() {
		setTitle("View Appointment");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String patientUsername = "", patientUsername2 = "", patientUsername3 = "", patientUsername4 = "", patientUsername5 = "", patientUsername6 = "", patientUsername7 = "", patientUsername8 = "", patientUsername9 = "", patientUsername10 = "", date = "", month = "", time = "", date2 = "", month2 = "", time2 = "", date3 = "", month3 = "", time3 = "", date4 = "", month4 = "", time4 = "", date5 = "", month5 = "", time5 = "", date6 = "", month6 = "", time6 = "", date7 = "", month7 = "", time7 = "", date8 = "", month8 = "", time8 = "", date9 = "", month9 = "", time9 = "", date10 = "", month10 = "", time10 = "";
		String docName = ViewAppointmentDoctor.usernameToName(RegPage.username);
		int numberOfAppointments = ViewAppointmentDoctor.numberOfAppointmentsDoctor(docName);
		
		if (numberOfAppointments != 0) {
			JLabel lblNewLabel = new JLabel("Your appointment schedule:");
			lblNewLabel.setBounds(215, 30, 255, 25);
			lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 20));
			contentPane.add(lblNewLabel);

			JLabel lblNewLabel_1 = new JLabel("Patient name");
			lblNewLabel_1.setBounds(200, 65, 97, 16);
			contentPane.add(lblNewLabel_1);

			JLabel lblNewLabel_2 = new JLabel("Date");
			lblNewLabel_2.setBounds(320, 65, 61, 16);
			contentPane.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("Timings");
			lblNewLabel_3.setBounds(410, 65, 61, 16);
			contentPane.add(lblNewLabel_3);
		}
		else {
			JLabel lblNewLabelError = new JLabel("Sorry! No appointments were found!");
			lblNewLabelError.setBounds(171, 185, 337, 25);
			lblNewLabelError.setFont(new Font("Serif", Font.PLAIN, 20));
			contentPane.add(lblNewLabelError);
			
			JButton btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainPageDoctor mainPageDoctor = new MainPageDoctor();
					mainPageDoctor.setVisible(true);
				}
			});
			btnNewButton.setBounds(265, 340, 117, 29);
			contentPane.add(btnNewButton);
		}
		if (numberOfAppointments == 1) {
			JLabel srNo1 = new JLabel("1.");
			srNo1.setBounds(175, 90, 20, 16);
			contentPane.add(srNo1);
			
			patientUsername = Appointment.getAppointmentsDoctor(docName).get(0);
			docName = Appointment.getAppointmentsDoctor(docName).get(1);
			date = Appointment.getAppointmentsDoctor(docName).get(2);
			month = Appointment.getAppointmentsDoctor(docName).get(3);
			time = Appointment.getAppointmentsDoctor(docName).get(4);
			
			JLabel pName1 = new JLabel(patientUsername);
			pName1.setBounds(200, 90, 97, 16);
			contentPane.add(pName1);

			JLabel d1 = new JLabel(date + " " + month);
			d1.setBounds(300, 90, 150, 16);
			contentPane.add(d1);
			
			JLabel t1 = new JLabel(time);
			t1.setBounds(410, 90, 90, 16);
			contentPane.add(t1);
			
			JButton btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainPageDoctor mainPageDoctor = new MainPageDoctor();
					mainPageDoctor.setVisible(true);
				}
			});
			btnNewButton.setBounds(265, 390, 117, 29);
			contentPane.add(btnNewButton);
		}
		else if (numberOfAppointments == 2) {
			JLabel srNo1 = new JLabel("1.");
			srNo1.setBounds(175, 90, 20, 16);
			contentPane.add(srNo1);
			
			JLabel srNo2 = new JLabel("2.");
			srNo2.setBounds(175, 120, 20, 16);
			contentPane.add(srNo2);
			
			patientUsername = Appointment.getAppointmentsDoctor(docName).get(0);
			docName = Appointment.getAppointmentsDoctor(docName).get(1);
			date = Appointment.getAppointmentsDoctor(docName).get(2);
			month = Appointment.getAppointmentsDoctor(docName).get(3);
			time = Appointment.getAppointmentsDoctor(docName).get(4);
			
			patientUsername2 = Appointment.getAppointmentsDoctor(docName).get(5);
			date2 = Appointment.getAppointmentsDoctor(docName).get(7);
			month2 = Appointment.getAppointmentsDoctor(docName).get(8);
			time2 = Appointment.getAppointmentsDoctor(docName).get(9);
			
			JLabel pName1 = new JLabel(patientUsername);
			pName1.setBounds(200, 90, 97, 16);
			contentPane.add(pName1);
			
			JLabel pName2 = new JLabel(patientUsername2);
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
			
			JButton btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainPageDoctor mainPageDoctor = new MainPageDoctor();
					mainPageDoctor.setVisible(true);
				}
			});
			btnNewButton.setBounds(265, 390, 117, 29);
			contentPane.add(btnNewButton);
		}
		else if (numberOfAppointments == 3) {
			JLabel srNo1 = new JLabel("1.");
			srNo1.setBounds(175, 90, 20, 16);
			contentPane.add(srNo1);
			
			JLabel srNo2 = new JLabel("2.");
			srNo2.setBounds(175, 120, 20, 16);
			contentPane.add(srNo2);
			
			JLabel srNo3 = new JLabel("3.");
			srNo3.setBounds(175, 150, 20, 16);
			contentPane.add(srNo3);
			
			patientUsername = Appointment.getAppointmentsDoctor(docName).get(0);
			docName = Appointment.getAppointmentsDoctor(docName).get(1);
			date = Appointment.getAppointmentsDoctor(docName).get(2);
			month = Appointment.getAppointmentsDoctor(docName).get(3);
			time = Appointment.getAppointmentsDoctor(docName).get(4);
			
			patientUsername2 = Appointment.getAppointmentsDoctor(docName).get(5);
			date2 = Appointment.getAppointmentsDoctor(docName).get(7);
			month2 = Appointment.getAppointmentsDoctor(docName).get(8);
			time2 = Appointment.getAppointmentsDoctor(docName).get(9);

			patientUsername3 = Appointment.getAppointmentsDoctor(docName).get(10);
			date3 = Appointment.getAppointmentsDoctor(docName).get(12);
			month3 = Appointment.getAppointmentsDoctor(docName).get(13);
			time3 = Appointment.getAppointmentsDoctor(docName).get(14);
			
			JLabel pName1 = new JLabel(patientUsername);
			pName1.setBounds(200, 90, 97, 16);
			contentPane.add(pName1);
			
			JLabel pName2 = new JLabel(patientUsername2);
			pName2.setBounds(200, 120, 97, 16);
			contentPane.add(pName2);
			
			JLabel pName3 = new JLabel(patientUsername3);
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
			
			JButton btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainPageDoctor mainPageDoctor = new MainPageDoctor();
					mainPageDoctor.setVisible(true);
				}
			});
			btnNewButton.setBounds(265, 390, 117, 29);
			contentPane.add(btnNewButton);
		}
		else if (numberOfAppointments == 4) {
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
			
			patientUsername = Appointment.getAppointmentsDoctor(docName).get(0);
			docName = Appointment.getAppointmentsDoctor(docName).get(1);
			date = Appointment.getAppointmentsDoctor(docName).get(2);
			month = Appointment.getAppointmentsDoctor(docName).get(3);
			time = Appointment.getAppointmentsDoctor(docName).get(4);
			
			patientUsername2 = Appointment.getAppointmentsDoctor(docName).get(5);
			date2 = Appointment.getAppointmentsDoctor(docName).get(7);
			month2 = Appointment.getAppointmentsDoctor(docName).get(8);
			time2 = Appointment.getAppointmentsDoctor(docName).get(9);

			patientUsername3 = Appointment.getAppointmentsDoctor(docName).get(10);
			date3 = Appointment.getAppointmentsDoctor(docName).get(12);
			month3 = Appointment.getAppointmentsDoctor(docName).get(13);
			time3 = Appointment.getAppointmentsDoctor(docName).get(14);

			patientUsername4 = Appointment.getAppointmentsDoctor(docName).get(15);
			date4 = Appointment.getAppointmentsDoctor(docName).get(17);
			month4 = Appointment.getAppointmentsDoctor(docName).get(18);
			time4 = Appointment.getAppointmentsDoctor(docName).get(19);
			
			JLabel pName1 = new JLabel(patientUsername);
			pName1.setBounds(200, 90, 97, 16);
			contentPane.add(pName1);
			
			JLabel pName2 = new JLabel(patientUsername2);
			pName2.setBounds(200, 120, 97, 16);
			contentPane.add(pName2);
			
			JLabel pName3 = new JLabel(patientUsername3);
			pName3.setBounds(200, 150, 97, 16);
			contentPane.add(pName3);
			
			JLabel pName4 = new JLabel(patientUsername4);
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
			
			JButton btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainPageDoctor mainPageDoctor = new MainPageDoctor();
					mainPageDoctor.setVisible(true);
				}
			});
			btnNewButton.setBounds(265, 390, 117, 29);
			contentPane.add(btnNewButton);
		}
		else if (numberOfAppointments == 5) {
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
			
			patientUsername = Appointment.getAppointmentsDoctor(docName).get(0);
			docName = Appointment.getAppointmentsDoctor(docName).get(1);
			date = Appointment.getAppointmentsDoctor(docName).get(2);
			month = Appointment.getAppointmentsDoctor(docName).get(3);
			time = Appointment.getAppointmentsDoctor(docName).get(4);
			
			patientUsername2 = Appointment.getAppointmentsDoctor(docName).get(5);
			date2 = Appointment.getAppointmentsDoctor(docName).get(7);
			month2 = Appointment.getAppointmentsDoctor(docName).get(8);
			time2 = Appointment.getAppointmentsDoctor(docName).get(9);

			patientUsername3 = Appointment.getAppointmentsDoctor(docName).get(10);
			date3 = Appointment.getAppointmentsDoctor(docName).get(12);
			month3 = Appointment.getAppointmentsDoctor(docName).get(13);
			time3 = Appointment.getAppointmentsDoctor(docName).get(14);

			patientUsername4 = Appointment.getAppointmentsDoctor(docName).get(15);
			date4 = Appointment.getAppointmentsDoctor(docName).get(17);
			month4 = Appointment.getAppointmentsDoctor(docName).get(18);
			time4 = Appointment.getAppointmentsDoctor(docName).get(19);
			
			patientUsername5 = Appointment.getAppointmentsDoctor(docName).get(20);
			date5 = Appointment.getAppointmentsDoctor(docName).get(22);
			month5 = Appointment.getAppointmentsDoctor(docName).get(23);
			time5 = Appointment.getAppointmentsDoctor(docName).get(24);
			
			JLabel pName1 = new JLabel(patientUsername);
			pName1.setBounds(200, 90, 97, 16);
			contentPane.add(pName1);
			
			JLabel pName2 = new JLabel(patientUsername2);
			pName2.setBounds(200, 120, 97, 16);
			contentPane.add(pName2);
			
			JLabel pName3 = new JLabel(patientUsername3);
			pName3.setBounds(200, 150, 97, 16);
			contentPane.add(pName3);
			
			JLabel pName4 = new JLabel(patientUsername4);
			pName4.setBounds(200, 180, 97, 16);
			contentPane.add(pName4);
			
			JLabel pName5 = new JLabel(patientUsername5);
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
			
			JButton btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainPageDoctor mainPageDoctor = new MainPageDoctor();
					mainPageDoctor.setVisible(true);
				}
			});
			btnNewButton.setBounds(265, 390, 117, 29);
			contentPane.add(btnNewButton);
		}
		else if (numberOfAppointments == 6) {
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
			
			patientUsername = Appointment.getAppointmentsDoctor(docName).get(0);
			docName = Appointment.getAppointmentsDoctor(docName).get(1);
			date = Appointment.getAppointmentsDoctor(docName).get(2);
			month = Appointment.getAppointmentsDoctor(docName).get(3);
			time = Appointment.getAppointmentsDoctor(docName).get(4);
			
			patientUsername2 = Appointment.getAppointmentsDoctor(docName).get(5);
			date2 = Appointment.getAppointmentsDoctor(docName).get(7);
			month2 = Appointment.getAppointmentsDoctor(docName).get(8);
			time2 = Appointment.getAppointmentsDoctor(docName).get(9);

			patientUsername3 = Appointment.getAppointmentsDoctor(docName).get(10);
			date3 = Appointment.getAppointmentsDoctor(docName).get(12);
			month3 = Appointment.getAppointmentsDoctor(docName).get(13);
			time3 = Appointment.getAppointmentsDoctor(docName).get(14);

			patientUsername4 = Appointment.getAppointmentsDoctor(docName).get(15);
			date4 = Appointment.getAppointmentsDoctor(docName).get(17);
			month4 = Appointment.getAppointmentsDoctor(docName).get(18);
			time4 = Appointment.getAppointmentsDoctor(docName).get(19);
			
			patientUsername5 = Appointment.getAppointmentsDoctor(docName).get(20);
			date5 = Appointment.getAppointmentsDoctor(docName).get(22);
			month5 = Appointment.getAppointmentsDoctor(docName).get(23);
			time5 = Appointment.getAppointmentsDoctor(docName).get(24);
			
			patientUsername6 = Appointment.getAppointmentsDoctor(docName).get(25);
			date6 = Appointment.getAppointmentsDoctor(docName).get(27);
			month6 = Appointment.getAppointmentsDoctor(docName).get(28);
			time6 = Appointment.getAppointmentsDoctor(docName).get(29);
			
			JLabel pName1 = new JLabel(patientUsername);
			pName1.setBounds(200, 90, 97, 16);
			contentPane.add(pName1);
			
			JLabel pName2 = new JLabel(patientUsername2);
			pName2.setBounds(200, 120, 97, 16);
			contentPane.add(pName2);
			
			JLabel pName3 = new JLabel(patientUsername3);
			pName3.setBounds(200, 150, 97, 16);
			contentPane.add(pName3);
			
			JLabel pName4 = new JLabel(patientUsername4);
			pName4.setBounds(200, 180, 97, 16);
			contentPane.add(pName4);
			
			JLabel pName5 = new JLabel(patientUsername5);
			pName5.setBounds(200, 210, 97, 16);
			contentPane.add(pName5);
			
			JLabel pName6 = new JLabel(patientUsername6);
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
			
			JButton btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainPageDoctor mainPageDoctor = new MainPageDoctor();
					mainPageDoctor.setVisible(true);
				}
			});
			btnNewButton.setBounds(265, 390, 117, 29);
			contentPane.add(btnNewButton);
		}
		else if (numberOfAppointments == 7) {
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
			
			patientUsername = Appointment.getAppointmentsDoctor(docName).get(0);
			docName = Appointment.getAppointmentsDoctor(docName).get(1);
			date = Appointment.getAppointmentsDoctor(docName).get(2);
			month = Appointment.getAppointmentsDoctor(docName).get(3);
			time = Appointment.getAppointmentsDoctor(docName).get(4);
			
			patientUsername2 = Appointment.getAppointmentsDoctor(docName).get(5);
			date2 = Appointment.getAppointmentsDoctor(docName).get(7);
			month2 = Appointment.getAppointmentsDoctor(docName).get(8);
			time2 = Appointment.getAppointmentsDoctor(docName).get(9);

			patientUsername3 = Appointment.getAppointmentsDoctor(docName).get(10);
			date3 = Appointment.getAppointmentsDoctor(docName).get(12);
			month3 = Appointment.getAppointmentsDoctor(docName).get(13);
			time3 = Appointment.getAppointmentsDoctor(docName).get(14);

			patientUsername4 = Appointment.getAppointmentsDoctor(docName).get(15);
			date4 = Appointment.getAppointmentsDoctor(docName).get(17);
			month4 = Appointment.getAppointmentsDoctor(docName).get(18);
			time4 = Appointment.getAppointmentsDoctor(docName).get(19);
			
			patientUsername5 = Appointment.getAppointmentsDoctor(docName).get(20);
			date5 = Appointment.getAppointmentsDoctor(docName).get(22);
			month5 = Appointment.getAppointmentsDoctor(docName).get(23);
			time5 = Appointment.getAppointmentsDoctor(docName).get(24);
			
			patientUsername6 = Appointment.getAppointmentsDoctor(docName).get(25);
			date6 = Appointment.getAppointmentsDoctor(docName).get(27);
			month6 = Appointment.getAppointmentsDoctor(docName).get(28);
			time6 = Appointment.getAppointmentsDoctor(docName).get(29);
			
			patientUsername7 = Appointment.getAppointmentsDoctor(docName).get(30);
			date7 = Appointment.getAppointmentsDoctor(docName).get(32);
			month7 = Appointment.getAppointmentsDoctor(docName).get(33);
			time7 = Appointment.getAppointmentsDoctor(docName).get(34);
			
			JLabel pName1 = new JLabel(patientUsername);
			pName1.setBounds(200, 90, 97, 16);
			contentPane.add(pName1);
			
			JLabel pName2 = new JLabel(patientUsername2);
			pName2.setBounds(200, 120, 97, 16);
			contentPane.add(pName2);
			
			JLabel pName3 = new JLabel(patientUsername3);
			pName3.setBounds(200, 150, 97, 16);
			contentPane.add(pName3);
			
			JLabel pName4 = new JLabel(patientUsername4);
			pName4.setBounds(200, 180, 97, 16);
			contentPane.add(pName4);
			
			JLabel pName5 = new JLabel(patientUsername5);
			pName5.setBounds(200, 210, 97, 16);
			contentPane.add(pName5);
			
			JLabel pName6 = new JLabel(patientUsername6);
			pName6.setBounds(200, 240, 97, 16);
			contentPane.add(pName6);
			
			JLabel pName7 = new JLabel(patientUsername7);
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

			JButton btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainPageDoctor mainPageDoctor = new MainPageDoctor();
					mainPageDoctor.setVisible(true);
				}
			});
			btnNewButton.setBounds(265, 390, 117, 29);
			contentPane.add(btnNewButton);
		}
		else if (numberOfAppointments == 8) {
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
			
			patientUsername = Appointment.getAppointmentsDoctor(docName).get(0);
			docName = Appointment.getAppointmentsDoctor(docName).get(1);
			date = Appointment.getAppointmentsDoctor(docName).get(2);
			month = Appointment.getAppointmentsDoctor(docName).get(3);
			time = Appointment.getAppointmentsDoctor(docName).get(4);
			
			patientUsername2 = Appointment.getAppointmentsDoctor(docName).get(5);
			date2 = Appointment.getAppointmentsDoctor(docName).get(7);
			month2 = Appointment.getAppointmentsDoctor(docName).get(8);
			time2 = Appointment.getAppointmentsDoctor(docName).get(9);

			patientUsername3 = Appointment.getAppointmentsDoctor(docName).get(10);
			date3 = Appointment.getAppointmentsDoctor(docName).get(12);
			month3 = Appointment.getAppointmentsDoctor(docName).get(13);
			time3 = Appointment.getAppointmentsDoctor(docName).get(14);

			patientUsername4 = Appointment.getAppointmentsDoctor(docName).get(15);
			date4 = Appointment.getAppointmentsDoctor(docName).get(17);
			month4 = Appointment.getAppointmentsDoctor(docName).get(18);
			time4 = Appointment.getAppointmentsDoctor(docName).get(19);
			
			patientUsername5 = Appointment.getAppointmentsDoctor(docName).get(20);
			date5 = Appointment.getAppointmentsDoctor(docName).get(22);
			month5 = Appointment.getAppointmentsDoctor(docName).get(23);
			time5 = Appointment.getAppointmentsDoctor(docName).get(24);
			
			patientUsername6 = Appointment.getAppointmentsDoctor(docName).get(25);
			date6 = Appointment.getAppointmentsDoctor(docName).get(27);
			month6 = Appointment.getAppointmentsDoctor(docName).get(28);
			time6 = Appointment.getAppointmentsDoctor(docName).get(29);
			
			patientUsername7 = Appointment.getAppointmentsDoctor(docName).get(30);
			date7 = Appointment.getAppointmentsDoctor(docName).get(32);
			month7 = Appointment.getAppointmentsDoctor(docName).get(33);
			time7 = Appointment.getAppointmentsDoctor(docName).get(34);
			
			patientUsername8 = Appointment.getAppointmentsDoctor(docName).get(35);
			date8 = Appointment.getAppointmentsDoctor(docName).get(37);
			month8 = Appointment.getAppointmentsDoctor(docName).get(38);
			time8 = Appointment.getAppointmentsDoctor(docName).get(39);
			
			JLabel pName1 = new JLabel(patientUsername);
			pName1.setBounds(200, 90, 97, 16);
			contentPane.add(pName1);
			
			JLabel pName2 = new JLabel(patientUsername2);
			pName2.setBounds(200, 120, 97, 16);
			contentPane.add(pName2);
			
			JLabel pName3 = new JLabel(patientUsername3);
			pName3.setBounds(200, 150, 97, 16);
			contentPane.add(pName3);
			
			JLabel pName4 = new JLabel(patientUsername4);
			pName4.setBounds(200, 180, 97, 16);
			contentPane.add(pName4);
			
			JLabel pName5 = new JLabel(patientUsername5);
			pName5.setBounds(200, 210, 97, 16);
			contentPane.add(pName5);
			
			JLabel pName6 = new JLabel(patientUsername6);
			pName6.setBounds(200, 240, 97, 16);
			contentPane.add(pName6);
			
			JLabel pName7 = new JLabel(patientUsername7);
			pName7.setBounds(200, 270, 97, 16);
			contentPane.add(pName7);
			
			JLabel pName8 = new JLabel(patientUsername8);
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
			
			JButton btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainPageDoctor mainPageDoctor = new MainPageDoctor();
					mainPageDoctor.setVisible(true);
				}
			});
			btnNewButton.setBounds(265, 390, 117, 29);
			contentPane.add(btnNewButton);
		}
		else if (numberOfAppointments == 9) {
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
			
			patientUsername = Appointment.getAppointmentsDoctor(docName).get(0);
			docName = Appointment.getAppointmentsDoctor(docName).get(1);
			date = Appointment.getAppointmentsDoctor(docName).get(2);
			month = Appointment.getAppointmentsDoctor(docName).get(3);
			time = Appointment.getAppointmentsDoctor(docName).get(4);
			
			patientUsername2 = Appointment.getAppointmentsDoctor(docName).get(5);
			date2 = Appointment.getAppointmentsDoctor(docName).get(7);
			month2 = Appointment.getAppointmentsDoctor(docName).get(8);
			time2 = Appointment.getAppointmentsDoctor(docName).get(9);

			patientUsername3 = Appointment.getAppointmentsDoctor(docName).get(10);
			date3 = Appointment.getAppointmentsDoctor(docName).get(12);
			month3 = Appointment.getAppointmentsDoctor(docName).get(13);
			time3 = Appointment.getAppointmentsDoctor(docName).get(14);

			patientUsername4 = Appointment.getAppointmentsDoctor(docName).get(15);
			date4 = Appointment.getAppointmentsDoctor(docName).get(17);
			month4 = Appointment.getAppointmentsDoctor(docName).get(18);
			time4 = Appointment.getAppointmentsDoctor(docName).get(19);
			
			patientUsername5 = Appointment.getAppointmentsDoctor(docName).get(20);
			date5 = Appointment.getAppointmentsDoctor(docName).get(22);
			month5 = Appointment.getAppointmentsDoctor(docName).get(23);
			time5 = Appointment.getAppointmentsDoctor(docName).get(24);
			
			patientUsername6 = Appointment.getAppointmentsDoctor(docName).get(25);
			date6 = Appointment.getAppointmentsDoctor(docName).get(27);
			month6 = Appointment.getAppointmentsDoctor(docName).get(28);
			time6 = Appointment.getAppointmentsDoctor(docName).get(29);
			
			patientUsername7 = Appointment.getAppointmentsDoctor(docName).get(30);
			date7 = Appointment.getAppointmentsDoctor(docName).get(32);
			month7 = Appointment.getAppointmentsDoctor(docName).get(33);
			time7 = Appointment.getAppointmentsDoctor(docName).get(34);
			
			patientUsername8 = Appointment.getAppointmentsDoctor(docName).get(35);
			date8 = Appointment.getAppointmentsDoctor(docName).get(37);
			month8 = Appointment.getAppointmentsDoctor(docName).get(38);
			time8 = Appointment.getAppointmentsDoctor(docName).get(39);
			
			patientUsername9 = Appointment.getAppointmentsDoctor(docName).get(40);
			date9 = Appointment.getAppointmentsDoctor(docName).get(42);
			month9 = Appointment.getAppointmentsDoctor(docName).get(43);
			time9 = Appointment.getAppointmentsDoctor(docName).get(44);
			
			JLabel pName1 = new JLabel(patientUsername);
			pName1.setBounds(200, 90, 97, 16);
			contentPane.add(pName1);
			
			JLabel pName2 = new JLabel(patientUsername2);
			pName2.setBounds(200, 120, 97, 16);
			contentPane.add(pName2);
			
			JLabel pName3 = new JLabel(patientUsername3);
			pName3.setBounds(200, 150, 97, 16);
			contentPane.add(pName3);
			
			JLabel pName4 = new JLabel(patientUsername4);
			pName4.setBounds(200, 180, 97, 16);
			contentPane.add(pName4);
			
			JLabel pName5 = new JLabel(patientUsername5);
			pName5.setBounds(200, 210, 97, 16);
			contentPane.add(pName5);
			
			JLabel pName6 = new JLabel(patientUsername6);
			pName6.setBounds(200, 240, 97, 16);
			contentPane.add(pName6);
			
			JLabel pName7 = new JLabel(patientUsername7);
			pName7.setBounds(200, 270, 97, 16);
			contentPane.add(pName7);
			
			JLabel pName8 = new JLabel(patientUsername8);
			pName8.setBounds(200, 300, 97, 16);
			contentPane.add(pName8);
			
			JLabel pName9 = new JLabel(patientUsername9);
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
			
			JButton btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainPageDoctor mainPageDoctor = new MainPageDoctor();
					mainPageDoctor.setVisible(true);
				}
			});
			btnNewButton.setBounds(265, 390, 117, 29);
			contentPane.add(btnNewButton);
		}
		else if (numberOfAppointments == 10) {
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
			
			patientUsername = Appointment.getAppointmentsDoctor(docName).get(0);
			docName = Appointment.getAppointmentsDoctor(docName).get(1);
			date = Appointment.getAppointmentsDoctor(docName).get(2);
			month = Appointment.getAppointmentsDoctor(docName).get(3);
			time = Appointment.getAppointmentsDoctor(docName).get(4);
			
			patientUsername2 = Appointment.getAppointmentsDoctor(docName).get(5);
			date2 = Appointment.getAppointmentsDoctor(docName).get(7);
			month2 = Appointment.getAppointmentsDoctor(docName).get(8);
			time2 = Appointment.getAppointmentsDoctor(docName).get(9);

			patientUsername3 = Appointment.getAppointmentsDoctor(docName).get(10);
			date3 = Appointment.getAppointmentsDoctor(docName).get(12);
			month3 = Appointment.getAppointmentsDoctor(docName).get(13);
			time3 = Appointment.getAppointmentsDoctor(docName).get(14);

			patientUsername4 = Appointment.getAppointmentsDoctor(docName).get(15);
			date4 = Appointment.getAppointmentsDoctor(docName).get(17);
			month4 = Appointment.getAppointmentsDoctor(docName).get(18);
			time4 = Appointment.getAppointmentsDoctor(docName).get(19);
			
			patientUsername5 = Appointment.getAppointmentsDoctor(docName).get(20);
			date5 = Appointment.getAppointmentsDoctor(docName).get(22);
			month5 = Appointment.getAppointmentsDoctor(docName).get(23);
			time5 = Appointment.getAppointmentsDoctor(docName).get(24);
			
			patientUsername6 = Appointment.getAppointmentsDoctor(docName).get(25);
			date6 = Appointment.getAppointmentsDoctor(docName).get(27);
			month6 = Appointment.getAppointmentsDoctor(docName).get(28);
			time6 = Appointment.getAppointmentsDoctor(docName).get(29);
			
			patientUsername7 = Appointment.getAppointmentsDoctor(docName).get(30);
			date7 = Appointment.getAppointmentsDoctor(docName).get(32);
			month7 = Appointment.getAppointmentsDoctor(docName).get(33);
			time7 = Appointment.getAppointmentsDoctor(docName).get(34);
			
			patientUsername8 = Appointment.getAppointmentsDoctor(docName).get(35);
			date8 = Appointment.getAppointmentsDoctor(docName).get(37);
			month8 = Appointment.getAppointmentsDoctor(docName).get(38);
			time8 = Appointment.getAppointmentsDoctor(docName).get(39);
			
			patientUsername9 = Appointment.getAppointmentsDoctor(docName).get(40);
			date9 = Appointment.getAppointmentsDoctor(docName).get(42);
			month9 = Appointment.getAppointmentsDoctor(docName).get(43);
			time9 = Appointment.getAppointmentsDoctor(docName).get(44);
			
			patientUsername10 = Appointment.getAppointmentsDoctor(docName).get(45);
			date10 = Appointment.getAppointmentsDoctor(docName).get(47);
			month10 = Appointment.getAppointmentsDoctor(docName).get(48);
			time10 = Appointment.getAppointmentsDoctor(docName).get(49);
			
			JLabel pName1 = new JLabel(patientUsername);
			pName1.setBounds(200, 90, 97, 16);
			contentPane.add(pName1);
			
			JLabel pName2 = new JLabel(patientUsername2);
			pName2.setBounds(200, 120, 97, 16);
			contentPane.add(pName2);
			
			JLabel pName3 = new JLabel(patientUsername3);
			pName3.setBounds(200, 150, 97, 16);
			contentPane.add(pName3);
			
			JLabel pName4 = new JLabel(patientUsername4);
			pName4.setBounds(200, 180, 97, 16);
			contentPane.add(pName4);
			
			JLabel pName5 = new JLabel(patientUsername5);
			pName5.setBounds(200, 210, 97, 16);
			contentPane.add(pName5);
			
			JLabel pName6 = new JLabel(patientUsername6);
			pName6.setBounds(200, 240, 97, 16);
			contentPane.add(pName6);
			
			JLabel pName7 = new JLabel(patientUsername7);
			pName7.setBounds(200, 270, 97, 16);
			contentPane.add(pName7);
			
			JLabel pName8 = new JLabel(patientUsername8);
			pName8.setBounds(200, 300, 97, 16);
			contentPane.add(pName8);
			
			JLabel pName9 = new JLabel(patientUsername9);
			pName9.setBounds(200, 330, 97, 16);
			contentPane.add(pName9);
			
			JLabel pName10 = new JLabel(patientUsername10);
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
			
			JButton btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainPageDoctor mainPageDoctor = new MainPageDoctor();
					mainPageDoctor.setVisible(true);
				}
			});
			btnNewButton.setBounds(265, 390, 117, 29);
			contentPane.add(btnNewButton);
		}
	}
	
	public static int numberOfAppointmentsDoctor(String docName) {
		int counter = 0;
		try {
	        FileReader reader = new FileReader("appointments.txt");
	        FileWriter writer = new FileWriter("appointments.txt", true);
	        BufferedReader appointmentSymbols = new BufferedReader(reader);
	        String name = appointmentSymbols.readLine();
	        while(name != null){
				if(name.equals(docName)){
					counter++;
					System.out.println(name);
				}
				name = appointmentSymbols.readLine();	
				}
	            appointmentSymbols.close();
	            
		}catch(IOException error){
            error.printStackTrace();
        }
		return counter;
	}
	
	public static String usernameToName(String username) {
		String docName = null;
		if(username.equals("dr_strange")) {
			docName = "Dr. Strange";
		}
		else if(username.equals("dr_who")) {
			docName = "Dr. Who";
		}
		else if(username.equals("dr_banner")) {
			docName = "Dr. Banner";
		}
		return docName;
	}
}
