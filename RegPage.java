import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
public class RegPage extends JFrame {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton;
	private JPasswordField passwordField;
	private JTextField textField_1;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegPage window = new RegPage();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

  /**
	 * Create the frame.
	 */
	public void RegPage() {
    getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);


		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);


    JLabel lblWelcome = new JLabel("Enter your information below:");
    lblWelcome.setBounds(100, 55, 300, 16);
    contentPane.add(lblWelcome);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(59, 82, 97, 28);
		contentPane.add(lblUsername);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(59, 133, 97, 28);
		contentPane.add(lblPassword);

		textField = new JTextField();
		textField.setBounds(178, 80, 166, 28);
		contentPane.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(178, 134, 166, 28);
		contentPane.add(passwordField);

		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userN = textField.getText();
				String pass = passwordField.getText();

				if ((userN.equals("docter") || userN.equals("staff")) && (pass.equals("123")))
				{
					JOptionPane.showMessageDialog(contentPane, "Welcome " + userN + "! " + "You are successfully logged in");

					MainPageStaff mainpage1 = new MainPageStaff();
					mainpage1.setVisible(true);
				}

				else if ((userN.equals("Patient1") || userN.equals("patient1") && pass.equals("Pat123")))
				{
					JOptionPane.showMessageDialog(contentPane, "Welcome " + userN + "! " + "You are successfully logged in");

					MainPagePatient mainpage3 = new MainPagePatient();
					mainpage3.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Invalid username or password");
				}

			}
		});
		btnNewButton.setBounds(111, 199, 117, 29);
		contentPane.add(btnNewButton);

	}

}
