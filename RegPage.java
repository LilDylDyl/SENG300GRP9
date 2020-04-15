import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

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
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
public class RegPage extends LoginPage {
	
	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_6;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

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
	
	public RegPage() {
		setTitle("Registration");
		setResizable(false);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 444);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setBounds(299, 121, 192, 26);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(245, 73, 198, 26);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(267, 217, 165, 26);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(267, 269, 165, 26);
		getContentPane().add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(314, 319, 165, 26);
		getContentPane().add(passwordField_2);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(172, 78, 83, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("Email Address:");
		label.setBounds(172, 126, 101, 16);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Account Type:");
		label_1.setBounds(172, 172, 101, 16);
		getContentPane().add(label_1);
		
		JLabel label_3 = new JLabel("Username:");
		label_3.setBounds(172, 222, 83, 16);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Password:");
		label_4.setBounds(172, 274, 83, 16);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Confirm Password:");
		label_5.setBounds(172, 324, 130, 16);
		getContentPane().add(label_5);
		
		String[] accountTypeOptions = {"--Choose--", "Staff Member", "Doctor", "Patient"};
		JComboBox comboBox = new JComboBox(accountTypeOptions);

		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox comboBox = (JComboBox)e.getSource();
			}
		});
		comboBox.setBounds(285, 168, 159, 27);
		comboBox.setSelectedIndex(0);
		getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String accountType = comboBox.getSelectedItem().toString();
				String name = textField_3.getText();
				String email = textField_2.getText();
				setUsername(textField_6.getText());
				String password = passwordField_1.getText();
				String confirmPassword = passwordField_2.getText();
				
				if(password.equals(confirmPassword) && accountType.equals("Doctor")) {
					
					Account account1 = new Account(username, accountType, name, email, password);
					
					JOptionPane.showMessageDialog(contentPane, "Registration complete! Welcome " + name + "! ");
					MainPageDoctor mainpagedoctor = new MainPageDoctor();
					mainpagedoctor.setVisible(true);
				}
				if(password.equals(confirmPassword) && accountType.equals("Patient")) {
					
					Account account2 = new Account(username, accountType, name, email, password);
					
					JOptionPane.showMessageDialog(contentPane, "Registration complete! Welcome " + name + "! ");
					MainPagePatient mainpagepatient = new MainPagePatient();
					mainpagepatient.setVisible(true);
				}
				if(password.equals(confirmPassword) && accountType.equals("Staff Member")) {
					
					Account account3 = new Account(username, accountType, name, email, password);
					
					JOptionPane.showMessageDialog(contentPane, "Registration complete! Welcome " + name + "! ");
					MainPageStaff mainpage1 = new MainPageStaff();
					mainpage1.setVisible(true);
				}
				else if((password.equals(confirmPassword)) == false) {
					JOptionPane.showMessageDialog(contentPane, "Your passwords do not match! Please try again");
				}
			}
		});
		btnNewButton.setBounds(267, 370, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Please enter the information below");
		lblNewLabel_1.setBounds(188, 17, 290, 44);
		lblNewLabel_1.setFont(new Font("Serif", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_1);
	}
	
	public void setUsername(String uname){
		username = uname;
	}

}
