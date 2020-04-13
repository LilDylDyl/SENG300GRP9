import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollBar;

public class MoreInformation extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MoreInformation frame = new MoreInformation();
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
	public MoreInformation() {
		setTitle("More Information");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Doctor");
		lblNewLabel.setBounds(80, 75, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Specialization");
		lblNewLabel_1.setBounds(210, 75, 101, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("Phone");
		label.setBounds(387, 75, 61, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Email");
		label_1.setBounds(541, 75, 61, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Dr. Stephen Strange");
		label_2.setBounds(50, 138, 131, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Dr. Who");
		label_3.setBounds(50, 180, 61, 16);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Dr. Bruce Banner");
		label_4.setBounds(50, 223, 103, 16);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Surgeon (MD)");
		label_5.setBounds(210, 138, 84, 16);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Dermatologist (MD)");
		label_6.setBounds(210, 180, 131, 16);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("Neurologist (MD)");
		label_7.setBounds(210, 223, 107, 16);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("+1 (587) 659 2337");
		label_8.setBounds(353, 138, 124, 16);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("+1 (401) 201 9810");
		label_9.setBounds(353, 180, 131, 16);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("+1 (306) 885 1048");
		label_10.setBounds(353, 223, 124, 16);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("strange@gmail.com");
		label_11.setBounds(507, 138, 142, 16);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("who@gmail.com");
		label_12.setBounds(507, 180, 113, 16);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("banner@yahoo.in");
		label_13.setBounds(507, 223, 124, 16);
		contentPane.add(label_13);
		
		JLabel lblNewLabel_2 = new JLabel("1.");
		lblNewLabel_2.setBounds(19, 138, 25, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel label_14 = new JLabel("2.");
		label_14.setBounds(19, 180, 25, 16);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("3.");
		label_15.setBounds(19, 223, 25, 16);
		contentPane.add(label_15);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPagePatient mainPagePatient = new MainPagePatient();
				mainPagePatient.setVisible(true);
			}
		});
		btnNewButton.setBounds(265, 332, 117, 29);
		contentPane.add(btnNewButton);
	}
}
