import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPagePatient extends JFrame {

	private JPanel contentPane;
	public static int balanceDue = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPagePatient frame = new MainPagePatient();
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
	public MainPagePatient() {
		setTitle("Patient");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("View appointment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAppointmentPatient viewAppointmentPatient = new ViewAppointmentPatient();
				viewAppointmentPatient.setVisible(true);
			}
		});
		
		btnNewButton.setBounds(242, 136, 188, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Book appointment");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookAppointment bookAppointment = new BookAppointment();
				bookAppointment.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(242, 188, 188, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Cancel appointment");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CancelAppointmentPatient cancelAppointmentPatient = new CancelAppointmentPatient();
				cancelAppointmentPatient.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(242, 238, 188, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("More information");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoreInformation moreInformation = new MoreInformation();
				moreInformation.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(242, 287, 188, 29);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("You can manage your appointments using the options below!");
		lblNewLabel.setBounds(150, 90, 399, 34);
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 16));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome!");
		lblNewLabel_1.setBounds(288, 44, 109, 38);
		lblNewLabel_1.setFont(new Font("Serif", Font.ROMAN_BASELINE, 20));
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("Log out");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "You are successfully logged out");
				LoginPage loginPage = new LoginPage();
				loginPage.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(574, 0, 92, 29);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Balance due:");
		lblNewLabel_2.setBounds(6, 5, 78, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("$" + Integer.toString(balanceDue));
		lblNewLabel_3.setBounds(91, 5, 61, 16);
		contentPane.add(lblNewLabel_3);
	}
	public static void setBalanceDue(int balance) {
		balanceDue += balance;
	}

}
