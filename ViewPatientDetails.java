import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ViewPatientDetails extends ViewAppointmentDoctor {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPatientDetails frame = new ViewPatientDetails();
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
	public ViewPatientDetails() {
		setTitle("Patient Details");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(160, 25, 81, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(315, 25, 101, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("Email");
		label.setBounds(467, 25, 61, 16);
		contentPane.add(label);
		
		if (numberOfAppointments == 1) {
			JLabel label_2 = new JLabel(patientUsername);
			label_2.setBounds(160, 75, 131, 16);
			contentPane.add(label_2);
			
			JLabel label_5 = new JLabel(Account.getUserDetails(patientUsername).get(2));
			label_5.setBounds(305, 75, 84, 16);
			contentPane.add(label_5);
			
			JLabel label_8 = new JLabel(Account.getUserDetails(patientUsername).get(3));
			label_8.setBounds(435, 75, 124, 16);
			contentPane.add(label_8);
			
			JLabel lblNewLabel_2 = new JLabel("1.");
			lblNewLabel_2.setBounds(129, 75, 25, 16);
			contentPane.add(lblNewLabel_2);
		}
		if (numberOfAppointments == 2) {
			JLabel label_2 = new JLabel(patientUsername);
			label_2.setBounds(160, 75, 131, 16);
			contentPane.add(label_2);
			
			JLabel label_5 = new JLabel(Account.getUserDetails(patientUsername).get(2));
			label_5.setBounds(305, 75, 84, 16);
			contentPane.add(label_5);
			
			JLabel label_8 = new JLabel(Account.getUserDetails(patientUsername).get(3));
			label_8.setBounds(435, 75, 124, 16);
			contentPane.add(label_8);
			
			JLabel lblNewLabel_2 = new JLabel("1.");
			lblNewLabel_2.setBounds(129, 75, 25, 16);
			contentPane.add(lblNewLabel_2);
			
			JLabel label_21 = new JLabel(patientUsername2);
			label_21.setBounds(160, 105, 131, 16);
			contentPane.add(label_21);
			
			JLabel label_51 = new JLabel(Account.getUserDetails(patientUsername2).get(2));
			label_51.setBounds(305, 105, 84, 16);
			contentPane.add(label_51);
				
			JLabel label_81 = new JLabel(Account.getUserDetails(patientUsername2).get(3));
			label_81.setBounds(435, 105, 124, 16);
			contentPane.add(label_81);
				
			JLabel lblNewLabel_21 = new JLabel("2.");
			lblNewLabel_21.setBounds(129, 105, 25, 16);
			contentPane.add(lblNewLabel_21);
		}
		if (numberOfAppointments == 3) {
			JLabel label_2 = new JLabel(patientUsername);
			label_2.setBounds(160, 75, 131, 16);
			contentPane.add(label_2);
			
			JLabel label_5 = new JLabel(Account.getUserDetails(patientUsername).get(2));
			label_5.setBounds(305, 75, 84, 16);
			contentPane.add(label_5);
			
			JLabel label_8 = new JLabel(Account.getUserDetails(patientUsername).get(3));
			label_8.setBounds(435, 75, 124, 16);
			contentPane.add(label_8);
			
			JLabel lblNewLabel_2 = new JLabel("1.");
			lblNewLabel_2.setBounds(129, 75, 25, 16);
			contentPane.add(lblNewLabel_2);
			
			JLabel label_21 = new JLabel(patientUsername2);
			label_21.setBounds(160, 105, 131, 16);
			contentPane.add(label_21);
			
			JLabel label_51 = new JLabel(Account.getUserDetails(patientUsername2).get(2));
			label_51.setBounds(305, 105, 84, 16);
			contentPane.add(label_51);
				
			JLabel label_81 = new JLabel(Account.getUserDetails(patientUsername2).get(3));
			label_81.setBounds(435, 105, 124, 16);
			contentPane.add(label_81);
				
			JLabel lblNewLabel_21 = new JLabel("2.");
			lblNewLabel_21.setBounds(129, 105, 25, 16);
			contentPane.add(lblNewLabel_21);
			
			JLabel label_31 = new JLabel(patientUsername3);
			label_31.setBounds(160, 135, 131, 16);
			contentPane.add(label_31);
			
			JLabel label_41 = new JLabel(Account.getUserDetails(patientUsername3).get(2));
			label_41.setBounds(305, 135, 84, 16);
			contentPane.add(label_41);
				
			JLabel llabel_51 = new JLabel(Account.getUserDetails(patientUsername3).get(3));
			llabel_51.setBounds(435, 135, 124, 16);
			contentPane.add(llabel_51);
				
			JLabel lblNewLabel_61 = new JLabel("3.");
			lblNewLabel_61.setBounds(129, 135, 25, 16);
			contentPane.add(lblNewLabel_61);
		}
		if (numberOfAppointments == 4) {
			JLabel label_2 = new JLabel(patientUsername);
			label_2.setBounds(160, 75, 131, 16);
			contentPane.add(label_2);
			
			JLabel label_5 = new JLabel(Account.getUserDetails(patientUsername).get(2));
			label_5.setBounds(305, 75, 84, 16);
			contentPane.add(label_5);
			
			JLabel label_8 = new JLabel(Account.getUserDetails(patientUsername).get(3));
			label_8.setBounds(435, 75, 124, 16);
			contentPane.add(label_8);
			
			JLabel lblNewLabel_2 = new JLabel("1.");
			lblNewLabel_2.setBounds(129, 75, 25, 16);
			contentPane.add(lblNewLabel_2);
			
			JLabel label_21 = new JLabel(patientUsername2);
			label_21.setBounds(160, 105, 131, 16);
			contentPane.add(label_21);
			
			JLabel label_51 = new JLabel(Account.getUserDetails(patientUsername2).get(2));
			label_51.setBounds(305, 105, 84, 16);
			contentPane.add(label_51);
				
			JLabel label_81 = new JLabel(Account.getUserDetails(patientUsername2).get(3));
			label_81.setBounds(435, 105, 124, 16);
			contentPane.add(label_81);
				
			JLabel lblNewLabel_21 = new JLabel("2.");
			lblNewLabel_21.setBounds(129, 105, 25, 16);
			contentPane.add(lblNewLabel_21);
			
			JLabel label_31 = new JLabel(patientUsername3);
			label_31.setBounds(160, 135, 131, 16);
			contentPane.add(label_31);
			
			JLabel label_41 = new JLabel(Account.getUserDetails(patientUsername3).get(2));
			label_41.setBounds(305, 135, 84, 16);
			contentPane.add(label_41);
				
			JLabel llabel_51 = new JLabel(Account.getUserDetails(patientUsername3).get(3));
			llabel_51.setBounds(435, 135, 124, 16);
			contentPane.add(llabel_51);
				
			JLabel lblNewLabel_61 = new JLabel("3.");
			lblNewLabel_61.setBounds(129, 135, 25, 16);
			contentPane.add(lblNewLabel_61);
			
			JLabel label_71 = new JLabel(patientUsername4);
			label_71.setBounds(160, 165, 131, 16);
			contentPane.add(label_71);
			
			JLabel llabel_81 = new JLabel(Account.getUserDetails(patientUsername4).get(2));
			llabel_81.setBounds(305, 165, 84, 16);
			contentPane.add(llabel_81);
				
			JLabel label_91 = new JLabel(Account.getUserDetails(patientUsername4).get(3));
			label_91.setBounds(435, 165, 124, 16);
			contentPane.add(label_91);
				
			JLabel lblNewLabel_11 = new JLabel("4.");
			lblNewLabel_11.setBounds(129, 165, 25, 16);
			contentPane.add(lblNewLabel_11);
		}
		if (numberOfAppointments == 5) {
			JLabel label_2 = new JLabel(patientUsername);
			label_2.setBounds(160, 75, 131, 16);
			contentPane.add(label_2);
			
			JLabel label_5 = new JLabel(Account.getUserDetails(patientUsername).get(2));
			label_5.setBounds(305, 75, 84, 16);
			contentPane.add(label_5);
			
			JLabel label_8 = new JLabel(Account.getUserDetails(patientUsername).get(3));
			label_8.setBounds(435, 75, 124, 16);
			contentPane.add(label_8);
			
			JLabel lblNewLabel_2 = new JLabel("1.");
			lblNewLabel_2.setBounds(129, 75, 25, 16);
			contentPane.add(lblNewLabel_2);
			
			JLabel label_21 = new JLabel(patientUsername2);
			label_21.setBounds(160, 105, 131, 16);
			contentPane.add(label_21);
			
			JLabel label_51 = new JLabel(Account.getUserDetails(patientUsername2).get(2));
			label_51.setBounds(305, 105, 84, 16);
			contentPane.add(label_51);
				
			JLabel label_81 = new JLabel(Account.getUserDetails(patientUsername2).get(3));
			label_81.setBounds(435, 105, 124, 16);
			contentPane.add(label_81);
				
			JLabel lblNewLabel_21 = new JLabel("2.");
			lblNewLabel_21.setBounds(129, 105, 25, 16);
			contentPane.add(lblNewLabel_21);
			
			JLabel label_31 = new JLabel(patientUsername3);
			label_31.setBounds(160, 135, 131, 16);
			contentPane.add(label_31);
			
			JLabel label_41 = new JLabel(Account.getUserDetails(patientUsername3).get(2));
			label_41.setBounds(305, 135, 84, 16);
			contentPane.add(label_41);
				
			JLabel llabel_51 = new JLabel(Account.getUserDetails(patientUsername3).get(3));
			llabel_51.setBounds(435, 135, 124, 16);
			contentPane.add(llabel_51);
				
			JLabel lblNewLabel_61 = new JLabel("3.");
			lblNewLabel_61.setBounds(129, 135, 25, 16);
			contentPane.add(lblNewLabel_61);
			
			JLabel label_71 = new JLabel(patientUsername4);
			label_71.setBounds(160, 165, 131, 16);
			contentPane.add(label_71);
			
			JLabel llabel_81 = new JLabel(Account.getUserDetails(patientUsername4).get(2));
			llabel_81.setBounds(305, 165, 84, 16);
			contentPane.add(llabel_81);
				
			JLabel label_91 = new JLabel(Account.getUserDetails(patientUsername4).get(3));
			label_91.setBounds(435, 165, 124, 16);
			contentPane.add(label_91);
				
			JLabel lblNewLabel_11 = new JLabel("4.");
			lblNewLabel_11.setBounds(129, 165, 25, 16);
			contentPane.add(lblNewLabel_11);
			
			JLabel labell_21 = new JLabel(patientUsername5);
			labell_21.setBounds(160, 195, 131, 16);
			contentPane.add(labell_21);
			
			JLabel labeel_51 = new JLabel(Account.getUserDetails(patientUsername5).get(2));
			labeel_51.setBounds(305, 195, 84, 16);
			contentPane.add(labeel_51);
				
			JLabel laabel_81 = new JLabel(Account.getUserDetails(patientUsername5).get(3));
			laabel_81.setBounds(435, 195, 124, 16);
			contentPane.add(laabel_81);
				
			JLabel a = new JLabel("5.");
			a.setBounds(129, 195, 25, 16);
			contentPane.add(a);
		}
		if (numberOfAppointments == 6) {
			JLabel label_2 = new JLabel(patientUsername);
			label_2.setBounds(160, 75, 131, 16);
			contentPane.add(label_2);
			
			JLabel label_5 = new JLabel(Account.getUserDetails(patientUsername).get(2));
			label_5.setBounds(305, 75, 84, 16);
			contentPane.add(label_5);
			
			JLabel label_8 = new JLabel(Account.getUserDetails(patientUsername).get(3));
			label_8.setBounds(435, 75, 124, 16);
			contentPane.add(label_8);
			
			JLabel lblNewLabel_2 = new JLabel("1.");
			lblNewLabel_2.setBounds(129, 75, 25, 16);
			contentPane.add(lblNewLabel_2);
			
			JLabel label_21 = new JLabel(patientUsername2);
			label_21.setBounds(160, 105, 131, 16);
			contentPane.add(label_21);
			
			JLabel label_51 = new JLabel(Account.getUserDetails(patientUsername2).get(2));
			label_51.setBounds(305, 105, 84, 16);
			contentPane.add(label_51);
				
			JLabel label_81 = new JLabel(Account.getUserDetails(patientUsername2).get(3));
			label_81.setBounds(435, 105, 124, 16);
			contentPane.add(label_81);
				
			JLabel lblNewLabel_21 = new JLabel("2.");
			lblNewLabel_21.setBounds(129, 105, 25, 16);
			contentPane.add(lblNewLabel_21);
			
			JLabel label_31 = new JLabel(patientUsername3);
			label_31.setBounds(160, 135, 131, 16);
			contentPane.add(label_31);
			
			JLabel label_41 = new JLabel(Account.getUserDetails(patientUsername3).get(2));
			label_41.setBounds(305, 135, 84, 16);
			contentPane.add(label_41);
				
			JLabel llabel_51 = new JLabel(Account.getUserDetails(patientUsername3).get(3));
			llabel_51.setBounds(435, 135, 124, 16);
			contentPane.add(llabel_51);
				
			JLabel lblNewLabel_61 = new JLabel("3.");
			lblNewLabel_61.setBounds(129, 135, 25, 16);
			contentPane.add(lblNewLabel_61);
			
			JLabel label_71 = new JLabel(patientUsername4);
			label_71.setBounds(160, 165, 131, 16);
			contentPane.add(label_71);
			
			JLabel llabel_81 = new JLabel(Account.getUserDetails(patientUsername4).get(2));
			llabel_81.setBounds(305, 165, 84, 16);
			contentPane.add(llabel_81);
				
			JLabel label_91 = new JLabel(Account.getUserDetails(patientUsername4).get(3));
			label_91.setBounds(435, 165, 124, 16);
			contentPane.add(label_91);
				
			JLabel lblNewLabel_11 = new JLabel("4.");
			lblNewLabel_11.setBounds(129, 165, 25, 16);
			contentPane.add(lblNewLabel_11);
			
			JLabel labell_21 = new JLabel(patientUsername5);
			labell_21.setBounds(160, 195, 131, 16);
			contentPane.add(labell_21);
			
			JLabel labeel_51 = new JLabel(Account.getUserDetails(patientUsername5).get(2));
			labeel_51.setBounds(305, 195, 84, 16);
			contentPane.add(labeel_51);
				
			JLabel laabel_81 = new JLabel(Account.getUserDetails(patientUsername5).get(3));
			laabel_81.setBounds(435, 195, 124, 16);
			contentPane.add(laabel_81);
				
			JLabel a = new JLabel("5.");
			a.setBounds(129, 195, 25, 16);
			contentPane.add(a);
			
			JLabel b = new JLabel(patientUsername6);
			b.setBounds(160, 225, 131, 16);
			contentPane.add(b);
			
			JLabel v = new JLabel(Account.getUserDetails(patientUsername6).get(2));
			v.setBounds(305, 225, 84, 16);
			contentPane.add(v);
				
			JLabel c = new JLabel(Account.getUserDetails(patientUsername6).get(3));
			c.setBounds(435, 225, 124, 16);
			contentPane.add(c);
				
			JLabel x = new JLabel("6.");
			x.setBounds(129, 225, 25, 16);
			contentPane.add(x);
		}
		if (numberOfAppointments == 7) {
			JLabel label_2 = new JLabel(patientUsername);
			label_2.setBounds(160, 75, 131, 16);
			contentPane.add(label_2);
			
			JLabel label_5 = new JLabel(Account.getUserDetails(patientUsername).get(2));
			label_5.setBounds(305, 75, 84, 16);
			contentPane.add(label_5);
			
			JLabel label_8 = new JLabel(Account.getUserDetails(patientUsername).get(3));
			label_8.setBounds(435, 75, 124, 16);
			contentPane.add(label_8);
			
			JLabel lblNewLabel_2 = new JLabel("1.");
			lblNewLabel_2.setBounds(129, 75, 25, 16);
			contentPane.add(lblNewLabel_2);
			
			JLabel label_21 = new JLabel(patientUsername2);
			label_21.setBounds(160, 105, 131, 16);
			contentPane.add(label_21);
			
			JLabel label_51 = new JLabel(Account.getUserDetails(patientUsername2).get(2));
			label_51.setBounds(305, 105, 84, 16);
			contentPane.add(label_51);
				
			JLabel label_81 = new JLabel(Account.getUserDetails(patientUsername2).get(3));
			label_81.setBounds(435, 105, 124, 16);
			contentPane.add(label_81);
				
			JLabel lblNewLabel_21 = new JLabel("2.");
			lblNewLabel_21.setBounds(129, 105, 25, 16);
			contentPane.add(lblNewLabel_21);
			
			JLabel label_31 = new JLabel(patientUsername3);
			label_31.setBounds(160, 135, 131, 16);
			contentPane.add(label_31);
			
			JLabel label_41 = new JLabel(Account.getUserDetails(patientUsername3).get(2));
			label_41.setBounds(305, 135, 84, 16);
			contentPane.add(label_41);
				
			JLabel llabel_51 = new JLabel(Account.getUserDetails(patientUsername3).get(3));
			llabel_51.setBounds(435, 135, 124, 16);
			contentPane.add(llabel_51);
				
			JLabel lblNewLabel_61 = new JLabel("3.");
			lblNewLabel_61.setBounds(129, 135, 25, 16);
			contentPane.add(lblNewLabel_61);
			
			JLabel label_71 = new JLabel(patientUsername4);
			label_71.setBounds(160, 165, 131, 16);
			contentPane.add(label_71);
			
			JLabel llabel_81 = new JLabel(Account.getUserDetails(patientUsername4).get(2));
			llabel_81.setBounds(305, 165, 84, 16);
			contentPane.add(llabel_81);
				
			JLabel label_91 = new JLabel(Account.getUserDetails(patientUsername4).get(3));
			label_91.setBounds(435, 165, 124, 16);
			contentPane.add(label_91);
				
			JLabel lblNewLabel_11 = new JLabel("4.");
			lblNewLabel_11.setBounds(129, 165, 25, 16);
			contentPane.add(lblNewLabel_11);
			
			JLabel labell_21 = new JLabel(patientUsername5);
			labell_21.setBounds(160, 195, 131, 16);
			contentPane.add(labell_21);
			
			JLabel labeel_51 = new JLabel(Account.getUserDetails(patientUsername5).get(2));
			labeel_51.setBounds(305, 195, 84, 16);
			contentPane.add(labeel_51);
				
			JLabel laabel_81 = new JLabel(Account.getUserDetails(patientUsername5).get(3));
			laabel_81.setBounds(435, 195, 124, 16);
			contentPane.add(laabel_81);
				
			JLabel a = new JLabel("5.");
			a.setBounds(129, 195, 25, 16);
			contentPane.add(a);
			
			JLabel b = new JLabel(patientUsername6);
			b.setBounds(160, 225, 131, 16);
			contentPane.add(b);
			
			JLabel v = new JLabel(Account.getUserDetails(patientUsername6).get(2));
			v.setBounds(305, 225, 84, 16);
			contentPane.add(v);
				
			JLabel c = new JLabel(Account.getUserDetails(patientUsername6).get(3));
			c.setBounds(435, 225, 124, 16);
			contentPane.add(c);
				
			JLabel x = new JLabel("6.");
			x.setBounds(129, 225, 25, 16);
			contentPane.add(x);
			
			JLabel z = new JLabel(patientUsername7);
			z.setBounds(160, 255, 131, 16);
			contentPane.add(z);
			
			JLabel s = new JLabel(Account.getUserDetails(patientUsername7).get(2));
			s.setBounds(305, 255, 84, 16);
			contentPane.add(s);
				
			JLabel d = new JLabel(Account.getUserDetails(patientUsername7).get(3));
			d.setBounds(435, 255, 124, 16);
			contentPane.add(d);
				
			JLabel f = new JLabel("7.");
			f.setBounds(129, 255, 25, 16);
			contentPane.add(f);
		}
		if (numberOfAppointments == 8) {
			JLabel label_2 = new JLabel(patientUsername);
			label_2.setBounds(160, 75, 131, 16);
			contentPane.add(label_2);
			
			JLabel label_5 = new JLabel(Account.getUserDetails(patientUsername).get(2));
			label_5.setBounds(305, 75, 84, 16);
			contentPane.add(label_5);
			
			JLabel label_8 = new JLabel(Account.getUserDetails(patientUsername).get(3));
			label_8.setBounds(435, 75, 124, 16);
			contentPane.add(label_8);
			
			JLabel lblNewLabel_2 = new JLabel("1.");
			lblNewLabel_2.setBounds(129, 75, 25, 16);
			contentPane.add(lblNewLabel_2);
			
			JLabel label_21 = new JLabel(patientUsername2);
			label_21.setBounds(160, 105, 131, 16);
			contentPane.add(label_21);
			
			JLabel label_51 = new JLabel(Account.getUserDetails(patientUsername2).get(2));
			label_51.setBounds(305, 105, 84, 16);
			contentPane.add(label_51);
				
			JLabel label_81 = new JLabel(Account.getUserDetails(patientUsername2).get(3));
			label_81.setBounds(435, 105, 124, 16);
			contentPane.add(label_81);
				
			JLabel lblNewLabel_21 = new JLabel("2.");
			lblNewLabel_21.setBounds(129, 105, 25, 16);
			contentPane.add(lblNewLabel_21);
			
			JLabel label_31 = new JLabel(patientUsername3);
			label_31.setBounds(160, 135, 131, 16);
			contentPane.add(label_31);
			
			JLabel label_41 = new JLabel(Account.getUserDetails(patientUsername3).get(2));
			label_41.setBounds(305, 135, 84, 16);
			contentPane.add(label_41);
				
			JLabel llabel_51 = new JLabel(Account.getUserDetails(patientUsername3).get(3));
			llabel_51.setBounds(435, 135, 124, 16);
			contentPane.add(llabel_51);
				
			JLabel lblNewLabel_61 = new JLabel("3.");
			lblNewLabel_61.setBounds(129, 135, 25, 16);
			contentPane.add(lblNewLabel_61);
			
			JLabel label_71 = new JLabel(patientUsername4);
			label_71.setBounds(160, 165, 131, 16);
			contentPane.add(label_71);
			
			JLabel llabel_81 = new JLabel(Account.getUserDetails(patientUsername4).get(2));
			llabel_81.setBounds(305, 165, 84, 16);
			contentPane.add(llabel_81);
				
			JLabel label_91 = new JLabel(Account.getUserDetails(patientUsername4).get(3));
			label_91.setBounds(435, 165, 124, 16);
			contentPane.add(label_91);
				
			JLabel lblNewLabel_11 = new JLabel("4.");
			lblNewLabel_11.setBounds(129, 165, 25, 16);
			contentPane.add(lblNewLabel_11);
			
			JLabel labell_21 = new JLabel(patientUsername5);
			labell_21.setBounds(160, 195, 131, 16);
			contentPane.add(labell_21);
			
			JLabel labeel_51 = new JLabel(Account.getUserDetails(patientUsername5).get(2));
			labeel_51.setBounds(305, 195, 84, 16);
			contentPane.add(labeel_51);
				
			JLabel laabel_81 = new JLabel(Account.getUserDetails(patientUsername5).get(3));
			laabel_81.setBounds(435, 195, 124, 16);
			contentPane.add(laabel_81);
				
			JLabel a = new JLabel("5.");
			a.setBounds(129, 195, 25, 16);
			contentPane.add(a);
			
			JLabel b = new JLabel(patientUsername6);
			b.setBounds(160, 225, 131, 16);
			contentPane.add(b);
			
			JLabel v = new JLabel(Account.getUserDetails(patientUsername6).get(2));
			v.setBounds(305, 225, 84, 16);
			contentPane.add(v);
				
			JLabel c = new JLabel(Account.getUserDetails(patientUsername6).get(3));
			c.setBounds(435, 225, 124, 16);
			contentPane.add(c);
				
			JLabel x = new JLabel("6.");
			x.setBounds(129, 225, 25, 16);
			contentPane.add(x);
			
			JLabel z = new JLabel(patientUsername7);
			z.setBounds(160, 255, 131, 16);
			contentPane.add(z);
			
			JLabel s = new JLabel(Account.getUserDetails(patientUsername7).get(2));
			s.setBounds(305, 255, 84, 16);
			contentPane.add(s);
				
			JLabel d = new JLabel(Account.getUserDetails(patientUsername7).get(3));
			d.setBounds(435, 255, 124, 16);
			contentPane.add(d);
				
			JLabel f = new JLabel("7.");
			f.setBounds(129, 255, 25, 16);
			contentPane.add(f);
			
			JLabel g = new JLabel(patientUsername8);
			g.setBounds(160, 285, 131, 16);
			contentPane.add(g);
			
			JLabel h = new JLabel(Account.getUserDetails(patientUsername8).get(2));
			h.setBounds(305, 285, 84, 16);
			contentPane.add(h);
				
			JLabel j = new JLabel(Account.getUserDetails(patientUsername8).get(3));
			j.setBounds(435, 285, 124, 16);
			contentPane.add(j);
				
			JLabel k = new JLabel("8.");
			k.setBounds(129, 285, 25, 16);
			contentPane.add(k);
		}
		if (numberOfAppointments == 9) {
			JLabel label_2 = new JLabel(patientUsername);
			label_2.setBounds(160, 75, 131, 16);
			contentPane.add(label_2);
			
			JLabel label_5 = new JLabel(Account.getUserDetails(patientUsername).get(2));
			label_5.setBounds(305, 75, 84, 16);
			contentPane.add(label_5);
			
			JLabel label_8 = new JLabel(Account.getUserDetails(patientUsername).get(3));
			label_8.setBounds(435, 75, 124, 16);
			contentPane.add(label_8);
			
			JLabel lblNewLabel_2 = new JLabel("1.");
			lblNewLabel_2.setBounds(129, 75, 25, 16);
			contentPane.add(lblNewLabel_2);
			
			JLabel label_21 = new JLabel(patientUsername2);
			label_21.setBounds(160, 105, 131, 16);
			contentPane.add(label_21);
			
			JLabel label_51 = new JLabel(Account.getUserDetails(patientUsername2).get(2));
			label_51.setBounds(305, 105, 84, 16);
			contentPane.add(label_51);
				
			JLabel label_81 = new JLabel(Account.getUserDetails(patientUsername2).get(3));
			label_81.setBounds(435, 105, 124, 16);
			contentPane.add(label_81);
				
			JLabel lblNewLabel_21 = new JLabel("2.");
			lblNewLabel_21.setBounds(129, 105, 25, 16);
			contentPane.add(lblNewLabel_21);
			
			JLabel label_31 = new JLabel(patientUsername3);
			label_31.setBounds(160, 135, 131, 16);
			contentPane.add(label_31);
			
			JLabel label_41 = new JLabel(Account.getUserDetails(patientUsername3).get(2));
			label_41.setBounds(305, 135, 84, 16);
			contentPane.add(label_41);
				
			JLabel llabel_51 = new JLabel(Account.getUserDetails(patientUsername3).get(3));
			llabel_51.setBounds(435, 135, 124, 16);
			contentPane.add(llabel_51);
				
			JLabel lblNewLabel_61 = new JLabel("3.");
			lblNewLabel_61.setBounds(129, 135, 25, 16);
			contentPane.add(lblNewLabel_61);
			
			JLabel label_71 = new JLabel(patientUsername4);
			label_71.setBounds(160, 165, 131, 16);
			contentPane.add(label_71);
			
			JLabel llabel_81 = new JLabel(Account.getUserDetails(patientUsername4).get(2));
			llabel_81.setBounds(305, 165, 84, 16);
			contentPane.add(llabel_81);
				
			JLabel label_91 = new JLabel(Account.getUserDetails(patientUsername4).get(3));
			label_91.setBounds(435, 165, 124, 16);
			contentPane.add(label_91);
				
			JLabel lblNewLabel_11 = new JLabel("4.");
			lblNewLabel_11.setBounds(129, 165, 25, 16);
			contentPane.add(lblNewLabel_11);
			
			JLabel labell_21 = new JLabel(patientUsername5);
			labell_21.setBounds(160, 195, 131, 16);
			contentPane.add(labell_21);
			
			JLabel labeel_51 = new JLabel(Account.getUserDetails(patientUsername5).get(2));
			labeel_51.setBounds(305, 195, 84, 16);
			contentPane.add(labeel_51);
				
			JLabel laabel_81 = new JLabel(Account.getUserDetails(patientUsername5).get(3));
			laabel_81.setBounds(435, 195, 124, 16);
			contentPane.add(laabel_81);
				
			JLabel a = new JLabel("5.");
			a.setBounds(129, 195, 25, 16);
			contentPane.add(a);
			
			JLabel b = new JLabel(patientUsername6);
			b.setBounds(160, 225, 131, 16);
			contentPane.add(b);
			
			JLabel v = new JLabel(Account.getUserDetails(patientUsername6).get(2));
			v.setBounds(305, 225, 84, 16);
			contentPane.add(v);
				
			JLabel c = new JLabel(Account.getUserDetails(patientUsername6).get(3));
			c.setBounds(435, 225, 124, 16);
			contentPane.add(c);
				
			JLabel x = new JLabel("6.");
			x.setBounds(129, 225, 25, 16);
			contentPane.add(x);
			
			JLabel z = new JLabel(patientUsername7);
			z.setBounds(160, 255, 131, 16);
			contentPane.add(z);
			
			JLabel s = new JLabel(Account.getUserDetails(patientUsername7).get(2));
			s.setBounds(305, 255, 84, 16);
			contentPane.add(s);
				
			JLabel d = new JLabel(Account.getUserDetails(patientUsername7).get(3));
			d.setBounds(435, 255, 124, 16);
			contentPane.add(d);
				
			JLabel f = new JLabel("7.");
			f.setBounds(129, 255, 25, 16);
			contentPane.add(f);
			
			JLabel g = new JLabel(patientUsername8);
			g.setBounds(160, 285, 131, 16);
			contentPane.add(g);
			
			JLabel h = new JLabel(Account.getUserDetails(patientUsername8).get(2));
			h.setBounds(305, 285, 84, 16);
			contentPane.add(h);
				
			JLabel j = new JLabel(Account.getUserDetails(patientUsername8).get(3));
			j.setBounds(435, 285, 124, 16);
			contentPane.add(j);
				
			JLabel k = new JLabel("8.");
			k.setBounds(129, 285, 25, 16);
			contentPane.add(k);
			
			JLabel l = new JLabel(patientUsername9);
			l.setBounds(160, 315, 131, 16);
			contentPane.add(l);
			
			JLabel p = new JLabel(Account.getUserDetails(patientUsername9).get(2));
			p.setBounds(305, 315, 84, 16);
			contentPane.add(p);
				
			JLabel o = new JLabel(Account.getUserDetails(patientUsername9).get(3));
			o.setBounds(435, 315, 124, 16);
			contentPane.add(o);
				
			JLabel i = new JLabel("9.");
			i.setBounds(129, 315, 25, 16);
			contentPane.add(i);
		}
		if (numberOfAppointments == 10) {
			JLabel label_2 = new JLabel(patientUsername);
			label_2.setBounds(160, 75, 131, 16);
			contentPane.add(label_2);
			
			JLabel label_5 = new JLabel(Account.getUserDetails(patientUsername).get(2));
			label_5.setBounds(305, 75, 84, 16);
			contentPane.add(label_5);
			
			JLabel label_8 = new JLabel(Account.getUserDetails(patientUsername).get(3));
			label_8.setBounds(435, 75, 124, 16);
			contentPane.add(label_8);
			
			JLabel lblNewLabel_2 = new JLabel("1.");
			lblNewLabel_2.setBounds(129, 75, 25, 16);
			contentPane.add(lblNewLabel_2);
			
			JLabel label_21 = new JLabel(patientUsername2);
			label_21.setBounds(160, 105, 131, 16);
			contentPane.add(label_21);
			
			JLabel label_51 = new JLabel(Account.getUserDetails(patientUsername2).get(2));
			label_51.setBounds(305, 105, 84, 16);
			contentPane.add(label_51);
				
			JLabel label_81 = new JLabel(Account.getUserDetails(patientUsername2).get(3));
			label_81.setBounds(435, 105, 124, 16);
			contentPane.add(label_81);
				
			JLabel lblNewLabel_21 = new JLabel("2.");
			lblNewLabel_21.setBounds(129, 105, 25, 16);
			contentPane.add(lblNewLabel_21);
			
			JLabel label_31 = new JLabel(patientUsername3);
			label_31.setBounds(160, 135, 131, 16);
			contentPane.add(label_31);
			
			JLabel label_41 = new JLabel(Account.getUserDetails(patientUsername3).get(2));
			label_41.setBounds(305, 135, 84, 16);
			contentPane.add(label_41);
				
			JLabel llabel_51 = new JLabel(Account.getUserDetails(patientUsername3).get(3));
			llabel_51.setBounds(435, 135, 124, 16);
			contentPane.add(llabel_51);
				
			JLabel lblNewLabel_61 = new JLabel("3.");
			lblNewLabel_61.setBounds(129, 135, 25, 16);
			contentPane.add(lblNewLabel_61);
			
			JLabel label_71 = new JLabel(patientUsername4);
			label_71.setBounds(160, 165, 131, 16);
			contentPane.add(label_71);
			
			JLabel llabel_81 = new JLabel(Account.getUserDetails(patientUsername4).get(2));
			llabel_81.setBounds(305, 165, 84, 16);
			contentPane.add(llabel_81);
				
			JLabel label_91 = new JLabel(Account.getUserDetails(patientUsername4).get(3));
			label_91.setBounds(435, 165, 124, 16);
			contentPane.add(label_91);
				
			JLabel lblNewLabel_11 = new JLabel("4.");
			lblNewLabel_11.setBounds(129, 165, 25, 16);
			contentPane.add(lblNewLabel_11);
			
			JLabel labell_21 = new JLabel(patientUsername5);
			labell_21.setBounds(160, 195, 131, 16);
			contentPane.add(labell_21);
			
			JLabel labeel_51 = new JLabel(Account.getUserDetails(patientUsername5).get(2));
			labeel_51.setBounds(305, 195, 84, 16);
			contentPane.add(labeel_51);
				
			JLabel laabel_81 = new JLabel(Account.getUserDetails(patientUsername5).get(3));
			laabel_81.setBounds(435, 195, 124, 16);
			contentPane.add(laabel_81);
				
			JLabel a = new JLabel("5.");
			a.setBounds(129, 195, 25, 16);
			contentPane.add(a);
			
			JLabel b = new JLabel(patientUsername6);
			b.setBounds(160, 225, 131, 16);
			contentPane.add(b);
			
			JLabel v = new JLabel(Account.getUserDetails(patientUsername6).get(2));
			v.setBounds(305, 225, 84, 16);
			contentPane.add(v);
				
			JLabel c = new JLabel(Account.getUserDetails(patientUsername6).get(3));
			c.setBounds(435, 225, 124, 16);
			contentPane.add(c);
				
			JLabel x = new JLabel("6.");
			x.setBounds(129, 225, 25, 16);
			contentPane.add(x);
			
			JLabel z = new JLabel(patientUsername7);
			z.setBounds(160, 255, 131, 16);
			contentPane.add(z);
			
			JLabel s = new JLabel(Account.getUserDetails(patientUsername7).get(2));
			s.setBounds(305, 255, 84, 16);
			contentPane.add(s);
				
			JLabel d = new JLabel(Account.getUserDetails(patientUsername7).get(3));
			d.setBounds(435, 255, 124, 16);
			contentPane.add(d);
				
			JLabel f = new JLabel("7.");
			f.setBounds(129, 255, 25, 16);
			contentPane.add(f);
			
			JLabel g = new JLabel(patientUsername8);
			g.setBounds(160, 285, 131, 16);
			contentPane.add(g);
			
			JLabel h = new JLabel(Account.getUserDetails(patientUsername8).get(2));
			h.setBounds(305, 285, 84, 16);
			contentPane.add(h);
				
			JLabel j = new JLabel(Account.getUserDetails(patientUsername8).get(3));
			j.setBounds(435, 285, 124, 16);
			contentPane.add(j);
				
			JLabel k = new JLabel("8.");
			k.setBounds(129, 285, 25, 16);
			contentPane.add(k);
			
			JLabel l = new JLabel(patientUsername9);
			l.setBounds(160, 315, 131, 16);
			contentPane.add(l);
			
			JLabel p = new JLabel(Account.getUserDetails(patientUsername9).get(2));
			p.setBounds(305, 315, 84, 16);
			contentPane.add(p);
				
			JLabel o = new JLabel(Account.getUserDetails(patientUsername9).get(3));
			o.setBounds(435, 315, 124, 16);
			contentPane.add(o);
				
			JLabel i = new JLabel("9.");
			i.setBounds(129, 315, 25, 16);
			contentPane.add(i);
			
			JLabel u = new JLabel(patientUsername10);
			u.setBounds(160, 345, 131, 16);
			contentPane.add(u);
			
			JLabel y = new JLabel(Account.getUserDetails(patientUsername10).get(2));
			y.setBounds(305, 345, 84, 16);
			contentPane.add(y);
				
			JLabel t = new JLabel(Account.getUserDetails(patientUsername10).get(3));
			t.setBounds(435, 345, 124, 16);
			contentPane.add(t);
				
			JLabel r = new JLabel("10.");
			r.setBounds(129, 345, 25, 16);
			contentPane.add(r);
		}
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAppointmentDoctor viewAppointmentDoctor = new ViewAppointmentDoctor();
				viewAppointmentDoctor.setVisible(true);
			}
		});
		btnNewButton.setBounds(265, 380, 117, 29);
		contentPane.add(btnNewButton);
	}

}
