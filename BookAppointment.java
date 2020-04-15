import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;

public class BookAppointment extends JFrame {

	private JPanel contentPane;
	public static String monthChosen;
	public static String doctorChosen;
	public String[] dates;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookAppointment frame = new BookAppointment();
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
	public BookAppointment() {
		setTitle("Book Appoinment");
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
		comboBox.setBounds(286, 143, 180, 27);
		contentPane.add(comboBox);
		
		String[] array = Appointment.getMonths().toArray(new String[Appointment.getMonths().size()]);
		JComboBox comboBox_1 = new JComboBox(array);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setMonthName(comboBox_1.getSelectedItem().toString());				
				JComboBox comboBox_1 = (JComboBox)e.getSource();
			}
		});
		comboBox_1.setBounds(286, 206, 180, 27);
		contentPane.add(comboBox_1);

		JLabel lblNewLabel = new JLabel("Doctor:");
		lblNewLabel.setBounds(217, 147, 57, 16);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("Month:");
		label.setBounds(217, 210, 57, 16);
		contentPane.add(label);
		

		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookAppointment2 bookappointment2 = new BookAppointment2();
				bookappointment2.setVisible(true);
			}
		});
		btnNewButton.setBounds(275, 346, 117, 29);
		contentPane.add(btnNewButton);
	}
	
	public void setMonthName(String month){
		monthChosen = month;
	}
	
	public void setDoctorName(String doctor){
		doctorChosen = doctor;
	}
}
