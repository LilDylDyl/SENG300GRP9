import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class BookAppointment3 extends BookAppointment2 {

	private JPanel contentPane;
	public static String timeChosen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookAppointment3 frame = new BookAppointment3();
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
	public BookAppointment3() {
		setTitle("Book Appoinment");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] time = Appointment.getTime().toArray(new String[Appointment.getTime().size()]);
		JComboBox comboBox_2 = new JComboBox(time);
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTime(comboBox_2.getSelectedItem().toString());
			}
		});
		comboBox_2.setBounds(334, 174, 166, 27);
		contentPane.add(comboBox_2);
		
		JLabel label_1 = new JLabel("Appointment time:");
		label_1.setBounds(180, 178, 124, 16);
		contentPane.add(label_1);
		
		
		JButton btnNewButton = new JButton("Confirm appointment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Appointment create = new Appointment(RegPage.username, doctorChosen, dateChosen, monthChosen, timeChosen);
				JOptionPane.showMessageDialog(contentPane, "Your appointment was successfully booked!");
				MainPagePatient mainpagepatient = new MainPagePatient();
				mainpagepatient.setVisible(true);
			}
		});
		btnNewButton.setBounds(240, 346, 169, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Available timings");
		lblNewLabel.setBounds(240, 67, 204, 44);
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 25));
		contentPane.add(lblNewLabel);
	}

	public void setTime(String time){
		timeChosen = time;
	}
}
