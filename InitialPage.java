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

	private JFrame frame;
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
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton btnNewButton = new JButton("I'm a Doctor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String case1 = btnNewButton.getText();
				if (case1.equals("I'm a Doctor")) {
					JOptionPane.showMessageDialog(frame, "Welcome to our Hospital Management System!");
					LoginPage projectlogin1 = new LoginPage();
					projectlogin1.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(144, 83, 153, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("I'm a Patient");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage projectlogin2 = new LoginPage();
				projectlogin2.setVisible(true);
			}
		});
		button.setBounds(144, 124, 153, 29);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("I'm a Staff member");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage projectlogin3 = new LoginPage();
				projectlogin3.setVisible(true);
			}
		});
		button_1.setBounds(144, 165, 153, 29);
		frame.getContentPane().add(button_1);
		
		JLabel lblNewLabel = new JLabel("Welcome!");
		lblNewLabel.setBounds(191, 55, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
	}

}

		/**
		
*/
