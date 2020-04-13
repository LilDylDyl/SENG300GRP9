import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ViewAppointmentStaff1 extends JFrame {

	private JPanel contentPane;
	public static String doctorChosen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAppointmentStaff1 frame = new ViewAppointmentStaff1();
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
	public ViewAppointmentStaff1() {
		setTitle("View Appointments");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		String[] doctorsList = {"--Choose doctor--", "Dr. Strange", "Dr. Who", "Dr. Banner"};	
		JComboBox comboBox = new JComboBox(doctorsList);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDoctorName(comboBox.getSelectedItem().toString());
			}
		});
		comboBox.setBounds(286, 183, 180, 27);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Doctor:");
		lblNewLabel.setBounds(217, 187, 57, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAppointmentStaff2 viewAppointmentStaff2 = new ViewAppointmentStaff2();
				viewAppointmentStaff2.setVisible(true);
			}
		});
		btnNewButton.setBounds(275, 346, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel2 = new JLabel("Choose a doctor to manage their appointments.");
		lblNewLabel2.setBounds(155, 90, 470, 38);
		lblNewLabel2.setFont(new Font("Serif", Font.PLAIN, 20));
		contentPane.add(lblNewLabel2);
	}
	
	public void setDoctorName(String doctor){
		doctorChosen = doctor;
	}
}
