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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setTitle("Login");
		setResizable(false);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(75, 80, 97, 28);
		contentPane.add(lblUsername);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(75, 134, 97, 28);
		contentPane.add(lblPassword);

		textField = new JTextField();
		textField.setBounds(178, 80, 166, 28);
		contentPane.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(178, 134, 166, 28);
		contentPane.add(passwordField);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userN = textField.getText();
				String pass = passwordField.getText();
				if((Account.VerifyLogin(userN, pass).equals("Doctor")))
				{
					JOptionPane.showMessageDialog(contentPane, "Welcome " + userN + "! " + "You are successfully logged in");
					MainPageDoctor mainpagedoctor = new MainPageDoctor();
					mainpagedoctor.setVisible(true);
				}
				else if((Account.VerifyLogin(userN, pass).equals("Patient")))
				{
					JOptionPane.showMessageDialog(contentPane, "Welcome " + userN + "! " + "You are successfully logged in");
					MainPagePatient mainpagepatient = new MainPagePatient();
					mainpagepatient.setVisible(true);
				}
				else if((Account.VerifyLogin(userN, pass).equals("Staff")))
				{
					JOptionPane.showMessageDialog(contentPane, "Welcome " + userN + "! " + "You are successfully logged in");
					MainPageStaff mainpage1 = new MainPageStaff();
					mainpage1.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Invalid username or password");
				}
			}
		});
		btnNewButton.setBounds(178, 190, 108, 29);
		contentPane.add(btnNewButton);
	}
}

