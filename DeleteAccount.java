import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class DeleteAccount extends JFrame {

	private JPanel contentPane;
	private JTextField textField_6;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteAccount frame = new DeleteAccount();
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
	public DeleteAccount() {
		setTitle("Delete Account");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_4 = new JLabel("Password:");
		label_4.setBounds(171, 211, 83, 16);
		getContentPane().add(label_4);
		
		JLabel label_1 = new JLabel("Account Type:");
		label_1.setBounds(171, 109, 101, 16);
		getContentPane().add(label_1);
		
		JLabel label_3 = new JLabel("Username:");
		label_3.setBounds(171, 159, 83, 16);
		getContentPane().add(label_3);
		
		String[] accountTypeOptions = {"--Choose--", "Staff Member", "Doctor", "Patient"};
		JComboBox comboBox = new JComboBox(accountTypeOptions);

		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox comboBox = (JComboBox)e.getSource();
			}
		});
		comboBox.setBounds(284, 105, 159, 27);
		comboBox.setSelectedIndex(0);
		getContentPane().add(comboBox);
		
		textField_6 = new JTextField();
		textField_6.setBounds(266, 154, 165, 26);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(266, 206, 165, 26);
		getContentPane().add(passwordField_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(241, 313, 165, 26);
		contentPane.add(textField_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(241, 261, 165, 26);
		contentPane.add(textField);
		
		JLabel label = new JLabel("Name:");
		label.setBounds(171, 266, 83, 16);
		contentPane.add(label);
		
		JLabel label_2 = new JLabel("Email:");
		label_2.setBounds(171, 318, 83, 16);
		contentPane.add(label_2);
		
		JButton btnNewButton = new JButton("Delete account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String accountType = comboBox.getSelectedItem().toString();
				String name = textField.getText();
				String email = textField_1.getText();
				String username = textField_6.getText();
				String password = passwordField_1.getText();
				
				boolean accountFound = Account.deleteAccount(username, accountType, name, email, password);
				if (accountFound == true) {
					JOptionPane.showMessageDialog(contentPane, "Account successfully deleted!");
					MainPageAdmin mainPageAdmin = new MainPageAdmin();
					mainPageAdmin.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Sorry! Account not found.");
				}
				
			}
		});
		btnNewButton.setBounds(276, 373, 138, 29);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPageAdmin mainPageAdmin = new MainPageAdmin();
				mainPageAdmin.setVisible(true);
			}
		});
		button.setBounds(186, 373, 93, 29);
		contentPane.add(button);
	}
}
