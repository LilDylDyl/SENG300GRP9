import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class MainPageStaff extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPageStaff frame = new MainPageStaff();
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
	public MainPageStaff() {
		setTitle("Staff");
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
				ViewAppointmentStaff1 viewAppointmentStaff1 = new ViewAppointmentStaff1();
				viewAppointmentStaff1.setVisible(true);
			}
		});
		btnNewButton.setBounds(242, 166, 188, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Cancel appointments");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CancelAppointmentStaff1 cancelAppointmentStaff1 = new CancelAppointmentStaff1();
				cancelAppointmentStaff1.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(242, 218, 188, 29);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("Welcome! You can manage doctor's appointments below.");
		lblNewLabel.setBounds(115, 90, 470, 38);
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
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
