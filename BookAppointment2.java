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

public class BookAppointment2 extends BookAppointment {

	private JPanel contentPane;
	public static String dateChosen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println(monthChosen);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookAppointment2 frame = new BookAppointment2();
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
	public BookAppointment2() {
		setTitle("Book Appoinment");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] dates = Appointment.getDates(monthChosen).toArray(new String[Appointment.getDates(monthChosen).size()]);
		JComboBox comboBox_2 = new JComboBox(dates);
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDate(comboBox_2.getSelectedItem().toString());
			}
		});
		comboBox_2.setBounds(334, 174, 166, 27);
		contentPane.add(comboBox_2);
		
		JLabel label_1 = new JLabel("Appointment date:");
		label_1.setBounds(180, 178, 124, 16);
		contentPane.add(label_1);
		
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookAppointment3 bookappointment3 = new BookAppointment3();
				bookappointment3.setVisible(true);
			}
		});
		btnNewButton.setBounds(275, 346, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Available dates");
		lblNewLabel.setBounds(249, 67, 177, 44);
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 25));
		contentPane.add(lblNewLabel);
	}
	
	public void setDate(String date){
		dateChosen = date;
	}
}
