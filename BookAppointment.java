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
		
		String[] doctorsList = {"Dr. Strange", "Dr. Who", "Dr. Banner"};	
		JComboBox comboBox = new JComboBox(doctorsList);
		comboBox.setBounds(358, 111, 132, 27);
		contentPane.add(comboBox);
		
		String[] array = Appointment.getMonths().toArray(new String[Appointment.getMonths().size()]);
		JComboBox comboBox_1 = new JComboBox(array);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox comboBox_1 = (JComboBox)e.getSource();
			}
		});
		comboBox_1.setBounds(358, 174, 132, 27);
		contentPane.add(comboBox_1);
		
		//String monthChosen = comboBox_1.getSelectedItem().toString();
		//String[] dates = Appointment.getDates(monthChosen).toArray(new String[Appointment.getDates(monthChosen).size()]);
		String[] dates = Appointment.getDates("January").toArray(new String[Appointment.getDates("January").size()]);
		JComboBox comboBox_2 = new JComboBox(dates);
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox_2.setBounds(358, 238, 132, 27);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel = new JLabel("Choose doctor:");
		lblNewLabel.setBounds(204, 115, 124, 16);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("Month:");
		label.setBounds(204, 178, 124, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Appointment date:");
		label_1.setBounds(204, 242, 124, 16);
		contentPane.add(label_1);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.setBounds(275, 346, 117, 29);
		contentPane.add(btnNewButton);
	}
}
