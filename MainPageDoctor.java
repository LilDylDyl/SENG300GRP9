import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class MainPageDoctor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPageDoctor frame = new MainPageDoctor();
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
	public MainPageDoctor() {
		setTitle("Doctor");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("View appointments");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAppointmentDoctor viewAppointmentDoctor = new ViewAppointmentDoctor();
				viewAppointmentDoctor.setVisible(true);
			}
		});
		btnNewButton.setBounds(242, 136, 188, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Cancel appointments");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CancelAppointmentDoctor cancelAppointmentDoctor = new CancelAppointmentDoctor();
				cancelAppointmentDoctor.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(242, 188, 188, 29);
		contentPane.add(btnNewButton_3);
		
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
	}
}
