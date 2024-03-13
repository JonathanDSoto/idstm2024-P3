import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sysmtem {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sysmtem window = new Sysmtem();
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
	public Sysmtem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_4350716344000");
		panel.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1, BorderLayout.NORTH);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel.add(btnNewButton_2, BorderLayout.WEST);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel.add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_4, BorderLayout.SOUTH);
	}
}
