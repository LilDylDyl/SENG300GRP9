import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainPageAdmin extends JFrame {

	private JPanel contentPane;
	public static String accountType;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPageAdmin frame = new MainPageAdmin();
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
	public MainPageAdmin() {
		setTitle("Administrator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add doctor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAccountType("Doctor");
				AdminAddUser adminAddDoctor = new AdminAddUser();
				adminAddDoctor.setVisible(true);
			}
		});
		
		btnNewButton.setBounds(242, 136, 188, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add patient");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAccountType("Patient");
				AdminAddUser adminAddPatient = new AdminAddUser();
				adminAddPatient.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(242, 188, 188, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Add staff");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAccountType("Staff");
				AdminAddUser adminAddStaff = new AdminAddUser();
				adminAddStaff.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(242, 238, 188, 29);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("Welcome Admin!");
		lblNewLabel.setBounds(278, 66, 121, 34);
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 16));
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
		
		JButton btnNewButton_4 = new JButton("Delete account");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteAccount deleteAccount = new DeleteAccount();
				deleteAccount.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(242, 289, 188, 29);
		contentPane.add(btnNewButton_4);
	}
	
	public void setAccountType(String type){
		accountType = type;
	}

}
