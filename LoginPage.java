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
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

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

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userN = textField.getText();
				String pass = passwordField.getText();
				try{
            FileReader reader = new FileReader("accounts.txt");
            BufferedReader accounts_input = new BufferedReader(reader);
            String account = accounts_input.readLine();

            while (account != null){
                if (account.equals(userN)){
										Account user = new Account(account);
										System.out.println("Found account: "+ user.getUserName());
                    break;
                }
                 account = accounts_input.readLine();
            }

            accounts_input.close();

        }catch(IOException error){
					System.out.println("No account with that username exists");
          error.printStackTrace();
        }

				if ((user.getUserName().equals("doctor") || userN.equals("nurse")) && (user.getPassword().equals(pass)))
				{
					JOptionPane.showMessageDialog(contentPane, "Welcome " + userN + "! ");
					MainPageStaff mainpage1 = new MainPageStaff();
					mainpage1.setVisible(true);
				}

				else if ((user.getUserName().equals("patient")) && (user.getPassword().equals(pass)))
				{
					JOptionPane.showMessageDialog(contentPane, "Welcome " + userN + "! " );
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
		/**
		JButton btnNewButton = new JButton("I'm a Doctor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String case1 = btnNewButton.getText();
				if (case1.equals("I'm a Doctor")) {
					JOptionPane.showMessageDialog(contentPane, "Welcome to our Hospital Management System!");
					ProjectLogin projectlogin1 = new ProjectLogin();
					projectlogin1.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(144, 83, 153, 29);
		contentPane.add(btnNewButton);

		JButton button = new JButton("I'm a Patient");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProjectLogin projectlogin2 = new ProjectLogin();
				projectlogin2.setVisible(true);
			}
		});
		button.setBounds(144, 124, 153, 29);
		contentPane.add(button);

		JButton button_1 = new JButton("I'm a Staff member");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProjectLogin projectlogin3 = new ProjectLogin();
				projectlogin3.setVisible(true);
			}
		});
		button_1.setBounds(144, 165, 153, 29);
		contentPane.add(button_1);

		JLabel lblNewLabel = new JLabel("Welcome!");
		lblNewLabel.setBounds(191, 55, 61, 16);
		contentPane.add(lblNewLabel);
	}

}
*/
