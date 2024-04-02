import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;

public class Sysmtem {

	private JFrame frame;
	public static boolean turno;
	public static int x_cont = 0, o_cont = 0;
	
	public static JButton btnNewButton;
	public static JButton btnNewButton_2;
	public static JButton btnNewButton_1;
	public static JButton btnNewButton_3;
	public static JButton btnNewButton_4;
	public static JButton btnNewButton_5;
	public static JButton btnNewButton_6;
	public static JButton btnNewButton_7;
	public static JButton btnNewButton_8;
	private JPanel panel_1;
	private JButton btnNewButton_9;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		turno = false;
		
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
		frame.setBounds(100, 100, 440, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		
		btnNewButton_9 = new JButton("Reiniciar ");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Component[] elementos = panel.getComponents();
				
				for (int i = 0; i < elementos.length; i++) { 
					  
					if( elementos[i].getClass().toString().equals("class javax.swing.JButton") ) {
						
						JButton btn = ((JButton) elementos[i]);  
						
						btn.setIcon(null);
						btn.setText("");
						btn.setEnabled(true);
						//reiniciar
						
					}
					
				}
				
			}
		});
		btnNewButton_9.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		panel_1.add(btnNewButton_9, BorderLayout.SOUTH);
		
		
		
		
		panel.setBackground(new Color(255, 177, 47));
		panel.setForeground(new Color(255, 83, 46));
		//frame.getContentPane().add(panel);
		
		panel_1.add(panel,BorderLayout.CENTER);
		
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		btnNewButton = new JButton("");
		btnNewButton_2 = new JButton("");
		btnNewButton_1 = new JButton("");
		btnNewButton_3 = new JButton("");
		btnNewButton_4 = new JButton("");
		btnNewButton_5 = new JButton("");
		btnNewButton_6 = new JButton("");
		btnNewButton_7 = new JButton("");
		btnNewButton_8 = new JButton("");
		
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 27)); 
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JButton btn = ((JButton) e.getSource());  
				click( btn);
			}
		});
		
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = ((JButton) e.getSource());  
				click( btn);
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				  
				JButton btn = ((JButton) e.getSource());  
				click( btn);
			}
		});
		panel.add(btnNewButton);
		
		
		panel.add(btnNewButton_1);
		
		
		panel.add(btnNewButton_2);
		
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = ((JButton) e.getSource());  
				click( btn);
			}
		});
		panel.add(btnNewButton_3);
		
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = ((JButton) e.getSource());  
				click( btn);
			}
		});
		panel.add(btnNewButton_4);
		
		
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = ((JButton) e.getSource());  
				click( btn);
			}
		});
		panel.add(btnNewButton_5);
		
		
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = ((JButton) e.getSource());  
				click( btn);
			}
		});
		panel.add(btnNewButton_6);
		
		
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = ((JButton) e.getSource());  
				click( btn);
			}
		});
		panel.add(btnNewButton_7);
		
		
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = ((JButton) e.getSource());  
				click( btn);
			}
		});
		panel.add(btnNewButton_8);
		
		panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("X: 0");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		panel_2.add(lblNewLabel_2);
		
		lblNewLabel_1 = new JLabel("0:0");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_1);
	}
	
	public void click(JButton btn) {
		
		//1.- si el botón esta libre
		if( btn.getText().equals("") ) {
			
			//2.- el turno 
			if(turno) {
				
				btn.setIcon( new ImageIcon(getClass().getResource("polluelo.png")) );
				btn.setText("O");
				
				//4.- cambiar el turno
				turno = false;
			}else {
				
				btn.setIcon( new ImageIcon(getClass().getResource("polluelo.png")) );
				btn.setText("X");
				turno = true;
			}
			
			btn.setEnabled(false);
			
			//3.- si alguien gano
			if(btnNewButton.getText().equals( btnNewButton_1.getText()) &&
					btnNewButton.getText().equals( btnNewButton_2.getText()) &&	
					
				! btnNewButton.getText().equals("")) {
				
				x_cont++;
				
				lblNewLabel.setText("X:"+x_cont);
				
				JOptionPane.showMessageDialog(lblNewLabel,
						"Hola",
					    "Inane warning",
					    JOptionPane.WARNING_MESSAGE);
			}
		} 
	}
}
