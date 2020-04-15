import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class InitialPage extends JFrame {

	private JFrame frmHospitalManagementSystem;
	private JTextField textField;
	private JButton btnNewButton;
	private JPasswordField passwordField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InitialPage window = new InitialPage();
					window.frmHospitalManagementSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InitialPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHospitalManagementSystem = new JFrame();
		frmHospitalManagementSystem.setTitle("Hospital Management System");
		frmHospitalManagementSystem.setResizable(false);
		frmHospitalManagementSystem.setBounds(100, 100, 666, 444);
		frmHospitalManagementSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHospitalManagementSystem.getContentPane().setLayout(null);

		JButton button = new JButton("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage projectlogin2 = new LoginPage();
				projectlogin2.setVisible(true);
				
			}
		});
		button.setBounds(252, 184, 153, 29);
		frmHospitalManagementSystem.getContentPane().add(button);

		JButton button_1 = new JButton("Register");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegPage projectlogin3 = new RegPage();
				projectlogin3.setVisible(true);
			}
		});
		button_1.setBounds(252, 225, 153, 29);
		frmHospitalManagementSystem.getContentPane().add(button_1);

		JLabel lblNewLabel = new JLabel("Welcome to Hospital Management System");
		lblNewLabel.setBounds(193, 141, 300, 16);
		frmHospitalManagementSystem.getContentPane().add(lblNewLabel);

	}

}

		/**

*/
